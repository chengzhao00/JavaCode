package oo;

/**
 * 对象属性：其他类作为属性
 *           自身作为属性
 * @author Administrator
 *
 */
public class Demo0606 {
	
		
}
/**
 *        学生(Student) 姓名  年龄  书(Book)  
 *        书  (Book)  书名  页数                
 *        把Book看成是Student的一个属性，设置封装性。
 *        打印学生信息，并学生的书信息。
 */

class Book{
	private String bookname;
	private int page;
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public Book(){
	}
	public Book(String bookname, int page) {
		super();
		this.bookname = bookname;
		this.page = page;
	}
	
}

class Student{
	  private String name;
	  private int age;
	  private Book book;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

class TestStudent{
	public static void main(String[] args) {
		Book book = new Book();
		book.setBookname("红楼梦");
		book.setPage(100);
		
		Student student = new Student();
		student.setName("zhangsan");
		student.setAge(10);
		student.setBook(book);
		
		System.out.println(student.getName()+"--->"+student.getAge()+"--->"+student.getBook().getBookname());
	}
}

/**
 * 
 *  【2】对象属性之中包含自己               
 *    人(Person) 姓名  年龄  孩子(Person)
 * 
 * */

class Person02 {
	private String name;
	private int age;
	private Person02 child;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person02 getChild() {
		return child;
	}
	public void setChild(Person02 child) {
		this.child = child;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class  TestPerson02{
	
	 public static void main(String[] args) {
		 Person02 child = new Person02();
	     child.setName("zhangsan");
	     child.setAge(20);
	     child.setChild(null);
	     
	     Person02 father = new Person02();
	     child.setName("zhanger");
	     child.setAge(50);
	     child.setChild(child);
	      
	     System.out.println(father.getName()+"-->"+father.getAge()+"-->"+father.getChild().getName());
	 }
	 
}


