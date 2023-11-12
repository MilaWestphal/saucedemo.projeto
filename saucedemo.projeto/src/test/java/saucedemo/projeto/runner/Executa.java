package saucedemo.projeto.runner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import saucedemo.projeto.elementos.Elementos;
import saucedemo.projeto.metodos.Metodos;
import saucedemo.projeto.navegador.Navegador;

public class Executa {
	
	Metodos metodo = new Metodos();
	Navegador navegador = new Navegador ();
	Elementos elemento = new Elementos();
	@Before
	public void inicioTeste() {
		navegador.abrirNavegador();
	}
	@After
	public void fecharTeste() {
		navegador.fecharNavegador();

}
	@Test
	public void loginValido() {
		metodo.escrever(elemento.nome, "standart-user");
		metodo.escrever(elemento.senha, "secret-sauce");
		metodo.clicar(elemento.btnLogin);

	}
	@Test
	public void loginUsuarioInvalido() {
		metodo.escrever(elemento.nome, "standart-user");
		metodo.escrever(elemento.senha, "secret-sauce");
		metodo.clicar(elemento.btnLogin);
		metodo.validarmsg(elemento.msgErro,"Epic sadface: Username and password do not match any user in this service");
}
	@Test
	public void loginEmBranco() {
		metodo.escrever(elemento.nome, "");
		metodo.escrever(elemento.senha, "");
		metodo.clicar(elemento.btnLogin);
		metodo.validarmsg(elemento.msgErro,"Epic sadface: Username is required");
	}
	
}