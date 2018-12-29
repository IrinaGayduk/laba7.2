package Elements;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
public class ElementField extends Element {
    public ElementField(WebElement native_el){
        super(native_el);
    }

    @Override
    public void clear() {
        sendKeys(Keys.CONTROL + "a");
        sendKeys(Keys.DELETE);
    }

    public void setValue(String value){
        clear();
        sendKeys(value);
    }

    public void appendText(String value){
        sendKeys(value);
    }

    public String getValue(){
        return (getText()==null) ? getAttribute("value") : getText();
    }
}
