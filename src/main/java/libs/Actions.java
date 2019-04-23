package libs;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;




public class Actions {

  static WebDriver webDriver;
  private static WebDriverWait webDriverWait15;
  static private WebDriverWait webDriverWait20;
  public static String parentWindow;



  public Actions(WebDriver webDriver) {
    this.webDriver = webDriver;
  //  logger = Logger.getLogger("ActionsWithOurElement");
  //  webDriverWait15 = new WebDriverWait(webDriver, configProperties.TIME_FOR_EXPLICIT_WAIT_LOW());
  //  webDriverWait20 = new WebDriverWait(webDriver, configProperties.TIME_FOR_EXPLICIT_WAIT_HIGHT());
  }
//
//  /**
//   * Method enters text into the input field
//   *
//   * @param input
//   * @param text
//   */
//  public static void enterTextInToInput(WebElement input, String text) {
//    try {
//      input.clear();
//      input.sendKeys(text);
//      logger.info(text + " was inputed in to input " + input);
//    } catch (Exception e) {
//      logErrorAndStopTest();
//    }
//
//  }
//
//
  /**
   * Method clicks on the element
   *
   * @param element
   */
  public static void clickOnElement(WebElement element) {
    try {
      webDriverWait20.until(ExpectedConditions.elementToBeClickable(element));
      element.click();
   //   logger.info("Element was clicked " + element);
    } catch (Exception e) {
     // logErrorAndStopTest();
    }
  }
//
//  /**
//   * Method select needed line in DropDown by WebElement
//   *
//   * @param select
//   * @param option
//   */
//  public static void selectOptionsInDropDown(WebElement select, WebElement option) {
//    clickOnElement(select);
//    clickOnElement(option);
//  }
//
//  /**
//   * Method select line in DropDown by xPathLocator
//   *
//   * @param select
//   * @param xPathLocator
//   */
//  public static void selectOptionsInDropDown(WebElement select, String xPathLocator) {
//    try {
//      selectOptionsInDropDown(select, webDriver.findElement(By.xpath(xPathLocator)));
//    } catch (Exception e) {
//      logErrorAndStopTest();
//    }
//  }
//
//  /**
//   * Method selected TEXT in dropDown
//   *
//   * @param dropDownElement
//   * @param textForSelection
//   */
//  public static void selectTextInDropDown(WebElement dropDownElement, String textForSelection) {
//    try {
//      Select optionsFromDD = new Select(dropDownElement);
//      optionsFromDD.selectByVisibleText(textForSelection);
//      logger.info(textForSelection + " text was selected in DropDown");
//    } catch (Exception e) {
//      logErrorAndStopTest();
//    }
//  }
//
//  /**
//   * Method set needed state in CheckBox
//   *
//   * @param element
//   * @param neededState (Can be only 'Checked' or 'Unchecked')
//   */
//  public static void setStateToCheckBox(WebElement element, String neededState) {
//    final String CHECK_STATUS = "Checked";
//    final String UNCHECK_STATUS = "Unchecked";
//    if (!neededState.equals(CHECK_STATUS) && !neededState.equals(UNCHECK_STATUS)) {
//      logger.error(neededState + " - Value of neededState is not expected ");
//      Assert.fail(neededState + " - Value of neededState is not expected ");
//    } else {
//      try {
//        if (neededState.equals(CHECK_STATUS) && !element.isSelected() ||
//                neededState.equals(UNCHECK_STATUS) && element.isSelected()) {
//          clickOnElement(element);
//        } else {
//          logger.info("CheckBox has " + neededState + " state already ");
//        }
//      } catch (Exception e) {
//        logErrorAndStopTest();
//      }
//    }
//  }
//
//  /**
//   * Method - switches focus to the opened window
//   *
//   * @param element
//   */
//  public static void swithToOpenedWindow(WebElement element) {
//    parentWindow = webDriver.getWindowHandle(); // get the current window handle
//    element.click();                            // click some link that opens a new window
//    for (String winHandle : webDriver.getWindowHandles()) {
//      webDriver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
//    }
//  }
//
//  /**
//   * Method - switches focus to the original window
//   */
//  public static void swithBackToOriginalWindows() {
//    webDriver.close(); // close newly opened window when done with it
//    webDriver.switchTo().window(parentWindow); // switch back to the original window
//  }
//
//  /**
//   * Method for reloading the page
//   */
//  public static void reloadPage() {
//    webDriver.navigate().refresh();
//  }
//
//  public static void hardWait(Integer milisecond){
//    try {
//      Thread.sleep(milisecond);
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }
//  }
//
//  public  static void waitUntilElementWillBeVisibility(WebElement element, WebElement mainElement){
//    mainElement = (new WebDriverWait(webDriver, 10))
//            .until(ExpectedConditions.visibilityOf(element));
//  }
//
//
//
//
//  public static String generateBoundedRandomString (int lenght,Boolean useLetterss, Boolean useNumber) {
//
//    int length = lenght;
//    boolean useLetters = useLetterss;
//    boolean useNumbers = useNumber;
//    String generateBoundedRandomString = RandomStringUtils.random(length, useLetters, useNumbers);
//    return (generateBoundedRandomString);
//  }
//
//
//  public static void moveFocusOnElement (String findElementByContainOfElement) {
//    try {
//      WebElement element;
//      element = webDriver.findElement(By.xpath("//*[contains(text(),'"+ findElementByContainOfElement +"')]"));
//      Actions action = new Actions(webDriver);
//      action.moveToElement(element).build().perform();
//      logger.info("Focus of the mouse was moved on the element");
//    }catch (Exception e){
//      logErrorAndStopTest();
//    }
//  }
//
////    public static void moveFocusOnElement2 (WebElement element,WebElement clickOnElement) {
////        try {
////            Actions builder = new Actions(webDriver);
////            Action mouseOverHome = builder
////                    .moveToElement(element)
////                    .build();
////                    clickOnElement(clickOnElement);
////            logger.info("Focus of the mouse was moved on the element");
////        }catch (Exception e){
////            logErrorAndStopTest();
////        }
////    }
//
//
//  public static void moveFocusOnElement (WebElement element,WebElement clickOnElement) {
//    try {
//      Actions builder = new Actions(webDriver);
//      try {
//        Action mouseOverHome = builder
//                .moveToElement(element)
//                .build();
//        logger.info("Focus of the mouse was moved on the element" + element);
//      }catch (Exception e){
//        logErrorAndStopTest();
//      }
//      clickOnElement(clickOnElement);
//    }catch (Exception e){
//      logErrorAndStopTest();
//    }
//  }
//
//
//
//
//  public static void findElemenByContainName(String text) {
//    try {
//      webDriver.findElement(By.xpath("//*[contains(text(),'"+ text +"')]"));
//      logger.info("The element was found by a text of body");
//    }catch (Exception e){
//      logger.equals("The element wasn't found by contain text");
//    }
//
//  }
//
//  public static void scrollDownToElement (WebElement element){
//    try {
//      ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", element);
//      logger.info("Scroll through the page to"+ element);
//    } catch (Exception e) {
//      logErrorAndStopTest();
//    }
//  }
//
//  /**
//   * Method checked is element present on page
//   *
//   * @param element
//   * @return
//   */
//  public static boolean isElementPresent(WebElement element) {
//    try {
//      boolean tempState = element.isDisplayed() && element.isEnabled();
//      logger.info("Is Element  Present ? - " + tempState);
//      return tempState;
//    } catch (Exception e) {
//      logger.info("Is Element  Present ? - false");
//      return false;
//    }
//  }
//
//  private static void logErrorAndStopTest() {
//    logger.error("Can not work with element ");
//    Assert.fail("Can not work with element ");
//  }


}
