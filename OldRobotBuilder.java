
public class OldRobotBuilder implements Builder{
    private Robot robot;

    public OldRobotBuilder(){
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Metal Head");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Metal Torso");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Metal Legs");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Metal Arms");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
