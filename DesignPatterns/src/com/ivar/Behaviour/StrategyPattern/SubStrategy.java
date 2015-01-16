package com.ivar.Behaviour.StrategyPattern;

public class SubStrategy implements Strategy {

	@Override
	public int execute(int a, int b) {
		return a - b;
	}

}
