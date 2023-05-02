package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethod {

    public static void main(String[] args) {
        System.setProperty("webdriver.http.factory", "jdk-http-client");


        WebDriver driver = new ChromeDriver();//Bos bir browser acar.
        driver.get("https://www.google.com");//Gitmek istedigimiz sayfayı belirtiriz
        System.out.println("sayfa baslıgı = " + driver.getTitle());//Sayfa baslıgını getirir.
        System.out.println("Sayfa adresi(URL): "+driver.getCurrentUrl());//sayfa adresini getirir.
        //System.out.println(driver.getPageSource()); driver.getPageSource() ==> Sayda kaynak kodlarını getirir.
        System.out.println(driver.getWindowHandle());//Sayfanın(Window) hash değerini getirir.
        // Bu hash değerleri ile başka sayfadan bu sayfaya direkt dönebilmeyi sağlar.
        //(Sayfalar arası geçiş)

    }
}
