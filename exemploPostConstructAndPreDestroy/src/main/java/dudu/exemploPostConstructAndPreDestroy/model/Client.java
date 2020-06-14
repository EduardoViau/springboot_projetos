package dudu.exemploPostConstructAndPreDestroy.model;

import lombok.*;
import org.springframework.stereotype.Component;

/**
 * @author Dudis
 */

@ToString
@Getter @Setter
@AllArgsConstructor

@Component
public class Client {

    private String name;
    private String lastName;

    public Client() {
        System.out.println("Classe cliente!");
    }

}
