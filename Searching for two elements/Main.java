import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int ele_1=-1,ele_2=-1;
      int arr_size=sc.nextInt();
      int arr[]=new int[arr_size];
      for(int i=0;i<arr_size;i++)
      {
        arr[i]=sc.nextInt();
      }
      int search_1=sc.nextInt();
      int search_2=sc.nextInt();
      for(int i=0;i<arr_size;i++)
      {
        if(search_1==arr[i])
        {
         ele_1=i; 
        }
        if(search_2==arr[i])
        {
         ele_2=i; 
        }
      }
      System.out.println(ele_1);
      System.out.println(ele_2);

  }
}
