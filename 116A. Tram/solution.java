import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
 
        for (int i = 0; i < n; i++) {
 
            int x = sc.nextInt();
            int y = sc.nextInt();
 
            a = (a - x) + y;
 
            if (a > b) {
                b = a;
            }
        }
 
        System.out.println(b);
 
        sc.close();
    }
}
