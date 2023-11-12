package saucedemo.projeto.metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import saucedemo.projeto.drivers.Drivers;
import saucedemo.projeto.elementos.Elementos;
public class Metodos extends Drivers{
	
	Elementos elemento = new Elementos();
	
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}
public void clicar(By elemento) {
	driver.findElement(elemento).click();
}

public void validarmsg(By elemento, String msgEsperada) {
	String msgCapturada = driver.findElement(elemento).getText();
     assertEquals(msgCapturada,msgEsperada);
}

}
