import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
    Scanner in=new Scanner(System.in);
    int arr_size=in.nextInt();
    int arr[]=new int [arr_size];
    for(int index=0;index<=(arr_size-1);index++)
    {
    arr[index]=in.nextInt();
    }
    int max;
    if(arr[0]>arr[1])
    {
    max=arr[0];
    }
    else
    max=arr[1];
    for(int index=2;index<=(arr_size-1);index++)
    {
    if(max<arr[index])
    max=arr[index];
    }
    System.out.print(max);}
}