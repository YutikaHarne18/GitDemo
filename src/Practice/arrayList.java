package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayList {
	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>(); //Her i have created object of ArrayList class
		a.add("1"); // To add data in ArrayList
		a.add("Yutika");
		a.add("Kuber");
		a.add("2");
		a.remove(3); //To remove data (give index number)
		System.out.println(a.get(2));
		
//		for loop to get the data from arraylist
		for(int i = 0 ; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}
		
//		another for loop type to get the data present in ArrrayList
		for (String val : a)
		{
			System.out.println(val);
		}
		
//		To check whether this data present in Arraylist or Not
		System.out.println(a.contains("yutika"));
		
//		Convert simple array to array list
		String[] names = {"Yutika", "Kuber"};
		List<String> namesList = Arrays.asList(names);
		System.out.println(namesList.contains("Yutika"));
		
		
	}

}
