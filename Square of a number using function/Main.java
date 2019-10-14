import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      System.out.print(square(n));// Type your code here   
	}
  public static int square(int a)
  {
    int result=a*a;
    return result;
}
}