package com.newfurniturey.lambdas;

public class RunnableTest {
	
	public static void main(String[] args) {
		
		System.out.println("=== RunnableTest ===");
		
		// anonymous runnable
		Runnable anonymousRunnable = new Runnable() {
			@Override public void run() {
				System.out.println("[runnable] anonymousRunnable");
			}
		};
		
		// lambda runnable
		Runnable lambdaRunnable = () -> System.out.println("[runnable] lambdaRunnable");
		
		// run them!
		anonymousRunnable.run();
		lambdaRunnable.run();
	}
	
}
