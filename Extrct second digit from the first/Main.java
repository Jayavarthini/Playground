import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n>1000)
    {
    int s=n/1000;
    int z=s%10;
      System.out.println(z);
    }
    else if(n<100)
    {
      int t=n%10;
      System.out.println(t);
    }
  }
}
    