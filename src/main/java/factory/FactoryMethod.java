package factory;

import entity.Type;
import entity.Workout;

public interface FactoryMethod {
    Workout createWorkout(Type type);
}
