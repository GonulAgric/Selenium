package day_01_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C07 {
    public static void main(String[] args) {

        // https://www.amazon.com/ adresine gidin
        // arama motorunda nutella yazip aratınız
        // sayfada kac tane link oldugunu bulunuz
        // linkleri yazdiriniz
        // pencereyi kapatiniz


        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // https://www.amazon.com/ adresine gidin
        driver.get(" https://www.amazon.com/");



        // arama motorunda nutella yazip aratınız
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("nutella"+ Keys.ENTER);


        // sayfada kac tane link oldugunu bulunuz
        List<WebElement> linklerListesi =driver.findElements(By.tagName("a"));
        System.out.println("Syafadaki link sayısı: "+linklerListesi.size());



        // linkleri yazdiriniz
        int sayi=1;
        for (WebElement each:linklerListesi) {
            System.out.println(sayi+". link " + each.getText());
            sayi++;
        }


        // pencereyi kapatiniz
        driver.close();


    }
}
