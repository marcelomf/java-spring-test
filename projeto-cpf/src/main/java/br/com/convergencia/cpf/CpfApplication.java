package br.com.convergencia.cpf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("br.com.convergencia.cpf")
@SpringBootApplication
public class CpfApplication {

	public static void main(String[] args) {
		SpringApplication.run(CpfApplication.class, args);
	}

}
