import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CardsPage {
    public CardsPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }
    public WebDriver driver;

    @FindBy(css = "a[href='/app/debetcard/']")
    private WebElement linkFullDebetCardRequest;


    public DebetCardRequestPage clickLinkFullDebetCardRequestBtn(){
        linkFullDebetCardRequest.click();
        return new DebetCardRequestPage(driver);
    }




}
