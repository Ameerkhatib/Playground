import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
  Scanner in=new Scanner(System.in);
  String s1=in.nextLine();
  String s2=in.nextLine();
  int l1=s1.length();
  int l2=s2.length();
  int cnt=0;
  for(int i=0;i<(l1-l2+1);i++)
  {
    boolean m=true;
    for(int j=0;j<l2;j++)
    {
    if(s1.charAt(i+j)!=s2.charAt(j))
    {
      m=false;
    }
    }
    if(m==true)
      cnt++;
  }
    System.out.println(cnt);
  }
  } 