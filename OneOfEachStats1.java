/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		int children=0;
		int chil2 = 0;
		int chil3 = 0;
		int chil4 = 0;
		double sumchildren = 0;
		double average;
		String b = "b ";
		String g = "g ";
		double rnd = Math.random();
		for(int i = 0; i < T; i++)
		{
			if(rnd < 0.5)
					{
						while ( rnd < 0.5) {
							//System.err.print(b);
							rnd =  Math.random();
							children ++;
						}
						children++;
						//System.err.println(g);
					
					}
					else
					{
						while ( rnd >= 0.5) {
							//System.err.print(g);
							rnd =  Math.random();
							children ++;
						}
						children ++;
						//System.err.println(b);
					}
			if (children == 2)	
			{
				chil2++;
			}	
			else if(children == 3)
			{
				chil3++;
			}
			else if (children >3)
			{
				chil4++;
			}
			sumchildren += children;
			children = 0;

		}
		average = (sumchildren/T);
		System.out.println("Average: "+ average +" children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + chil2);
		System.out.println("Number of families with 3 children: " + chil3);
		System.out.println("Number of families with 4 or more children: " + chil4);
		if(chil2 >= chil3 && chil2 >= chil4)
		{
			System.out.println("The most common number of children is " + chil2 + ".");
		}
		else if(chil3 >= chil2 && chil3 >= chil4)
		{
			System.out.println("The most common number of children is " + chil3 + ".");
		}
		else if(chil4 >= chil2 && chil4 >= chil3)
		{
			System.out.println("The most common number of children is " + chil4 + " or more.");
		}
	}
}
