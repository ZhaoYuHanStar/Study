package zyh;

public class SyncThread1 implements Runnable {
	// 不重复解决方案：volatile可保证变量的内存可见性
	// 同步如何保证：AtomicInteger
	private static int count;

	public SyncThread1() {
		count = 0;
	}
	
	public void countAdd() {
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
	
	//没有对count进行写操作，因此不用加synchronized修饰
	public void printCount() {
		for(int i=0; i<5; i++) {
			try {
				System.out.println(Thread.currentThread().getName() + " count:" + (count++));
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	@Override
	public void run() {
		String currentThreadName = Thread.currentThread().getName();
		if("thread1".equals(currentThreadName)) {
			countAdd();
		}else if("thread2".equals(currentThreadName)) {
			printCount();
		}
	}

}
