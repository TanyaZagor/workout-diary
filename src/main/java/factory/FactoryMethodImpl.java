package factory;

import entity.*;

public class FactoryMethodImpl implements FactoryMethod {
    public Workout createWorkout(Type type) {
        Workout workout = null;
        switch (type) {
            case RUN: workout = new RunWorkout(); break;
            case SKY: workout = new SkyWorkout(); break;
            case SWIM: workout = new SwimWorkout(); break;
            case YOGA: workout = new YogaWorkout(); break;
        }
        return workout;
    }
}
