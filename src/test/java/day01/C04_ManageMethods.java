package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_ManageMethods {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriver driver = new ChromeDriver();

        //Techpro sayfasına gidelim:
        driver.get("https://techproeducation.com");

        //Sayfanın konumu ve boyutlarını yazdırın
        System.out.println("Sayfanın konumu: "+driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutları: "+driver.manage().window().getSize());


        //Sayfayı minimize(simge durumu) yapalım
        Thread.sleep(2000);
        driver.manage().window().minimize();


        //Sayfayı maximize(tam ekran) yapalım
        Thread.sleep(2000);
        driver.manage().window().maximize();

        //Sayfanın konumu ve boyutlarını yazdırın
        System.out.println("Sayfanın konumu: "+driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutları: "+driver.manage().window().getSize());

        //Sayfayı fullscreen yapalım
        Thread.sleep(2000);
        driver.manage().window().fullscreen();


        //Sayfanın konumu ve boyutlarını yazdırın
        System.out.println("Sayfanın konumu: "+driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutları: "+driver.manage().window().getSize());

        //Sayfayı kapatın:
        Thread.sleep(2000);
        driver.close();


    }
}
