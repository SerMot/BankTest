import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DepositsPage {
    public DepositsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;

    @FindBy(xpath = "//div[@class=\'calculator__check-row-field check-deposit\']//span[@class=\'calculator__check-block-input\']")
    private WebElement checkboxField;

    @FindBy(css = "input[name='amount']")
    private WebElement amountField;

    @FindBy(xpath = "//div[@class='calculator__slide-section'][2]//div[@class='range js-range ui-slider ui-slider-horizontal ui-widget ui-widget-content ui-corner-all']/span\n")
    private WebElement monthLine;

    @FindBy(xpath = "//h3[@class='document__title']/a")
    private WebElement downloadDeposits;


    public void selectCheckbox() {
        if (!checkboxField.isSelected())
            checkboxField.click();
    }

    public DepositsPage inputAmountField(String amount) {
        amountField.clear();
        amountField.sendKeys(amount);
        return this;
    }

    //http://qaru.site/questions/6304941/how-to-slidemove-slider-in-selenium-webdriver
    public void scrollMonth() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].setAttribute('style', 'left: 40%;')", monthLine);
        //jse.executeScript("window.scrollBy(100, 0)", "");
        //jse.executeScript("window.scrollBy(0, -1000)", "");
        //goMarket.click();
        }

        public void clikDeposits() {
            downloadDeposits.click();
        }


}
