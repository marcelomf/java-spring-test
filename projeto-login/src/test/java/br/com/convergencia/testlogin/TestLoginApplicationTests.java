package br.com.convergencia.testlogin;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import br.com.convergencia.login.LoginApplication;
import br.com.convergencia.login.domain.Pessoa;

@SpringBootTest
@ContextConfiguration(classes = LoginApplication.class) 
class TestCpfApplicationTests {

	@Test
	void testCpf() {		
		Exception exception = assertThrows(Exception.class, () -> {
			Pessoa pessoa = new Pessoa();
			pessoa.setCpf("123abc");
		});
	}

	@Test
	void testNome() {		
		Exception exception = assertThrows(Exception.class, () -> {
			Pessoa pessoa = new Pessoa();
			pessoa.setNome("Jo");
		});
	}

	@Test
	void testUsuario() {		
		Exception exception = assertThrows(Exception.class, () -> {
			Pessoa pessoa = new Pessoa();
			pessoa.setUsuario("12");
		});
	}

	@Test
	void testSenha() {		
		Exception exception = assertThrows(Exception.class, () -> {
			Pessoa pessoa = new Pessoa();
			pessoa.setSenha("12");
		});
	}

}
