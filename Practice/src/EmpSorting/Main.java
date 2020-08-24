package EmpSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Employee> emp= new ArrayList<Employee>();
		
		emp.add(new Employee("Susan","Software",30));
		emp.add(new Employee("Prem","Designer",32));
		emp.add(new Employee("Nabin","Civil",28));
		emp.add(new Employee("Peter","Marvel",45));
		
		//sorting by name
		Collections.sort(emp, new SortByName());
		System.out.println("Sorted By Name"); 
		System.out.println("==============");
        for (int i=0; i<emp.size(); i++) 
        {
        	System.out.println(emp.get(i));
        }
           System.out.println(""); 
           System.out.println(""); 
                     
        //sorting by department
        Collections.sort(emp, new SortByDepartment());
        System.out.println("Sort By Department");
        System.out.println("===================");
        
        for (int i=0; i<emp.size(); i++) 
        {
        	System.out.println(emp.get(i));
        }
        System.out.println("");
        System.out.println("");
      //sorting by department
        Collections.sort(emp, new SortByAge());
        System.out.println("Sort By Age");
        System.out.println("===================");
        
        for (int i=0; i<emp.size(); i++) 
        {
        	System.out.println(emp.get(i));
        }
        
  
		
	}

	

}
