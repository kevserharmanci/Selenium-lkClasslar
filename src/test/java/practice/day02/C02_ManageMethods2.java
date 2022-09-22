package practice.day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_ManageMethods2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://amazon.com");

        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());

        //4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(6,6));
        driver.manage().window().setSize(new Dimension(500,500));
        //5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        System.out.println("newdriver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        System.out.println("newdriver.manage().window().getSize() = " + driver.manage().window().getSize());

        //8. Sayfayi kapatin
        driver.close();
    }
}
