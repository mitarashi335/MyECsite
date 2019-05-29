import java.util.ArrayList;
import java.util.List;

public class ListPractice {
	public static void main(String[] args){

		Person A = new Person("sato",28);
		Person B = new Person("monzen",22);
		Person C = new Person("suzuki",31);

		List<Person> personList = new ArrayList<Person>();
		personList.add(A);
		personList.add(B);
		personList.add(C);

		for(Person s:personList){
			System.out.println(s.getName()+"さんは"+s.getAge()+"才");
		}
		System.out.println("1件目は"+personList.get(0).getName()+"さんです");
	}

}
