package tests.K22_testNG_frameworkOlusturma.D04_pageClassKullanimi;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestOtomasyonuPage;
import utulities.Driver;
import utulities.ReusableMethods;

public class C01_PageClassKullanimi {
    //3 farkli test methodu olusturup, asagidaki görevleri yapin
    //1- testotomasyonu anasayfasina gidip url'in testotomasyonu icerdigini test edin
    //2-phone icin arama yapip urun bulunabildigini test edin
    //3-ilk urunu tiklayip, urun isminde case sensetive olmadan "phone" bulundugunu test edin...

    //1- testotomasyonu anasayfasina gidip url'in testotomasyonu icerdigini test edin
    @Test
    public void anasayfaTesti() { //bu testin ilk calismasini istiyoruz anasayfa dediği
        // a ile basladigi icin digerlerinden önce başlayacaktir ancak ilkUrunIslemtesti phoneAramaTestinden önce baslar bu nedenle ilkUrun testini
        // phoneAramaTestine dependson yapariz

        Driver.getDriver().get("https://www.testotomasyonu.com");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrlIcerik = "testotomasyonu";

        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));
        ReusableMethods.bekle(1);


    }

    //2-phone icin arama yapip urun bulunabildigini test edin
    @Test(dependsOnMethods = "anasayfaTesti")
    public void phoneAramaTesti() {
        //baska klasdaki methoda ulaşmak için testNG obje olusturmayı tercih etmiştir..
        TestOtomasyonuPage testOtomasyonuPage=new TestOtomasyonuPage();
        testOtomasyonuPage.aramaKutusu.sendKeys("phone"+Keys.ENTER);
        int actualPhoneAramasindaBulunanUrunSayisi=testOtomasyonuPage.bulunanElementleriList
                                                                      .size();
          Assert.assertTrue(actualPhoneAramasindaBulunanUrunSayisi>0);


    }
    //3-ilk urunu tiklayip, urun isminde case sensetive olmadan "phone" bulundugunu test edin...
    @Test(dependsOnMethods = "phoneAramaTesti")
    public void ilkUrunIsimTesti(){

        TestOtomasyonuPage testOtomasyonuPage=new TestOtomasyonuPage();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();",testOtomasyonuPage.bulunanElementleriList.get(0));
        //testOtomasyonuPage.bulunanElementleriList.get(0).click();
        String expectedPhoneIsimIcerik="phone";
        String actualUrunIsmi=testOtomasyonuPage
                .ilkUrunSayfasindakiIsımElementi
                .getText()
                .toLowerCase();
        Assert.assertTrue(actualUrunIsmi.contains(expectedPhoneIsimIcerik));
        Driver.quitDriver();


    }

}






