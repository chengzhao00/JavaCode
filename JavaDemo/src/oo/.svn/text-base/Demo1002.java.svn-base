package oo;

/**
 * 接口
 * @author Administrator
 *
 */
public class Demo1002 {

}

interface Oper {
	public final static int i = 5;

	int add(int i, int j);// 用于求2个数的和i和j

	int sub(int i, int j);// 求差

	int mutiply(int i, int j);// 求乘积

	int div(int i, int j);// 求商

}
class OperImpl implements Oper {

	public int add(int i, int j) {
		return i + j;
	}

	public int sub(int i, int j) {
		return i - j;
	}

	public int mutiply(int i, int j) {
		return i * j;
	}

	public int div(int i, int j) {
		return i / j;
	}
}

class  Test13{
	public static void main(String[] args) {
		Oper oper = new OperImpl();// 接口 实现类
		System.out.println(oper.add(3, 5));
		System.out.println(oper.div(10, 2));
	}
}


/**
 * 接口-->抽象类-->实现类
 * 
 */

abstract class OperImple222 implements Oper {

	public int add(int i, int j) {
		return 0;
	}

	public int sub(int i, int j) {
		return 0;
	}

}

class SubOperImple222 extends OperImple222 {

	public int mutiply(int i, int j) {
		return 0;
	}

	public int div(int i, int j) {
		return 0;
	}

}

/**
 * 接口练习 USB模拟
 * */

interface USB {
	public void start();

	public void end();

	public void work();
}
class Mouse01 implements USB {

	public void start() {
		System.out.println("鼠标开始插入电脑，准备工作。。");
	}

	public void end() {
		System.out.println("鼠标结束工作，可以安全退出");
	}
	
	public void work() {
		System.out.println("我是鼠标，各种点，各种点。。。。。各种点。。乱点。。左键，。。点点。。右键，，点点。。。");
	}
}
class FlashDisk implements USB {

	public void start() {
		System.out.println("我是U盘，插入电脑，准备工作。。");
	}

	public void end() {
		System.out.println("U盘设备，结束工作，安全退出");
	}

	public void work() {
		System.out.println("我是Upan，各种读，各种写，各种读，再读，，各种鞋，，再写，，各种鞋，，写完了。。");
	}

}

class Computer01 {
	public void plugIn(USB usb) {// 表示插入的Usb接口设备工作
		usb.start();
		System.out.println("******ok啦******");
		usb.work();
		System.out.println("******ok*******");
		usb.end();
	}
}

class Test14{
	public static void main(String[] args) {
		USB usb = new FlashDisk();
		Computer01 c = new Computer01();
		c.plugIn(usb);
	}
	
}
/**
 * 工厂模式
 * 接口练习  吃苹果，吃香蕉，每次实例化，都要修改类名，引出工厂模式
 * */
interface Fruit {
	
	public void eat();
}
class Apple implements Fruit {

	public void eat() {
		System.out.println("吃苹果啦。。");
	}
}
class Banana implements Fruit {

	public void eat() {
		System.out.println("吃香蕉了。。。。");
	}
}
class Factory {
	public static Fruit getFruit(String msg) {
		if ("apple".equals(msg)) {// null.equals
			return new Apple();
		}
		if ("banana".equals(msg)) {
			return new Banana();
		}
		return null;
	}
}
class Test15{
	public static void main(String[] args) {
		Fruit f = Factory.getFruit("apple");
		f.eat();
		// .....
		Fruit f1 = Factory.getFruit("banana");
		f1.eat();
		// ...
		Fruit f2 = Factory.getFruit("apple1");
		if (f2 != null) {
			f2.eat();
		} else {
			System.out.println("提示信息有误，无法创建对象");
		}
		// 练习：动物园，
		// 动物接口：玩，睡，
		// 实现类：猴子，兔子，鱼，各种动物。。
	}
}