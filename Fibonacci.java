package PST;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, a = 0, b = 1, c, i = 1;

        System.out.print("Enter number of terms: ");
        n = sc.nextInt();

        while (i <= n) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
            i++;
        }
    }
}