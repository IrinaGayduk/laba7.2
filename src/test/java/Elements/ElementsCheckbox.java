package Elements;
import org.openqa.selenium.WebElement;
public class ElementsCheckbox extends Element {

        public ElementsCheckbox(WebElement check_box){
            super(check_box);
        }

        public ElementsCheckbox select(){
            if(!isSelected()) click();
            return this;
        }

}
