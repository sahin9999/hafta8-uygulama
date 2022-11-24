package EvcilHayvan;

public class Animal {
	
	protected int legs;
	
	protected Animal(int legs) {
		super();
		this.legs = legs;
	}

	protected void valk() {
		System.out.println("Hayvanlar yurur.");
	}
	
	protected void eat() {
		System.out.println("Hayvanlar beslenir.");
	}

	
}
