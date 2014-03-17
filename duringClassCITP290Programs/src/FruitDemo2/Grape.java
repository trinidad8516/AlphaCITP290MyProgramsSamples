package FruitDemo2;

public class Grape extends Fruit {

	public Grape(String color) {
		super(color);
	}
	
	@Override
	public void print() {
		System.out.println("I am a(n)" + getColor() + " grape.");
		
	}

}
