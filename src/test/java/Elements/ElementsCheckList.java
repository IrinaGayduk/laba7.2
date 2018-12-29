package Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.*;
public class ElementsCheckList extends Element {
    public ElementsCheckList(WebElement check_list) { super(check_list); }

    public ElementsCheckList select_from_check_list(String name) {
        open_check_list();
        select_check_box(name);
        return this;
    }

    private ElementsCheckList open_check_list() {
        if(getAttribute("class").contains("hidden")) findElement(By.tagName("span")).click();
        return this;
    }

    private ElementsCheckList select_check_box(String name) {
        List<WebElement> check_boxes = findElements(By.tagName("li"));
        for (WebElement element: check_boxes){
            if (element.getText().contains(name)){
                ElementsCheckbox check_box = new ElementsCheckbox(element);
                check_box.select();
                break;
            }
        }
        return this;
    }
}
