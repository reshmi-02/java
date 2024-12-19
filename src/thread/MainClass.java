package thread;


class D extends Thread{
	public void run() {
		for(int i=1;i<=20;i++) {
			System.out.println("hey hello...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class B extends Thread{
	public void run() {
		for(int i=1;i<=20;i++) {
			System.out.println("okay Bye.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MainClass {
	public static void main(String[] args) {	
		D a1  = new D();
		B b1  = new B();
		a1.start();
		b1.start();
		b1.setPriority(10);
		a1.setPriority(2);
	}
}
