package day_01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04 {

    public static void main(String[] args) {


        // https://www.amazon.com/ adresine gidin
        // Kaynak Kodlarini konsola yazdiriniz
        // Kaynak Kodlarinda "Gateway" yazdigini test edin
        // sayfayi kapatiniz


        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        // https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");



        // Kaynak Kodlarini konsola yazdiriniz
        String kaynakKOd = driver.getPageSource();
        System.out.println(kaynakKOd);


        // Kaynak Kodlarinda "Gateway" yazdigini test edin
        if (kaynakKOd.contains("Gateway")){
            System.out.println("Sayfa kaynak kodlarında Gateway yazıyor");
        }else {
            System.out.println("Sayfa kaynak kodlarında Gateway yazmıyor");
        }



        // sayfayi kapatiniz
        driver.close();


    }
}
