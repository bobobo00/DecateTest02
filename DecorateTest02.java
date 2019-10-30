package cn.io.study3;
/**
 * 模拟咖啡
 * 1，抽象组件：需要装饰的抽象对象（接口或抽象父类）
 * 2，具体组件：需要装饰的对象
 * 3，抽象装饰类：包含了对抽象组件的引用以及装饰着共有的方法
 * 4，具体装饰类：被装饰对象
 * @author dell
 *
 */

public class DecorateTest02 {
	public static void main(String[] args) {
		Drink coffee=new Coffee();
		Drink suger=new Suger(coffee);
		System.out.println(coffee.info()+"------>"+coffee.cost());
		System.out.println(suger.info()+"------>"+suger.cost());
		Drink milk=new Milk(suger);
		System.out.println(milk.info()+"----->"+milk.cost());
		
	}

}

//抽象组件
interface Drink{
	double cost();
	String info();
}

//具体组件
class Coffee implements Drink{
    private String name="原味咖啡";
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 10.0;
	}

	@Override
	public String info() {
		// TODO Auto-generated method stub
		return name;
	}
	
}
//抽象装饰类
abstract class Decorate implements Drink{
	private Drink d;
	
	public Decorate(Drink d) {
		this.d = d;
	}
	
	public double cost() {
		// TODO Auto-generated method stub
		return this.d.cost();
	}

	@Override
	public String info() {
		// TODO Auto-generated method stub
		return this.d.info();
	}
}

//具体装饰类
class Milk extends Decorate{

	public Milk(Drink d) {
		super(d);
		// TODO Auto-generated constructor stub
	}
	
	public double cost() {
		// TODO Auto-generated method stub
		return super.cost()*2;
	}

	@Override
	public String info() {
		// TODO Auto-generated method stub
		return super.info()+"加入牛奶";
	}
}
//具体装饰类
class Suger extends Decorate{

	public Suger(Drink d) {
		super(d);
		// TODO Auto-generated constructor stub
	}
	
	public double cost() {
		// TODO Auto-generated method stub
		return super.cost()*4;
	}

	@Override
	public String info() {
		// TODO Auto-generated method stub
		return super.info()+"加入蔗糖";
	}
	
}
