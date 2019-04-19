import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int s=1,i=1;
            for(s=1;s<=n;s++)
            {
              if(i%2==1)
              {
          System.out.println(i);
                s=s-1;
              }
              i=i+1;
            }
   }
}