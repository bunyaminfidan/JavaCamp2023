package courseSiteDemo.entities;

public class Course {

	private int id;
	private String courseName;
	private String imageUrl;
	private double ratio;
	private double unitPrice;

	public Course() {

	}

	public Course(int id, String courseName, String imageUrl, double ratio, double unitPrice) {

		this.id = id;
		this.courseName = courseName;
		this.imageUrl = imageUrl;
		this.ratio = ratio;
		this.unitPrice =  unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public double getRatio() {
		return ratio;
	}

	public void setRatio(double ratio) {
		this.ratio = ratio;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
