

public class Wall {
    private int wallHeight;

    public Wall(int wallHeight){
        this.wallHeight = wallHeight;
    }

    public double getTimeToOvercomeWall(CanJump jumper){
        return jumper.jump(wallHeight);
    }
}
