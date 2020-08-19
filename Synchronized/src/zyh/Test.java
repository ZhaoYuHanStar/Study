package zyh;

/**  
* @ClassName: Test  
* @Description: zyh synchronized 修饰代码块的几种情况
* @author 赵语涵
* @date 2020年8月19日 下午9:34:42  
*    
*/
public class Test {

	public static void main(String[] args) {
		// 两个并发线程访问同一个对象  同步代码块
//		SyncThread syncThread = new SyncThread();
//		Thread thread1 = new Thread(syncThread, "thread1");
//		Thread thread2 = new Thread(syncThread, "thread2");
//		thread1.start();
//		thread2.start();
		
		// 两个并发线程访问不同个对象  同步代码块
//		Thread thread1 = new Thread(new SyncThread(), "thread1");
//		Thread thread2 = new Thread(new SyncThread(), "thread2");
//		thread1.start();
//		thread2.start();
		
		// 两个并发线程访问同一对象  同步代码块
//		SyncThread1 syncThread = new SyncThread1();
//		Thread thread1 = new Thread(syncThread, "thread1");
//		Thread thread2 = new Thread(syncThread, "thread2");
//		thread1.start();
//		thread2.start();
		
		//指定要给某个对象加锁
//		Account account = new Account("zhang san", 10000.0f);
//		AccountOperator accountOperator = new AccountOperator(account);
//
//		final int THREAD_NUM = 5;
//		Thread threads[] = new Thread[THREAD_NUM];
//		for (int i = 0; i < THREAD_NUM; i ++) {
//			threads[i] = new Thread(accountOperator, "Thread" + i);
//			threads[i].start();
//		}
	}

}
