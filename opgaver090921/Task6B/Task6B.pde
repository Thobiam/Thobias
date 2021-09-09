void setup() {
  // taskA();
  taskB();
}


void taskA() {  
  int a = 5;
  int b = 5;

  if (a == 10 || b == 10 || a+b==10) {
    println("Succes!");
  } else {
    println("failure!");
  }
}

void taskB() {
  int x = 14;
  int y = 14;
  int z = 2;
  if (x%10==0 || y%10==0 || z%10==0) {
    println("Failure!");
  } else if (x+y+z==30) {
    println("Succes!");
  }
}
