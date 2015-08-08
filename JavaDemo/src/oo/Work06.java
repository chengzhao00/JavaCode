package oo;

/**
 * 
 * @author Administrator
 *
 */
public class Work06 {

}
class Point {// this
	double x;
	double y;
	double z;

	public double getDistance(Point p1, Point p2) {
		double distance = 0.0;
		distance = Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y)
				* (p1.y - p2.y) + (p1.z - p2.z) * (p1.z - p2.z));
		return distance;
	}

	public double getDistance1(Point p2) {
		double distance = 0.0;
		distance = Math.sqrt((this.x - p2.x) * (this.x - p2.x)
				+ (this.y - p2.y) * (this.y - p2.y) + (this.z - p2.z)
				* (this.z - p2.z));
		return distance;
	}

	// public double getD1(double x1,double y1,double z1,double x2,double
	// y2,double z2);

	Point() {

	}

	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	Point(double x, double y, double z) {
		this(x, y);// Point(double x,double y)
		this.z = z;
	}

	public void showInfo() {
		System.out.println("X轴：" + x + "\tY轴：" + y + "\tZ轴：" + z);
	}
}
//class TestPoint{
//	Point p1 = new Point();
//	p1.x = 0.0;
//	p1.y = 0.0;
//	p1.z = 0.0;
//	p1.showInfo();
//	Point p2 = new Point(1.0, 2.0, 3.0);
//	p2.showInfo();
//	p2.x = 4.0;
//	p2.showInfo();
//	Point p3 = new Point();
//	double d1 = 0.0;// p1,p2的距离
//	d1 = p1.getDistance(p1, p2);
//	System.out.println(d1);
//	double d2 = 0.0;// 第二种方法求距离
//	d2 = p1.getDistance1(p2);
//	System.out.println(d2);
//}

class Student01 {
	String name;
	int age;
	char sex;
	double cs;
	double ms;
	double es;

	public void showInfo() {// this
		System.out.println("姓名：" + name + ",年龄：" + age + "，性别：" + sex);
		System.out.println("语文成绩：" + cs + "，数学成绩：" + ms + ",英语成绩：" + es);
		System.out.println("该生的总分：" + this.getSumScore() + "\t平均分："
				+ getAvgScore());
	}

	public double getSumScore(Student01 s) {
		double sum = 0.0;
		sum += s.cs + s.ms + s.es;
		return sum;
	}

	public double getSumScore() {
		double sum = 0.0;
		sum += this.cs + this.ms + this.es;
		return sum;
	}

	public double getAvgScore() {
		// return (this.cs + this.ms + this.es) / 3;
		return this.getSumScore() / 3;
	}

	Student01() {

	}

	Student01(String name, int age, char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	Student01(String name, int age, char sex, double cs, double ms, double es) {
		this(name, age, sex);
		this.cs = cs;
		this.ms = ms;
		this.es = es;
	}
}

//class TestStudent{
//	Student s1 = new Student();
//	s1.name = "大师兄";
//	s1.age = 500;
//	s1.sex = '男';
//	s1.cs = 99.9;
//	s1.es = 98.9;
//	s1.ms = 99.8;
//	s1.showInfo();
//	System.out.println(s1.getSumScore(s1));
//	System.out.println(s1.getSumScore());
//	System.out.println(s1.getAvgScore());
//	Student s2 = new Student("花花", 30, '男');
//	s2.cs = 56.8;
//	s2.ms = 77.9;
//	s2.es = 98.9;
//	// System.out.println(s2.getSumScore() + "\t" + s2.getAvgScore());
//	System.out.println("*************");
//	s2.showInfo();
//	Student s3 = new Student("如梦", 23, '女', 99.8, 77.6, 66.9);
//	s3.showInfo();
//}

class Cat {
	double height;
	double weight;
	String color;

	Cat() {
	}

	Cat(double height, double weight, String color) {
		this.height = height;
		this.weight = weight;
		this.color = color;
	}

	public String eat(int n) {
		if (n > 2) {
			return "吃饱了，" + n + "条鱼呢。。";
		} else {
			return "尚有空间。。";
		}
	}

	public void catchMouse() {
		System.out.println(color + "抓老鼠。。。");
	}
}
//class TestCat{
//	Cat c1 = new Cat();
//	c1.height = 10.2;
//	c1.weight = 3.0;
//	c1.color = "白猫";
//	System.out.println(c1.eat(4));
//	Cat c2 = new Cat(20.4, 8.0, "黑猫");
//	c2.catchMouse();
//}