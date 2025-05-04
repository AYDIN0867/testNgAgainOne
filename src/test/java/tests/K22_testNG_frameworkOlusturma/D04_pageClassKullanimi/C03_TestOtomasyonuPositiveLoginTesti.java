package tests.K22_testNG_frameworkOlusturma.D04_pageClassKullanimi;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestOtomasyonuPage;
import utulities.Driver;
import utulities.ReusableMethods;

public class C03_TestOtomasyonuPositiveLoginTesti {

    //1-https://www.testotomasyonu.com
    @Test
    public void positiveLoginTestiTestOtomasyonu(){
     Driver.getDriver().get("https://www.testotomasyonu.com");
        //2-account linkine basin
        TestOtomasyonuPage testOtomasyonuPage=new TestOtomasyonuPage();
        testOtomasyonuPage.accountyLinki.click();
       JavascriptExecutor jse=(JavascriptExecutor) Driver.getDriver();
       // jse.executeScript("arguments[0].click();",testOtomasyonuPage.accountyLinki);

        //3- Kullanici email'i olarak alican@gmail.com girin girin
        testOtomasyonuPage.loginSayfasiEmailBox.sendKeys("alican@gmail.com");

        //4-Kullanici sifresi olarak gecerli pasword olarak 12345 girin
        testOtomasyonuPage.loginSayfasiPassWordBox.sendKeys("12345");
       testOtomasyonuPage.loginPageSignBox.click();
        ReusableMethods.bekle(3);
        jse.executeScript("window.scrollBy(0, -500);");
        //5-Basarili olarak giris yapilabildiğini test edin
        jse.executeScript("arguments[0].scrollIntoView(true);", testOtomasyonuPage.userPageLogOutBox);
        Assert.assertTrue(testOtomasyonuPage.userPageLogOutBox.isDisplayed());

        //6- logout olun

        testOtomasyonuPage.userPageLogOutBox.click();

        Driver.quitDriver();

    }



















}
