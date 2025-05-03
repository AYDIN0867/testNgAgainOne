package tests.K22_testNG_frameworkOlusturma.D03_pageObjectModel_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import utulities.Driver;
import utulities.ReusableMethods;

public class C02_DriverClassKullanimi {

    //uc farkli test method'u olusturun
    //testotomasyonu,wisequarter ve bestbuy sitelerine gidip
    //url'in bu kelimeleri icerdigini test edin
    //ve windowlarikapatin

    @Test
    public void testotomasyonuTest(){

        Driver.getDriver().get("https://www.testotomasyonu.com");
        String actualUrl=Driver.getDriver().getCurrentUrl();

        String expectedIcerik="testotomasyonu";
        Assert.assertTrue(actualUrl.contains(expectedIcerik));
        ReusableMethods.bekle(1);
        Driver.quitDriver();


    }

    @Test
    public void wisequarterTest(){

        Driver.getDriver().get("https://www.wisequarter.com");
        String actualUrl=Driver.getDriver().getCurrentUrl();

        String expectedIcerik="wisequarter";
        Assert.assertTrue(actualUrl.contains(expectedIcerik));
        ReusableMethods.bekle(1);
        Driver.quitDriver();

    }

    @Test
    public void bestbuyTest(){

        Driver.getDriver().get("https://www.bestbuy.com");
        String actualUrl=Driver.getDriver().getCurrentUrl();

        String expectedIcerik="bestbuy";
        Assert.assertTrue(actualUrl.contains(expectedIcerik));
        ReusableMethods.bekle(1);
        Driver.quitDriver();

    }
//burada testlerin harf sırasına göre çalıştığını unutmayalim....
}
