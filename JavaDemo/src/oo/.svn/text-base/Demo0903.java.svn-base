package oo;

/**
 * @author Administrator
 * toString()  
 * equals()
 * hashCode()
 * ==比较的是地址
 * equals比较的是值
 */
public class Demo0903 {

	
	public static void main(String[] args) {
		String a ="aaa";
		String b ="aaa";
		System.out.println(a==b);
		
		Person13 person1 = new Person13("zhangsan",12);
		Person13 person2 = new Person13("zhangsan",12);
		System.out.println(person1==person2);
		System.out.println(person1.equals(person2));
		System.out.println(person1.toString());
		System.out.println(person2.toString());
	}

}
//创建Person类，两个属性姓名，年龄，如果两个对象的姓名一样，年龄相等，就equals返回true。
class Person13 {
	private String name;
	private int age;
	
	
	/*@Override
	public String toString() {// 返回该对象各个属性值。
		return "姓名：" + this.name + ",年龄：" + this.age;
	}
*/
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

	public Person13() {
		super();// 指代Object类的构造函数
		// TODO Auto-generated constructor stub
	}

	public Person13(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}
class Test25{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person13 p1 = new Person13("zhangsan", 30);
		System.out.println(p1.hashCode());// int类型的编码
		System.out.println(Integer.toHexString(p1.hashCode()));
		System.out.println(p1.toString());
	}
}

////练习1：创建1个类Cat类，毛色，和性别，大小。重写该类toString描述一只猫
class Cat04 {
	private String color;
	private char sex;
	private String type;

	// public String toString() {
	// return "毛色：" + this.color + ",性别：" + this.sex + ",大小：" + type;
	// }

	@Override
	public boolean equals(Object obj) {// c1.equals(c2) c1.equals("abc")
		// Object obj = c2;--->向上转型

		// this obj this:c1,obj:c2
		// 比较对象的各个属性值，都一样，就true
		// step1:应该线比较2个对象的地址，如果一样，就直接true
		if (this == obj) {
			return true;
		}
		// step2:如果对象的地址不一样，应该比较属性值
		if (obj instanceof Cat04) {
			Cat04 c2 = (Cat04) obj;
			// this和c2比
			if (this.color.equals(c2.color) && (this.sex == c2.sex)
					&& (this.type.equals(c2.type))) {
				return true;
			}
		}
		return false;
	}

	public void showInfo() {
		System.out.println("毛色：" + this.color + ",性别：" + this.sex + ",大小："
				+ type);
	}

	
	 @Override
	 public String toString() {
	 return "Cat [color=" + color + ", sex=" + sex + ", type=" + type + "]";
	 }

	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Cat04() {
		super();
	}

	public Cat04(String color, char sex, String type) {
		super();
		this.color = color;
		this.sex = sex;
		this.type = type;
	}

}
class Test24{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat04 c1 = new Cat04("白猫", '女', "小小猫");
		System.out.println("-->" + c1);
		Cat04 c2 = new Cat04("白猫", '男', "小小猫");
		// c2 = c1;
		System.out.println("-->" + c2);
		System.out.println(c1.toString());
		System.out.println(c1);
		c1.showInfo();
		int a = 3;
		int b = 3;
		System.out.println(a == b);
		System.out.println(c1 == c2);// false
		System.out.println("***___>" + c1.equals(c2));// false
		System.out.println(c1.equals("abc"));
		
	}
}
//练习2 人的书 比较
class Book03 {
	private String name;
	private double price;

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Book03) {
			Book03 book = (Book03) obj;
			if (this.name.equals(book.name) && this.price == book.price) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Book03() {
		super();
	}

	public Book03(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

}
class Person15 {
	private String name;
	private int age;
	private Book03 book;

	

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", book=" + book + "]";
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

	public Book03 getBook() {
		return book;
	}

	public void setBook(Book03 book) {
		this.book = book;
	}

	public Person15() {
		super();
	}

	public Person15(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person15(String name, int age, Book03 book) {
		super();
		this.name = name;
		this.age = age;
		this.book = book;
	}

}



