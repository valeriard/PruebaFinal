package pagesObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import java.util.List;
import java.util.logging.Logger;

@DefaultUrl("http://automationpractice.com/index.php")
public class AutomationPageObject extends PageObject {


    @FindBy(xpath = "//*[@class='login']")
    WebElementFacade login;

    @FindBy(xpath = "//*[@id='email_create']")
    WebElementFacade emailCreate;

    @FindBy(xpath = "//*[@id='SubmitCreate']")
    WebElementFacade submitEmailCreate;

    @FindBy(xpath = "//*[@id='id_gender1']")
    WebElementFacade genderMale;

    @FindBy(xpath = "//*[@id='customer_firstname']")
    WebElementFacade firstName;

    @FindBy(xpath = "//*[@id='customer_lastname']")
    WebElementFacade lastName;

    @FindBy(xpath = "//input[@id='firstname']")
    WebElementFacade firstNameYourAddress;

    @FindBy(xpath = "//input[@id='lastname']")
    WebElementFacade lastNameYourAddress;


    @FindBy(xpath = "//*[@id='email']")
    WebElementFacade emailPersonalInformation;

    @FindBy(xpath = "//*[@id='passwd']")
    WebElementFacade passwdPersonalInformation;

    @FindBy(xpath = "//*[@id='uniform-days']")
    WebElementFacade daysBirth;

    @FindBy(xpath = "//*[@id='days']/option[3]")
    WebElementFacade selectDaysNum;

    @FindBy(xpath = "//*[@id='uniform-months']")
    WebElementFacade monthBirth;

    @FindBy(xpath = "//*[@id='months']/option[3]")
    WebElementFacade selectMonthsOption;

    @FindBy(xpath = "//*[@id='uniform-years']")
    WebElementFacade yearsBirth;

    @FindBy(xpath = "//*[@id='years']/option[26]")
    WebElementFacade selectYearsOption;

    @FindBy(xpath = "//label[text()='Sign up for our newsletter!']")
    WebElementFacade newsletter;

    @FindBy(xpath = "//label[text()='Receive special offers from our partners!']")
    WebElementFacade receiveOffers;

    @FindBy(xpath = "//input[@id='company']")
    WebElementFacade company;

    @FindBy(xpath = "//input[@id='address1']")
    WebElementFacade txtAddress;

    @FindBy(xpath = "//input[@id='address2']")
    WebElementFacade txtAddressTwo;

    @FindBy(xpath = "//input[@id='city']")
    WebElementFacade txtCity;

    @FindBy(xpath = "//*[@id='uniform-id_state']")
    WebElementFacade selectState;

    @FindBy(xpath = "//*[@id='id_state']/option[3]")
    WebElementFacade selectStateOption;

    @FindBy(xpath = "//input[@id='postcode']")
    WebElementFacade txtPostalCode;

    @FindBy(xpath = "//*[@id='uniform-id_country']")
    WebElementFacade selectCountry;

    @FindBy(xpath = "//*[@id='id_country']/option[2]")
    WebElementFacade selectCountryOption;

    @FindBy(xpath = "//textarea[@id='other']")
    WebElementFacade txtAddInformation;

    @FindBy(xpath = "//input[@id='phone']")
    WebElementFacade txtHomePhone;

    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElementFacade txtMobilePhone;

    @FindBy(xpath = "//input[@id='alias']")
    WebElementFacade txtAliasReference;

    @FindBy(xpath = "//span[text()='Register']")
    WebElementFacade btnRegister;

    @FindBy(xpath = "//h1[@class='page-heading']")
    WebElementFacade labelWelcomeAccount;


    @FindBy(xpath = "//input[@id='email']")
    WebElementFacade emailRegister;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElementFacade passwdRegister;

    @FindBy(xpath = "//button[@id='SubmitLogin']")
    WebElementFacade submitSingInRegister;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]")
    WebElementFacade submitwomen;

    @FindBy(xpath = "//*[@id=\"subcategories\"]/ul/li[1]/div[1]")
    WebElementFacade submitwomenTops;

    @FindBy(xpath = "//*[@id=\"subcategories\"]/ul/li[2]/div[1]")
    WebElementFacade submitwomenDresses;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div")
    WebElementFacade selectProduct;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]")
    WebElementFacade buttonañadir;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
    WebElementFacade Siguiente;

    @FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
    WebElementFacade Siguiente2;

    @FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button")
    WebElementFacade Siguiente3;

    @FindBy(xpath = "//*[@id=\"uniform-cgv\"]")
    WebElementFacade AceptarTerminos;

    @FindBy(xpath = "//*[@id=\"form\"]/p/button")
    WebElementFacade Siguiente4;
    @FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p")
    WebElementFacade PagoTarjeta;

    @FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p")
    WebElementFacade PagoCheque;

    @FindBy(xpath = "//*[@id=\"cart_navigation\"]/button")
    WebElementFacade ConfirmarOrden;

    @FindBy(xpath = "//input[@id='search_query_top']")
    WebElementFacade txtbuscar;

    @FindBy(xpath = "//*[@id=\"searchbox\"]/button")
    WebElementFacade BtnBuscar;

    public void signIn() {
        login.click();

    }

    public void userEnterEmail(List<String> parameters) {
        emailCreate.waitUntilVisible();
        emailCreate.type(parameters.get(0));
    }

    public void sendCreateAccount() {
        submitEmailCreate.click();
    }


    public void fillsAllForm(List<String> parameters) {
        genderMale.click();
        firstName.sendKeys(parameters.get(0));
        lastName.sendKeys(parameters.get(1));
        emailPersonalInformation.type(parameters.get(2));
        passwdPersonalInformation.sendKeys(parameters.get(3));
        daysBirth.waitUntilClickable();
        daysBirth.click();
        selectDaysNum.click();
        monthBirth.click();
        selectMonthsOption.click();
        yearsBirth.click();
        selectYearsOption.click();
        newsletter.click();
        receiveOffers.click();


        firstNameYourAddress.sendKeys(parameters.get(0));
        lastNameYourAddress.sendKeys(parameters.get(1));
        company.sendKeys(parameters.get(4));
        txtAddress.sendKeys(parameters.get(5));
        txtAddressTwo.sendKeys(parameters.get(6));
        txtCity.sendKeys(parameters.get(7));
        selectState.click();
        selectStateOption.click();
        txtPostalCode.sendKeys(parameters.get(8));
        selectCountry.click();
        selectCountryOption.click();
        txtAddInformation.sendKeys(parameters.get(9));
        txtHomePhone.sendKeys(parameters.get(10));
        txtMobilePhone.sendKeys(parameters.get(11));
        txtAliasReference.type(parameters.get(12));
    }




    public void userRegister() {
        btnRegister.click();
    }


    public void verifyMyAccount(List<String> parameters) throws InterruptedException {

        String textToVerify = labelWelcomeAccount.getText();
        if (textToVerify.equals(parameters.get(0))) {
            Logger.getLogger("TEST SUCCESS");

        } else {
            Assert.fail("TEST FAILED");
        }
    }

    public void verifyMyDress () throws InterruptedException {
        submitwomen.click();
        submitwomenDresses.click();
        selectProduct.click();
           }

    public void verifyMyTops () throws InterruptedException {
        submitwomen.click();
        submitwomenTops.click();
        selectProduct.click();
    }

    public void search () throws InterruptedException {
        txtbuscar.sendKeys("Dresses");
        BtnBuscar.click();
        Thread.sleep(2000);
    }
    public void makePayment () throws InterruptedException {
        buttonañadir.click();
        Siguiente.click();
        Siguiente2.click();
        Siguiente3.click();
        AceptarTerminos.click();
        Siguiente4.click();
        PagoTarjeta.click();
        ConfirmarOrden.click();
    }
    public void chequePayment () throws InterruptedException {
        buttonañadir.click();
        Siguiente.click();
        Siguiente2.click();
        Siguiente3.click();
        AceptarTerminos.click();
        Siguiente4.click();
        PagoCheque.click();
        ConfirmarOrden.click();
    }



    public void emailRegister(List<String> parameters) {
        emailRegister.sendKeys(parameters.get(0));
    }


    public void enterPassword(List<String> parameters) {
        passwdRegister.sendKeys(parameters.get(0));
    }


    public void clickSingInRegister() {
        submitSingInRegister.click();
    }

}
