import java.util.Scanner;
public class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine().toLowerCase();
        String s2=sc.nextLine().toLowerCase();
        int s= s1.compareTo(s2);
        if(s==0){
            System.out.println("0");
        }
        else if(s>0){
            System.out.println("1");
        }
        else{
            System.out.println("-1");
        }
    }
}
→Judgement P
