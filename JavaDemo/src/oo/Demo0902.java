package oo;

/**
 * 
 * 类继承，方法调用
 * 
 * 
 * @author Administrator
 * 
 */
public class Demo0902 {

}

/**
 * 对象多态 父类A 方法1，2，3 子类B 方法1，3，4 A a = new A(); 对象可以调用方法 B b = new B(); 对象可以调用的方法
 * A a1 = new B();对象可以调用的方法 能调用的方法看左边，具体调用的方法看右边
 * 
 * 调用父类的方法：对象向上转型 调用子类的方法：对象向下转型
 * 
 * instanceof
 * 
 */
class A02 {
	public void test1() {
		System.out.println("父类的测试方法一。。。");
	}

	public void test2() {
		System.out.println("父类测试方法二。。。");
	}

	public void test3() {
		System.out.println("父类的测试犯法   3.。。。。。");
	}
}

class B02 extends A02 {
	public void test1() {
		System.out.println("1。。。子类重写父类的测试方法一。。。");
	}

	public void test3() {
		System.out.println("3。。。子类重写父类的测试方法一。。。");
	}

	public void test4() {
		System.out.println("子类的新增方法4.。。。");
	}
}

class Test19 {
	public static void main(String[] args) {
		// A:1,2,3
		// B:1,3,4
//		A02 a = new A02();
//		a.test3();
//		B02 b = new B02();
//		b.test2();
//		A02 a1 = b;// 子类对象-》父类类型，叫向上转型，不能再调用子类新增，但因为实际上是子类对象，可以调用子类重写
//		a1.test1();// 子类重写
//		a1.test2();
//		a1.test3();
//		B02 b1 = (B02) a1;// 父类类型-》子类类型，叫向下转型，可以调用子类新增
//		b1.test4();
		
		// 练习1：创建对象，练习多态性，向上转型和向下转型
		// A a2 = new A();
		// B b2 = (B) a2;
		// B b3 = new B();
		// A a3 = b3;
		// C c3 = (C) a3;
		// B - A -B
		// B -A - C X
		// A -B X
		// 对象 instanceof 类 --》boolean

		A2 a = new A2();
		System.out.println(a instanceof A2);// true
		System.out.println(a instanceof B2);// false
		System.out.println(a instanceof C2);// false
		A2 a1 = new B2();
		System.out.println(a1 instanceof B2);// true
		System.out.println(a1 instanceof A2);// true
		System.out.println(a1 instanceof C2);// false
		C2 c = new C2();
		System.out.println(c instanceof A2);// true
		A2 a3 = c;
		System.out.println(a3 instanceof C2);// true
	}
}

// 练习2： // 题目：设计一个方法，这个方法用于接收一个类的任意子类的对象，调用重写后的方法。
// 父类：A fun()
// 子类：B，C fun(){重写} 新方法（） 

class A2 {
	public void fun() {
		System.out.println("父类的方法。。。");
	}
}

class B2 extends A2 {
	public void fun() {
		System.out.println("B子类重写父类的方法fun()");
	}

	public void tB() {
		System.out.println("B。。子类的新增的方法。。。");
	}
}

class C2 extends A2 {
	public void fun() {
		System.out.println("zilei C重写父类的方法fun()...");
	}

	public void tC() {
		System.out.println("C。。。子类的新增的方法。。。");
	}
}

class Test26 {
	// public void test(B b) {// b = b
	// b.fun();
	// }
	//
	// public void test(C c) {
	// c.fun();
	// }
	public void test(A2 a) {// a = c;对象向上转型
		a.fun();
		// 为什么a不能调用子类的新增的方法。。
		if (a instanceof C2) {
			C2 c = (C2) a;
			c.tC();
		}
		if (a instanceof B2) {
			B2 b = (B2) a;
			b.tB();
		}
	}

	public static void main(String[] args) {

		Test26 t1 = new Test26();
		B2 b = new B2();
		C2 c = new C2();
		t1.test(new A2());// 实参匹配形参 实参：c 形参 A
		// A a = new A();
		// a.fun();
		// new A().fun();
		// new A().fun();

	}
}
