package com.ivar.structural.BridgeDesignPattern;

public class TestRemote {

	public static void main(String[] args) {
	
		RemoteDevice tv1 = new TVRemoteMute(new TVDevice(1, 200));
		RemoteDevice tv2 = new TVRemotePause(new TVDevice(1, 200));
		RemoteDevice tv3 = new TVRemoteMute(new DVDDevice(1, 200));
		RemoteDevice tv4 = new TVRemotePause(new DVDDevice(1, 200));
		
		System.out.println("Test TV mute...");
		tv1.pressSeven();
		tv1.pressEight();
		tv1.pressNine();
		
		System.out.println("Test TV pause...");
		tv2.pressSeven();
		tv2.pressEight();
		tv2.pressNine(); 
		
		System.out.println("Test TV mute...");
		tv3.pressSeven();
		tv3.pressEight();
		tv3.pressNine();
		
		System.out.println("Test TV pause...");
		tv4.pressSeven();
		tv4.pressEight();
		tv4.pressNine(); 
		
		//tv2.deviceFeedback();
		
	}

}
