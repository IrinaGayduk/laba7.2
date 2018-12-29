package PageObjects;
import Extensions.ExtensionsChrome;
import Extensions.ExtensionsCusfield;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.PageFactory;

import java.io.*;
public class PageObjectsScreen {
    protected ExtensionsChrome driver;
    public ExtensionsChrome getDriver() {
        return driver;
    }
    public PageObjectsScreen(ExtensionsChrome driver){
        this.driver = driver;
        PageFactory.initElements(new ExtensionsCusfield(driver), this);
    }
    public PageObjectsScreen Get_Screenshot(String name) throws Exception {
        File scrFile = driver.getFullScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File("././././Screenshots/"+ name + System.currentTimeMillis() + ".png"));
        } catch (IOException e){
            System.out.println("IOException while saving screenshot!");
        }
        return this;
    }
    public PageObjectsScreen Get_Screenshot() throws Exception {
        return Get_Screenshot("");
    }
}
