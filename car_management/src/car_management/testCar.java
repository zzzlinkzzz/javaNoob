package car_management;

import java.util.ArrayList;
import java.util.Scanner;

public class testCar {
	
	public static void print(Car carData[]) {
		for (Car c: carData)
			System.out.println(c.toString());
	}
	
	//input array:
	public static Car[] inputAr(Scanner scan) {
		int n = Integer.parseInt(scan.nextLine());
		System.out.println("Enter n: ");
		Car[] carData = new Car[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("carId: ");
			String id = scan.nextLine();
			
			System.out.println("carName: ");
			String name = scan.nextLine();
			
			System.out.println("carBrand: ");
			String brand = scan.nextLine();
			
			System.out.println("year: ");
			int year = Integer.parseInt(scan.nextLine());
			
			System.out.println("price: ");
			int price = Integer.parseInt(scan.nextLine());
			
			carData[i] = new Car(id, name, brand, year, price);
		}
		
		return carData;
	}
	
	//input arraylist:
	public static ArrayList<Car> inputal(Scanner scan){
		int n = Integer.parseInt(scan.nextLine());
		System.out.println("Enter n: ");
		ArrayList<Car> carArl = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			System.out.println("carId: ");
			String id = scan.nextLine();
			
			System.out.println("carName: ");
			String name = scan.nextLine();
			
			System.out.println("carBrand: ");
			String brand = scan.nextLine();
			
			System.out.println("year: ");
			int year = Integer.parseInt(scan.nextLine());
			
			System.out.println("price: ");
			int price = Integer.parseInt(scan.nextLine());
			
			Car c = new Car(id, name, brand, year, price);
			
			carArl.add(c);
		}
		
		
		return carArl;
	}
	
	public static Car findMaxPrice(Car[] carData) {
		int p = 0;
		Car c = carData[0];
		
		for (int i = 0; i < carData.length; i++) {
			if (carData[i].getPrice() > p) {
				p = carData[i].getPrice();
				c = carData[i];
			}
		}
		return c;
	}
	
	public static ArrayList<Car> lookUpBrand(Car[] carData,String brand) {
		ArrayList<Car> brandList = new ArrayList<>();
		
		for (int i = 0; i < carData.length; i ++) {
			if(carData[i].getCarBrand() == brand) {
				brandList.add(carData[i]);
			}
		}
		
		return brandList;
		
	}
	
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		
		Car[] carData = inputAr(scan);
		
		print(carData);
		
		findMaxPrice(carData);
		
		ArrayList<Car> BMWList = lookUpBrand(carData, "BMW");
		
		for (int i = 0; i < BMWList.size(); i++) {
			System.out.println(BMWList.get(i));
		}
		
	}
}
