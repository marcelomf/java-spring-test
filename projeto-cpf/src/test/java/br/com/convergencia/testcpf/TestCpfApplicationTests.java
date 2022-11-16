package br.com.convergencia.testcpf;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import br.com.convergencia.cpf.CpfApplication;
import br.com.convergencia.cpf.domain.Pessoa;

@SpringBootTest
@ContextConfiguration(classes = CpfApplication.class) 
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
	void testSituacao() {		
		Exception exception = assertThrows(Exception.class, () -> {
			Pessoa pessoa = new Pessoa();
			pessoa.setSituacao("ATIVO");
		});
	}

}
