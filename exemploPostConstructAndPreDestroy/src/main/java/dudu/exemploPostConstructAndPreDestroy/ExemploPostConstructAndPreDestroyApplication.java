package dudu.exemploPostConstructAndPreDestroy;

import dudu.exemploPostConstructAndPreDestroy.dao.ClientDAO;
import dudu.exemploPostConstructAndPreDestroy.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExemploPostConstructAndPreDestroyApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExemploPostConstructAndPreDestroyApplication.class, args);

		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);

		clientDAO.setClient(new Client("Eduardo", "vaiu"));

		System.out.println("ClientDAO: " + clientDAO);
		System.out.println("Client: " + clientDAO.getClient().toString());

	}

}
