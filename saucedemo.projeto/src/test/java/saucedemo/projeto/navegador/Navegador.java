package saucedemo.projeto.navegador;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import saucedemo.projeto.drivers.Drivers;

public class Navegador extends Drivers{

	public void abrirNavegador() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");
	
		}
	public void fecharNavegador() {
		driver.quit();
	}
	
}