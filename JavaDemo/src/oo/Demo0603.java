package oo;


/**
 * this关键字:可以指代对象本身，用来调用构造方法，和调用对象属性
 * @author Administrator
 *
 */
public class Demo0603 {
	
	

}

class School {
	String name;
	int year;
	String address;
	
	public void showInfo(){
		System.out.println("学校名称："+this.name+"\t建校时间："+this.year+"\t学校地址："+address);
	}
	public void test1(){
		showInfo();//this.showInfo();
	}
	
	 School(){
		//this("abc");
	}
	School(String name){//形参beida
		this();//指代构造函数
		System.out.println("这是一个参数的构造函数");
		this.name=name;
	}
	School(String name,int year){//"北大", 2003
		this(name);//表示调用参数String类型的构造函数
	//	name=_name;
		this.year=year;
		System.out.println("测试的构造函数。。");
	}
	public School(String name,int year,String address){
//		name = _name;//此处未成功赋值
//		year = _year;
		this(name,year);
		this.address=address;
		System.out.println("三个参数的。。。");
		
	}
}
