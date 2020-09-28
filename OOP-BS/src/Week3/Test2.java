package Week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {

	// nhập vào một danh sách gồm n sinh viên

	public static void main(String[] args) {
		ArrayList<Student> alstudent = new ArrayList<>();
		Student a = new Student("Trần Thị Lệ", 4.0);
		alstudent.add(a);

		Student b = new Student("Nguyễn Văn Nam", 9.0);
		alstudent.add(b);

		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());

		for (int i = 0; i < n; i++) {
			// Nhập từng thông tin cho sinh viên thứ i
			String name = scan.nextLine();
			double score = Double.parseDouble(scan.nextLine());
			Student e = new Student(name, score);
			alstudent.add(e);
		}
		
		alstudent.add(new Student("Chiến", 8));
		// In ra theo cách số 1:
		for(int i=0; i <alstudent.size(); i++)
			System.out.println(alstudent.get(i).toString());
		
		// In ra theo cách số 2:
		for (Student s : alstudent)
			System.out.println(s.toString());
	}

}
