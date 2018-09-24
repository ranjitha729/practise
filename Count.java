public class Count {
  public static void main(String args[]) {
	  int n, count=0;
	Scanner	sc = new Scanner(System.in);		
		System.out.println("  Enter any Number: ");
		n = sc.nextInt();
		while(n > 0) {
			n = n/ 10;
			count = count + 1; 
		}
		System.out.println(count);
  }
}
