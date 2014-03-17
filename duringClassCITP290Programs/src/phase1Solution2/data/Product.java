package phase1Solution2.data;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * 
 * @author hoffmanz
 */
public class Product {

	private String upc;
	private String description;
	private BigDecimal price;
	private int quantity;
	private int numInStock;

	public Product() {
		
	}
	
	public Product(Product p) {
		this.upc = p.getUpc();
		this.description = p.getDescription();
		this.price = p.getPrice();
		this.quantity = p.getQuantity();
		this.numInStock = p.getNumInStock();
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getNumInStock() {
		return numInStock;
	}

	public void setNumInStock(int numInStock) {
		this.numInStock = numInStock;
	}

	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		return description + " " + nf.format(price) + " x " + quantity + " = "
				+ nf.format(price.multiply(new BigDecimal(quantity)));
	}
}
