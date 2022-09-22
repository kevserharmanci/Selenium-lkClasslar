package practice.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Tekrartesti {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://youtube.com");

        //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
        //(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        if (driver.getTitle().equals("youtube")){
            System.out.println("Youtube title test PASSED");
        }else System.out.println("youtube title : "+driver.getTitle());//youtube title : YouTube

        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
        //URL'yi yazdırın.
        if (driver.getCurrentUrl().contains("youtube")){
            System.out.println("Youtube URL test PASSED");
        }else System.out.println("youtube URL : "+driver.getCurrentUrl());


        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://amazon.com");

        //5. Youtube sayfasina geri donun
        driver.navigate().back();

        //6. Sayfayi yenileyin
        driver.navigate().refresh();

        //7. Amazon sayfasina donun
        driver.navigate().forward();

        //8. Sayfayi tamsayfa yapin
        driver.manage().window().maximize();

        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
        //doğru başlığı(Actual Title) yazdırın.
        if (driver.getTitle().contains("Amazon")){
            System.out.println("Amazon title tets PASSED");
        }else System.out.println("Amazon title : "+driver.getTitle());

        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //URL'yi yazdırın
        if (driver.getCurrentUrl().equals("https://amazon.com/")){
            System.out.println("amazin URL test PASSED");
        }
        System.out.println("amazon URL : "+driver.getCurrentUrl());

        //11.Sayfayi kapatin
        driver.quit();

    }
}
