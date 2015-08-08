package oo;
/**
 * 抽象工厂模式
 * @author Administrator
 *抽象工厂模式提供一个创建一系列相关或相互依赖对象的接口，而无须指定他们具体的类。
 *它针对的是有多个产品的等级结构。而工厂方法模式针对的是一个产品的等级结构。
 */
public class Demo1010 {
	public static void main(String[] args) {
        AbstractFactory f = new DefaultFactory();
        Vehicle v = f.createVehicle();
        v.run();
        Weapon w = f.createWeapon();
        w.shoot();
        Food a = f.createFood();
        a.printName();
    }
}
class Vehicle{

	public void run() {
		System.out.println("Vehicle");
	}
}
class Weapon{

	public void shoot() {
		System.out.println("Weapon");
	}
	
}
class Food{

	public void printName() {
		System.out.println("Food");
	}
	
}
//抽象工厂类
abstract class AbstractFactory {
  public abstract Vehicle createVehicle();
  public abstract Weapon createWeapon();
  public abstract Food createFood();
}
//具体工厂类，其中Food,Vehicle，Weapon是抽象类，
class DefaultFactory extends AbstractFactory{
  @Override
  public Food createFood() {
      return new Food();
  }
  @Override
  public Vehicle createVehicle() {
      return new Vehicle();
  }
  @Override
  public Weapon createWeapon() {
      return new Weapon();
  }
}
