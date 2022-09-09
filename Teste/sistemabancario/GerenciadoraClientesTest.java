package sistemabancario;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraClientesTest {
	@Test
	public void pesquisaCliente() {
		
		//Criando Clientes
		Cliente cliente01 = new Cliente(1, "Alessandro", 42, "rocha.alessandro@senac.com.br", 1, true);
		Cliente cliente02 = new Cliente(2, "Alessandro2", 43, "rocha.alessandro2@senac.com.br", 2, true);
		
		List<Cliente> clientes = new ArrayList<>();
		clientes.add(cliente01);
		clientes.add(cliente02);
		
		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientes);
		
		Cliente cliente = gerClientes.pesquisaCliente(1);
		
		assertThat(cliente.getId(), is(1));
		assertThat(cliente.getEmail(), is("rocha.alessandro@senac.com.br"));
		
		
	}

}
