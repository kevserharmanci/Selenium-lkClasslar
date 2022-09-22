package practice.day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C04_CssSellectorApplication {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.navigate().to("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        WebElement boston=driver.findElement(By.cssSelector("#pid6_thumb"));
        WebElement sailor=driver.findElement(By.cssSelector("#pid11_thumb"));

        WebElement berlin=driver.findElement(with(By.tagName("img")).above(sailor).toRightOf(boston));

        WebElement mountie= driver.findElement(with(By.className("ui-li-thumb")).below(boston));

        berlin.click();
        mountie.click();
        Thread.sleep(5000);
        driver.quit();
    }
}
