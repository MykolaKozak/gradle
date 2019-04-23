package ukrFlora.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ukrFlora.appmanager.ApplicationManager;



public class BaseTest {

  private final ApplicationManager app = new ApplicationManager();

  @BeforeMethod
  public void setUp() {
    app.init();

  }

  @AfterMethod
  public void tearDown(){
    app.stop();
  }

}
