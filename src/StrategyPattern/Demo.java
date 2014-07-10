package StrategyPattern;

public class Demo {

	public static void main(String[] args) {
		Duck model = new ModelDuck();
		model.performFly(); // I can't fly!
		model.setFlyBehavior(new FlyWithWings());
		model.performFly(); // I can fly!
	}

}
