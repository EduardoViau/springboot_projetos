package oliveira.viau.exemploinjecao;

import oliveira.viau.exemploinjecao.interfaces.AnimalInterface;
import oliveira.viau.exemploinjecao.model.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author Dudis
 */

@Component
public class Pet {

    @Autowired
    private AnimalInterface animalInterface;

    public void execute() {
        animalInterface.comunicar();
    }
}
