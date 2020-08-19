package zyh;

/**  
* @ClassName: SyncThread  
* @Description: SyncThread 修饰一个代码块
* @author 赵语涵
*/
public class SyncThread implements Runnable{
	private static int count;

	public SyncThread() {
		count = 0;
	}
	
	@Override
	public void run() {
		synchronized (this) {
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
	
	public int getCount() {
		return count;
	}

}
