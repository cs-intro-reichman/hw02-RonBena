/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int divisor= 1;
		int num= Integer.parseInt(args[0]);
		while (divisor <= num){
			if(num % divisor == 0){
				System.out.println(divisor);
				divisor++;
			}
			else {
				divisor++;
			}

		}

	}
}
