import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int temp,a,c=0;
      temp=n;
      while(n>0)
      {
        a=n%10;
        n=n/10;
        c=c+(a*a*a);
      }
      if(temp==c)
        System.out.println("Armstrong Number");
      else 
        System.out.println("Not a Armstrong Number");
        }
}