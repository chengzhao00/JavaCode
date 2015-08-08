package oo;

/**
 * 封装对象
 * @author Administrator
 *
 */
public class Demo0702 {

}

/**
 * 
 */
class Person04 {
	private String name;// 私有化该属性，意味外部无法访问
	private int age;

	/**
	 * 对被封装的属性进行赋值，参数就是值
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 对属性进行取值
	 * 
	 * @return
	 */
	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		if (age < 0) {
			System.out.println("年龄不能为负数");
			return;//
			// break;//for,while,do-while,swhich
		}
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public void printInfo() {
		System.out.println(name + "\t" + age);
	}

}

class Test{

	public static void main(String[] args) {
		Person04 p = new Person04();
		p.setAge(30);
		//p.age = 30;
	}
}

//练习：Student：name，age：限制，sex，成绩：0-100之间