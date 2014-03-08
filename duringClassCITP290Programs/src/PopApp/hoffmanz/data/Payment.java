/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hoffmanz.data;

import java.math.BigDecimal;

/**
 *
 * @author hoffmanz
 */
public class Payment {

    public static final BigDecimal TAX_RATE = new BigDecimal(0.06);
    private BigDecimal amount;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
