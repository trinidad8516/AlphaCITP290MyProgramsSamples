
public abstract class Fruit {
	private static int count = 0;
	
	private String color;

	public static int getCount() {
		return count;
	}
	
	public Fruit(String color) {
		count++;
		//this.color = color;
		setColor(color);
		
	}
	
	public abstract void print();
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
