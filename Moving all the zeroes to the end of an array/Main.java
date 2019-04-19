import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner sc=new Scanner(System.in);
      int arr_size=sc.nextInt();
      int arr[]=new int[arr_size];
      for(int i=0;i<arr_size;i++)
      {
        arr[i]=sc.nextInt();
      }
      zero(arr_size,arr);
      for(int i=0;i<arr_size;i++)
      System.out.print(arr[i]+" ");
    }
  public static void zero(int arr_size,int arr[])
  {
    int count=0;
    for(int i=0;i<arr_size;i++)
    {
      if(arr[i]!=0)
      {
        int temp=arr[i];
        arr[i]=arr[count];
        arr[count]=temp;
        count++;
      }
    }
  }
}
