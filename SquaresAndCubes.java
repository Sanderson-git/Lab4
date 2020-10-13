import java.util.Scanner;

public class SquaresAndCubes {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Hello, please enter an integer");
		int userInput = scnr.nextInt();
		String Num = "Number";
		String Squar = "Squared";
		String Cube = "Cubed";
		
		System.out.printf("%-7s %-7s %-7s", Num, Squar, Cube);
		System.out.printf("\n=======" + "=======" + "=======");
		for (int i = 1; i <= userInput; i++) {
			int numSquared = (int) Math.pow(i, 2);
			int numCubed = (int) Math.pow (i, 3);
			System.out.printf("\n%-7d %-7d %-7d", i, numSquared, numCubed);
		}
		
			
			
		System.out.println("\nContinue? (y/n)"); //loop main
		char toContinue = scnr.next().charAt(0);
			if (toContinue == ('y')) {
				main(null); // if input is Y then call main again.
			} else {
				System.out.println("Goodbye!");
			}
		// TODO Auto-generated method stub

	}

}
