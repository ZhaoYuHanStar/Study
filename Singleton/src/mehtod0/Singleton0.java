package mehtod0;

/**  
* @ClassName: Singleton0  
* @Description: 单例模式第0种  预加载,线程安全,但是不被需要时就加载进了内存,会浪费内存
* @author 赵语涵
* @date 2020年10月9日 下午8:55:29  
*    
*/
public class Singleton0 {
	private static Singleton0 singleton0 = new Singleton0();
	private Singleton0(){}
	public static Singleton0 getInstance() {
		return singleton0;
	}
}
