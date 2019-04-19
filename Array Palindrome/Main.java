import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx <= n - 1; idx++){
            arr[idx] = sc.nextInt();
        }
      int left=0;
      int right=n-1;
      boolean palindrome=true;
      while(left<right)
      {
        if(arr[left]!=arr[right])
        {
          palindrome=false;
          break;
        }
        left++;
        right--;
      }
      if(palindrome==true)
        System.out.print("Yes");
      else
        System.out.print("No");
    }
}