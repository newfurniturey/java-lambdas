package com.newfurniturey.lambdas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ListenerTest {
	// dirty, dirty counters
	static int innerCounter = 0;
	static int lambdaCounter = 0;
	
	public static void main(String[] args) {
		
		JButton button = new JButton("Test Button");
		
		// anonymous class
		button.addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent e) {
				System.out.printf("[inner] Button clicked %d times%n", ++innerCounter);
			}
		});
		
		// lambda
		button.addActionListener(
			e -> System.out.printf("[lambda] Button clicked %d times%n", ++lambdaCounter)
		);
		
		// display the button
		JFrame frame = new JFrame("ListenerTest");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(button, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}
	
}
