
public class Rabbit extends Animal implements Runner, Jumper {

	@Override
	public void jump() {
		System.out.println("Rabbit jumps very high!");
	}

	@Override
	public void run() {
		System.out.println("Rabbit runs with long, bounding strides.");
	}
	
}
