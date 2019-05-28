package _01_houses;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class Houses {
	static Robot block = new Robot();

	public static void main(String[] args) {
		block.moveTo(50, 500);	
		block.penDown();
		block.setPenWidth(5);
		block.setPenColor(255, 0, 0);
		block.setSpeed(200);
		block.move(100);
		block.turn(45);
		block.move(20);
		block.turn(90);
		block.move(20);
		block.turn(45);
		block.move(100);
	}
}
