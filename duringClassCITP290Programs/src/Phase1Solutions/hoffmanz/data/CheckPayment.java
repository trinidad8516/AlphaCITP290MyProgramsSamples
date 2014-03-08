package hoffmanz.data;

/**
 * 
 * @author hoffmanz
 */
public class CheckPayment extends Payment {

	private String routingNum;
	private String accountNum;
	private String checkNum;

	public String getRoutingNum() {
		return routingNum;
	}

	public void setRoutingNum(String routingNum) {
		this.routingNum = routingNum;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getCheckNum() {
		return checkNum;
	}

	public void setCheckNum(String checkNum) {
		this.checkNum = checkNum;
	}

	@Override
	public String toString() {
		return "Check (#" + accountNum + "): " + this.getFormattedAmount();
	}

}
