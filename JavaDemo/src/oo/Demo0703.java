package oo;


/**
 *  类与类的关系
 * @author Administrator
 *
 */
public class Demo0703 {

}

/**
 * 1.类的属性之中包含类
 * Student学生：姓名：String，年龄：int，书：Book Book书：书名，价格，显示信息
 * 测试：一个人，叫张三，看书《甄嬛传》 通过人，能否知道看的书的名字，以及书的价格。。
 * 2.类的属性是类自己  孩子
 *  
 */
class Person05 {
	// private Person father;
	private String name;// 学生姓名
	private int age;// 学生年龄
	private Book book;// 学生的书
	private Person05 child;// name,age,book,child

	public void setChild(Person05 child) {
		this.child = child;
	}

	public Person05 getChild() {
		return this.child;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public Book getBook() {
		return this.book;
	}

	Person05() {

	}

	Person05(String name, int age) {
		this.name = name;
		this.age = age;
	}

	Person05(String name, int age, Book book) {
		this(name, age);
		this.book = book;
	}

}

class Test05{
	
	public static void main(String[] args) {
		 Book book = new Book("红楼梦",20);
		 Person05 person = new Person05("zhsngsan",10,book);
		 System.out.println(person.getBook().getBookname());
	}
}
