package practice.day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://amazon.com");

        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());

        //4. Sayfayi simge durumuna getirin
        driver.manage().window().minimize();
        System.out.println("mindriver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        System.out.println("mindriver.manage().window().getSize() = " + driver.manage().window().getSize());
        //--minimize edince pozisyonu ve boyutu acik haline gore veriyor

        //5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);

        //6. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        driver.manage().window().maximize();
        System.out.println("maxdriver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        System.out.println("maxdriver.manage().window().getSize() = " + driver.manage().window().getSize());



        //7. Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();

        //8. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("flldriver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        System.out.println("flldriver.manage().window().getSize() = " + driver.manage().window().getSize());

        //9. Sayfayi kapatin
        driver.quit();



        //Soru 2

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



        //Homework
        //1.Yeni bir class olusturalim (Homework)
        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //yazdirin.
        //4.https://www.walmart.com/ sayfasina gidin.
        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        //6. Tekrar “facebook” sayfasina donun
        //7. Sayfayi yenileyin


        //1. Yeni bir class olusturun (TekrarTesti)
        //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
        //(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
        //URL'yi yazdırın.
        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        //5. Youtube sayfasina geri donun
        //6. Sayfayi yenileyin
        //7. Amazon sayfasina donun
        //8. Sayfayi tamsayfa yapin
        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
        //doğru başlığı(Actual Title) yazdırın.
        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //URL'yi yazdırın
        //11.Sayfayi kapatin


        //1. Bir class oluşturun: LoginTest
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //a. http://a.testaddressbook.com adresine gidiniz.
        //b. Sign in butonuna basin
        //c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        //d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //i. Username : testtechproed@gmail.com
        //ii. Password : Test1234!
        //e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        //3. Sayfada kac tane link oldugunu bulun.


        //1. Bir class oluşturun : AmazonSearchTest
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //a.web sayfasına gidin. https://www.amazon.com/
        //b. Search(ara) “city bike”
        //c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        //d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
    }
}