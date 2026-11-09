import java.util.*;
public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
                int p=sc.nextInt();
                int v=sc.nextInt();
                int t=sc.nextInt();
                if((p+v+t)>=2)
                {
                    c++;
                }
                
        }
        System.out.println(c);
    }
}
