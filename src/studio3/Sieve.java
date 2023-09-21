package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("What is the integer you would like to check up to?");
		int n = scan.nextInt();

		boolean[]primeNumberCheck;
		primeNumberCheck = new boolean [n];


		for (int i = 0; i < n ; i++  ) {
			primeNumberCheck[i] = true;	
		}


		for (int i = 2; i < Math.sqrt(n); i++ ) {
		
			for (int j = 0; j< primeNumberCheck.length; j++) {
				if (j % i == 0) {	
					primeNumberCheck[j] = false;
					primeNumberCheck[1] = false;

				}
			}
		}

		for (int i = 0; i < n; i++) {
			if (primeNumberCheck[i] == true) {
				System.out.print((i + " "));
			}
		}
	}
}








