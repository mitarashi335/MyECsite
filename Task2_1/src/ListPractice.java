import java.util.ArrayList;
import java.util.List;

public class ListPractice {
	public static void main(String[] args){
		Person A =new Person("aaa",10);
		Person B =new Person("bbb",11);
		Person C =new Person("ccc",12);

		List<Person>personList=new ArrayList<Person>();

		personList.add(A);
		personList.add(B);
		personList.add(C);

		for(Person s : personList){
			System.out.println(s.getName()+"は"+s.getAge()+"才");
		}
		System.out.println("1件目は"+personList.get(0).getName()+"さんです");
	}
}
