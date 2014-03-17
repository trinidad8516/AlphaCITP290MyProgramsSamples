
public class AnimalOlympics {

	public static void main(String[] args) {
		
		Deer d = new Deer();
		Rabbit r = new Rabbit();
		Frog f = new Frog();
		Fish i = new Fish();
		
		oneHundredMeterDash(r, d);
		longJump(r, f);
		oneHundredMeterSwim(f, i);
	}
	
	public static void oneHundredMeterDash(Runner r1, Runner r2) {
		System.out.println("One Hundred Meter Dash");
		r1.run();
		r2.run();
	}
	
	public static void longJump(Jumper j1, Jumper j2) {
		System.out.println("Long Jump");
		j1.jump();
		j2.jump();
		if (j2 instanceof Swimmer) {
			Swimmer s = (Swimmer) j2;
			s.swim();
		}
	}
	
	public static void oneHundredMeterSwim(Swimmer s1, Swimmer s2) {
		System.out.println("One Hundred Meter Swim");
		s1.swim();
		s2.swim();
	}
}
