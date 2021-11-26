package Kasus_1;

public class Asyncrun implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Asyncrun.run on threads " + Thread.currentThread().getId());
//		throw new ArithmeticException();
	}
	
	public static void main(String[] args) {
		try {
			Thread t = new Thread(new Asyncrun());
			t.start();
			System.out.println("main on threads " + Thread.currentThread().getId());
			throw new ArithmeticException();
		}
		catch (Exception e) {
			System.out.println(e.getClass() + " handled");
		}
	}
}
