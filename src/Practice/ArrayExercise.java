package Practice;

public class ArrayExercise {
	
	public static void main( String[] args)
	{
		double[] numbers = {1,3,5.5,8,10};
	
//		print first number present in array
		 System.out.println(numbers[0]);
		 
//		 print last number present in array
		 System.out.println(numbers[4]);
		 
		 System.out.println("--------------------");
//		 Print array in reverse order
		 for(int i = 4 ; i>=0 ; i--)
		 {
			 System.out.println(numbers[i]);
		 }
	System.out.println("-------------------------");
	
//	     Print sum of all numbers in array
	     double sum = 0;
	     for (double num : numbers)
	     {
	    	 sum += num;
	     }
	     System.out.println(sum);
	     
	     System.out.println("--------------");
	     
		 for(int a = 0 ; a<numbers.length ; a++)
		 {
			 System.out.println(numbers[a]);
		 }
		 
	}
	
}
