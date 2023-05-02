package day_01_practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class C06 {

    public static void main(String[] args) {

        // pencere konumunu ve pencere olcusunu yazdiriniz
        // pencere konumunu 20,20 yapiniz, pencere olcusunu 900,600 olarak degistirelim
        // yeni pencere konumunu ve yeni pencere olcusunu yazdiriniz


        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriver driver = new ChromeDriver();

        // pencere konumunu ve pencere olcusunu yazdiriniz
        System.out.println("Pencere konumu = " + driver.manage().window().getPosition());
        System.out.println("Pencere olcusu = " + driver.manage().window().getSize());


        // pencere konumunu 20,20 yapiniz, pencere olcusunu 900,600 olarak degistirelim
        driver.manage().window().setPosition(new Point(20,20));
        driver.manage().window().setSize(new Dimension(900,600));


        // yeni pencere konumunu ve yeni pencere olcusunu yazdiriniz
        System.out.println("Yeni pencere konumu = " + driver.manage().window().getPosition());
        System.out.println("Yeni pencere olcusu = " + driver.manage().window().getSize());

    }
}
