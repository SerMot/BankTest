import org.testng.annotations.Test;

public class MainTest extends BaseTest {
    public MainPage mainPage;
    public DepositsPage depositsPage;
    public CardsPage cardsPage;
    public DebetCardRequestPage debetCardRequestPage;


    @Test
    public void Test1() {
        mainPage=new MainPage(driver);
        depositsPage=new DepositsPage(driver);
        mainPage.clickDepositsLink();
        depositsPage.selectCheckbox();
        depositsPage.inputAmountField("550000");
        depositsPage.scrollMonth();
        depositsPage.clikDeposits();
    }

    @Test
    public void Test2() {
        mainPage=new MainPage(driver);
        cardsPage=new CardsPage(driver);
        debetCardRequestPage=new DebetCardRequestPage(driver);
        mainPage.clickCardsLink();
        cardsPage.clickLinkFullDebetCardRequestBtn();
        debetCardRequestPage.inputClientLastName("Петров")
                .inputClientName("Петр")
                .inputClientMobilePhone("8927578945")
                .inputAdditionalEmail("test@mail.ru")
                .clickNoPatronymicCheckBox();
        debetCardRequestPage.selectPlaceGetCard("Астраханская область");



    }


}