import org.junit.Test;
import org.openqa.selenium.By;

public class Page2 extends Page1 {
	
	@Test
	public void execute() throws InterruptedException {
		dr.findElement(By.xpath("//span[text()='Women']")).click();
		dr.findElement(By.xpath("//span[text()='Coats & Jackets']")).click();
		Thread.sleep(5000);
		dr.findElement(By.xpath("//a[@class='product-item-link' and @href='https://www.bluefly.com/xcvi-linen-blend-jacket.html']")).click();
		Thread.sleep(5000);
		dr.findElement(By.xpath("//input[@id='qty']")).click();
		
		
		
				
		
	}

}
