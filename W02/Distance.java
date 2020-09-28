
public class Distance {
    public static double distance(double x, double y){
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("input int x: ");
        double x = scan.nextDouble();
        
        System.out.println("input int y: ");
        double y = scan.nextDouble();
        
        scan.close();

        System.out.println("Distance: " + distance(x,y));
    }
}