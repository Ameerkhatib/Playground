import java.util.Scanner;
class Main{
    public static void main(String args[]){
     Scanner in=new Scanner(System.in);
      String s=in.nextLine();
      StringBuilder sb=new StringBuilder(s);
      int l=sb.length();
      int f[]=new int[26];
      for(int i=0;i<26;i++)
      {
        f[i]=0;
      }
      for(int i=0;i<l;i++)
      {
        if(sb.charAt(i)>='A'&&sb.charAt(i)<='Z')
        {
          f[sb.charAt(i)-'A']++;
        }
         if(sb.charAt(i)>='a'&&sb.charAt(i)<='z')
        {
          f[sb.charAt(i)-'a']++;
        }
      }
    
        for(int i=0;i<26;i++)
        {
          if(f[i]==0)
          {
            char m=(char) (i+'a');
            System.out.print(m+" ");
          }}
        
    }
}