
public class MyThread extends Thread{
	private String name;
	private int x ;
	MyThread(String name, int x){
		this.name = name;
		this.x=x;
		start();
	}
	
	
	public void run() {
		for(int i = 0; i>=0;i++) {
			System.out.println(x+i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
