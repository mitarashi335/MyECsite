import java.util.ArrayList;
import java.util.List;

public class ListPractice {
	public static void main(String[] args){
	Person sato=new Person("sato",28);
	Person monzen=new Person("monzen",22);
	Person suzuki=new Person("suzuki",31);

	List<Person>PersonList=new ArrayList<Person>();
	PersonList.add(sato);
	PersonList.add(monzen);
	PersonList.add(suzuki);

	for(Person s:PersonList){
		System.out.println(s.getName()+"は"+s.getAge()+"才");
	}

	System.out.println("1件目は"+PersonList.get(0).getName()+"さんです");
	}
}
