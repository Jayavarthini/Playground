import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner sc=new Scanner(System.in);
      int base=sc.nextInt();
      int exponent=sc.nextInt();
      int c=1;
      for(int i=1;i<=exponent;i++)
      {
        c=c*base;
      }
      System.out.print(c);
        
    }
}