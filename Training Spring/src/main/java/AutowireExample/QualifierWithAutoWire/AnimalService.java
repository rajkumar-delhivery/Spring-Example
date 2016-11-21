package AutowireExample.QualifierWithAutoWire;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by delhivery on 24/10/16.
 */

@Service
public class AnimalService {

    private Animal animal;
    private Zoo zoo;

    public AnimalService(@Qualifier("deer") Animal animal, Zoo zoo){
       this.animal = animal;
        this.zoo = zoo;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }
}
