package hoffmanz.model;

import hoffmanz.data.Employee;

/**
 * Responsible for supplying all persistent data to the login display.
 * 
 * @author hoffmanz
 * 
 */
public class LoginDisplayModel {

	/**
	 * Provides an array of all employees in the system.
	 * 
	 * @return All employees
	 */
	public Employee[] getEmployees() {

		Employee[] emps = new Employee[2];

		emps[0] = new Employee();
		emps[0].setUsername("steve");
		emps[0].setPassword("steve".toCharArray());

		emps[1] = new Employee();
		emps[1].setUsername("francis");
		emps[1].setPassword("siugfb38".toCharArray());

		return emps;
	}
}
