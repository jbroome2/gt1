public class SumSquare {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println(
				"Your program will generate an output of Sum of Squares of multiple of 3" + "\nfrom 3 to 33. ");

		int j = 3;
		int x = 9;
		while (j <= 33) {
			System.out.printf("\nCumulation result:  %-7d  :  " + "%5d %3s %d", x, j, " * ", j);
			j = j + 3;

			if (j <= 33) {
				x = j * j + x;
			} else
				break;
		}
		System.out.println("\nThe SUM of Square of Multiples of 3 is " + x);
	}
}
