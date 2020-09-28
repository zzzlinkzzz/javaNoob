package Week3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class Test3 {
	/*
	 * Cung cấp cho người đọc mô tả của file Dòng thứ 1 là số sinh viên Các dòng
	 * tiếp theo là thuộc tính của từng sinh viên, mỗi thuộc tính trên 1 dòng Tên
	 * Điểm
	 */
	// Hàm đọc dữ liệu từ tệp tin có tên là filename
	// Scanner/Formatter
	
	public static ArrayList<Student> input(String fileName) {
		Scanner scan = null;
		int n;
		ArrayList<Student> stds = new ArrayList<>();
		try {
			scan = new Scanner(new File(fileName));
			n = Integer.parseInt(scan.nextLine());
			for(int i =0; i < n; i ++)
			{
				String name = scan.nextLine();
				double score = Double.parseDouble(scan.nextLine());
				// Tạo ra một student mới có tên là a
				Student a = new Student(name, score);
				// Add student a vào trong ArrayList
				stds.add(a);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stds;
	}

	public static void print(ArrayList<Student> stds)
	{
//		for(int i =0; i < stds.size(); i ++)
//			System.out.println(stds.get(i).toString());
		for(Student s: stds)
			System.out.println(s.toString());
	}
	
	// Tìm những sinh viên có điểm lớn nhất? Ghi ra file "output1.txt"
	public static ArrayList<Student> findSMaxScore(ArrayList<Student> stds)
	{
		ArrayList<Student> re = new ArrayList<>();
		double max = stds.get(0).getScore();
		for(int i =0; i < stds.size(); i ++)
			if(max < stds.get(i).getScore())
				max = stds.get(i).getScore();
		for(int i =0; i < stds.size(); i ++)
			if(max == stds.get(i).getScore())
				re.add(stds.get(i));
		return re;
		
	}
	
	public static void writeFile(String fileName, ArrayList<Student> stds)
	{
		Formatter fm = null;
		try {
			fm = new Formatter(new File(fileName));
			for(Student s: stds)
				fm.format(s.toString() + "\n");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally
		{
			fm.close();
		}
	}
	
	public static void main(String[] args) {
		// String fileName = "students.txt");
		ArrayList<Student> students = input("students.txt");
		print(students);
		
		System.out.println("Students with max score:");
		ArrayList<Student> sms = findSMaxScore(students);
		print(sms);
		writeFile("output1.txt", students);
	}

}
