
// Builder interface for building all of the different types of robots we want to use.
public interface Builder {
    public void buildRobotHead();
    public void buildRobotTorso();
    public void buildRobotLegs();
    public void buildRobotArms();
    public Robot getRobot();


}
