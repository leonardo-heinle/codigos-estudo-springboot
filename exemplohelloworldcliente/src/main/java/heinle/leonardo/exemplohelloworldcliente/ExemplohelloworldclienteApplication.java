package heinle.leonardo.exemplohelloworldcliente;

import heinle.leonardo.exemplohelloworldcliente.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExemplohelloworldclienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemplohelloworldclienteApplication.class, args);

		Client client = new Client();
		client.setName("Leo");
		client.setLastName("Heinle");
		System.out.println(client);

		Client client1 = new Client("Ze", "Silva");
		System.out.println(client1);

		System.out.println(new Client("Joao", "Mendes", 1000));
	}

}
