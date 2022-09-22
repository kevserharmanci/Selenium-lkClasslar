package practice.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_SonSoru {
    public static void main(String[] args) {
        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin  2- Add Element butonuna basin
        //Delete butonu’nun gorunur oldugunu test edin
        //Delete tusuna basin
        //“Add/Remove Elements” yazisinin gorunur oldugunu test edin
        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin  2- Add Element butonuna basin
        //Delete butonu’nun gorunur oldugunu test edin
        //Delete tusuna basin
        //“Add/Remove Elements” yazisinin gorunur oldugunu test edin
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

//https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.navigate().to("https://the-internet.herokuapp.com/add_remove_elements/");

// 2- Add Element butonuna basin
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();

        //Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton=driver.findElement(By.xpath("//*[text()='Delete']"));
        System.out.println(deleteButton.isDisplayed() ?
                "Delete button test PASSED" : "Delete Button test FAILED");
        //Delete tusuna basin
        deleteButton.click();
        //“Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElm= driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
        System.out.println(addRemoveElm.isDisplayed() ? "Add/RemoveElement test PASSED" : "Add/RemoveElement test FAILED");


    }
}