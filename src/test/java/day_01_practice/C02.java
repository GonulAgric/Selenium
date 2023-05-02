package day_01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriver driver = new ChromeDriver();


        // Pencereyi maximize yapiniz
        driver.manage().window().maximize();


        // "https://teknosa.com/" adresine gidiniz
        driver.get("https://teknosa.com/");
        Thread.sleep(2000);


        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
       String teknosaTitle= driver.getTitle();
       System.out.println("Teknosa Title: "+teknosaTitle);
       String teknosaUrl= driver.getCurrentUrl();
       System.out.println("Teknosa Url: "+ teknosaUrl);



        // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz
        if (teknosaTitle.contains("Teknoloji")){
            System.out.println("Title Teknoloji iceriyor");
        }else {
            System.out.println("Title Teknoloji icermiyor");
        }




        // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz

        if (teknosaUrl.contains("Teknoloji")){
            System.out.println("URL Teknoloji kelimesini iceriyor");
        }else {
            System.out.println("URL Teknoloji kelimesini icermiyor");
        }





        // "https://medunna.com/" adresine gidiniz
        driver.get("https://medunna.com/");


        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        String medunnaTitie=driver.getTitle();
        System.out.println("Medunna Title: "+medunnaTitie);
        String medunnaUrl=driver.getCurrentUrl();
        System.out.println("Medunna Url: "+ medunnaUrl);



        // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.
        if (medunnaTitie.contains("MEDUNNA")){
            System.out.println("Title medunna kelimesini iceriyor");
        }else {
            System.out.println("Title medunna kelimesini icermiyor");
        }




        // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz
        if (medunnaUrl.contains("medunna")){
            System.out.println("Url Medunna kelimesini iceriyor");
        }else {
            System.out.println("Url Medunna kelimesini icermiyor");
        }



        // teknosa adresine geri donunuz
        driver.navigate().back();
        Thread.sleep(2000);



        // Sayfayı yenileyiniz
        driver.navigate().refresh();



        // medunna adresine ilerleyiniz
        driver.navigate().forward();
        Thread.sleep(2000);




        // Sayfayı yenileyiniz
        driver.navigate().refresh();




        // pencereyi kapat
        driver.close();
    }
}
