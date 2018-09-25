public class Armstrong {
	 public static void main(String[] args) {

	        int n, originalNumber, remainder, result = 0;
	        Scanner	sc = new Scanner(System.in);		
			System.out.println("  Enter any Number: ");
			n = sc.nextInt();

	        originalNumber = n;

	        while (originalNumber != 0)
	        {
	            remainder = originalNumber % 10;
	            result += Math.pow(remainder, 3);
	            originalNumber /= 10;
	        }

	        if(result == n)
	            System.out.println("yes");
	        else
	            System.out.println("no");
	    }
	}
