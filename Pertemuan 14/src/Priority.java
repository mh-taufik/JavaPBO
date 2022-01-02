
public class Priority implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread());
	}	

	public static void main(String[] args) {
		Priority run = new Priority();
		Thread thread1 = new Thread(run,"Threads Pertama");
		Thread thread2 = new Thread(run,"Threads Kedua");
		Thread thread3 = new Thread(run,"Threads Ketiga");		

		//pengubahan priority
		thread1.setPriority(3);
		thread2.setPriority(5);
		thread3.setPriority(8);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
