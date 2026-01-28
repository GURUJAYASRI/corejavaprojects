package PST;
import java.util.Scanner;
import java.util.Arrays;
public class Ascdec {

	public static void main(String[] args) {
		 
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter size of array: ");
		        int n = sc.nextInt();

		        int[] arr = new int[n];

		        System.out.println("Enter " + n + " elements:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		        }

		         
		        Arrays.sort(arr);
		        System.out.print("Ascending order: ");
		        for (int i = 0; i < n; i++) {
		            System.out.print(arr[i] + " ");
		        }

		         
		        System.out.print("\nDescending order: ");
		        for (int i = n - 1; i >= 0; i--) {
		            System.out.print(arr[i] + " ");
		            sc.close();
		        }
		    }
		


	}