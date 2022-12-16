package BaseClass;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Properties plm=new Properties();
 @BeforeTest
	public static void setup() throws IOException {
		if (driver==null) {
		FileReader fl=new FileReader(System.getProperty("user+dir")+"\\src\\test\\resources\\configfiles\\config.properties");
		plm.load(fl);
		}
		if (plm.getProperty("browser").equalsIgnoreCase("chrome")) {
			 WebDriverManager.chromedriver().setup();
			 WebDriver driver=new ChromeDriver();
			 plm.getProperty("testurl");
			}
		else if (plm.getProperty("browser").equalsIgnoreCase("firefox")) {
			 WebDriverManager.firefoxdriver().setup();
			 WebDriver driver=new FirefoxDriver();
			 plm.getProperty("testurl");
			}
		}
@AfterTest
	public static void teardown() {

		driver.close();
	}}
