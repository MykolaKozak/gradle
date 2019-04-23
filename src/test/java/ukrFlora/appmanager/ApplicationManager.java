package ukrFlora.appmanager;

import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.util.concurrent.TimeUnit;


public class ApplicationManager {
  ChromeDriver wd;



  protected NavigationHelper navigationHelper;
  protected SessionHelper sessionHelper;
  protected Actions actions;

  public void init() {
    File fileFF = new File("./drivers/chromedriver.exe");
    System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());

    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);
    actions = new Actions(wd);

    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.manage().window().maximize();
    wd.get("https://ukraflora.com.ua");
  }

  public void stop() {
    wd.quit();
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
