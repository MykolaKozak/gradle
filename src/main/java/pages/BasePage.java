package pages;

import libs.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class BasePage {

  protected static WebDriver webDriver;
  Actions actions;



  public BasePage(WebDriver webDriver) {
    this.webDriver = webDriver;
    PageFactory.initElements(webDriver, this);
    actions = new Actions(webDriver);
  }





//  public void checkCurrentUrl() {
//    try {
//      Assert.assertEquals("Url is not expected", webDriver.getCurrentUrl(), expectedUrl);
//    } catch (Exception e) {
//      logger.error("Can't get Url");
//      Assert.fail("Can't get Url");
//    }
//  }

}