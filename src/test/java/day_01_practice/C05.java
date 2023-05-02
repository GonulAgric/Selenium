package day_01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05 {

    public static void main(String[] args) {

        // maximize iken pencere konumunu ve pencere olcusunu yazdiriniz
        // fullscreen iken pencere konumunu ve pencere olcusunu yazdiriniz
        // sayfayi kapatiniz


        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriver driver = new ChromeDriver();



        // maximize iken pencere konumunu ve pencere olcusunu yazdiriniz
        driver.manage().window().maximize();
        System.out.println("Maximize pencere konumu: " + driver.manage().window().getPosition());
        System.out.println("Maximize pencere olcusu: "+driver.manage().window().getSize());



        // fullscreen iken pencere konumunu ve pencere olcusunu yazdiriniz
        driver.manage().window().fullscreen();
        System.out.println("Fullscreen pencere konumu = " + driver.manage().window().getPosition());
        System.out.println("Fullscreen pencere olcusu: "+ driver.manage().window().getSize());

        // sayfayi kapatiniz
        driver.close();





    }
}
