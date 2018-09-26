public class Even1 {
	public static void main(String args[]) {
		int n1;
		int n2;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the limits:");
		n1 = scan.nextInt();
		n2=scan.nextInt();
		for (int i = n1; i <= n2; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
