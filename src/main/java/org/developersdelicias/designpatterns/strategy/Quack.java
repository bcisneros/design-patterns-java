package org.developersdelicias.designpatterns.strategy;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack!");
	}

}
