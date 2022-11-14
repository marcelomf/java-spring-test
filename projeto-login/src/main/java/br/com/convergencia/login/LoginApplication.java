package br.com.convergencia.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.convergencia.login.utils.ExceptionHandlerController;

import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableJpaRepositories("br.com.convergencia.login.repository")
@Import(ExceptionHandlerController.class)
public class LoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginApplication.class, args);
	}

}
