package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Selenium {

    public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.driver","src/resources/Drivers/chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        /*
          en temel haliyle otomosyon yapmak icin classimiza gerekli olan web driver
          yerini belirtiyoruz. java kutuphanesindeki " System.setProperty" methoduyla
         driverimizin yolunu belirtiyoruz.
         */

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

}
