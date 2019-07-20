import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.WebDriverWait;


import static java.lang.String.format;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class DebetCardRequestPage {
    public DebetCardRequestPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }
    public WebDriver driver;

    @FindBy (css = "input[name='ClientLastName']")
    private WebElement clientLastNameField;

    @FindBy(css = "input[name='ClientName']")
    private WebElement clientNameField;

    @FindBy(css = "input[name='ClientMobilePhone']")
    private WebElement clientMobilePhoneField;

    @FindBy(css = "input[name='AdditionalEmail']")
    private WebElement additionalEmailField;

    @FindBy(css = "div[class='jq-checkbox js-validation-ignore-checkbox']")
    private WebElement noPatronymicField;

    @FindBy(css = "div[class='jq-selectbox__select-text placeholder']")
    private WebElement placeGetCardDropDown;

    private String placeGetCardDropDownOption="//div[@class='jq-selectbox__dropdown']//li[text()='%s']";

    public DebetCardRequestPage inputClientLastName(String clientlastname){
        clientLastNameField.sendKeys(clientlastname);
        return this;
    }

    public DebetCardRequestPage inputClientName(String clientname){
        clientNameField.sendKeys(clientname);
        return this;
    }

    public DebetCardRequestPage inputClientMobilePhone(String clientmobilephone){
        clientMobilePhoneField.sendKeys(clientmobilephone);
        return this;
    }

    public DebetCardRequestPage inputAdditionalEmail(String additionalemail){
        additionalEmailField.sendKeys(additionalemail);
        return this;
    }

    public void clickNoPatronymicCheckBox() {
        if (!noPatronymicField.isSelected())
            noPatronymicField.click();
    }


    public DebetCardRequestPage selectPlaceGetCard(String place){
        placeGetCardDropDown.click();
        new WebDriverWait(driver,5).until(visibilityOfElementLocated(By.xpath(format(placeGetCardDropDownOption,place)))).click();
        return this;
    }

}
