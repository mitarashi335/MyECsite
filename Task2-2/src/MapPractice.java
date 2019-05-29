import java.util.HashMap;
import java.util.Map;
public class MapPractice {
	public static void main(String[] args){

		Person sato=new Person("sato",28);
		Person monzen=new Person("monzen",22);
		Person suzuki=new Person("suzuki",31);

		Map<String, Person> personMap = new HashMap<String, Person>( ){
			{
				put("佐藤",sato );
				put("門前",monzen );
				put("鈴木",suzuki  );
			}
		};
		if(personMap.containsKey("門前")==true){
			System.out.println("門前さんはいます");
		}else{
			System.out.println("門前さんは離席しています");
		};

		System.out.println(personMap.get("鈴木").getAge()+"才が最年長です");

		for(Map.Entry<String,Person> k:personMap.entrySet()){
			System.out.println(k.getKey()+"は"+k.getValue().getAge()+"才");
		};
	}
}
