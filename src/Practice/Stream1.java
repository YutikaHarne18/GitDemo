package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Stream1 {

		@Test
		public static void filter() 
		{
//		Regular without using Stream
//		1. Find the count of name start with initial A from array
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Yutika");
		names.add("Ashish");
		names.add("Kuber");
		names.add("Archana");
		
		int count = 0;
		for (int i = 0 ; i<names.size() ; i++)
		{
			String actual = names.get(i);
			if (actual.startsWith("A"))
			{
				count++;
			}
		}
		System.out.println(count);
		
		}
	
		@Test
		public void streamFilter()
		{
			ArrayList<String> names = new ArrayList<String>();
			names.add("Yutika");
			names.add("Ashish");
			names.add("Kuber");
			names.add("Archana");
			
//			There is no life for intermediate operation if there is no terminal operation
//			Termianal operation will execute only if intermediate operation(filter) returns true
//			We can create stream
//			How to use filter in STream API
			
			long c = names.stream().filter(s -> s.startsWith("A")).count();
			System.out.println(c);
			
//			Lets directly create the stream
			long d = Stream.of("Yutika","Kuber","Archana","Ashish").filter(s->
			{
				s.startsWith("A");
				return false; //Forecefully return false as this will give output only if internediate operation means filter will return True so now output will be 0
			}).count();
			System.out.println(d);
			
//			Print the names present in array having more than 5 letters
			names.stream().filter(s->s.length()>5).forEach(s->System.out.println(s));
//			Print the names present in array having more than 5 letters only first result
			names.stream().filter(s->s.length()>5).limit(1).forEach(s->System.out.println(s));
			
		}
		
		@Test
		public void streamMAp()
		{
//			Print the names that ends with  "a" in uppercase using Map
			Stream.of("Yutika","Kuber","Archana","Ashish").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
			
//			Print names which has furst lettter as A with uppercase and sorted 
			List<String>  names = Arrays.asList("Yutika","Kuber","Archana","Ashish");
			names.stream().filter(s-> s.startsWith("A")).sorted().map(s-> s.toUpperCase()).forEach(s-> System.out.println(s));
			
//			Merge 2 different stream with sorted
			ArrayList<String> names1 = new ArrayList<String>();
			names1.add("Yuti");
			names1.add("Ashi");
			names1.add("Kub");
			names1.add("Archa");
			
			Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
//			newStream.sorted().forEach(s->System.out.println(s));
			
//			Validate if Yutika is present in stream or not
			boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("yutika"));
			Assert.assertTrue(flag);
		}
		
		@Test
		public void streamCollect()
		{
//			Create the new List with modification and save it to new list using collect
			List <String> ls =Stream.of("Yutika","Kuber","Archana","Ashish").filter(s->s.startsWith("A")).map(s->s.toUpperCase()).collect(Collectors.toList());
			System.out.println(ls);
			
//			Print the unique numbers form array and sort it
			List<Integer>  num = Arrays.asList(1,2,3,4,5,5,3,8);
			num.stream().distinct().forEach(s->System.out.println(s));
			
//			Print the 3rd index after sorting
			List<Integer> newLi = num.stream().distinct().sorted().collect(Collectors.toList());
			System.out.println(newLi.get(2));
			
		}

}
