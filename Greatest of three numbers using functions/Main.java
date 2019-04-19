import java.util.Scanner;
class Main{
  public static int fn(int m1,int m2)
  {
    if(m1>m2)
      return m1;
    else 
      return m2;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n1,n2,n3;
      n1=sc.nextInt();
      n2=sc.nextInt();
      n3=sc.nextInt();
      int large=fn(n1,n2);
      if(n3>large)
        System.out.println(n3);
      else
        System.out.println(large);
	}
}