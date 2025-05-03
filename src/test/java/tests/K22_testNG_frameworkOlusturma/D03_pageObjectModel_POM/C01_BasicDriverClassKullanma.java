package tests.K22_testNG_frameworkOlusturma.D03_pageObjectModel_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utulities.Driver;
import utulities.ReusableMethods;

public class C01_BasicDriverClassKullanma {

    @Test
    public void driverClassIlkTest(){

        //testotomasyonu anasayfasina gidin

        Driver.getDriver().get("https://www.testotomasyonu.com");//getDriver bizim Driver class indaki methodumuzun ismi ...

        //Arama kutusunu locate edip

        WebElement aramaKutusu=Driver.getDriver().findElement(By.id("global-search"));

        //phone icin arama yapin
        aramaKutusu.sendKeys("phone"+ Keys.ENTER);

        //sayfayi kapatin

        ReusableMethods.bekle(2);
        Driver.quitDriver();







    }

}
