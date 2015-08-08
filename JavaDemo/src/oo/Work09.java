package oo;

public class Work09 {

}

/**
 * 练习1
 * 
 */
abstract class Pet {
	private String name;

	private int age;

	public void sleep() {
		System.out.println(name + "   在睡觉。。");
	}

	public void happy() {
		System.out.println(name + "，乐啦。。。");
	}

	public abstract void cream();

	public Pet() {
		super();
	}

	public Pet(String name, int age) {
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

class Cat03 extends Pet {
	private String color;

	public void cream() {
		System.out.println(getName() + "叫了两声。喵喵。。。,舔   " + color + "色的毛。。。");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Cat03() {
		super();
	}

	public Cat03(String name, int age) {
		super(name, age);
	}

}

class Dog03 extends Pet {
	public void cream() {
		System.out.println(getName() + "叫了两声。。汪汪。。。");
	}

	public void lookDoor() {
		System.out.println(getName() + "，在看门。。。");
	}

	public Dog03() {
		super();
	}

	public Dog03(String name, int age) {
		super(name, age);
	}

}

class Girl {
	private String name;

	private int age;

	private Pet pet;

	public void enjoy() {
		System.out.println(name + "和自己的宠物在玩。。" + pet.getName());
		pet.happy();
		pet.cream();
		System.out.println("玩累啦。。。");
		pet.sleep();
		if (pet instanceof Dog03) {
			System.out.println(pet.getName() + "睡醒啦。。");
			Dog03 dog = (Dog03) pet;
			dog.lookDoor();
		}

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

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public Girl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Girl(String name, int age, Pet pet) {
		super();
		this.name = name;
		this.age = age;
		this.pet = pet;
	}

}

class Test17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog03 d1 = new Dog03("啸天", 3);
		Girl g1 = new Girl("如花", 14, d1);
		g1.enjoy();
		Cat03 c1 = new Cat03("Tom", 2);
		c1.setColor("白");
		Girl g2 = new Girl("如梦", 15, c1);
		g2.enjoy();
	}
}

/**
 * 
 * 练习2
 */
class Person09 {
	private String name;

	private int age;
	{
		name = "无名";
		age = 30;

	}

	@Override
	public String toString() {
		return name + " ： " + age;
	}

	public void printInf() {
		System.out.println(name + " ： " + age);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Person09) {
			Person09 p = (Person09) obj;
			if (p.name.equals(this.name) && p.age == this.age) {
				return true;
			}
		}
		return false;
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

	public Person09() {
		super();
	}

	public Person09(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}

class Teacher extends Person09 {
	private String course;

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Teacher() {
		super();
	}

	public boolean equals(Object obj) {
		// 父类已经完成
		// if (this == obj) {
		// return true;
		// }
		// if (obj instanceof Teacher) {
		// Teacher t = (Teacher) obj;
		// if (t.getName().equals(this.getName())
		// && t.getAge() == this.getAge()
		// && t.course.equals(this.course)) {
		// return true;
		// }
		// }

		// return false;

		boolean flag = super.equals(obj);// false，true，
		if (flag) {
			if (obj instanceof Teacher) {
				Teacher t = (Teacher) obj;
				if (t.course.equals(this.course)) {
					return true;
				}
			}
		}
		return false;
	}

	public Teacher(String name, int age, String course) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.course = course;
	}

	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " ： " + course;// String+String
		// super.printInf();
		// return " ： " + course;// void+String
	}
}
