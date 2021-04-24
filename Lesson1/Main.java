

public class Main {

    public static void main(String[] args) {
	    Human human = new Human("Седобородый", 2000, 4);
	    Cat cat = new Cat("Шерлок", 1001, 2);
	    Robot robot = new Robot("Кнопка", 50, 25);

		Wall[] walls = {new Wall(1), new Wall(5)};
		RunningTrack[] runningTracks = {new RunningTrack(1000), new RunningTrack(5000)};

		for (Wall wall : walls){
			wall.getTimeToOvercomeWall(human);
			wall.getTimeToOvercomeWall(cat);
			wall.getTimeToOvercomeWall(robot);
		}

		for(RunningTrack runningTrack : runningTracks){
			runningTrack.getTimeToOvercomeRoad(human);
			runningTrack.getTimeToOvercomeRoad(cat);
			runningTrack.getTimeToOvercomeRoad(robot);
		}
    }
}
