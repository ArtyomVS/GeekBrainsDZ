

public class RunningTrack {
    private int roadLength;

    public RunningTrack(int roadLength){
        this.roadLength = roadLength;
    }

    public double getTimeToOvercomeRoad(CanRun runner){
        return runner.run(roadLength);
    }
}
