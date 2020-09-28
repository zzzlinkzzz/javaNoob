package Week3;

public class Car {
	
	private String ID;
	private String name;
	private String brand;
	private int year;
	private double price;
	
// Hàm dựng có đối
public Car(String ID, String name , String brand, int year, double price) 
	{
	this.ID=ID;
	this.name=name;
	this.brand=brand;
	this.year=year;
	this.price=price;
	}

//Hàm dựng không đối
public Car() {}

//Setname vì biến là private
public void setname(String name)
	{this.name=name;}

// Getname vì biến là private 
public String getname()
	{return name;}	
//setID
public void setid(String ID)
{this.ID=ID;}
//get ID
public String getid()
{return ID;}
//set brand
public void setbrand(String brand)
{this.brand=brand;}
//getbrand
public String getbrand()
{return brand;}
//set year
public void setyear(int year)
{this.year=year;}
// getyear
public int getyear()
{return year;}
//setprice
public void setprice(double price)
{this.price=price;}
//get price
public double getprice()
{return price;}
//Tostring
public String toString() {
	return "Car [" + name + "\t " + ID + "\t" + brand + "\t" +year + "\t"+ price+"]";
	}

}
