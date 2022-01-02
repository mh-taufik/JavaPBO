public class DenganThread implements Runnable{
	public void run() {
		long start = System.currentTimeMillis();
		for(int i=1;i<=250;i++)
			System.out.printf("");
		long end = System.currentTimeMillis();
		float sec = (end - start) / 1000F;
		System.out.println(Thread.currentThread().getName() + " Selesai dengan waktu: " + sec);
	}	

	public static void main(String[] args) {
		DenganThread run = new DenganThread();
		Thread thread1 = new Thread(run,"Pertama");	
		Thread thread2 = new Thread(run,"Kedua");	
		Thread thread3 = new Thread(run,"Ketiga");	
		Thread thread4 = new Thread(run,"Keempat");	
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}
}
