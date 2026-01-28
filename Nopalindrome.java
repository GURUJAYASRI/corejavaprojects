package PST;
import java.util.Scanner;

public class Nopalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, temp, rev = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        temp = num;  

        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num = num / 10;
        }

        if (temp == rev) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }
    }
}