package oliveira.viau.exemploinjecao.model;

import oliveira.viau.exemploinjecao.interfaces.AnimalInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Dudis
 */
@Component
@Qualifier("cat")

public class Cat implements AnimalInterface {
    @Override
    public void comunicar() {
        System.out.println("miau");
    }
}
