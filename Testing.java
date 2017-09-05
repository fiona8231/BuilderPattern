
public class Testing {
    public static void main(String[] args){
        Builder oldStyleRobot = new OldRobotBuilder();
        RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);
        robotEngineer.makeRobot();

        Robot robot1 = robotEngineer.getRobot();
        System.out.println("Robot built");
        System.out.println("Robot head type" + robot1.getRobotHead());
        System.out.println("Robot Arms type" + robot1.getRobotArms());

    }

}
