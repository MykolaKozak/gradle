package ukrFlora.appmanager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {
  private ChromeDriver wd;

  public Actions(ChromeDriver wd){
    this.wd = wd;
  }

  public void clickOnElement(WebElement element){
    element.click();
  }

  public void type (String text, WebElement element){
    element.clear();
    element.sendKeys(text);
    element.click();
  }

}
