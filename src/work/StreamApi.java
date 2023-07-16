package work;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] ints = new Integer[] {1,2,3,4,5,6,7,8,9};
		List<Integer> list = Arrays.asList(ints);
		
		List newlist=list.stream().filter(i->i % 4== 0).collect(Collectors.toList());
		System.out.println(newlist);
		List list2=list.stream().filter(i->i>3).collect(Collectors.toList());
		System.out.println(list2);
		
		
	
	}

}
