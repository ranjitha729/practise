public class Naturalno {
   public static void main(String args[]) {
	   int n;
	   int sum=0;
  	 Scanner scan = new Scanner(System.in);
  	 System.out.println("enter th number:");
  	 n = scan.nextInt();
  	 for(int i=0;i<=n;i++) {
  		 sum = sum+i;
  	 }
  	 System.out.println(sum);
   }
}
