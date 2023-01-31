package javaLearn.concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streamss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list= new ArrayList<>();
		list.add("zApple");
		list.add("orange");
		list.add("App");
		list.add("en");
		
	Long c= list.stream().filter(s->s.startsWith("A")).count();
	
	//list.stream().filter(s->s.startsWith("A")).count();
	
Long  l=Stream.of("Apple","orage","maker","").filter(s->
	{
		s.startsWith("A");
		return true;
	}).count();

	//System.out.println(l);
	
	//list.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	
	list.stream().filter(s->s.endsWith("e")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
	List<Integer> values= Arrays.asList(1,2,2,5,5,3,6,6);
	values.stream().sorted().distinct().forEach(s->System.out.println(s));
	
	}

	
}
