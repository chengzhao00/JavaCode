package oo;

/**
 * 在类与类没有继承关系的时候，不同的类调用方法
 * 方法参数传递的是对象变量
 * @author Administrator
 *
 */
/**
 * A和B没有关联关系：当我们需要A调用B的方法，就可以把B对象传递给A，在A中调用方法
 *                  首先使用B调用自身的方法，通过创建A来调用A自身的方法，把本身传递给A
 * @author Administrator
 *
 */
public class Demo0901 {

}

class A01 {
	public void test(B01 b) {
		b.fun();
	}
}

class B01 {
	public void fun() {
		System.out.println("helloworld");
	}

	public void test1() {
		A01 a = new A01();
		a.test(this);
	}
}

class Test18{
	public static void main(String[] args) {
		B01 b = new B01();
		b.test1();
	}
}








