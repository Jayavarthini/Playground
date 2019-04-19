import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int z=sc.nextInt();
      int num,sum=0;
      while(z>0)
      {
        num=z%10;
        sum=sum+num;
        z=z/10;
      }
      System.out.println(sum);
	}
}