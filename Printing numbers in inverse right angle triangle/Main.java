import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i,j,num;
      for(i=n;i>=1;i--)
      {
        num=i;
        for(j=1;j<=i;j++)
        {
          System.out.print(num);
          num=num-1;
        }
        System.out.print("\n");
      }
	}
}