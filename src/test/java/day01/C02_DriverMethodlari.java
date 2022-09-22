package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        //amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");
        // kaynak kodların ıcınde "Gateway" kelımesının oldugunu test edınız
        //System.out.println(driver.getPageSource());
        String istenenKelime = "Gatewayasas";
        if (driver.getPageSource().contains(istenenKelime)) {
            System.out.println("Pagesource testı PASSED");
        } else System.out.println("Pagesource testı FILED");//Pagesource testı FILED
        driver.close();//sayfayı kapatır
        //driver.quit();//birden fazla sayfa varsa hepsını kapatır
    }
}
