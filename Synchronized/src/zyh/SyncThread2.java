package zyh;

public class SyncThread2 implements Runnable{
        private byte[] lock = new byte[0]; // 特殊的instance变量
        public void method() {
            synchronized(lock) {
            	// todo 同步代码块
            }
        }

        public void run() {

        }
}
