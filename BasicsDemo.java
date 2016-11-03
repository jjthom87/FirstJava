class BasicsDemo {
	static void print() {
		System.out.println("\n\nInside print ...");
		System.out.println("Hello, world!!");
		System.out.println();
		System.out.println("Hello, world!!");
		System.out.println("Hello,");
		System.out.println(" ");
		System.out.print("World!!");
	}

	static void primitives(){
		//literals demo
		System.out.println("\n\nInside Primitives");

		int intHex = 0x0041;
		System.out.println("intHex: " + intHex);
		int intBinary = 0b01000001;
		System.out.println("intBinary: " + intBinary);
		int intUnderscore = 1_23_456;
		System.out.println("intUnderscore: " + intUnderscore);

		char charA = 'A';
		System.out.println("charA: " + charA);
		char charInt = 65;
		System.out.println("charInt: " + charInt);
		char charUnicode1 = '\u0041'; //4 * (16 power 1) + 1 * (16 power 0)
		System.out.println("charUnicode1: " + charUnicode1);
		char charUnicode2 = 0x41; //4 * (16 power 1) + 1 * (16 power 0)
		System.out.println("charUnicode2: " + charUnicode2);
		char charBinary = 0b01000001; //binary corresponding to decimal 65
		System.out.println("charBinary: " + charBinary);
	}

	public static void main(String[] args) {
		primitives();
	}
}