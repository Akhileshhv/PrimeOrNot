package arrayOperations;

import java.util.Scanner;

public class PrimeOrNot {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();
	        sc.close();

	        boolean prime = true;
	        for (int i = 2; i < n; i++) {
	            if (n % i == 0) {
	                prime = false;
	                break;
	            }
	        }

	        System.out.println(prime ? "Prime" : "Not Prime");
	    }
	}


