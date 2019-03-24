import entity.Type;
import entity.Workout;
import factory.FactoryMethod;
import factory.FactoryMethodImpl;

public class App {

    public static void main(String[] args) {
        FactoryMethod factory = new FactoryMethodImpl();
        for (Type type : Type.values()) {
            Workout workout = factory.createWorkout(type);
            workout.info();
        }
    }
}
