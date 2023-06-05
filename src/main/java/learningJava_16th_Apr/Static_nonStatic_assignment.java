package learningJava_16th_Apr;

public class Static_nonStatic_assignment {

	String name;
	int age;
	double height;
	String color;
	boolean pass;

	static int i;

	static String s;

	public static void main(String[] args) {

		static1();
		static2();
		static3();
		Static_nonStatic_assignment objref = new Static_nonStatic_assignment();

		objref.sample1();
		objref.sample2();
		objref.sample3();

	}

	public static void static1() {
		Static_nonStatic_assignment objref = new Static_nonStatic_assignment();
		objref.name = "Selenium";
		System.out.println("This is a static method 1");

	}

	public static void static2() {
		i = 10;
		System.out.println("this is static method2");
	}

	public static void static3() {

		System.out.println("this is static method3");
	}

	public void sample1() {
		System.out.println("This is non-static method 1");
	}

	public void sample2() {
		System.out.println("This is non-static method 2");
	}

	public void sample3() {
		System.out.println("This is non-static method 3");
	}
}
