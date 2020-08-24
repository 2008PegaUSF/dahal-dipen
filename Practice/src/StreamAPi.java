import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPi {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,4,5,30,6,7,4,5,88,76,23);
		
	//	list.stream().distinct().forEach(e->System.out.println(e));
	//	list.stream().filter(e -> e % 2 ==0  ) 
    //		.forEach(System.out::println);
		
		/*
		 * list.stream().filter(e -> e % 2 ==0 ) .peek(e ->
		 * System.out.println("Filtered value: " + e)) .collect(Collectors.toList());
		 */
		System.out.println(list.stream()
		.filter(e-> e % 3==0)
		.findFirst()
		.orElse(9));
		
		
	
		
	
	}

}
