package nsei.exemploComScope;

import nsei.exemploComScope.dao.ClassDAO;
import nsei.exemploComScope.dao.ClassJDBC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExemploComScopeApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExemploComScopeApplication.class, args);

		ClassJDBC objJDBC = applicationContext.getBean(ClassJDBC.class);
		ClassJDBC objJDBC1 = applicationContext.getBean(ClassJDBC.class);
		ClassDAO objDAO = applicationContext.getBean(ClassDAO.class);
		ClassDAO objDAO1 = applicationContext.getBean(ClassDAO.class);

		System.out.println("objeto da Classe JDBC: " + objJDBC);
		System.out.println("objeto da classe DAO: " + objDAO);

		System.out.println("objeto da Classe JDBC1: " + objJDBC1);
		System.out.println("objeto da classe DAO1: " + objDAO1);
	}

}
