package thread;

class A extends Thread{
	int j=0;
	public void run() {
		for(int i=0;i<=30;i++) {
			j=i;
		}
	}
}

public class JoinMethod {
	public static void main(String[] args) {
		A a1=new A();
		a1.start();
		System.out.println(a1.j);
	}
}
