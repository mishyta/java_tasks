package page;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Objects.Point;

import static tools.DriverHendler.getDriver;

public class Page {



    private final WebDriver driver;

    public Page() {
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[fill='rgb(204, 204, 221)']")
    public WebElement minuteArrowElement;

    @FindBy(css = "[fill='rgb(136, 136, 153)']")
    public WebElement hourArrowElement;

    @FindBy(css = "[fill='rgb(221, 0, 0)']")
    public WebElement secondArrowElement;

    @FindBy(css = "#time")
    public WebElement currentTime;

    public  Point getCoordsOfTheEndOfArrow(WebElement arrow){
        String[] atr = StringUtils.substringBetween(
                        arrow.getAttribute("transform"),"(", ")")
                .split(",");
        return Point.builder()
                .x(Double.valueOf(atr[1]))
                .y(Double.valueOf(atr[0]))
                .build();
    }

    public void quit(){
        driver.quit();
    }
}
