package work;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {

	public static void main(String[] args) 
	{
		
		List<String> cd =List.of("Aman","Ankit","Durgesh","vikram","anita");
		
		List<String> newList  =cd.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
		
		for (String string : newList) 
		{
		    System.out.println(string);	
		}
		
		
		List<Integer> listNumber=List.of(100,30,45,66,77,88);
		List newLinistNumer=(List) listNumber.stream().map(i->i*i).collect(Collectors.toList());
		//System.out.println(newLinistNumer);
		listNumber.stream().forEach(e-> {System.out.println(e);});
		
		Integer  minNumber=listNumber.stream().min((x,y)->x.compareTo(y)).get();
		
		System.out.println("min:"+minNumber);
		
		
		
		

	}

}
