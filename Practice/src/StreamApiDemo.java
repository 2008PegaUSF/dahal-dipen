import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApiDemo {

	public static void main(String[] args) {
		List<Person> people = getPeople();

		
		//filter
		List<Person> female= people.stream()
				.filter(person -> person.getGender().equals(Gender.FEMALE))
				.collect(Collectors.toList());
				
			//female.forEach(System.out::println);
	 //sort
	List<Person> sorted=people.stream()
			.sorted(Comparator.comparing(Person::getAge).reversed())
			.collect(Collectors.toList());
			
		//sorted.forEach(System.out::println);	
	//Allmatch
	boolean allmatch= people.stream()
	.allMatch(person->person.getAge()>5);
	//System.out.println(allmatch);
	
	//AnyMatch
	boolean anymatch= people.stream()
			.anyMatch(person->person.getAge()>7);
			//System.out.println(anymatch);

	//Nonematch
	boolean nonmatch= people.stream()
					.noneMatch(person-> person.getName().equals("Peter Parkar"));
		//			System.out.println(nonmatch);
	//Max
		/*
		 * people.stream() .max(Comparator.comparing(Person::getAge))
		 * .ifPresent(System.out::println);
		 */
	
	//Min
		/*
		 * people.stream() .min(Comparator.comparing(Person::getAge))
		 * .ifPresent(System.out::println);
		 */
		
	//groupby
		Map<Gender, List<Person>> groubyGender = people.stream()
				.collect(Collectors.groupingBy(Person::getGender));
		
		/*
		 * groubyGender.forEach((gender,people1) -> { System.out.println(gender);
		 * people1.forEach(System.out::println); System.out.println(); });
		 */
	Optional<String> oldestFemaleAge=  people.stream()
    .filter(person->person.getGender().equals(Gender.FEMALE))
    .max(Comparator.comparing(Person::getAge))
    .map(Person::getName);
    
    //oldestFemaleAge.ifPresent(System.out::println);
		
 //findFirst eg	
	Optional<Person> findfirst=  people.stream()
			 
			   //.filter(person-> !person.getName().equalsIgnoreCase("Peter Parkar"))
			    .findFirst();
			    
	            if(findfirst.isPresent())
	            {
	            	Person name= findfirst.get();
	            	System.out.println(name);
	            }
	            else
	            {	            	
	            	System.out.println("No Value Found");
	            }
	//findAny
	            
	         Optional<Person> any = people.stream().filter(person ->person.getAge()>100).findAny();
	            if (any.isPresent()) {
	                Person result = any.get();
	                System.out.println(result);
	            }
       
	    
        	
		
		
		
		
	
	}
	

			
	
	private static List<Person> getPeople() {
		
		Person[] arrayOfEmps = {
				 new Person("Peter Parkar", 20, Gender.MALE),
			        new Person("Alina Smith", 33, Gender.FEMALE),
			        new Person("Helen White", 57, Gender.FEMALE),
			        new Person("Alex Boz", 14, Gender.MALE),
			        new Person("Jamie Goa", 99, Gender.MALE),
			        new Person("Anna Cook", 7, Gender.FEMALE),
			        new Person("Zelda Brown", 120, Gender.FEMALE)
		    };
		
		List<Person> empList = Arrays.asList(arrayOfEmps);
		
	    return empList;
	    
	  } 
	

}
