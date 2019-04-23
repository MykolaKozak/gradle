package ukrFlora.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import pages.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.util.concurrent.TimeUnit;


public class BaseTest {

  // public ChromeDriver webDriver;

  WebDriver webDriver;

  protected MainPage mainPage;

  @BeforeMethod
  public void setUp() {
    String browser = BrowserType.CHROME;
    if (browser == BrowserType.FIREFOX) {
      System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
      webDriver = new FirefoxDriver();
    } else if (browser == BrowserType.CHROME) {
      File fileFF = new File("./drivers/chromedriver.exe");
      System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());
      webDriver = new ChromeDriver();
    } else if (browser == BrowserType.IE) {
      webDriver = new InternetExplorerDriver();
      File fileFF = new File("./drivers/chromedriver.exe");
   //  System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());
    }
    webDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    webDriver.manage().window().maximize();
    webDriver.get("https://ukraflora.com.ua");
    mainPage = new MainPage(webDriver);
  }

  @AfterMethod
  public void tearDown() {
    webDriver.quit();
  }

}
