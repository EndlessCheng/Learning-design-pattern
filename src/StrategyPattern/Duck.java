package StrategyPattern;

public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior; // 强制所有子类实现这两个行为

	public Duck() {

	}

	public abstract void display();

	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}

	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}

	public void performFly() {
		flyBehavior.fly(); // 委托给行为类实现
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("I'm a duck, I can swim.");
	}

}
