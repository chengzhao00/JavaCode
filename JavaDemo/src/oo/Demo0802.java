package oo;

/**
 * 1继承 2方法覆写
 * super的使用方法
 *   1调用父类的构造方法
 *   2调用父类的方法
 *   
 *   
 * @author Administrator
 * 
 */
public class Demo0802 {

}

/**
 * 引出对象继承
 * super调用父类的构造
 */
class Person08 {// father
	private String name;

	private int age;

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

class Student02 extends Person08 {// son
// private String name;
// private int age;
	private String school;

	// public String getName() {
	// return name;
	// }
	//
	// public void setName(String name) {
	// this.name = name;
	// }
	//
	// public int getAge() {
	// return age;
	// }
	//
	// public void setAge(int age) {
	// this.age = age;
	// }

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
}

class Test03 {
	public static void main(String[] args) {
		Student02 s1 = new Student02();
		s1.setName("zhangsan");// 使用父类的方法
		s1.setAge(20);// 使用父类的方法
		s1.setSchool("qianfengxiaoban");// 子类自己的方法
		System.out.println(s1.getName() + "\t" + s1.getAge() + "\t" + s1.getSchool());
	}
}

/**
 * 方法覆写
 */
//练习1：父类动物：名字，年龄，吃，睡，子类，狗，猫
class Animal {
	private String name;

	private int age;

	Animal() {
		System.out.println("父类的构造函数。。");
	}

	public void eat() {
		System.out.println("吃东西啦。。。");
	}

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void sleep() {
		System.out.println("准备睡觉。。");
	}

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

class Cat01 extends Animal {
	private String color;

	public void catchMouse() {
		System.out.println("小猫爪老鼠。。");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

class Dog01 extends Animal {
	private double height;// 子类新增的属性

	Dog01() {
		super();// 指代父类的构造函数
		// super(name, age);
		System.out.println("子类的构造函数。。");
	}

	Dog01(String name, int age, double height) {
		super(name, age);
		this.height = height;
	}

	public void lookDoor() {
		System.out.println("小狗看家。。");
	}

	public void eat() {
		System.out.println("吃骨头。。。。。");
	}

	public void test() {
		super.eat();
		this.sleep();
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}

/**
 * 创建父类，调用方法 创建子类，调用子类的方法
 */
class Test04 {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.setName("花花");
		a1.setAge(2);
		System.out.println(a1.getName() + "\t" + a1.getAge());
		a1.sleep();
		// 实例化子类对象
		Dog01 d1 = new Dog01();
		d1.setName("二黄");
		d1.setAge(2);
		d1.setHeight(0.8);// 子类自己的方法
		d1.eat();// 子类调用父类的方法
		d1.lookDoor();// 子类调用新增的方法
		Cat01 c1 = new Cat01();
		c1.setName("莎莎");
		c1.setAge(1);
		c1.setColor("小白");
		c1.catchMouse();
	}
}



//练习1：父类：person,name,age,说话，走路，构造函数
//子类：工人：name，age，职业，工作干活。。，重写说话，构造函数
class Person12 {
	private String name;
	private int age;

	public void speak() {
		System.out.println(name + "人在说话。。");
	}

	public void walk() {
		System.out.println(name + "人在走路。。。");
	}

	public Person12() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person12(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

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
class Worker extends Person12 {
	private String job;

	@Override
	public void speak() {
		// super.speak();
		System.out.println("子类重新说话，咋说呢。。。" + getName() + "在汇报工作。。。");
	}

	public void working() {
		System.out.println(this.getName() + "在工作");
	}

	public Worker() {
		super();// 指代父类的无参的构造函数
	}

	public Worker(String name, int age, String job) {// "小李", 34, "码农"
		super(name, age);// 指代父类的有参的构造函数
		this.job = job;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

}
class Test10{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person12 p1 = new Person12("张三", 30);
		p1.speak();
		p1.walk();
		Worker w1 = new Worker("小李", 34, "码农");
		w1.speak();
		w1.working();
	}
}
/**
 * 使用this调用本类的常量 使用super调用父类的常量
 */
// 测试：this和super的用法。
class A1 {
	int i = 5;
}

class B1 extends A1 {
	int i = 10;
	public void test() {
		System.out.println(this.i);
		System.out.println(super.i);
	}
}

class Test21 {
	public static void main(String[] args) {
		B1 b = new B1();
		b.test();
	}
}
/**
 * 覆写方法 使用this调用本类的方法 使用super调用父类的方法
 */
class Test06 {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		System.out.println("*********");
		Dog01 d1 = new Dog01();
		Dog01 d2 = new Dog01("二黄", 3, 2.3);
		d1.test();
	}

}






