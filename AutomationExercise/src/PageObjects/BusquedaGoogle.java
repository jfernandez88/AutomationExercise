package PageObjects;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class BusquedaGoogle {
	
	
	private WebDriver driver;
	private By InputBusqueda = By.name("q");
	private By ResultadosDeBusqueda = By.xpath("//*[@id='rso']//h3/a");
	private String URL = "https://www.google.com";	
	
	
		public BusquedaGoogle(WebDriver driver) {
			this.driver=driver;
		}
		/*Metodo para realizar busqueda segun parametro de entrada*/				
		public void Buscar(String Texto) {
			driver.get(URL);
			WebElement elemento = driver.findElement(InputBusqueda);
			if(elemento.isDisplayed()){
				elemento.sendKeys(Texto);
				elemento.sendKeys(Keys.ENTER);
				
			}
		}
		
		/*Metodo para Clickear en link segun href de la lista de resultados*/
		public void ClickEnBusqueda(String UrlBuscada){
			WebElement myDynamicElement = (new WebDriverWait(driver, 10))
		              .until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));

		    List<WebElement> ListaElementos = driver.findElements(ResultadosDeBusqueda);
		   
		    for (WebElement webElement : ListaElementos)
		    {
		    	if(webElement.getAttribute("href").equals(UrlBuscada)){
		    		webElement.click();
		    		break;
		    	}
		    	
		    }
		
			
		}
			

}
