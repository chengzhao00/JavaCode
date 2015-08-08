package oo;

/**
 * 单例  
 * @author Administrator
 *
 */
public class Demo1007 {

}
//饿汉式
class Singleton {

	private static Singleton singleton = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {
		return singleton;
	}
}

//懒汉式
class Singleton1 {

	private static Singleton1 singleton = null;

	private Singleton1() {

	}

	public static Singleton1 getInstance() {

		if (singleton == null) {
			// 1.-->2.?
			singleton = new Singleton1();
		}
		return singleton;

	}
}
class Test16{
	public static void main(String[] args) {
//        Singleton s1 = new Singleton();
//		 Singleton s2 = new Singleton();
//		 Singleton s3 = new Singleton();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
