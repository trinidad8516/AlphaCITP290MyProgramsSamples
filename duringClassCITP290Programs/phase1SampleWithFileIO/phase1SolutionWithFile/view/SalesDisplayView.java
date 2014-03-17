package phase1SolutionWithFile.view;

import phase1SolutionWithFile.data.Payment;
import phase1SolutionWithFile.data.Product;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * Output methods for the sales display.
 * 
 * @author hoffmanz
 * 
 */
public class SalesDisplayView {

	/**
	 * Prints all products in the invoice including subtotal, tax, and total.
	 * 
	 * @param invoice
	 *            The current invoice
	 * @param subtotal
	 *            The current subtotal
	 */
	public void printInvoice(Product[] invoice, BigDecimal subtotal) {

		NumberFormat nf = NumberFormat.getCurrencyInstance();

		System.out.println("+----------------------------------+");
		for (Product p : invoice) {
			System.out.println("|  " + p);
		}

		System.out.println("+----------------------------------+");
		System.out.println("Subtotal: " + nf.format(subtotal));
		System.out.println("Tax: "
				+ nf.format(subtotal.multiply(Payment.TAX_RATE)));
		System.out.println("Total: "
				+ nf.format(subtotal.add(subtotal.multiply(Payment.TAX_RATE))));

	}

	/**
	 * Prints all payments in the invoice including the total amount paid and
	 * the amount remaining due.
	 * 
	 * @param payments
	 *            The current set of payments
	 * @param amountPaid
	 *            The total amount paid
	 * @param amountDue
	 *            The total amount still due
	 */
	public void printPayments(Payment[] payments, BigDecimal amountPaid,
			BigDecimal amountDue) {
		NumberFormat nf = NumberFormat.getCurrencyInstance();

		System.out.println("+----------------------------------+");
		for (Payment p : payments) {
			System.out.println("|  " + p);
		}

		System.out.println("+----------------------------------+");
		System.out.println("Amount Paid: " + nf.format(amountPaid));
		System.out.println("Amount Due: " + nf.format(amountDue));

	}

	public void displayOrderMenu() {
		System.out.println("Please choose one of the following:");
		System.out.println("1) Add Product");
		System.out.println("2) Remove Product");
		System.out.println("3) Finish");
		System.out.println("4) Log Out");
		System.out.println("5) Add New Employee");

	}

	public void displayPaymentMenu() {
		System.out.println("Please choose one of the following:");
		System.out.println("1) Add Payment");
		System.out.println("2) Remove Payment");
	}

	public void askForUpc() {
		System.out.print("UPC: ");
	}

	public void askForQuantity() {
		System.out.print("Quantity: ");
	}

	public void displayProductNotFound(String upc) {
		System.out.println("Product " + upc + " could not be found.");
	}

	public void displayInvalidQuantity(String qs) {
		System.out.println(qs + " is not a valid quantity.");
	}

	public void displayInvalidChoice(String choice) {
		System.out.println(choice + " is not a valid choice.");
	}

	public void displayMustHaveProduct() {
		System.out
				.println("You must have at least one product in your invoice to complete a sale.");
	}

	public void displayChangeDue(BigDecimal changeDue) {
		NumberFormat nf = NumberFormat.getCurrencyInstance();

		System.out.println("Change Due: " + nf.format(changeDue));

	}

	public void displayPaymentTypeMenu() {
		System.out.println("Please choose one of the following:");
		System.out.println("1) Cash");
		System.out.println("2) Credit");
		System.out.println("3) Check");

	}

	public void askForAmount() {
		System.out.print("Payment Amount: ");
	}

	public void askForCreditCardNumber() {
		System.out.print("Credit Card Number: ");
	}

	public void askForExpirationDate() {
		System.out.print("Expiration Date: ");
	}

	public void askForAccountNumber() {
		System.out.print("Account Number: ");
	}

	public void askForRoutingNumber() {
		System.out.print("Routing Number: ");
	}

	public void askForCheckNumber() {
		System.out.println("Check Number: ");
	}

	public void askForPaymentNumber() {
		System.out.println("Line number of payment to remove: ");

	}

}
