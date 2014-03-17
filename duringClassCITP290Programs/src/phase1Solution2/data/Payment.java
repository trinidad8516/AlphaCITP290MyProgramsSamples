package phase1Solution2.data;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * 
 * @author hoffmanz
 */
public class Payment {

	/**
	 * This is the current tax rate.
	 */
	public static final BigDecimal TAX_RATE = new BigDecimal(0.06);
	private BigDecimal amount;

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * Returns the amount in a currency formatted String.
	 * 
	 * @return The amount as a String
	 */
	public String getFormattedAmount() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		return nf.format(amount);
	}
}
