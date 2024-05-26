package lr7;

import java.io.Serializable;
import java.util.Objects;

public class Dog implements Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
