public class Factorial {
	public static void main(String[] args) {

        int n;
        int fact = 1;
        Scanner	sc = new Scanner(System.in);		
		System.out.println("  Enter any Number: ");
		n = sc.nextInt();
        for(int i = 1; i <= n; ++i)
        {
              fact *= i;
        }
        System.out.println (fact);
    }
}
