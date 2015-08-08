package oo;

/*
 * 面向对象的概念
 */
public class Demo0601 {

	public static void main(String[] args) {
		//面向过程
		Person person = new Person();
		person.fromAToB();
		
		//面向对象
		Human human = new Human();
		human.fromAToB();
	}
	
}


/**
 * 面向过程的编程方式：从A地到B地
 * @author Administrator
 *
 */
class Person{
	
	public void fromAToB(){
		System.out.println("1.开着车直走。。。");
		System.out.println("2.开着车左转。。。");
		System.out.println("3.开着车直走。。。");
		System.out.println("4.开着车右拐。。。");
		System.out.println("5.开着车直走。。。");
	}
	
}

/**
 * 面向对象的编程方式：从A地到B地
 * 
 */
class Car{
	
	public String ahead(){
		return "直走。。。";
	}
	public String back(){
		return "后退。。。";
	}
	public String left(){
		return "左转。。。";
	}
	public String right(){
		return "右转。。。";
	}

	
}
class Human{
	
	public void fromAToB(){
		Car car = new Car();
		System.out.println("1.human开着车"+car.ahead());
		System.out.println("2.human开着车"+car.left());
		System.out.println("3.human开着车"+car.ahead());
		System.out.println("4.human开着车"+car.right());
		System.out.println("4.human开着车"+car.ahead());
		
	}
	
}
