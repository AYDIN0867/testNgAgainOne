package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

import java.util.List;

public class TestOtomasyonuPage {

    public TestOtomasyonuPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "global-search")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//*[@*='prod-img']")
    public List<WebElement> bulunanElementleriList;

    @FindBy(xpath = "//div[@class=' heading-sm mb-4']")
    public WebElement ilkUrunSayfasindakiIsımElementi;

    @FindBy(xpath = "(//span[.='Account'])[1]")
    public WebElement accountyLinki;

    @FindBy(xpath = "//*[@id='email']")
    public  WebElement loginSayfasiEmailBox;

    @FindBy(xpath = "//*[@id='password']")
    public  WebElement loginSayfasiPassWordBox;


}
