
public class Robot implements RobotPlan {

    private String robotHead;
    private String robotTorso;
    private String robotLegs;
    private String robotArms;

    @Override
    public void setRobotHead(String head) {
        robotHead = head;
    }

    public String getRobotHead(){ return robotHead; }

    @Override
    public void setRobotTorso(String torso) {
      robotTorso = torso;
    }

    public String getRobotTorso(){ return robotTorso;}

    @Override
    public void setRobotLegs(String legs) {
        robotLegs = legs;
    }

    public String getRobotLegs(){ return  robotLegs; }

    @Override
    public void setRobotArms(String arms) {
        robotArms = arms;
    }

    public String getRobotArms(){ return  robotArms; }
}
