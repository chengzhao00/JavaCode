package oo;

/**
 * 抽象类
 * 抽象方法
 * @author Administrator
 *
 */
public class Demo1001 {

}
abstract class Animal05 {// 声明该类为抽象类
	private String name;
	private int age;
	
	public Animal05(){
		System.out.println("抽象类的构造");
	}

	public void sleep() {
		System.out.println("动物睡觉。。");
	}

	public abstract void eat();// 该方法没有具体方法体，就是抽象方法。

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

class Dog05 extends Animal05 {

	@Override
	public void eat() {
		System.out.println("小狗吃骨头。。。");
	}
}

class Test20{

	public static void main(String[] args) {
		Dog05 d1 = new Dog05();
		d1.sleep();
		d1.eat();
	}
}

