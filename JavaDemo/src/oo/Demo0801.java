package oo;

/**
 * 静态 1.静态属性 2.静态方法 3.面试题 静态代码块 一般代码块
 * 
 * 静态属性：当修改了这个属性，所有实例的这个属性都会改变
 * 静态方法：直接使用类名调用，一般是一些工具方法使用
 * 静态代码块--》构造代码块--》构造函数
 * 
 * 
 * @author Administrator
 * 
 */
public class Demo0801 {
   
}

class Person06 {

	public String name;

	public int age;

	public static String city;

	public String prinfInfo() {
		return this.name + "\t" + this.age + "\t" + this.city;
	}
	public static void test() {
		System.out.println("静态的测试方法。。");
		// System.out.println("name--->" + name);// 静态方法中，不能调用非静态的属性
		// System.out.println(this.count);// 静态方法中，拒绝this关键字，super
	}

}

class Test01 {
	public static void main(String[] args) {
		Person06 p1 = new Person06();
		p1.name = "张三";
		p1.age = 10;
		p1.city = "北京";
		Person06 p2 = new Person06();
		p2.name = "王五";
		p2.age = 20;
		p2.city = "深圳";
		// System.out.println(p1.prinfInfo());
		// System.out.println(p2.prinfInfo());

		// 已经产生了50个对象，要修改他们的city属性值
		// city为静态变量
		System.out.println("---------------------------");
		p1.city = "上海";

		System.out.println(p1.prinfInfo());
		System.out.println(p2.prinfInfo());

	}
}
// 练习1：利用static统计该类共产生了多少个对象-->count（static）

class Person07{
	
	public static int count =0;
	
    public Person07(){
    	count++;
      System.out.println("创建了"+count+"个对象");
    }
    
}
class Test02{
	 public static void main(String[] args) {
			Person07 p1  = new Person07();
			Person07 p2  = new Person07();
			Person07 p3  = new Person07();
			Person07 p4  = new Person07();
			
		}
}

/**
 * 静态代码块 构造代码块 构造函数
 */
class Test11 {

	{
		System.out.println("构造代码块。。。");
	}

	public Test11() {
		System.out.println("这是构造函数。。。");
	}

	static {
		System.out.println("。。静态代码块。。。");

	}

	public static void main(String[] args) {
		Test11 t3 = new Test11();
	}
}
