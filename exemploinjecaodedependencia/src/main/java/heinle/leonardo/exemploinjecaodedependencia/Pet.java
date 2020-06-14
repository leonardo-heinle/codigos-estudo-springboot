package heinle.leonardo.exemploinjecaodedependencia;

import heinle.leonardo.exemploinjecaodedependencia.interfaces.AnimalInterface;
import heinle.leonardo.exemploinjecaodedependencia.model.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Leonardo
 */
@Component
public class Pet {

    @Autowired
    @Qualifier("cat")
    private AnimalInterface animalInterface;

    public void execute() {
        animalInterface.comunicar();
    }

}
