package tests.K22_testNG_frameworkOlusturma.D04_pageClassKullanimi;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPages;
import utulities.Driver;
import utulities.ReusableMethods;

public class C02_FacebookNegativeLoginTesti {

@Test
public void negatifLoginTesti(){
    //1-https://www.facebook.com/ adresine gidin
    Driver.getDriver().get("https://www.facebook.com");
    //2-Cookies cikiyorsa kabul edin
    //3-POM'a uygun olarak email,sifre ve girisyap butonunu llocate edin
    //4- Faker class'ini kullanarak email ve sifre degerlerini yazdirip,giris butonuna basin
    FacebookPages facebookPages=new FacebookPages();
    Faker faker=new Faker();
    facebookPages.loginPagefacebookEmailBox
                    .sendKeys(faker.internet()
                            .emailAddress());
    facebookPages.loginPagefacebookPassWordBox
                    .sendKeys(faker.internet()
                            .password());
    ReusableMethods.bekle(1);
    facebookPages.facebookLogin.click();

//5-Basarili giris YAPILAMADIGINI test edin

    Assert.assertTrue(facebookPages.loginPagefacebookEmailBox.isDisplayed());

    Driver.quitDriver();





}












}
