package zyh2;

/**
* 同步线程
*/
class SyncThread implements Runnable {
    private static int count;

    public SyncThread() {
        count = 0;
    }

    public synchronized static void method() {
        for (int i = 0; i < 5; i ++) {
            try {
                System.out.println(Thread.currentThread().getName() + ":" + (count++));
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized static void method1() {
        for (int i = 0; i < 5; i ++) {
            try {
                System.out.println(Thread.currentThread().getName() + ":" + (count++));
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void run() {
    	String currentThreadName = Thread.currentThread().getName();
		if("thread1".equals(currentThreadName)) {
			method();
		}else if("thread2".equals(currentThreadName)) {
			method1();
		}
//    	method();
    }
}
