import org.jointheleague.graphical.robot.Robot;

public class RobotGrafitti {
public static void main(String[] args) {

	Robot bender= new Robot();
bender.turn(270);
bender.move(800);
bender.penDown();
bender.turn(105);
bender.move(300);
}
}
