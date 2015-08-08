package oo;

/**
 * 简单工厂模式
 * 简单工厂模式是由一个具体的类去创建其他类的实例，父类是相同的，父类是具体的
 * @author Administrator
 *
 */
// 抽象产品角色
interface ICar {
	public void drive();
}

// 具体产品角色
class Benz implements ICar {
	public void drive() {
		System.out.println("Driving Benz ");
	}
}

class Bmw implements ICar {
	public void drive() {
		System.out.println("Driving Bmw ");
	}
}
class Driver{
	public static ICar driver(String s){
		if(s.equalsIgnoreCase("Benz"))
			return new Benz();
		else if(s.equalsIgnoreCase("Bmw"))
			return new Bmw(); 
		else
			return null;
	}
}
public class Demo1008 {
	public static void main(String[] args) {
		ICar car = Driver.driver("benz");
		car.drive();
	}
}
