import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
      int arr[]=new int[n];
    int i;
    for(i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    perf_batch(arr,n);
  }
  public static void perf_batch(int arr[],int n)
  {
    boolean is_perfect=true;
    int i;
    int b_sum=arr[0]+arr[1]+arr[2];
    for(i=3;i<n;i=i+3)
    {
      int c_sum=arr[i]+arr[i+1]+arr[i+2];
        if(c_sum!=b_sum)
        {
          is_perfect=false;
        }
    }
    if(is_perfect==true)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch"); 
  }
 }
