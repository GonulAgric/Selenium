package day_04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_cssSelector {


    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));




        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //Add Element butonuna basin
        WebElement addElement = driver.findElement(By.cssSelector("button[onclick='addElement()']"));
        addElement.click();
        Thread.sleep(2000);
        //Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));
        System.out.println("Delete Button Görünürmü ? "+deleteButton.isDisplayed());
        //Delete tusuna basin
        Thread.sleep(3000);
        deleteButton.click();
        //“Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElement = driver.findElement(By.cssSelector("h3"));
        //Eğer xpath ile almak isterseniz //h3
        System.out.println("AddRemove Elements Görünürmü ? "+addRemoveElement.isDisplayed());
        //Sayfayı kapatını
        driver.close();
        /*
        Xpath ve cssSelector arasındaki farklar:
             - Xpath metin ile çalışabilir cssSelector çalışamaz
             - Xpath daha fazla kombinasyona sahiptir ve index'e göre arama yapabilir
             - CssSelector index'e göre arama yapamaz ancak daha hızlı çalışır
         */
    }
}
