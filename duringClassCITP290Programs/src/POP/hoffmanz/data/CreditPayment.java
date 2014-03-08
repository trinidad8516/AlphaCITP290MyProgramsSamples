/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hoffmanz.data;

/**
 *
 * @author hoffmanz
 */
public class CreditPayment extends Payment {

    private String cardNum;
    private String expirationDate;

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
