package zyh2;

/**  
* @ClassName: Test  
* @Description: synchronized 修饰静态方法
* @author 赵语涵
* @date 2020年8月19日 下午9:35:38  
*    
*/
public class Test {

	public static void main(String[] args) {
		// 两个线程访问不同的被修饰的静态方法  + 访问相同的被修饰的静态方法
		SyncThread syncThread1 = new SyncThread();
		SyncThread syncThread2 = new SyncThread();
		Thread thread1 = new Thread(syncThread1, "thread1");
		Thread thread2 = new Thread(syncThread2, "thread2");
		thread1.start();
		thread2.start();
		
	}

}
