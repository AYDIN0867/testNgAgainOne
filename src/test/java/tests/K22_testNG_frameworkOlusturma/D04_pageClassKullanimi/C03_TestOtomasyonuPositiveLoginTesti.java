package tests.K22_testNG_frameworkOlusturma.D04_pageClassKullanimi;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.TestOtomasyonuPage;
import utulities.Driver;

public class C03_TestOtomasyonuPositiveLoginTesti {

    //1-https://www.testotomasyonu.com
    @Test
    public void positiveLoginTestiTestOtomasyonu(){
     Driver.getDriver().get("https://www.testotomasyonu.com");
        //2-account linkine basin
        TestOtomasyonuPage testOtomasyonuPage=new TestOtomasyonuPage();
        testOtomasyonuPage.accountyLinki.click();
       // JavascriptExecutor jse=(JavascriptExecutor) Driver.getDriver();
       // jse.executeScript("arguments[0].click();",testOtomasyonuPage.accountyLinki);

        //3- Kullanici email'i olarak alican@gmai.com girin girin


        //4-Kullanici sifresi olarak gecerli pasword olarak 12345 girin

    }







    //5-Basarili olarak giris yapilabildiğini test edin

    //6- logout olun









}
