import java.util.Scanner;

public class SquaresAndCubesPrime {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Hello, please enter an integer");
		int userInput = scnr.nextInt();
		String Num = "Number";
		String Squar = "Squared";
		String Cube = "Cubed";
		String lineBreak = "====";
		
		System.out.printf("%-7s %-7s %-7s", Num, Squar, Cube);
		System.out.printf("\n=======" + "=======" + "=======");
		for (int i = 1; i <= userInput; i++) {
			int numSquared = (int) Math.pow(i, 2);
			int numCubed = (int) Math.pow (i, 3);
			System.out.printf("\n%-7d %-7d %-7d", i, numSquared, numCubed);
		}
		System.out.println("\nWould you like to see some multiplication tables?(y/n)");
		char toContinueBeta = scnr.next().charAt(0);
		
		if (toContinueBeta == ('y')) {
			System.out.println("Please enter an integer");
			int multInput = scnr.nextInt();

			System.out.printf("%-4d %-4d %-4d %-4d", 1, 2, 3, 4);
			System.out.printf("\n%-4s %-4s %-4s %-4s", lineBreak, lineBreak, lineBreak, lineBreak); //formatting only working because linebreak is equal to only 4 '=' characters
			for (int ib = 1; ib <= multInput; ib++) {
				System.out.printf("\n%-4d %-4d %-4d %-4d", ib, ib * 2, ib * 3, ib * 4);
			}
			System.out.println("\nContinue? (y/n)"); //loop main
			char toContinue = scnr.next().charAt(0);
				if (toContinue == ('y')) {
					main(null); // if input is Y then call main again.
				} else {
					System.out.println("Goodbye!");
				}
		} else {
			System.out.println("Goodbye!");
			
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
}