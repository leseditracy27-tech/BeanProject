package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    private final Animal animal;
    private final Timer timer;

    public AnimalsCage(
    @Qualifier("dog") Animal animal,
    Timer timer
    ) {
        this.animal = animal;
        this.timer = timer;
    }
    public Animal getAnimal() {
        return animal;
    }

    public Timer getTimer() {
        return timer;
    }  //
        public String whatAnimalSay() {
            return animal.say();


    }
}

