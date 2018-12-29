package PageObjects;
import Elements.*;
import Extensions.ExtensionsChrome;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
public class PageObgectsDelivery {
    public PageObgectsDelivery(ExtensionsChrome driver) {
        super(driver);
    }

    @FindBy(id = "total_checkout_amount")
    @CacheLookup
    public ElementsLabel price;

    @FindBy(id = "make-order")
    @CacheLookup
    public ElemetsButton purchaseButton;

    public int Get_Price(){
        String price_string = price.getText();
        price_string = price_string.replaceAll(" ","");
        return Integer.parseInt(price_string);
    }
}
