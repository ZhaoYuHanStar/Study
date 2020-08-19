package zyh3;

/**  
* @ClassName: SyncThread  
* @Description: SyncThread 修饰一个类
*/
public class SyncThread implements Runnable{
	private static int count;

	public SyncThread() {
		count = 0;
	}
	
	@Override
	public void run() {
		method();
	}
	
	public void method() {
		synchronized (SyncThread.class) {
			for(int i=0; i<5; i++) {
				try {
					System.out.println(Thread.currentThread().getName() + ":" + (count++));
					Thread.sleep(100);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
