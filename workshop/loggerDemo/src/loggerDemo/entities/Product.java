package loggerDemo.entities;

public class Product {

	private int id;
	private String productName;
	private String description;
	private int amountStock;
	private int price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAmountStock() {
		return amountStock;
	}

	public void setAmountStock(int amountStock) {
		this.amountStock = amountStock;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
