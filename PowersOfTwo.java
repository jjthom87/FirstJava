public class PowersOfTwo {
	public static void main(String[] args) {
		
		//read in one command-line argument
		int n = Integer.parseInt(args[0]);

		int i = 0; //count from 0 to n
		int powerOfTwo = 1; // the ith power of two

		while ( i <= n ) {
			System.out.println(i + " " + powerOfTwo);
			powerOfTwo = 2 * powerOfTwo;
			i = i + 1;
		}
	}
}