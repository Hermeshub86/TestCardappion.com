import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testCardappion {
	
	@Test
	public void teste(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.cardappion.com");
		System.out.println(driver.getTitle());
		Assert.assertEquals("cardappion.com", driver.getTitle());
	}
	
	@Test
	public void TesteBotaoCadastre() {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/cardappion.com.html");
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div[1]/div/div/a[1]")).click();
		
		
	}
	
	@Test
	public void TesteBotaoAcessarConta() {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/cardappion.com.html");
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div[1]/div/div/a[2]")).click();
		
		
	}
	
	@Test
	public void TesteAcessarEmail() {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/cardappion.com.html");
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div[1]/div/div/a[2]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/div/div/div/div/form/div[1]/div/input")).sendKeys("HermesPmpb@gmail.com");
		
	}
	
	@Test
	public void TesteAcessarSenha() {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/cardappion.com.html");
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div[1]/div/div/a[2]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/div/div/div/div/form/div[2]/div/input")).sendKeys("abcde12345678");
		
	}
	
	
	
	
}
