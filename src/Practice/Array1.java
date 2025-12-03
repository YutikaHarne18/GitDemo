package Practice;

public class Array1 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 6;
		arr[3] = 4;
		arr[4] = 5;
		
		int[] arr2 = {1,2,3,4,5,6};
		
		System.out.println(arr[1]);
		System.out.println(arr2[3]);
		
		for (int i = 0 ; i<arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
	
		System.out.println("--------------");
		
		for (int p = 0 ; p<arr.length ;p++)
		{
			System.out.println(arr2[p]);
		}
		
		System.out.println("--------------");

		
		String[] names = {"yutika","kuber","deva","cuty"};
		
		for (int n = 0 ; n<names.length ; n++)
		{
			System.out.println(names[n]);
		}
		
		System.out.println("--------------");
		
		for(String s : names)
		{
			System.out.println(s);
		}
		
	}
	
}
