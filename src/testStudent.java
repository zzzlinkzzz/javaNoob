import java.util.Scanner;

public class testStudent {
    public static Student findmaxScore(Student stds[]){
        double max = stds[0].getScore();
        Student s = new Student();
        s = stds[0];

        for (int i = 0; i < stds.length; i++){
            if (max < stds[i].getScore()) {
                max = stds[i].getScore();
                s = stds[i];
            }
        }
    return s;
    }

    public static Student[] input(Scanner scan){
        System.out.println("Enter n: ");
        int n = Integer.parseInt(scan.nextLine());

        Student stds[] = new Student[n];

        for (int i = 0; i < n; i++){
            String name = scan.nextLine();
            double score = Double.parseDouble(scan.nextLine());

            stds[i] = new Student(name,score);
        }
        return stds;
    }

    public static void print(Student stds[]) {
    //in ra ten cua tung sinh vien:
        for (int i = 0; i < stds.length; i++){
            System.out.println(stds[i].toString());
        }
    //in ten cach 2:
        for (Student s : stds)
            System.out.println(s.toString());
    }

    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        Student stds[] = input(scan);

        print(stds);

        System.out.print("Sinh vien co diem cao nhat la: " + findmaxScore(stds).toString());
    }
}
