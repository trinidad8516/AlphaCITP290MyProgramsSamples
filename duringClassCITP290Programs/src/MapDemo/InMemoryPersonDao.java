package MapDemo;

import java.util.ArrayList;
import java.util.List;

public class InMemoryPersonDao implements DataAccessObject<Person> {

	private static List<Person> dataStore = new ArrayList<Person>();

	@Override
	public void create(Person e) {
		dataStore.add(e);

	}

	@Override
	public Person read(String ssn) {
		Person temp = null;

		for (Person p : dataStore) {
			if (p.getSsn().equals(ssn)) {
				temp = p;
				break;
			}
		}
		return temp;
	}

	@Override
	public void update(Person e) {
		for (Person p : dataStore) {
			if (p.getSsn().equals(e.getSsn())) {
				p.setEmailAddress(e.getEmailAddress());
				p.setFirstName(e.getFirstName());
				p.setLastName(e.getLastName());
				p.setPhoneNumber(e.getPhoneNumber());
				break;
			}
		}

	}

	@Override
	public void delete(String ssn) {
		Person temp = null;
		for (Person p : dataStore) {
			if (p.getSsn().equals(ssn)) {
				temp = p;
				break;
			}
		}
		dataStore.remove(temp);

	}

	@Override
	public List<Person> list() {
		return dataStore;
	}

}
