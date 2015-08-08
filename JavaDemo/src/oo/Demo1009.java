package oo;

/**
 * 工厂方法模式
 * @author Administrator
 *工厂方法模式是有一个抽象的父类定义公共接口，子类负责生成具体的对象，这样做的目的是将类的实例化操作延迟到子类中完成。
 */
//抽象产品角色
interface Moveable {
   void run();
}
//具体产品角色
class Plane implements Moveable {
   @Override
   public void run() {
       System.out.println("plane....");
   }
}

class Broom implements Moveable {
   @Override
   public void run() {
       System.out.println("broom.....");
   }
}

//抽象工厂
abstract class VehicleFactory {
   abstract Moveable create();
}
//具体工厂
class PlaneFactory extends VehicleFactory{
   public Moveable create() {
       return new Plane();
   }
}
class BroomFactory extends VehicleFactory{
   public Moveable create() {
       return new Broom();
   }
}
public class Demo1009 {
	public static void main(String[] args) {
        VehicleFactory factory = new PlaneFactory();
        Moveable m = factory.create();
        m.run();
    }
}
