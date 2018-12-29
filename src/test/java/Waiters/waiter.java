package Waiters;
import Extensions.ExtensionsChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;
public class waiter {
    public static final int Wait_15_seconds = 15;
    public static void Wait_For_Element(ExtensionsChrome driver, String xpath, int Max_Time_Seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Max_Time_Seconds);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }
    public static void Wait_For_Loading(ExtensionsChrome driver, int time, WebElement Progress_Bar) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.invisibilityOf(Progress_Bar));
    }
    public static void Wait_For_Preloader(ExtensionsChrome driver, String xpath, int Max_Time_Seconds){
        WebDriverWait wait = new WebDriverWait(driver, Max_Time_Seconds);
        wait.until(ExpectedConditions.not(ExpectedConditions.attributeContains(By.xpath(xpath),"class","disabled")));
    }
    public static void Wait_Implicit(ExtensionsChrome driver, int time, TimeUnit timeUnit) {
        driver.manage().timeouts().implicitlyWait(time, timeUnit);
    }
}
