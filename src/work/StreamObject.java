package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {
		

		String name[]= {"Vikram","Ankit","mahesh"};
		
		Stream list=Stream.of(name);
		
		list.forEach(e->{
			     System.out.println(e);
		});
		 List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
	     list3.stream().forEach(i -> {System.out.print(i + " ");});	 
	}

}
