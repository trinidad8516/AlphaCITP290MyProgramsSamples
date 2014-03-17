package PolymorphismDemo;


public class Frog extends Animal implements Jumper, Swimmer {

	@Override
	public void swim() {
		System.out.println("Frog swims with mighty leg strokes.");
		
	}

	@Override
	public void jump() {
		System.out.println("Frog jumps high!");
		
	}

}
