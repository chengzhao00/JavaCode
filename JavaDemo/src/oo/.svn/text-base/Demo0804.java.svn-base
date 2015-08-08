package oo;


/**
 * 对象的多态
 * 
 * @author Administrator
 *
 */
public class Demo0804 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

/**
 *  父类A 方法1，2，3
 *  子类B 方法1，2，5
 *	A a = new A(); 对象可以调用方法
 *	B b = new B(); 对象可以调用的方法
 *	A a1 = new B();对象可以调用的方法          
 *	能调用的方法看左边，具体调用的方法看右边 
 */
//1,3,4,5
class A {
	int i;
	static int k;

	public static void fun() {
		// System.out.println(i);
		System.out.println(k);
		// A.test1();
	}


	public void test1() {
		System.out.println("父类中的方法1.。");
	}

	public void test2() {
		System.out.println(".。。。父类中的方法2.。");
	}

	public void test3() {
		System.out.println("**。。**。。父类中的方法3.。");
	}

}
//1,3,4,5
class B extends A {
	int j;

	@Override
	public void test1() {
		System.out.println("子类重写父类的方法。。。。。中的方法1.。");
	}

	@Override
	public void test3() {
		System.out.println("子类重写父类的方法。。。。。中的方法3.。");
	}

	public void test4() {
		System.out.println("。。。。子类新增的方法。。");
	}
	

}

class Test12 {

	public static void main(String[] args) {
		A a = new A();
		// a.test1();
		// a.test2();
		// a.test3();

		// a能调用的方法？
		B b = new B();
		// b.test1();// 子类调用重写后的方法。。。
		// b.test2();// 子类调用父类的方法
		// b.test4();// 子类新增的方法。。
		// b能调用的方法？
		A a1 = new B();// 不能调子类的新增方法
		a1.test1();// 调用子类重写后的方法
		a1.test2();
		a1.test3();
		// a1能调用的方法？
		// B b1 = new A();
		a1.i = 10;
		B b1 = (B) a1;
		b1.j = 3;
	}
}
