package EmpSorting;

import java.util.Comparator;

public class SortByAge implements Comparator<Employee>{

	@Override
	public int compare(Employee age1, Employee age2) {
		
		return age1.age-age2.age;
	}
	

}
