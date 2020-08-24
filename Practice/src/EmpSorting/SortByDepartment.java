package EmpSorting;

import java.util.Comparator;

public class SortByDepartment implements Comparator<Employee> {

	@Override
	public int compare(Employee dep1, Employee dep2) {
		return  dep1.Department.compareTo(dep2.Department);
	}

}
