package com.test.build;

public class BuildTest {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("Hi - Checking in the new code and then printing  --  the current iteration : "+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
