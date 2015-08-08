package oo;

public class Work07 {

}

/**
 * 
 * @author Administrator
 *
 */
class Computer {
	private String display;
	private String mainBox;
	private String mouse;
	private String keyBoard;

	public void open() {
		System.out.println("正在开机。。");
	}

	public void close() {
		System.out.println("正在关机");
	}

	public void showInfo() {
		System.out.println("显示器：" + display + "，主机箱：" + mainBox + "，鼠标："
				+ mouse + ",键盘：" + keyBoard);
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String getMainBox() {
		return mainBox;
	}

	public void setMainBox(String mainBox) {
		this.mainBox = mainBox;
	}

	public String getMouse() {
		return mouse;
	}

	public void setMouse(String mouse) {
		this.mouse = mouse;
	}

	public String getKeyBoard() {
		return keyBoard;
	}

	public void setKeyBoard(String keyBoard) {
		this.keyBoard = keyBoard;
	}

	public Computer() {
	}

	public Computer(String display, String mainBox, String mouse,
			String keyBoard) {
		this.display = display;
		this.mainBox = mainBox;
		this.mouse = mouse;
		this.keyBoard = keyBoard;
	}

}
class Test07{
	
	public static void main(String[] args) {
		Computer c1 = new Computer();
		c1.setDisplay("三星");
		c1.setMainBox("微型");
		c1.setMouse("雷蛇");
		c1.setKeyBoard("罗技");
		c1.open();
		c1.showInfo();
		c1.close();

	}
}

/**
 *
 */
class Person10 {
	private String name;
	private int age;
	private boolean sex;
	private Person10 p;

	public String canMarry(Person10 p) {// p = p2
		// this,p能否结婚 --- 》p1和p2
		String str = "恭喜，百年好合";
		// 判断第一点：是否同性
		if (this.sex == p.sex) {
			str = "同性不能结婚";
			// System.out.println(str);
			return str;
		}
		// 判断第二点：年龄：男<24,女<22
		if (this.sex) {// 表示this是男，p是女
			if (this.age < 24 || p.age < 22) {
				str = "年龄不够。。";
				return str;
			}
		} else {// 表示p是男，this是女
			if (this.age < 22 || p.age < 24) {
				str = "年龄不够。。";
				return str;
			}
		}

		// 判断第三点：是否已婚
		if (this.p != null || p.p != null) {
			str = "不能重婚";
		}
		return str;
	}

	public Person10() {
	}

	public Person10(String name, int age, boolean sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public Person10(String name, int age, boolean sex, Person10 p) {
		this(name, age, sex);
		this.p = p;
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

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public Person10 getP() {
		return p;
	}

	public void setP(Person10 p) {
		this.p = p;
	}

}
class Test08{
	public static void main(String[] args) {
		Person10 p1 = new Person10("Jack", 13, false);
		Person10 p2 = new Person10("Rose", 28, false);
		System.out.println(p1.canMarry(p2));// 实参p2，p1调用方法，表示判断p1和p2能否结婚
	}
}

/**
 * 
 *
 */
class Mouse {
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

	public Mouse(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Mouse() {
		super();
		// TODO Auto-generated constructor stub
	}

}


class Cat02 {
	private String name;
	private char sex;
	private Mouse m;// 表示猫抓到的老鼠

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public Mouse getM() {
		return m;
	}

	public void setM(Mouse m) {
		this.m = m;
	}

	public Cat02() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat02(String name, char sex) {
		super();
		this.name = name;
		this.sex = sex;
	}

	public Cat02(String name, char sex, Mouse m) {
		super();
		this.name = name;
		this.sex = sex;
		this.m = m;
	}

}

class Test09{
	public static void main(String[] args) {
		Mouse m1 = new Mouse("Jerry", 1);
		Cat02 c1 = new Cat02("Tom", '男');
		c1.setM(m1);
		System.out.println("一只叫  " + c1.getName() + "的猫，抓了一只老鼠,叫："
				+ c1.getM().getName() + "，老鼠的年龄：" + c1.getM().getAge());	
	}
}