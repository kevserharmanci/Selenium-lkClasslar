package practice.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_GetMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        String sourceCode=driver.getPageSource();
        System.out.println("sourceCode = " + sourceCode);

        driver.manage().window().maximize();

        String title=driver.getTitle();
        System.out.println("title = " + title);

        String URL=driver.getCurrentUrl();
        System.out.println("URL = " + URL);

        System.out.println("WindiwHandle"+driver.getWindowHandle());

        driver.close();



    }
}