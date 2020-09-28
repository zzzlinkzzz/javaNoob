public class sumArrs {
	public static int[] sumArrays (int[] a, int[] b) {
		int len = a.length;
		
		int[] c = new int[a];
		
		for (i = 0; i <len; i++) {
			c[i] = a[i] + b[i];
		}
		
		return c;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	}
}