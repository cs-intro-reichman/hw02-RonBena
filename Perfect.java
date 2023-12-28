/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
	int N = Integer.parseInt(args[0]);
	String Perfect = N + " is a perfect number since " + N + "= 1";
	int divsum = 1;
	int divisor= 2;
		while (divisor < N){
			if(N % divisor == 0){
				Perfect = Perfect + " + " + divisor;
				divsum = divsum + divisor;
				divisor++;
			}
				else {
						divisor++;
				}
		}
			if(N ==  divsum){
				System.out.println(Perfect);
			}
				else{
						System.out.println(N + " is not a perfect number");
				}

	}
}
