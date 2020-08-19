package zyh1;

/**  
* @ClassName: SyncThread  
* @Description: SyncThread 修饰一个方法
*/
public class SyncThread implements Runnable{
	private static int count;

	public SyncThread() {
		count = 0;
	}
	
	@Override
	public synchronized void run() {
		for(int i=0; i<5; i++) {
			try {
				System.out.println(Thread.currentThread().getName() + ":" + (count++));
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public int getCount() {
		return count;
	}

}
