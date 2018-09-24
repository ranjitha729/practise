public class Alphabet {
   public static void main(String args[]) {
	   char ch;
       Scanner scan = new Scanner(System.in);
		 System.out.print("Enter an character: ");
       ch = scan.next().charAt(0);
       if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
  		 System.out.println("Alphabet");
       }
        else {
           System.out.print("No");
       } 
   }
}
