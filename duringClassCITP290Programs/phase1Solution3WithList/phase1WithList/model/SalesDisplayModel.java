package phase1WithList.model;

import java.math.BigDecimal;

import phase1WithList.data.Product;

/**
 * Responsible for supplying all persistent data to the sales display.
 * 
 * @author hoffmanz
 * 
 */
public class SalesDisplayModel {

	/**
	 * Provides an array of all products in the inventory.
	 * 
	 * @return All products
	 */
	public Product[] getInventory() {
		Product[] ps = new Product[3];

		ps[0] = new Product();
		ps[0].setUpc("1");
		ps[0].setDescription("BANANAS");
		ps[0].setPrice(new BigDecimal(.59));
		ps[0].setNumInStock(10);

		ps[1] = new Product();
		ps[1].setUpc("2");
		ps[1].setDescription("APPLES");
		ps[1].setPrice(new BigDecimal(.79));
		ps[1].setNumInStock(23);

		ps[2] = new Product();
		ps[2].setUpc("3");
		ps[2].setDescription("PEARS");
		ps[2].setPrice(new BigDecimal(.65));
		ps[2].setNumInStock(5);

		return ps;
	}

}
