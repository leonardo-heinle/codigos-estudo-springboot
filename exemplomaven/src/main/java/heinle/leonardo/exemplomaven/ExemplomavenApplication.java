package heinle.leonardo.exemplomaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExemplomavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemplomavenApplication.class, args);
		System.out.println("Oi... Spring boot com maven");
	}

}
