package ukrFlora.appmanager;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationHelper {
private ChromeDriver wd;

  public NavigationHelper(ChromeDriver wd) {
    this.wd=wd;
  }

  public void goToHomePage(){
    wd.findElementByName("someName").click();
  }
}
