package phase1SolutionWithFile.data;

/**
 * 
 * @author hoffmanz
 */
public class CashPayment extends Payment {

	@Override
	public String toString() {
		return "Cash: " + this.getFormattedAmount();
	}

}
