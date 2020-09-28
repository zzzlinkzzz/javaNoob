
import java.util.Scanner;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class test {

    public static ArrayList<Student> input(String fileName)
    {
        ArrayList<Student> stds = new ArrayList<>();
        Scanner scan = null;
        int n;

        try {
            scan = new Scanner(new File(fileName));
            n = Integer.parseInt(scan.nextLine());

            for (int i= 0; i < n; i++)
            {
                String name = scan.nextLine();
                double score = Double.parseDouble(scan.nextLine());

                Student s = new Student(name,score);
                stds.add(s);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return stds;
    }


    public static void print(ArrayList<Student> stds)
    {
        for (Student s: stds)
            System.out.println(s.toString());
    }

    public static void writeFile(String fileName, ArrayList<Student> stds)
    {
        Formatter fm = null;

        try {
            fm = new Formatter(new File(fileName));
            for (Student s: stds)
                fm.format(s.toString() + "/n");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            fm.close();
        }
    }


    public static void main(String[] args)
    {
        ArrayList<Student> stds = new ArrayList<>();

        stds = input("student.txt");
        print(stds);
        writeFile("output.txt", stds);
    }
}
