package FruitDemo2;

public class Apple extends Fruit {

	public Apple(String color) {
		super(color);
	}
	
	@Override
	public void setColor(String color) {
		super.setColor(color);
		
		System.out.println("You have set the color of an apple to " + color);
	}

	@Override
	public void print() {
		System.out.println("I am a(n)" + getColor() + " apple.");
		
	}

}
