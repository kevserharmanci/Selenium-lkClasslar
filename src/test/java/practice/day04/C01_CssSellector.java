package practice.day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_CssSellector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        /*
        1 ) Bir class oluşturun : Locators_css
        2 ) Main method oluşturun ve aşağıdaki görevi tamamlayın.
          a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
          b. Locate email textbox
          c. Locate password textbox ve
          d. Locate signin button
          e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
             i. Username : testtechproed@gmail.com
             ii. Password : Test1234!
     */
//a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.navigate().to("http://a.testaddressbook.com/sign_in");;
        //          b. Locate email textbox
        WebElement email=driver.findElement(By.cssSelector("#session_email"));

        //          c. Locate password textbox ve
        WebElement password=driver.findElement(By.cssSelector("#session_password"));

        //CSS sellector de sadece id attribute i icin   #   isareti kullanilir
        //CSS sellector de sadece class attribute i icin   .   isareti kullanilir

        //          d. Locate signin button
        WebElement signinButton=driver.findElement(By.cssSelector("input[name='commit']"));

        //          e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        email.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        signinButton.click();

        //             i. Username : testtechproed@gmail.com
        //             ii. Password : Test1234!

        driver.quit();


    }
}
