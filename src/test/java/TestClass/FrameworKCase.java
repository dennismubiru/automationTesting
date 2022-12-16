package TestClass;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
public class FrameworKCase extends BaseClass {
@Test
 public static void ltestcase() {
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dmubiru1@gmail.com");
	 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("demubiru");
	 driver.findElement(By.xpath("//button[@name='login']")).click();	 
 }
}
