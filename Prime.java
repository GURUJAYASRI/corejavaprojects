package PST;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, i = 2;

        System.out.print("Enter number: ");
        n = sc.nextInt();

        while (i < n) {
            if (n % i == 0) {
                System.out.println("Not Prime");
                return;
            }
            i++;
        }

        System.out.println("Prime");
    }
}