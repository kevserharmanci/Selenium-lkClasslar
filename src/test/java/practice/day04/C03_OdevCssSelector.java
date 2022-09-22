package practice.day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_OdevCssSelector {
    public static void main(String[] args) {
        //1-C01_TekrarTesti isimli bir class olusturun  2- https://www.amazon.com/ adresine gidin  3- Browseri tam sayfa yapin

        //Sayfayi “refresh” yapin
        //Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        //Gift Cards sekmesine basin
        //Birthday butonuna basin
        //Best Seller bolumunden ilk urunu tiklayin  9- Gift card details’den 25 $’i secin
        //10-Urun ucretinin 25$ oldugunu test edin
        //10-Sayfayi kapatin

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



        //1-C01_TekrarTesti isimli bir class olusturun  2- https://www.amazon.com/ adresine gidin  3- Browseri tam sayfa yapin
        driver.navigate().to("https://www.amazon.com/");
        //Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        System.out.println("title contains 'Spend less' ="+driver.getTitle().contains("Spend less"));
        //Gift Cards sekmesine basin
        driver.findElement(By.xpath("//*[text()='Gift Cards']")).click();
        //Birthday butonuna basin
        driver.findElement(By.cssSelector("img[alt='Birthday gift cards']")).click();
        //Best Seller bolumunden ilk urunu tiklayin  9- Gift card details’den 25 $’i secin
        driver.findElement(By.xpath("(//*[@alt='Amazon.com eGift Card'])[1]")).click();
        driver.findElement(By.cssSelector("#a-autoid-28")).click();
        //10-Urun ucretinin 25$ oldugunu test edin
        System.out.println("25$ test = "+driver.findElement(By.xpath("//*[text()='$25.00']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[text()='$25.00']")).getText().equals("25$") ?
                "25$ price test PASSED" : "25$ price test FAILED");
        //10-Sayfayi kapatin
        driver.quit();
    }
}