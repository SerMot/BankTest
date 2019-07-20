import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public MainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        driver.get("https://rencredit.ru/");
    }
    public WebDriver driver;

    @FindBy(xpath = "//div[@class=\"service__title\"]/a[@href=\"/contributions/\"]")
    private WebElement depositsLink;

    @FindBy(css = "a[href=\'/cards/\']")
    private WebElement cardsLink;

    public DepositsPage clickDepositsLink(){
        depositsLink.click();
        return new DepositsPage(driver);
    }

    public CardsPage clickCardsLink(){
        cardsLink.click();
        return new CardsPage(driver);
    }

}
