package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEmp {

	public static void main(String[] args)
	{
		List<Employee> lste=new ArrayList<Employee>();
		lste.add(new Employee("abc"));
		lste.add(new Employee("xyz"));
		lste.add(new Employee("aaa"));
		System.out.println(lste);
		
		lste.forEach(obj1 -> System.out.println(obj1));
		
		Collections.sort(lste);
		lste.forEach(obj1 -> System.out.println(obj1));
	}
}


