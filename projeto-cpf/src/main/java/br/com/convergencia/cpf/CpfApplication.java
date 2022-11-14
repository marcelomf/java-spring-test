package br.com.convergencia.cpf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.Import;

import br.com.convergencia.cpf.utils.ExceptionHandlerController;

@SpringBootApplication
@EnableJpaRepositories("br.com.convergencia.cpf")
@Import(ExceptionHandlerController.class)
public class CpfApplication {

	public static void main(String[] args) {
		SpringApplication.run(CpfApplication.class, args);
	}

}
