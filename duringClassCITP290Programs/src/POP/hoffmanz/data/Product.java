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
public class Product {

    private String upc;
    private String description;
    private BigDecimal price;
    private int quantity;
    private int numInStock;

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
}
