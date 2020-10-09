package mehtod2;

/**  
* @ClassName: Singleton2  
* @Description: 单例模式第3种  优化懒加载,使用synchronized保证线程安全
* 				并用volatile来保证对象实例化过程的正确性(可见性)
* 				缺：实现起来较复杂,易出错
* @author 赵语涵
* @date 2020年10月9日 下午8:55:29  
*    
*/
public class Singleton2 {
	private volatile static Singleton2 singleton1;
	private Singleton2(){}
	public static Singleton2 getInstance() {
		if(singleton1 == null) {
			synchronized (Singleton2.class) {
				if(singleton1 == null) {
					singleton1 = new Singleton2();
				}
			}
		}
		return singleton1;
	}
}
