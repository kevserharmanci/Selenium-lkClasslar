package practice.day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Odev {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
               /*
    1-https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    2- Add Element butonuna 10 kez basinız
    3- 10 kez Add element butonuna basıldığını test ediniz
    4 - Delete butonuna görünmeyene kadar basınız
    5- Delete butonunun görünmediğini test ediniz
    6- Sayfayı kapatınız
     */



        //1-https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.navigate().to("https://the-internet.herokuapp.com/add_remove_elements/");

        //    2- Add Element butonuna 10 kez basinız
        for (int i = 0; i < 10; i++) {
            driver.findElement(By.xpath("//*[text()='Add Element']")).click();
        }
        Thread.sleep(3000);
        //    3- 10 kez Add element butonuna basıldığını test ediniz
        System.out.println();
        System.out.println(driver.findElements(By.xpath("//*[text()='Delete']")).size() == 10 ? "it clicks to ADD button ten times" : "Ten times tests FAILED ");
        System.out.println();
        Thread.sleep(3000);
        //    4 - Delete butonuna görünmeyene kadar basınız

        while (driver.findElements(By.xpath("//*[text()='Delete']")).size()!=0){
            driver.findElement(By.xpath("//*[text()='Delete']")).click();
        }
        //    5- Delete butonunun görünmediğini test ediniz
        System.out.println("there is no any delete button");
        //    6- Sayfayı kapatınız
        driver.quit();


    }
}