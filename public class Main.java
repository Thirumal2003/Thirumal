import java.util.Scanner;
public class pyramid
{
 public static void main(String[] args)
 {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
        {
            char ch=(121-n);
            if(i==j)
            {
                System.out.print(ch+1);
                ch++;
            }
            if(i!=j)
            {
                System.out.print(ch);
            }
        }
        System.out.println();
    }
 }   
}
