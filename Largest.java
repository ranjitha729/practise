public class Largest {
     public static void main(String args[]) {
    	 int a,b,c;
    	  Scanner scan = new Scanner(System.in);
    	  System.out.println("enter the numbers:");
    	 a = scan.nextInt();
    	 b = scan.nextInt();
    	 c= scan.nextInt();
    	 if(a>b && a>c) {
    		 System.out.println(a);
    	 }
    	 else if(b>a && b>c) {
    		 System.out.println(b);
    	 }
    	 else {
    		 System.out.println(c);
    	 }
     }
}
