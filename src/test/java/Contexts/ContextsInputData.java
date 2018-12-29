package Contexts;
import PageObjects.PageObjectsCheckout;
import PageObjects.PageObgectsDelivery;
import Waiters.waiter;
public class ContextsInputData {
    public static PageObgectsDelivery inputContacts(PageObjectsCheckout page, String name, String city, String phone, String email){
        page.name.setValue(name);
        if (!page.city.getValue().equals(city)) page.city.setValue(city);
        page.phone.setValue(phone);
        page.email.setValue(email);
        waiter.Wait_For_Preloader(page.getDriver(), "//*[@id=\"step_contacts\"]/div/div[1]/div[2]/div/span", waiter.Wait_15_seconds);
        page.continue_button.click();
        return new PageObgectsDelivery(page.getDriver());
    }
}
