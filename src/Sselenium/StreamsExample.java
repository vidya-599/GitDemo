package Sselenium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class StreamsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// using filter
		Stream<String> d = Stream.of("a", "b", "c");
		Stream.of("a", "b", "c").filter(s -> s.startsWith("a")).count();
		long e = Stream.of("a", "b", "c").filter(s ->
		{
			 s.startsWith("a");
				return true;
		}). count();
		// print all names
		Stream.of("a", "b", "c").filter(s -> s.length()>4).forEach(s -> System.out.println(s));
		// limit to 1
		Stream.of("a", "b", "c").filter(s -> s.length()>4).limit(1).forEach(s -> System.out.println(s));
		
		// using sorting & map
		Stream.of("a", "b", "c").filter(s -> s.startsWith("a")).sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

		//merging 2 diff streams
		Stream<String> mergedStreams = Stream.concat(Stream.of("a", "b", "c"), Stream.of("a", "b", "c"));
		//Check if list has matching element 
		boolean newStream = mergedStreams.anyMatch(h -> h.equalsIgnoreCase("a"));
		Assert.assertTrue(newStream);
		
		//collection using javastreams
		List<String> list = Stream.of("a", "b", "c").filter(s -> s.startsWith("a")).map(s -> s.toUpperCase()).collect(Collectors.toList());
		String s = list.get(0);
		
		// print unique numbers & sort the array...distinct gives unique numbers
		List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9);
		num.stream().distinct().forEach(w -> System.out.println(w));
		// sort and give 3rd index
		List<Integer> value = num.stream().distinct().sorted().collect(Collectors.toList());
		value.get(2);
	} 

}
