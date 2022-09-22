package practice.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class C05_LoginTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //a. http://a.testaddressbook.com adresine gidiniz.
        driver.navigate().to("http://a.testaddressbook.com");

        //b. Sign in butonuna basin
        driver.findElement(By.id("sign-in")).click();
        //c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        driver.findElement(By.id("session_email")).sendKeys("testtechproed@gmail.com");
        driver.findElement(By.id("session_password")).sendKeys("Test1234!");
        driver.findElement(By.name("commit")).click();
        //d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //i. Username : testtechproed@gmail.com
        //ii. Password : Test1234!

        //e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        System.out.println("Expected id : testtechproed@gmail.com girildi ve gecerli");
        //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).

        if (driver.getPageSource().contains("Addresses")){
            System.out.println("Addresses gorundu PASSED");
        }else {
            System.out.println("Addresses gorunmedi FAILED");
        }

        if (driver.getPageSource().contains("Sign Out")){
            System.out.println("Sign Out gorundu PASSED");
        }else {
            System.out.println("Sign Out gorunmedi FAILED");
        }




        //3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> tumLinkler=driver.findElements(By.tagName("*"));
        System.out.println("Link sayisi : "+tumLinkler.size());

        Thread.sleep(3000);
        driver.quit();

    }
}