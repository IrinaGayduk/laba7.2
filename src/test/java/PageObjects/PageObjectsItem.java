package PageObjects;
import Elements.*;
import Extensions.ExtensionsChrome;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
public class PageObjectsItem {
    public PageObjectsItem(ExtensionsChrome driver) {
        super(driver);
    }

    @FindBy(id = "price_label")
    @CacheLookup
    public ElementsLabel label;

    @FindBy(xpath = "//*[@id='detail_buy_label']/div[3]/div[1]/div/form/span/span/button")
    @CacheLookup
    public ElemetsButton buy;

    public int Get_Price(){
        String price_string = label.getText();
        price_string = price_string.replaceAll(" ","");
        return Integer.parseInt(price_string);
    }
}
