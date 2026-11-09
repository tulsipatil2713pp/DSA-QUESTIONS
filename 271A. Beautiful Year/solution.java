import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int y = sc.nextInt();
 
        while (true) {
 
            y++;
 
            int temp = y;
 
            int a = temp % 10;
            temp = temp / 10;
 
            int b = temp % 10;
            temp = temp / 10;
 
            int c = temp % 10;
            temp = temp / 10;
 
            int d = temp % 10;
 
            if (a != b && b != c && c != d &&
                a != c && a != d && b != d) {
 
                System.out.println(y);
                break;
            }
        }
 
        sc.close();
    }
}
