package app.config;
import app.model.Dog;
import app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {
    @Bean(name = "Dog")
    public Dog getName() {
        Dog animal = new Dog();
        animal.setName("dog");
        return animal;
    }

    @Bean(name = "timer")
    public Timer getTime(){
        Timer timer = new Timer();
        return timer;
    }
}
