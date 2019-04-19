import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      if(n>10000)
      {
      int s=n/10000;
      int t=n%10;
      int sum=s+t;
        System.out.println(sum);
      }
      else if(n<10000)
      {
        int s=n/1000;
      int t=n%10;
      int sum=s+t;
      System.out.println(sum);
      }
	}
}