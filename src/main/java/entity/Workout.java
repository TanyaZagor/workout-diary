package entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Workout extends AbstractEntity {

    private String id = super.getId();

    private String name;

    private Type type;

    private Date date;

    public void info() {
        System.out.println(type.toString());
    }
}
