package mehtod1;

/**  
* @ClassName: Singleton1 
* @Description: 单例模式第1种 懒加载,避免的内存的浪费(预加载),但是线程不安全
* @author 赵语涵
* @date 2020年10月9日 下午8:55:29  
*    
*/
public class Singleton1 {
	private static Singleton1 singleton1;
	private Singleton1(){}
	public static Singleton1 getInstance() {
		if(singleton1 == null) {//只有空的时候才创建,但是可能两个线程同时判断为空
			singleton1 = new Singleton1();
		}
		return singleton1;
	}
}
