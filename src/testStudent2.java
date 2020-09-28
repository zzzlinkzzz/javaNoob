import java.util.ArrayList;
import java.util.Scanner;

public class testStudent2 {
    public static void main (String args[]){
        ArrayList<Student> alstudents = new ArrayList<>();
        Student a = new Student("A",9.2);
        alstudents.add(a);

        Student b = new Student("B",7.3);
        alstudents.add(b);

//        Scanner scan = new Scanner(System.in);
//        int n = Integer.parseInt(scan.nextLine());
//
//        for (int i = 0; i < n; i++){
//            String name = scan.nextLine();
//            double score = Integer.parseInt(scan.nextLine());
//            Student s = new Student(name,score);
//            alstudents.add(s);
//        }

        //in cach 1:
        for (int i = 0; i < alstudents.size();i++){
            System.out.println(alstudents.get(i).toString());
        }
        //in cach 2:
        for (Student s : alstudents)
            System.out.println(s.toString());
    }
}
