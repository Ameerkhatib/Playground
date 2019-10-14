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
    pb(list,n);//Try your code here
  }
  public static void pb(int list[],int n)
  {
    boolean is_pb = true;
    int sum=list[0]+list[1]+list[2];
    for(int idx=3;idx<n;idx=idx+3)
    {
      int sum1=list[idx]+list[idx+1]+list[idx+2];
      if(sum1 !=sum)
      {
        is_pb=false;
    }
    }
    if(is_pb==true){
      
      System.out.print("Perfect Batch");
    }
    else
    {
      System.out.print("Not a Perfect Batch");
    }}
}
