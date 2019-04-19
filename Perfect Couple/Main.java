import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
      {
        arr[i]=sc.nextInt();
      }
      int value=sc.nextInt();
      perfect(size,arr,value);
    }
    public static void perfect(int size,int arr[],int value)
    {
      for(int i=0;i<size;i++)
      {
        for(int j=i+1;j<size;j++)
        {
          int sum=arr[i]+arr[j];
          if(sum==value)
          {
            System.out.println(arr[i]+ "," + " " + arr[j]);
          }
        }
      }
    }
}