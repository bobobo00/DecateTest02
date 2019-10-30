package cn.io.study3;
/**
 * ģ�⿧��
 * 1�������������Ҫװ�εĳ�����󣨽ӿڻ�����ࣩ
 * 2�������������Ҫװ�εĶ���
 * 3������װ���ࣺ�����˶Գ�������������Լ�װ���Ź��еķ���
 * 4������װ���ࣺ��װ�ζ���
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

//�������
interface Drink{
	double cost();
	String info();
}

//�������
class Coffee implements Drink{
    private String name="ԭζ����";
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
//����װ����
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

//����װ����
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
		return super.info()+"����ţ��";
	}
}
//����װ����
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
		return super.info()+"��������";
	}
	
}
