diceCup myCup;
color[]colors=new color[9];
int colorCount=int(random(9));
int numOfDie = 5;

void setup()
{
  
  background(#59AD5F);    //background ;)
  size(2000, 1500);  //size of the windiow
  colors[0] = color(#8584F2);
  colors[1] = color(#64BC1C); 
  colors[2] = color(#50B4E8);
  colors[3] = color(#A08D5A);
  colors[4] = color(#E7F0AE);
  colors[5] = color(#BBAEF0);
  colors[6] = color(#F0F7FF);
  colors[7] = color(#FA9A9A);
  colors[8] = color(#00EADD);
  
  
  myCup = new diceCup(numOfDie);  //add object myCup

  for (int i =0; i<numOfDie; i++) {    //for loop so we start with eyes on the die.
    myCup.addDice(new Die(255, 0));    //adds values to the for each die int the diePool array.
  }
  //myCup.shake();
  myCup.diceDraw(100, 100, 50);        //draws and sorts the die based on the value: valueOfDie.
}
void draw()
{
}
void keyPressed()

{

  if (keyCode==ENTER) {                //when the key Enter is pressed do the following:
    background(#59AD5F);                //set new background
    for (int i =0; i<numOfDie; i++) {   //run a for loop based on the int numOfDie.
      myCup.addDice(new Die(255, 0));    //add Die values to Die array "dicePool"
    }
    myCup.shake();                      //run roll() thru the dicePool[] to add a random int value to the die.
    myCup.diceDraw(100, 100, 50);      //draws and sorts die based on the random int value given by shake funktion.
  }

  if (keyCode == UP) {                //when "Up" run shake(). adds a die to the diceCup and initialize diceCup with the updated numOfDie.
    background(#59AD5F);
    myCup.shake();
    numOfDie++;
   myCup = new diceCup(numOfDie);

    for (int i =0; i<numOfDie; i++) {
      myCup.addDice(new Die(255, 0));      //again adds the value to the dicePool[]
    }
  }
}
//Die randomDie() {
//  Die myDie = new Die(140, 0);

//  return myDie;
//}
