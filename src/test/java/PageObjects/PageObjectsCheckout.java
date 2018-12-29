package PageObjects;
import Elements.*;
import Extensions.ExtensionsChrome;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
public class PageObjectsCheckout {
    public PageObjectsCheckout(ExtensionsChrome driver) {
        super(driver);
    }

    @FindBy(id = "reciever_name")
    @CacheLookup
    public ElementField name;

    @FindBy(id = "suggest_locality")
    @CacheLookup
    public ElementField city;

    @FindBy(id = "reciever_phone")
    @CacheLookup
    public ElementField phone;

    @FindBy(id = "reciever_email")
    @CacheLookup
    public ElementField email;

    @FindBy(xpath = "//*[@id=\"step_contacts\"]/div/div[1]/div[2]/div/span/button")
    @CacheLookup
    public ElemetsButton continue_button;
}
