import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      int len=str.length();
        int front=0;
      int end=len-1;
       boolean is_match=true;
      while(front<end)
      {
        
        if(str.charAt(front)!=str.charAt(end))
           {
              is_match=false;
             break;
           }
           front++;
           end--;
      }
           if(is_match==true)
           System.out.print("Yes");
           else 
           System.out.print("No");
    } 
}