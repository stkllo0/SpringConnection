package app.model;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Im a Cat";
    }
}
