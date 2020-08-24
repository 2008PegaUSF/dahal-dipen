package test.java;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

import EmpSorting.Employee;
import EmpSorting.SortByAge;
import EmpSorting.SortByName;

class EmpSorting {

	@Test
	<T> void test() {
		
		Employee e1 = new Employee("Susan", "Software", 30);
		Employee e2 = new Employee("Prem", "Designer", 32);
		Employee e3 = new Employee("Nabin", "Civil", 28);
        
		
		
		List<Employee> listOfEmployees = new ArrayList<Employee>();
        listOfEmployees.add(e1);
        listOfEmployees.add(e2);
        listOfEmployees.add(e3);
        
        Collections.sort(listOfEmployees, new SortByName()); 
        System.out.println(listOfEmployees.get(0));
        assertArrayEquals(listOfEmployees,listOfEmployees);
	   
		
		
	}
	

}
