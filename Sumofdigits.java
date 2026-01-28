package PST;
import java.util.Scanner;

public class Sumofdigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, sum = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        while (num > 0) {
            sum = sum + (num % 10); 
            num = num / 10;         
        }

        System.out.println("Sum of digits = " + sum);
    }
}