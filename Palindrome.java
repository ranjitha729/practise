public class Palindrome {
        public static void main(String args[]) {
        	int n,rem,rev=0;
        	Scanner sc = new Scanner(System.in);
        	System.out.println("enter the number:");
        	n=sc.nextInt();
        int s=n;
        	while(n!=0) {
        		rem = n%10;
        		rev = rev * 10 + rem;
        		n=n/10;
        	}
        	if(s==rev) {
        		System.out.println("yes");
        	}
        	else {
        		System.out.println("no");
        	}
        	sc.close();
        }
}
