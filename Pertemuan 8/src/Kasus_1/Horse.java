package Kasus_1;

public class Horse extends Animal{
	public void sound() {
		System.out.println("Weigh");
	}
	
	public static void main(String[] args) {
		Animal obj = new Horse();
		obj.sound();
	}
}
