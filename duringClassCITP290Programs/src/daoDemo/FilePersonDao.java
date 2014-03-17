package daoDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilePersonDao implements DataAccessObject<Person> {

	private List<Person> readAllPersons() {
		File f = new File("persons.dat");
		List<Person> ps = new ArrayList<Person>();

		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				System.out.println("Could not create file.");
			}
		}

		Scanner sc = null;

		try {
			sc = new Scanner(f);
		} catch (FileNotFoundException e) {
			System.out.println("Could not open file.");
		}

		while (sc.hasNext()) {
			ps.add(new Person(sc.nextLine()));
		}

		return ps;
	}

	private void writeAllPersons(List<Person> ps) {
		File f = new File("persons.dat");
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				System.out.println("Could not create file.");
			}
		}

		PrintWriter pw = null;

		try {
			pw = new PrintWriter(f);
		} catch (FileNotFoundException e) {
			System.out.println("Could not locate file.");
		}

		for (Person p : ps) {
			pw.println(p.toDataText());
		}

		pw.close();
	}

	@Override
	public void create(Person e) {
		List<Person> ps = readAllPersons();

		boolean match = false;

		for (Person p : ps) {
			if (p.getSsn().equals(e.getSsn())) {
				match = true;
				break;
			}
		}

		if (!match) {
			ps.add(e);
		}

		writeAllPersons(ps);

	}

	@Override
	public Person read(String ssn) {
		List<Person> ps = readAllPersons();

		Person match = null;
		for (Person p : ps) {
			if (p.getSsn().equals(ssn)) {
				match = p;
				break;
			}
		}

		return match;
	}

	@Override
	public void update(Person e) {
		List<Person> ps = readAllPersons();

		for (Person p : ps) {
			if (p.getSsn().equals(e.getSsn())) {
				p.setFirstName(e.getFirstName());
				p.setLastName(e.getLastName());
				p.setPhoneNumber(e.getPhoneNumber());
				p.setEmailAddress(e.getEmailAddress());
			}
		}

		writeAllPersons(ps);

	}

	@Override
	public void delete(String ssn) {
		List<Person> ps = readAllPersons();

		Person match = null;
		for (Person p : ps) {
			if (p.getSsn().equals(ssn)) {
				match = p;
			}
		}
		if (match != null) {
			ps.remove(match);
		}

		writeAllPersons(ps);

	}

	@Override
	public List<Person> list() {
		return readAllPersons();
	}

}
