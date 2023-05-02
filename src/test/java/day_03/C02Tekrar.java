package day_03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

import java.time.Duration;

public class C02Tekrar {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



        driver.get("https://amazon.com");
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Bilgisayar"+ Keys.ENTER);
        WebElement a=driver.findElement(By.id("high-price"));
        a.sendKeys("200"+Keys.ENTER);
        Thread.sleep(10);



    }
}
