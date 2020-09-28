package car_management;

public class Car {
	private String carId;
	private String carName;
	private String carBrand;
	private int year;
	private int price;
	
	public Car() {}
	
	public Car(String id,String name, String brand, int year, int price) {
		this.carId = id;
		this.carName = name;
		this.carBrand = brand;
		this.year = year;
		this.price = price;
	}
	
	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "car [carId=" + carId + ", carName=" + carName + ", carBrand=" + carBrand + ", year=" + year + ", price="
				+ price + "]";
	}
}
