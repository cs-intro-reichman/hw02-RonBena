/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String word= args[0];
		for(int i = word.length()-1; i > -1;i--){
			System.out.print(word.charAt(i));
		}
		int midch = word.length()/2 - 1 ;
		System.out.println();
		System.out.println("The middle character is " + word.charAt(midch));
	}
}
