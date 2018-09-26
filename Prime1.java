public class Prime1 {
	  public static void main(String args[]) {
    	  int i,n1,n2,count=0;
    	 Scanner sc = new Scanner (System.in);
    	  System.out.println("enter the number");
    	  n1 = sc.nextInt();
    	  n2 = sc.nextInt();
    	  for(i = n1; i <= n2; i++)	{
  			for( int j = 2; j < i; j++){
  				if(i % j == 0){
  					count = 0;
  					break;
  				}
  				else{
  					count = 1;
  				}
  			}
  			if(count == 1){
  				System.out.println(i);
  			}
  		}
	  }
}
  	


