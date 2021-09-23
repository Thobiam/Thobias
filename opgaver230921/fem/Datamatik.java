public class Datamatik
{
	public static void main(String[] args)
	{
		Student [] studentArr = new Student[10];

		studentArr[0] = new Student("Morten", 22, false, "a", 10);
		studentArr[1] = new Student("Egon", 25, false, "a", 20);
		studentArr[2] = new Student("Kaj", 19, false, "a", 30);
		studentArr[3] = new Student("Pierre", 21, false, "a", 40);
		studentArr[4] = new Student("Fillip", 22, false, "a", 50);
		studentArr[5] = new Student("Benedigte", 20, true, "a", 60);
		studentArr[6] = new Student("Laura", 20, true, "b", 70);
		studentArr[7] = new Student("Emma", 21, true, "b", 80);
		studentArr[8] = new Student("Fiona", 20, true, "b", 90);
		studentArr[9] = new Student("Rasmus", 22, false, "b", 100);
		
	}

	static String pStudent(Student [] studentArr, int index){

		String studentName = "";

		for(int i = 0; i<studentArr.length; i++){
			if(studentArr[i].studyNumber == index){
				studentName = studentArr[i].name;
			}
		}
		System.out.println("studentName for studyNumber" + index + " is: " + studentName);
		return studentName;
	}
}