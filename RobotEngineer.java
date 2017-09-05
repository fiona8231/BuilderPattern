
public class RobotEngineer {

    private Builder builder; // kinda like factory

    RobotEngineer(Builder newRobotBuilder){
        this.builder = newRobotBuilder;
    }

    public Robot getRobot(){
        return this.builder.getRobot();
    }

    public void makeRobot(){
        this.builder.buildRobotHead();
        this.builder.buildRobotTorso();
        this.builder.buildRobotArms();
        this.builder.buildRobotLegs();
    }


}
