package Contexts;
import PageObjects.PageObjectsCard;
import PageObjects.PageObjectsCheckout;
import PageObjects.PageObjectsItem;
import PageObjects.PajeObjectsSearch;
import Waiters.waiter;

public class ContextsBuying {
    public static PageObjectsItem Select_Element(PajeObjectsSearch page, int element_Index){
        page.Results.get(element_Index).click();
        page.Results.get(element_Index).click();
        return new PageObjectsItem(page.getDriver());
    }

    public static PageObjectsCard Click_Element(PageObjectsItem page){
        page.buy.click();
        waiter.Wait_For_Element(page.getDriver(), "//div[@id=\"cart-popup\"]", waiter.Wait_15_seconds);
        return new PageObjectsCard(page.getDriver());
    }

    public static PageObjectsCheckout Buy_Element(PageObjectsCard page){
        page.validate.click();
        return new PageObjectsCheckout(page.getDriver());
    }
}
