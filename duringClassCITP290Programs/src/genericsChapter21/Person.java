package genericsChapter21;


	public class Person implements Comparable {

		private String firstName;
		private String lastName;
		private String emailAddres;
		private double phoneNumber;
	
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
		public String getEmailAddres() {
			return emailAddres;
		}
		public void setEmailAddres(String emailAddres) {
			this.emailAddres = emailAddres;
		}
		public double getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(double phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		@Override
		public int compareTo() {
			// TODO Auto-generated method stub
			return 0;
		}
		
}
