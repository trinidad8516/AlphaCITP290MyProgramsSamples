package MapDemo;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class MapBuilderApp {

	public static void main(String[] args) {
		DataAccessObject<Person> pDao = new FilePersonDao();
		
		List<Person> persons = pDao.list();
		
		Map<String,Person> pMap = new TreeMap<String,Person>();
		
		for(Person p: persons) {
			pMap.put(p.getSsn(), p);
		}
		
		/*
		Person per1 = pMap.get("333333321");
		
		System.out.println(per1);
		*/
		
		for(Entry<String, Person> e: pMap.entrySet()) {
			System.out.println(e);
		}

	}

}
