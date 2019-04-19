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
    int max=0;
    for(i=0;i<n;i++)
    {
      if(max<arr[i])
      {
        max=arr[i];
      }
    }
    for(i=0;i<n;i++)
    {
       if(max==arr[i])
       {
     System.out.println(i);
       }
    }
  }
}
