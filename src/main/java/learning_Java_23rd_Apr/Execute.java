package learning_Java_23rd_Apr;

public interface Execute {
	
	//100% abstraction
	//all the variables inside an interface are public, static and final in nature
	
	public static final int i=10;
	
	//what is an interface ?
	//is blueprint of a class
	//it specifies the methods that a Class should implement
	//it does not provide any implementation details of those methods
	//interface tells a Class what to do but does not tell how to do
	//the implementation details are left to the implementing Class
	
	public void secret();
	
	default void world()
	{
		
	} 
	public static void something() {
		
	}
	public static void gaming() {
		
	}

}
