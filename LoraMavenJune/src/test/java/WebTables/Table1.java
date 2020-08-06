package WebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 
{

	public static void main(String[] args) 
	
	{	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srika\\Desktop\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> trCollection = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		for(WebElement trElement :trCollection)
		{
		 List<WebElement> td_Collection = trElement.findElements(By.tagName("td"));
		 
		  for(WebElement td_Element:td_Collection)
		  {
			  
			  if(td_Element.getText().contains("Germany"))
			  
			  System.out.println(td_Element.getText());
			  
		  }
			
				
		}
		
		
		
	}

}
