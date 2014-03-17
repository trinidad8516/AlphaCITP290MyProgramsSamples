package MapDemo;

public class Person implements Comparable<Person> {

	private String ssn;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String emailAddress;

	public Person() {
		ssn = "";
		firstName = "";
		lastName = "";
		phoneNumber = "";
		emailAddress = "";
	}

	public Person(String personData) {
		String[] data = personData.split("\t", -1);
		ssn = data[0];
		firstName = data[1];
		lastName = data[2];
		phoneNumber = data[3];
		emailAddress = data[4];
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public int compareTo(Person p) {
		return this.getLastName().compareTo(p.getLastName());
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "Person [ssn=" + ssn + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", phoneNumber=" + phoneNumber
				+ ", emailAddress=" + emailAddress + "]";
	}

	public String toDataText() {
		return ssn + "\t" + firstName + "\t" + lastName + "\t" + phoneNumber
				+ "\t" + emailAddress;
	}
}
