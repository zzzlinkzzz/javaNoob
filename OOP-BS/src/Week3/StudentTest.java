package Week3;

import java.util.Scanner;
/*
 * Bài tập về nhà: Quản lí xe ô tô (Mảng, ArrayList)
 * Mỗi ô tô sẽ có các thuộc tính:
 * 1. Mã ô tô (String)
 * 2. Tên ô tô (String)
 * 3. Hãng sản xuất (String)
 * 4. Năm sản xuất (int)
 * 5. Giá (double)
 * --> Tạo ra một lớp Car.java mô tả đối tượng ô tô (thuộc tính, hàm dựng có đối, không đối, setters, getters, toString())
 * Tạo ra một lớp CarTest.java thực hiện các yêu cầu sau:
 * 1. Nhập vào một mảng gồm n ô tô
 * 2. In ra thông tin của từng ô tô trong mảng.
 * 3. Tìm ra các ô tô có giá cao nhất?
 * 4. Tìm ra các ô tô có hãng sản xuất là "BMW"
 * 5. Sắp xếp các ô tô theo thứ tự năm giảm dần?
 */

public class StudentTest {

	// Tìm ra sinh viên có điểm cao nhất?
	public static Student findMaxScore(Student stds[])
	{
		// Gán max = điểm của sinh viên thứ 0 trong mảng stds
		double max = stds[0].getScore();
		Student s = new Student();
		s = stds[0];
		
		// Student s = new Student();
		// s = stds[0]
		//.. s.getScore() < stds[i].getScore() --> s = stds[i];
		
		for(int i = 1; i < stds.length; i ++)
			if(max < stds[i].getScore())
			{
				max = stds[i].getScore();
				s = stds[i];
			}
		return s;
	}
	
	// Sắp xếp danh sách sinh viên theo điểm số tăng dần
	// Tìm sinh viên có quê quán ở Hà Nội?
	// Tìm điểm trung bình của các sinh viên
	// 
	
	public static Student[] input(Scanner scan) {
		System.out.println("Enter n = ");
		int n = Integer.parseInt(scan.nextLine());

		// int n = scan.nextInt();
		// scan.nextLine();

		// Khai báo mảng sinh viên:
		// int array[] = new int[n];
		Student stds[] = new Student[n];

		for (int i = 0; i < n; i++) {
			// Nhập từng thông tin cho sinh viên thứ i
			String name = scan.nextLine();
			double score = Double.parseDouble(scan.nextLine());

			// Tạo sinh viên thứ i từ các thông tin vừa nhập trên
			// stds[i] = new Student();
			// stds[i].setName(name);
			// stds[i].setScore(score);

			// Cách 2: Sử dụng hàm dựng có đối:
			stds[i] = new Student(name, score);
		}
		return stds;
	}
	
	public static void print(Student stds[])
	{
		// In ra thông tin của từng sinh viên
		for (int i = 0; i < stds.length; i++)
			System.out.println(stds[i].toString());

		// In ra thông tin theo cách 2:
		System.out.println("Cách 2: ");
		for (Student s : stds)
			System.out.println(s.toString());
	}

	public static void main(String[] args) {
		// Tạo 1 sinh viên có tên là Nguyễn Văn A, điểm là 7.0

		// Sử dụng hàm dựng không đối
//		Student std1 = new Student();
//		std1.setName("Nguyễn Văn An");
//		std1.setScore(7.0);
//		System.out.println(std1.getName() + "\t" + std1.getScore());
//		System.out.println(std1.toString());
//
//		// Sử dụng hàm dựng có đối
//		Student std2 = new Student("Nguyễn Văn B", 9.0);
//		System.out.println(std2.getName() + "\t" + std2.getScore());
//		System.out.println(std2.toString());

		// Tạo một mảng gồm n sinh viên, nhập thông tin của các sinh viên từ bàn phím
		Scanner scan = new Scanner(System.in);

		/*
		 * Note: Nếu dữ liệu/ thuộc tính của đối tượng trên các dòng khác nhau Đối với
		 * dạng số, thường sẽ đọc cả dòng, sau đó chuyển về đúng định dạng
		 */

		// Gọi ra hàm nhập dữ liệu
		Student stds[] = input(scan);
		
		// Gọi ra hàm in dữ liệu:
		print(stds);
		
		System.out.println("Sinh viên có điểm cao nhất là: " + findMaxScore(stds).toString());
	}

}
