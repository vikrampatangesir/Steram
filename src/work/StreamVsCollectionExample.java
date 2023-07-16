package work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamVsCollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<String> names = new ArrayList<>();
	        names.add("Mike");
	        names.add("Syed");
	        names.add("Rajeev");
	        names.add("Miike");
	        System.out.println("--------");
	        System.out.println(names);
	        
	        Stream<String> namesStream= names.stream();
	        
	        List<String> list2 = names.stream().filter(s->s.startsWith("M")).collect(Collectors.toList());
	        
	        System.out.println(list2);
	        
	        

	}

}
