package thread;

class C implements Runnable{
//	int j=0;
	public void run() {
//		for(int i=0;i<=30;i++) {
//			j=i;
//		}
		System.out.println("Hey Hello");
	}
}
public class Demo {
	public static void main(String[] args) throws InterruptedException {
		C c=new C();
		Thread a1=new Thread(c);
		a1.start();
//		a1.join();
//		System.out.println(c.j);
	}
}
