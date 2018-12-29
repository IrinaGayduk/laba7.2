package PageObjects;
import Elements.*;
import Extensions.ExtensionsChrome;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PajeObjectsSearch {
    public static final String Rozetka_Link = "https://rozetka.com.ua/ganteli-diski-grify-zamki/c146633/";

    public PajeObjectsSearch(ExtensionsChrome driver) {
        super(driver);
        open();
    }

    @FindBy(xpath = "//body/div[3]")
    @CacheLookup
    public WebElement Progress_Bar;

    @FindBy(id = "price[min]")
    @CacheLookup
    public ElementField Min_Price;

    @FindBy(id = "price[max]")
    @CacheLookup
    public ElementField Max_Price;

    @FindBy(id = "submitprice")
    @CacheLookup
    public ElemetsButton Submit_Price;

    @FindBy(xpath = "//form[@id=\"filter_parameters_form\"]/div[7]")
    @CacheLookup
    public ElementsCheckList Filter_Country;

    @FindBy(css = ".g-i-tile-i.available")
    @CacheLookup
    public List<WebElement> Results;

    public PajeObjectsSearch open() {
        driver.get(Rozetka_Link);
        return this;
    }

    public PajeObjectsSearch Set_Country(String country){
        Filter_Country.select_from_check_list(country);
        return this;
    }

    public PajeObjectsSearch Set_Min_Price(int price){
        Min_Price.setValue(Integer.toString(price));
        return this;
    }

    public PajeObjectsSearch Set_Max_Price(int price){
        Max_Price.setValue(Integer.toString(price));
        return this;
    }
}
