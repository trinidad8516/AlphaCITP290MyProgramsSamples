package hoffmanz.view;

public class LoginDisplayView {

	public void askForUsername() {
		System.out.print("Username: ");
	}
	
	public void askForPassword() {
		System.out.print("Password: ");
	}
	
	public void printLoginError() {
		System.out.println("Username and/or password invalid.");
	}
}
