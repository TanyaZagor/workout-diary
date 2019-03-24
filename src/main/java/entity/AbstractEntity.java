package entity;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public abstract class AbstractEntity {

    private String id = UUID.randomUUID().toString();

}
