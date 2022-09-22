package practice.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_IlkGunSoru2 {
    public static void main(String[] args) {
 /*
                Yeni bir Class olusturalim.C05_NavigationMethods
        Youtube ana sayfasina gidelim . https://www.youtube.com/

        Amazon soyfasina gidelim. https://www.amazon.com/

        Tekrar YouTube’sayfasina donelim

        Yeniden Amazon sayfasina gidelim

        Sayfayi Refresh(yenile) yapalim

        Sayfayi kapatalim / Tum sayfalari kapatalim

         */
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        // Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://amazon.com");
        //         YouTube’sayfasina gidelim
        driver.navigate().to("https://youtube.com");
        //        Yeniden Amazon sayfasina gidelim
        driver.navigate().back();
        //        Yeniden youtube sayfasina gidelim
        driver.navigate().forward();
        //        Sayfayi yenileyeleim
        driver.navigate().refresh();
        //        Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.close();
    }
}
