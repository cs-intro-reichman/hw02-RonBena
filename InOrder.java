/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int num1 = 0;
		int numnew = -1;
		do {
			numnew = num1;
			num1= (int) (Math.random()*10);
			if(num1 >= numnew)
			{
				System.out.print(num1 + " ");
			}
		}while(num1>numnew);
	}
}
