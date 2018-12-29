package PageObjects;
import Elements.*;
import Extensions.ExtensionsChrome;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
public class PageObjectsCard {
    public PageObjectsCard(ExtensionsChrome driver) {
        super(driver);
    }

    @FindBy(id = "popup-checkout")
    @CacheLookup
    public ElemetsButton validate;

    @FindBy(name = "cost")
    @CacheLookup
    public ElementsLabel price;

    public int Get_Price(){
        String price_string = price.getText();
        price_string = price_string.replaceAll(" ","");
        return Integer.parseInt(price_string);
    }
}
