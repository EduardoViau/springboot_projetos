package viau.eduardo.exemplogradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import viau.eduardo.exemplogradle.model.Client;

@SpringBootApplication
public class ExemplogradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemplogradleApplication.class, args);
		Client client = new Client();
		client.setName("dudis");
		client.setLastName("viau");
        System.out.println(client);

		Client client1 = new Client("ze", "Silva");
		System.out.println(client1);

		System.out.println(new Client("do", "karalho"));
	}

}
