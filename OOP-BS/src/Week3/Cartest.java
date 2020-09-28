package Week3;

import java.util.Scanner;

public class Cartest {
	/*
	 * Đọc dữ liệu từ file cars.txt
	 * - Dòng đầu tiên là số xe (n)
	 * - Các dòng tiếp theo là các thuộc tính của mỗi xe, theo thứ tự:
	 * id
	 * name
	 * brand
	 * year
	 * price
	 * 1. Tìm những xe có giá cao nhất và in ra file output1.txt
	 * 2. Tìm những xe có nsx là BMW và in ra file output2.txt
	 * 3. Sắp xếp lại ds các xe theo thứ tự year tăng dần và in ra file output3.txt
	 */

	// Tạo mảng 1 chiều có n phần tử

	public static Car[] input(Scanner scan) { // Nhập số n vào
		System.out.println("Enter n:");
		int n = Integer.parseInt(scan.nextLine());

		Car car[] = new Car[n];

		for (int i = 0; i < n; i++) {
			String name = scan.nextLine();
			String ID = scan.nextLine();
			String brand = scan.nextLine();
			int year = Integer.parseInt(scan.nextLine());
			double price = Double.parseDouble(scan.nextLine());

			car[i] = new Car(ID, name, brand, year, price);
		}
		return car;
	}

	// In danh sách các phần từ của mảng
	public static void print(Car car[]) {
		for (int i = 0; i < car.length; i++)
			System.out.println(car[i].toString());

		System.out.println("Cách 2: ");
		for (Car s : car)
			System.out.println(s.toString());
	}

	// Tìm xe có giá cao nhất
	public static Car maxprice(Car car[]) {
		Car max = new Car();
		max = car[0];
		for (int i = 0; i < car.length; i++) {
			if (car[i].getprice() > max.getprice()) {
				max = car[i];
			}
		}
		return max;
	}

	// Tìm xe có hãng sx là BMW
	public static Car findbrand(Car car[], String brand) {
		Car car_brand = new Car();
		for (int i = 0; i < car.length; i++) {
			if (car[i].getbrand().equalsIgnoreCase(brand)) {
				car_brand = car[i];
			}
		}
		return car_brand;
	}
	// Sap xep cac xe theo thu tu năm SX giảm dần
	// Sắp xếp nổi bọt, chèn, chọn, ...

	public static void sort(Car car[]) {
		Car temp = new Car();
		for (int i = 0; i < car.length - 1; i++) {
			for (int j = i + 1; j < car.length; j++) {
				if (car[i].getyear() < car[j].getyear()) {
					temp = car[i];
					car[i] = car[j];
					car[j] = temp;
				}
			}
	//		a = 4, b = 5 --> temp = a = 4; a = b = 5; b = temp = 4; 
		}
		print(car);
	}

	// Run
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Car car[] = input(scan);
		print(car);
		System.out.println("Xe có giá max là:" + maxprice(car).toString());
		System.out.println("Xe có hãng BMW là:" + findbrand(car, "BMW").toString());
		sort(car);
	}
}