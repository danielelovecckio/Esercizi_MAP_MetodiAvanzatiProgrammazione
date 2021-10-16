
public class MainThread {

	public static void main(String[] args) {
		MyThread th = new MyThread("TH1", 3,2);
		MyThread th1 = new MyThread("TH2", 4,5);
		MyThread th2 = new MyThread("TH1",-2 ,3);

	}

}
