package learning_Java_23rd_Apr;

public class Child_methodOverriding extends Parent_MethodOverriding {

	public static void main(String[] args) {

		Child_methodOverriding child = new Child_methodOverriding();
		child.display();
		child.cash(100000);
		
		
		Parent_MethodOverriding parent = new Parent_MethodOverriding();
		parent.display();
		parent.cash(1000000);
	}

	public void display() {
		System.out.println("This is child's display method");
	}

	public void cash(int money) {
		System.out.println("This is child's cash method");
	}

}
