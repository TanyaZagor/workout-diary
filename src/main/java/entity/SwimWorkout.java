package entity;

public class SwimWorkout extends Workout {

    private int distance;

    private Style style;


    public SwimWorkout() {
        super.setType(Type.SWIM);
    }
}
