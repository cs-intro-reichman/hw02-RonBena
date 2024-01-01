
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		//// Put your code here
	
		String b = "b ";
		String g = "g ";
		double n =  Math.random();
		if(n < 0.5)
					{
						while ( n < 0.5) {
							System.out.print(b);
							n =  Math.random();
						}
						System.out.print(g);
					}
					else
					{
						while ( n >= 0.5) {
							System.out.print(g);
							n =  Math.random();
						}
						System.out.print(b);
					}
		

	}
}
