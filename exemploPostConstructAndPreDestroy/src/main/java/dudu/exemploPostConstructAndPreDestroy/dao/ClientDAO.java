package dudu.exemploPostConstructAndPreDestroy.dao;

import dudu.exemploPostConstructAndPreDestroy.model.Client;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Getter @Setter
@Component
public class ClientDAO {

    @Autowired
    private Client client;

    @PostConstruct
    public void postConstruct() {
        System.out.println("objeto criado");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("objeto finalizado");
    }

}
