package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE

		Robot Bob = new Robot();
		Bob.move(100);
		Bob.turn(60);
		Bob.setPenColor(Color.blue);
		Bob.penDown();
		Bob.setSpeed(10);
		for (int i = 0; i < 4; i++) 
		{Bob.move(50);
		Bob.turn(90);
			
		}
	
		Bob.hide();
	}
}
