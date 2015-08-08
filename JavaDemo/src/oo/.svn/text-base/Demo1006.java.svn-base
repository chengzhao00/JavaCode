package oo;

/**
 * 匿名内部类
 * @author Administrator
 *
 */
public class Demo1006 {

}
interface B3 {
	public void test();
}

// class BImple implements B {
//
// @Override
// public void test() {
// System.out.println("hellowrold");
// }
// }

abstract class C {
	public void fun1() {
		System.out.println("123");
	}

	public abstract void fun2();
}

class Outer04 {
	public static void main(String[] args) {
		// B b = new BImple();
		B3 b = new B3() {// 接口的实现：匿名内部类

			@Override
			public void test() {
				// TODO Auto-generated method stub
				System.out.println("hellowrold");
			}

		};
		b.test();
		// 练习：创建抽象类的匿名子类，并调用方法测试。
		C c = new C() {

			@Override
			public void fun1() {
				// TODO Auto-generated method stub
				System.out.println("345");
			}

			@Override
			public void fun2() {
				// TODO Auto-generated method stub
				System.out.println("子类实现抽象父类的抽象方法。。。");
			}

		};
		c.fun2();
	}
}

