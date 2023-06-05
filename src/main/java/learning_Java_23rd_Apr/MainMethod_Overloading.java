package learning_Java_23rd_Apr;

public class MainMethod_Overloading {

	public static void main(String[] args) {
		System.out.println("This is the original main method");
		main(10);
		main(args = new String[3], args = new String[4]);
	}

	public static void main(int i) {
		System.out.println("This is the overloaded main method with int parameters");
	}

	public static void main(String[] args1, String[] args2) {
		System.out.println("This is overloaded main method with multiple string array parameters");
	}
}
