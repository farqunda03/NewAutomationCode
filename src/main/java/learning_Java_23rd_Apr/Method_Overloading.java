package learning_Java_23rd_Apr;

public class Method_Overloading {

	public static void main(String[] args) {
		display();
		display(10);
		display(20, 30);
		display("world");
		display("Hello", "World");
		display("Hello", 10);
		display(new StringBuffer("join"));
		display(new StringBuilder("join"));
		display(new StringBuilder("join"),"dom");
		display(new StringBuilder("join"),new StringBuffer("join"));
		display(new StringBuilder("join"),new StringBuffer("join"),"Hello");

	}

	public static void display() {
		System.out.println("This is non parameterized display method");

	}

	public static void display(int i) {
		System.out.println("This is an int parameter display method");
	}

	public static void display(int i, int j) {
		System.out.println("this is multiple int parameter display method");
	}

	public static void display(String s) {
		System.out.println("this is a string parameter display method ");
	}

	public static void display(String s1, String s2) {
		System.out.println("this is mutiple string parameters display method");
	}

	public static void display(String s1, int i) {
		System.out.println("This is multiple String and int parameters display method");
	}
	public static void display(StringBuffer s) {
		System.out.println("this is a stringBuffer parameter display method ");
	}
	public static void display(StringBuilder s) {
		System.out.println("this is a stringBuilder parameter display method ");
	}
	public static void display(StringBuilder s1,String s2) {
		System.out.println("this is a stringBuilder and string parameter display method ");
	}
	public static void display(StringBuilder s1,StringBuffer s2) {
		System.out.println("this is a stringBuilder and stringBuffer parameter display method ");
	}
	public static void display(StringBuilder s1,StringBuffer s2,String s3 ) {
		System.out.println("this is a stringBuilder,stringBuffer and String parameter display method ");
	}
}
