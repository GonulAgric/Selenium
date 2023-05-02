package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_LocartorsGetMethodları {

      /*
  Amazon sayfasına gidin
  Search bölümünü locate edip, "Tablet" aratalım
  Arama sonuç yazısında Tablet yazısını locate edip konsola yazdırın
  Sayfayı kapatın
   */

    public static void main(String[] args) {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//          Amazon sayfasına gidin
        driver.get("https://amazon.com");

//          Search bölümünü locate edip, "Tablet" aratalım
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Tablet");
        aramaKutusu.submit();//Enter'a bas

//          Arama sonuç yazısında Tablet yazısını locate edip konsola yazdırın
        WebElement aramaSonucu = driver.findElement(By.className("sg-col-inner"));
        System.out.println("aramaSonucu = " + aramaSonucu.getText());

//          Sayfayı kapatın
        driver.close();

    }

}
