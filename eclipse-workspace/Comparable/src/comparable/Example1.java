package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Example1 {

	public static void main(String[] args) {
		ArrayList<Employee> employee=new ArrayList<Employee>();
		
		employee.add(new Employee("Sam", 5, "Cognizant" ));
		employee.add(new Employee("Tom", 10, "Deloitte"));
		employee.add(new Employee("kate", 1, "HP" ));
		employee.add(new Employee("Harry", 2, "O2"));
		employee.add(new Employee("Anagha", 5, "Cognizant" ));
		employee.add(new Employee("Megha", 6, "Google"));
				System.out.println(employee);
				Collections.sort(employee);
				System.out.println(employee);
	}

}
