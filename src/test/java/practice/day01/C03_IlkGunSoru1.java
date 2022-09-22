package practice.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkGunSoru1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        /*
                Yeni bir package olusturalim : day01
        Yeni bir class olusturalim : C03_GetMethods

        Amazon sayfasina gidelim. https://www.amazon.com/

        Sayfa basligini(title) yazdirin

        Sayfa basliginin “Amazon” icerdigini test edin

        Sayfa adresini(url) yazdirin

        Sayfa url’inin “amazon” icerdigini test edin.

        Sayfa handle degerini yazdirin

        Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin

        Sayfayi kapatin.


         */

        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://youtube.com");
        driver.manage().window().maximize();

        //        Sayfa basligini(title) yazdirin
        System.out.println("driver.getTitle() = " + driver.getTitle());
        //        Sayfa basliginin “Youtube” icerdigini test edin
        if (driver.getTitle().contains("Youtube")){
            System.out.println("youtube.com title'i \"Youtube\" iceriyor PASSED");
        }else System.out.println("youtube.com title'i \"Youtube\" icermiyor FAILED");

        //        Sayfa adresini(url) yazdirin
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        //        Sayfa url’inin “youtube” icerdigini test edin.
        if (driver.getCurrentUrl().contains("youtube")){
            System.out.println("youtube.com URL'i \"Youtube\" iceriyor PASSED");
        }else System.out.println("youtube.com URL'i \"Youtube\" icermiyor FAILED");

        //        Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());

        //        Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        if (driver.getPageSource().contains("Gateway")){
            System.out.println("\"Gateway\" source test PASSED");
        }else  System.out.println("\"Gateway\" source test FAILED");

        //        Sayfayi kapatin.
        driver.quit();
    }
}