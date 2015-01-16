package com.ivar.Behaviour.StrategyPattern;

public class Context {

	Strategy strategy;

	Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public int executeStrategy(int a, int b) {
		return this.strategy.execute(a, b);
	}

}
