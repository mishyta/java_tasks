import page.Page;
import Objects.Clock;
public class Main {

    public static void main(String[] args) {

        Page page = new Page();

        Clock clock = new Clock(page.getCoordsOfTheEndOfArrow(page.hourArrowElement),
                page.getCoordsOfTheEndOfArrow(page.minuteArrowElement),
                page.getCoordsOfTheEndOfArrow(page.secondArrowElement));

        System.out.println(clock.executeTime());

        page.quit();

    }
}
