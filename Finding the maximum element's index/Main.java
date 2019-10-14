import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int list[]=new int[n];
    for(int idx=0;idx<n;idx++)
    {
      list[idx]=in.nextInt();
    }
    int max;
    if(list[0]>list[1])
    {
      max=0;
    }
    else
    {
      max=1;
    }
    for(int idx=2;idx<n;idx++)
    {
      if(list[max]<list[idx])
      {
        max=idx;
      }
    }
    System.out.print(max);//Try your code here
  }
}