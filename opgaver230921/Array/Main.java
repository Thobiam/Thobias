class Main
{
	public static void main(String[] args) 
	{

	int[]intArray = {2,4,8};
	String[]stringArray = {"ti","tyve","fem"};
	boolean[]booleanArray = {true, true, false};

	stringPrint(stringArray);

	int sum = addition(intArray);
	
	average = arrayAverage(intArray);

	System.out.print(sum);

	}
	static void stringPrint(String [] Array)
	{
	for(int i=0;i<Array.length;i++){
	System.out.println(Array[i]+" ");}
	}

	static int addition(int [] Array){
		int sum = 0;
		for(int i = 0;i<Array.length;i++){
			sum = Array[i]+sum;

		}
		return sum;
	}
	static int arrayAverage(int [] Array){
		int sum = addition(Array);
		int average = sum / Array.length;
		return average;
	} 

}
