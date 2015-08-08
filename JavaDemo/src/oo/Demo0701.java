package oo;


public class Demo0701 {

}


/**
 * 内存分析的概念 
 * 当对象赋值的时候，修改的是内存中引用的值
 * 
 */
class Person03{
	
	String name;
	int age;

	public void showInfo() {
		System.out.println("姓名：" + name + ",年龄：" + age);
	}

	Person03() {

	}

	Person03(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Test1{
	public static void main(String[] args) {
		Person03 p1 = new Person03();
		p1.showInfo();// null,0
		p1.name = "张三";
		p1.age = 30;
		p1.showInfo();
		// ........
		Person03 p2 = new Person03("李四", 31);
		p2.showInfo();
		// ........
		Person03 p3 = p1;// p1和p3共同指向一个对象
		p3.name = "王五";
		System.out.println("--->" + p1.name);// 王五
		System.out.println(p3.name);// 王五
		System.out.println(p3.age);// 30
		p2 = p3;//
		p3.age = 40;
		System.out.println("==>" + p2.age);// 40
	}

}

/**
 * 基本数据类型传
 * 主方法中的x值在方法内重新赋值，在方法外并没有改变
 * 局部变量，会在代码执行完之后，跳出方法之后就会销毁
 *
 */
class Test2{
	
	public void change(int x) {// x = x x=5
		System.out.println("----------->" + x);
		x = 100;
		System.out.println("方法中：x--》" + x);// 100
	}

	public static void main(String[] args) {
		int x = 5;
		System.out.println("方法调用前：x--" + x);// 5
		Test2 d1 = new Test2();
		d1.change(x);
		System.out.println("方法调用后：x--》" + x);// 5
	}
	
}




/**
 * 引用对象传值
 */

class Test3{
	
	int x ;
	public void change(Test3 d) {// d = d1包名类名@编码
		System.out.println("&&&&&&&&&" + d);

		System.out.println("*****" + d.x);
		d.x = 100;
		System.out.println("方法中。。。x" + x);// 100
	}

	public static void main(String[] args) {
		Test3 d1 = new Test3();
		System.out.println("&&&&&&&&&" + d1);// 包名类名@编码
		System.out.println(d1.x);
		d1.x = 5;
		System.out.println("方法调用前。。。x" + d1.x);// 5
		d1.change(d1);
		System.out.println("方法调用后x。。" + d1.x);// 100

	}
	
}
