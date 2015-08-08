package oo;

public class work08 {

}
class Animal03 {
	private String name;
	private int legs;

	public void move() {
		System.out.println(name + ",移动。。。");
	}

	public void move(int n) {
		System.out.println(name + ",移动了" + n + "米。。");
	}

	public Animal03() {
		this("AAA", 4);
	}

	public Animal03(String name, int legs) {
		this.name = name;
		this.legs = legs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

}
class Bird extends Animal03 {
	Bird(String name) {
		super(name, 2);
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "，飞。。。。。。");
	}
}
class Fish extends Animal03 {
	Fish(String name) {
		super(name, 0);
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "，游泳。。。");
	}

}
class Test22{
	public static void main(String[] args) {
		Animal03 a1 = new Animal03();
		a1.move();
		a1.move(3);
		Fish f1 = new Fish("比目鱼");
		f1.move();
		f1.move(4);
		Bird b1 = new Bird("啄木鸟");
		b1.move();// 重写后的方法
		b1.move(6);
	}
}
/***********************************************************************/	

	/**
	 * 作为孙，猪，沙，类的父类，存储这3个类公共的代码
	 * 
	 * @author Administrator
	 * 
	 */
	class Student03 {
		private String name;
		private int age;

		public void eatZhai(String food) {
			System.out.println("和尚们吃斋啦。。。吃啥呢。。" + food);
		}

		public void readFo() {
			System.out.println("和尚在念佛。。");
		}

		public void getBook() {
			System.out.println("西天取经。。。");
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

		public Student03() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Student03(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

	}
	class SunStu extends Student03 {
		private String arms;

		public void killYao(String yao) {
			System.out.println(getName() + ",降妖除魔。。。" + yao);
		}

		public String getArms() {
			return arms;
		}

		public void setArms(String arms) {
			this.arms = arms;
		}

		public SunStu() {
			super();
		}

		public SunStu(String name, int age, String arms) {
			super(name, age);
			this.arms = arms;
		}

	}
	class ZhuStu extends Student03 {
		private String wife;

		public void qianHorse() {
			System.out.println(getName() + ",牵马。。。");
		}

		public String getWife() {
			return wife;
		}

		public void setWife(String wife) {
			this.wife = wife;
		}

		public ZhuStu() {
			super();
		}

		public ZhuStu(String name, int age, String wife) {
			super(name, age);
			this.wife = wife;
		}
	}

	class ShaStu extends Student03 {
		private String river;

		public void tiaoPackage() {
			System.out.println(getName() + ",挑行李。。");
		}

		public String getRiver() {
			return river;
		}

		public void setRiver(String river) {
			this.river = river;
		}

		public ShaStu() {
			super();
		}

		public ShaStu(String name, int age, String river) {
			super(name, age);
			this.river = river;
		}
	}
	
  
	class Test23{
		  public void main(String[] args) {
				SunStu wukong = new SunStu("悟空", 500, "金箍棒");
				wukong.eatZhai("萝卜");
				wukong.killYao("白骨精");
				ZhuStu bajie = new ZhuStu("八戒", 501, "高小翠");
				bajie.readFo();
				bajie.qianHorse();
				ShaStu wujing = new ShaStu("悟净", 503, "流沙河");
				wujing.getBook();
				wujing.tiaoPackage();
			}
	  }