package phase1SolutionWithFile.controller;

import phase1SolutionWithFile.data.Employee;
import phase1SolutionWithFile.model.LoginDisplayModel;
import phase1SolutionWithFile.view.LoginDisplayView;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Handles all procedural logic for the login display. An employee must
 * successfully log in to advance past this display.
 * 
 * @author Zack Hoffmann
 * 
 */
public class LoginDisplayController {

	/**
	 * Kicks off operation of the controller.
	 * 
	 */
	public void run() {
		LoginDisplayView view = new LoginDisplayView();
		LoginDisplayModel model = new LoginDisplayModel();

		Scanner sc = new Scanner(System.in);

		Employee tempEmp = null;

		while (tempEmp == null) {

			view.askForUsername();
			String username = sc.nextLine();
			view.askForPassword();
			char[] password = sc.nextLine().toCharArray();

			for (Employee e : model.getEmployees()) {
				if (e.getUsername().equals(username)
						&& Arrays.equals(e.getPassword(), password)) {
					tempEmp = e;
					break;
				}
			}
			if (tempEmp == null) {
				view.printLoginError();
			}
		}

		new SalesDisplayController(tempEmp).run();

		sc.close();

	}
}
