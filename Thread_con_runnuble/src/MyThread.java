
class MyThread implements Runnable{
	private int X;
	private int Y;
	Thread th;
	MyThread(String name, int x, int y){
		this.X = x;
		this.Y = y;
		th = new Thread(this, name);
		th.start();
	}
	
	@Override
	public void run() {
		for(int i=1; i>0;i++) {
			System.out.println(i*(X+Y));
			try {
				th.sleep(800);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
