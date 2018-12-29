package Contexts;
import org.testing.Assert;
import PageObjects.PageObjectsCard;
import PageObjects.PageObgectsDelivery;
import PageObjects.PageObjectsItem;
public class ContextsItem {
    public static int verify_item_price(PageObjectsItem page, int min_price, int max_price){
        int current_price = page.Get_Price();
        Assert.assertTrue(current_price >= min_price);
        Assert.assertTrue(current_price <= max_price);
        return current_price;
    }

    public static void Verify_Total_Price(PageObjectsCard page, int current_price){
        int total_price = page.Get_Price();
        Assert.assertEquals(total_price, current_price);
    }

    public static void Verify_Total_Price(PageObgectsDelivery page, int current_price){
        int total_price = page.Get_Price();
        Assert.assertEquals(total_price, current_price);
    }

    public static void Verify_Purchase_Button_Is_Enabled(PageObgectsDelivery page){
        Assert.assertTrue(page.purchaseButton.isEnabled());
    }
}
