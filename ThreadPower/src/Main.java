 
public class Main {

	public static void main(String[] args) {
		
		ThreadPower th1 = new ThreadPower("1st thread", 1, -1);
		th1.setDaemon(true);
		th1.start();
		ThreadPower th2= new ThreadPower("2nd thread", 2, -2);
		th2.start();
		ThreadPower th3=new ThreadPower("3rd thread", 3, -3);
		th3.start();
		ThreadPower th4=new ThreadPower("4th thread", 4, -4); 
		th4.setDaemon(true);
		th4.start();
		ThreadPower th5=new ThreadPower("5th thread", 5, -5);
		th5.start();
		ThreadPower th6 = new ThreadPower("6th thread", 2, -2);
		th6.start();
	//th1.setDaemon(true);
		
		//th.setDaemon(true);
	}

}
