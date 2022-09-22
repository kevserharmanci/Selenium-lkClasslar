package practice.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Homework {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.navigate().to("https://facebook.com");

        if (driver.getTitle().equals("facebook")){
            System.out.println("facebook Title test PASSED");
        }else System.out.println(driver.getTitle());

        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //yazdirin.
        if (driver.getCurrentUrl().contains("facebook")){
            System.out.println("URL testi PASSED");
        }else {
            System.out.println(driver.getCurrentUrl());
        }
        //4.https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://walmart.com");

        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        if (driver.getTitle().contains("Walmart.com")){
            System.out.println("Walmart Title Test PASSED");
        }else System.out.println("Walmart Title Test FAILED");

        //6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();

        //7. Sayfayi yenileyin
        driver.navigate().refresh();

        //Maximize yap
        driver.manage().window().maximize();

        //8.browser i kapat
        driver.quit();
    }
}