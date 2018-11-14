
public class Dale extends Character {
	//Q1b
	
	public void greet(String str) {
		System.out.println("I am a Dale. " + str);
	}
	
	public void greet(Object str) { //method overloading - different arguments
		
		System.out.println("Object.... I am Dale." + str);
	}
}
