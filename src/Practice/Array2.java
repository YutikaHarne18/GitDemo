package Practice;


public class Array2 {
	
	public static void main(String[] args) {
		
//		Find multiple of 2 from given array
		int[] num = {1,2,3,4,5,6,7,8,9};
		
		for(int i= 0  ; i<num.length ; i++)
		{
			if(num[i] % 2 == 0)
			{
				System.out.println(num[i]);
				break; //this is used to break the loop after getting first multiple of 2
			}
			
			else 
			{
				System.out.println(num[i] + " is not multiple of 2");
			}
		}
		
	}
	
}
