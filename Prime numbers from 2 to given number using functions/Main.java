import java.util.Scanner;
class Main{
  public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      prime(n);
  }
  public static int prime(int num)
  {
    int i,j,count=1;
    for(i=2;i<num;i++)
    {
      count=1;
      for(j=2;j<i;j++)
      {
        if(i%j==0)
          count=count+1;
        }
        if(count==1)
        {
          System.out.println(i);
        }
      }
    
      return 0;
  
  }	
     
}