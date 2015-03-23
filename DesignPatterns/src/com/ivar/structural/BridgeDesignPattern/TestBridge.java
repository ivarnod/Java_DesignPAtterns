package com.ivar.structural.BridgeDesignPattern;

public class TestBridge {
	Remote tv = new TVRemote(new TV(1, 200));
	
	Remote dvd = new DVDRemote(new DVD(1, 200));
	
	
	
	
}
