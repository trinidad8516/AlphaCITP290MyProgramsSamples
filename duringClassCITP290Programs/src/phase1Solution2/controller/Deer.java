
public class Deer extends Animal implements Runner, Jumper {
	
	
	public void jump() {
		System.out.println("Deer jumps very far!");
	}

	@Override
	public void run() {
		System.out.println("Deer runs with quick gallops.");
		
	}
}
