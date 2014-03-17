package daoDemo;

import java.util.Collections;
import java.util.List;


public class PersonSorterApp {

	public static void main(String[] args) {
		
		Person[] ps = new Person[3];
		
		ps[0] = new Person();
		ps[0].setLastName("Hoffmann");
		ps[0].setSsn("1");
		
		ps[1] = new Person();
		ps[1].setLastName("Smith");
		ps[1].setSsn("2");
		
		ps[2] = new Person();
		ps[2].setLastName("Adams");
		ps[2].setSsn("3");
		
//		DataAccessObject<Person> pdao = new InMemoryPersonDao();
		DataAccessObject<Person> pdao = new FilePersonDao();
		pdao.create(ps[0]);
		pdao.create(ps[1]);
		pdao.create(ps[2]);
		
		ps[2].setLastName("Addams");
		pdao.update(ps[2]);
		
		pdao.delete(ps[1].getSsn());
		
		List<Person> persons = pdao.list();
		Collections.sort(persons);
		
		for(Person p: persons) {
			System.out.println(p.getLastName());
		}

	}
}
