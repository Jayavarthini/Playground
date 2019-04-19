import java.util.Scanner;
class Main{
  public static int sum(int num)
  {
    int r=0,i;
    for(i=1;i<=num;i++)
    {
      r=r+i;
    }
      return r;
  }
	public static void main (String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int digits=sum(n);
      System.out.println(digits);
    }
}
