package hoffmanz.model;

import hoffmanz.data.Employee;

public class LoginDisplayModel {

	public Employee[] getEmployees() {
		
		Employee[] emps = new Employee[2];
		
		emps[0] = new Employee();
		emps[0].setUsername("steve");
		emps[0].setPassword("siugfb38".toCharArray());
		
		emps[1] = new Employee();
		emps[1].setUsername("francis");
		emps[1].setPassword("siugfb38".toCharArray());
		
		return emps;
	}
}
