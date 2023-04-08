package classessWithAttribute;

public class Product {

	public Product() {

		System.out.println("Constructor worked");

	}

	public Product(int id, String name, String description, double price, int stockAmount, String productCode) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.productCode = productCode;
	}

	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String productCode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getProductCode() {
		return this.name.substring(1, 3) + this.id;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
