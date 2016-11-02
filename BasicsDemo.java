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
	}

	public static void main(String[] args) {
		primitives();
	}
}