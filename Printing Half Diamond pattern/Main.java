import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i,j,k;
      for(i=1;i<=n;i++)
      {
        for(j=i;j<n;j++)
        {
          System.out.print(" ");
        }
        for(k=1;k<=(2*i-1);k++)
        {
         System.out.print("*");
        }
        System.out.print("\n");
      }
      
	}
}