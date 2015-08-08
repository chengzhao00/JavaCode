package oo;

/**
 * 方法内部类的变量，必须使用final标识
 * 闭包
 * @author Administrator
 *
 */
public class Demo1005 {
	private int i = 8;

	public void test(final int j) {
		class Inner03 {
			public void fun() {
				System.out.println(i);
				System.out.println(j);
			}
		}
		Inner03 i3 = new Inner03();
		i3.fun();
	}

	public static void main(String[] args) {
		Demo1005 o3 = new Demo1005();
		o3.test(3);
	}

}
