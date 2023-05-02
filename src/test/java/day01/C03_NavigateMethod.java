package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NavigateMethod {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriver driver = new ChromeDriver();

        //Amazon sayfasına gidelim
       // driver.navigate().to("https://amazon.com");
        driver.get("https://amazon.com");

        //techproeducation sayfasına gidelim
        Thread.sleep(3000);//3000 ms bekler=>Java methodu
        driver.get("https://techproeducation.com");
        driver.navigate().to("https://techproeducation.com");

        //Amazon sayfasına geri donelim.

        Thread.sleep(3000);
        driver.navigate().back();

        //techproeducation sayfasına geri donelim

        Thread.sleep(3000);
        driver.navigate().forward();

        // Sayfayı yenileyelim
        Thread.sleep(3000);
        driver.navigate().refresh();

        //Sayfayı kapatalım

        driver.close();
    }
}
