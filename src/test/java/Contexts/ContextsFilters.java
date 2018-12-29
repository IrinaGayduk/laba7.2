package Contexts;
import PageObjects.PajeObjectsSearch;
import Waiters.waiter;
public class ContextsFilters {
    public static void Filter_By_Price(PajeObjectsSearch page, int min_price, int max_price){
        set_price(page, min_price, max_price);
        filter_submit_price(page);
    }

    public static void filter_by_country(PajeObjectsSearch page, String country){
        page.Set_Country(country);
        waiter.Wait_For_Loading(page.getDriver(), Waiters.Wait_15_seconds,page.Progress_Bar);
    }
    private static void set_price(PajeObjectsSearch page, int min_price, int max_price){
        page.Set_Min_Price(min_price);
        page.Set_Max_Price(max_price);
    }

    private static void filter_submit_price(PajeObjectsSearch page){
        page.Submit_Price.click();
        waiter.Wait_For_Loading(page.getDriver(), Waiters.Wait_15_seconds, page.Progress_Bar);
    }
}
