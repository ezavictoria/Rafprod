package siteRafprod;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//3 - Classe
public class Cadastro {
	// 3.1 Atributos / Características
		String url;               // endereço do site alvo
		WebDriver driver;         // objeto do Selenium WebDriver
		
		// 3.2 Métodos ou Funções
		@Before
		public void iniciar() {
			url = "https://rafprod.app.toolzz.com.br/login_app";
			System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\PC\\eclipse-workspace\\SiteUnDosTres\\drivers\\chrome\\100.0.4896.60\\chromedriver.exe");
			driver = new ChromeDriver ();
			driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
			driver.manage().window().maximize();
		}
			
		@After
		public void finalizar() {
			driver.quit();
		}
		
		@Test
		public void fazerCadastro() {
						
			driver.get(url);
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/span[2]/a")).click();
			
			
			driver.findElement(By.xpath("/html/body/div[3]/form/div[1]/div[3]/div/div[1]/a/div")).click();
			driver.findElement(By.id("email")).sendKeys("aluno@gmail.com");
			driver.findElement(By.id("cpf")).sendKeys("803.688.373-27");
			driver.findElement(By.id("name")).sendKeys(Keys.chord("Aluno Teste"));
			driver.findElement(By.id("data_nascimento")).sendKeys("16/04/2002");
			driver.findElement(By.id("password")).sendKeys("654321");
			driver.findElement(By.id("password-confirm")).sendKeys("654321");
			driver.findElement(By.id("telefone")).sendKeys("(96) 98648-3954");
			driver.findElement(By.xpath("/html/body/div[3]/form/div[3]/div[3]/button[2]")).click();
			
			
			driver.findElement(By.id("cep")).sendKeys("68925-290");
			driver.findElement(By.id("numero")).sendKeys(Keys.chord("465"));
			driver.findElement(By.id("complemento")).sendKeys(Keys.chord("próximo ao shopping"));
			driver.findElement(By.id("nome_mae")).sendKeys(Keys.chord("Mae Teste"));
			driver.findElement(By.id("email_mae")).sendKeys(("mae@gmail.com"));
			driver.findElement(By.id("btnContinuar")).click();
	
			
			driver.findElement(By.xpath("/html/body/div[3]/form/div[3]/div[1]/div[18]/div[3]/div/label")).click();
			driver.findElement(By.id("alternativa44346")).sendKeys(Keys.chord("testando a página"));
			driver.findElement(By.id("alternativa44347")).sendKeys(Keys.chord("testando a página para entrar numa empresa muito top"));
			driver.findElement(By.xpath("/html/body/div[3]/form/div[3]/div[1]/div[21]/div[2]/div")).click();
			driver.findElement(By.id("confirmarCadastro")).click();
	
			
			driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div[3]/form/div/div[1]/div")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div[3]/form/div/div[2]/button")).click();
			
			
			//Resultado esperado
			String Banner = "Banner1";
				
			assertEquals(Banner, driver.findElement(By.id("tituloBannerNovo")).getText());
			
			
		}
		
	}
