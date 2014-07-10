package StrategyPattern;

public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior; // ǿ����������ʵ����������Ϊ

	public Duck() {

	}
	
	public abstract void display();
	
	public void performFly(){
		flyBehavior.fly(); // ί�и���Ϊ��ʵ��
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void swim(){
		System.out.println("I'm a duck, I can swim.");
	}

}
