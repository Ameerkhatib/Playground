import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in=new Scanner(System.in);
      String s=in.nextLine();
      int l=s.length();
      int f=0;
      int e=l-1;
    boolean p=true;
      while(f<e)
      {
        if(s.charAt(f)!=s.charAt(e))
        {
          p=false;
          break;
        }
        f++;
        e--;
      }
        if(p==true)
          System.out.println("Yes");
        else
          System.out.println("No");
        
      
    } 
}