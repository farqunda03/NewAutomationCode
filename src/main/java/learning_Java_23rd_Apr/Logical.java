package learning_Java_23rd_Apr;

//A concrete class can extend an Abstract class

public class Logical extends Abstraction_Concept {

	public static void main(String[] args) {
		Logical child = new Logical();
		child.logic();
		child.secret();

	}

	@Override
	public void logic() {

		System.out.println("this is over-ridden logic method");
	}

	@Override
	public void secret() {

		System.out.println("this is over-ridden secret method");
	}

}
