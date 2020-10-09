package mehtod3;

/**  
* @ClassName: Singleton3  
* @Description: 单例模式第4种  静态内部类  按需创建,提高空间利用率  
* @author 赵语涵
* @date 2020年10月9日 下午8:55:29  
*    
*/
public class Singleton3 {
	
	private Singleton3(){}
	
	private static class Singleton3Holder {
		private static final Singleton3 INSTANCE = new Singleton3();
	}
	
	public static Singleton3 getInstance() {
		return Singleton3Holder.INSTANCE;
	}
}
