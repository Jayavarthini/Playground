import java.util.*;
class Main
{
  public static int pow(int c,int d)
  {
    int i,e=1;
    for(i=1;i<=d;i++)
    {
      e=c*e;
    }
    return e;
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int num=pow(a,b);
    System.out.println(num);
  }
}