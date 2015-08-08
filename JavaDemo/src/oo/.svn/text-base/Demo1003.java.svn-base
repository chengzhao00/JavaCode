package oo;

/**
 * 
 * 内部类  从普通类调用属性/方法引出内部类的属性/方法
 * @author Administrator
 *
 */
public class Demo1003 {
	public static void main(String[] args) {
		Outer01 outer01 = new Outer01();
		 outer01.test();
		Outer01.Inner01 i1 = outer01.new Inner01();
		i1.fun1();
		//匿名
		Outer01.Inner01 i2 = new Outer01().new Inner01();
		i2.fun1();
	}
}

class Outer01 {// 外部类
	private int i = 6;
	static String msg = "helloworld";

	public void test() {
		System.out.println("test方法。。。" + this.i);
		System.out.println(Outer01.msg);
		Inner01 inner01 = new Inner01();
		inner01.fun1();
	}

	class Inner01 {// 内部类
		int i = 8;

		public void fun1() {
			System.out.println(i);// Outer01.this.i
			System.out.println(Outer01.this.i);
			System.out.println(Outer01.msg);
		}
	}

	

}