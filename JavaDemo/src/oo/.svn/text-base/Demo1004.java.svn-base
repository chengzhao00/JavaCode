package oo;

/**
 * 静态内部类 不能访问外部类的非静态属性，只能访问外部类静态属性和方法
 * @author Administrator
 *
 */
public class Demo1004 {

}

class Outer02 {// 外部类
	private int i = 6;// 外部类的私有属性
	static String msg = "helloworld";// 外部类的静态属性

	public void test() {// 外部类的成员方法
		System.out.println("test方法。。。" + this.i);// 访问外部类的私有属性
		System.out.println(Outer02.msg);// 访问外部类的静态属性，
		Inner01 inner01 = new Inner01();// 创建内部类对象
		inner01.fun1();// 内部类对象，在调用内部类的方法
	}
	
	public static void printInfo(){
		System.out.println("printInfo");
	}

	static class Inner01 {// 静态内部类
		int i = 8;// 内部类的属性
		static int j = 0;

		public void fun1() {// 内部类的方法
			System.out.println(i);// Outer01.this.i  静态内部类不能访问外部的非静态属性
			// System.out.println(Outer02.this.i);// 访问外部类的私有属性
			System.out.println(Outer02.msg);// 访问外部类的的静态属性
			Outer02 outer02 = new Outer02();//静态内部类无法访问外部非静态变量，如果要访问外部的非静态变量，必须创建外部类的实例
			System.out.println(outer02.i);// 创建外部类的对象才能访问外部类的成员属性
			
		}
	}

	public static void main(String[] args) {
		Outer02 o2 = new Outer02();
		 o2.test();
		Outer02.Inner01 i1 = new Outer02.Inner01();
		i1.fun1();
	}
}

