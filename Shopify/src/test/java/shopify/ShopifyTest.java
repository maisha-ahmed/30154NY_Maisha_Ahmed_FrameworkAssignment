package shopify;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ShopifyTest extends CommonAPI
{
    @Test
    public void testA()
    {
        String url = "https://www.shopify.com/";
        driver.get(url);
        System.out.println(driver.getTitle());
    }
    @Test
    public void testWeCannotCreateAStoreWithInvalidCredentials() throws InterruptedException
    {
        String url = "https://www.shopify.com/";
        driver.get(url);
        driver.findElement(By.cssSelector(".marketing-input-button-pair__input.marketing-input.marketing-input--floating")).sendKeys("maishapnt.com");
        driver.findElement(By.cssSelector(".marketing-button.marketing-form__button.marketing-input-button-pair__button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='0_signup_password']")).sendKeys("1234pnT"); //*[@id='0_signup_password']
        driver.findElement(By.xpath("//*[@id='0_signup_shop_name']")).sendKeys("Maisha PNT");
        driver.findElement(By.xpath("//*[@id='SignupForm_modal']/div[5]/button")).click();
        Thread.sleep(3000);
    }
    @Test
    public void testGetTextFromAboutPage()
    {
        String url = "https://www.shopify.com/";
        driver.get(url);
        driver.findElement(By.xpath("//a[text()='About']")).click();
        System.out.println(driver.findElement(By.xpath("//*[@class='js']")).getText());
    }
    @Test
    public void testLookForAutomationTestJobs() throws InterruptedException
    {
        String url = "https://www.shopify.com/";
        driver.get(url);
        driver.findElement(By.xpath("//a[text()='Careers']")).click();
        driver.findElement(By.xpath("//a[text()='jobs']")).click();
        driver.findElement(By.name("keywords")).sendKeys("automation test");
        driver.findElement(By.xpath("//*[@id='Main']/form/section/div/div/div[2]/div[4]/div/button")).click();
        Thread.sleep(3000);
    }
    @Test
    public void testLookForQAJobs() throws InterruptedException
    {
        String url = "https://www.shopify.com/";
        driver.get(url);
        driver.findElement(By.xpath("//a[text()='Careers']")).click();
        driver.findElement(By.xpath("//a[text()='jobs']")).click();
        driver.findElement(By.name("keywords")).sendKeys("qa tester");
        driver.findElement(By.xpath("//*[@id='Main']/form/section/div/div/div[2]/div[4]/div/button")).click();
        Thread.sleep(3000);
    }
    @Test
    public void testGetTextFromShopifyWorkCulturePage()
    {
        String url = "https://www.shopify.com/";
        driver.get(url);
        driver.findElement(By.xpath("//a[text()='Careers']")).click();
        driver.findElement(By.xpath("//a[text()='Life at Shopify']")).click();
        System.out.println(driver.findElement(By.xpath("//*[@class='js']")).getText());
    }
    @Test
    public void testGetAcceptedPaymentMethods()
    {
        String url = "https://www.shopify.com/";
        driver.get(url);
        driver.findElement(By.xpath("//a[text()='Shopping cart']")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id='Main']/section[2]/div/div/div[2]/div/section[3]")).getText());
    }
    @Test
    public void testGetRubyAPIFromAppDevelopersPage()
    {
        String url = "https://www.shopify.com/";
        driver.get(url);
        driver.findElement(By.xpath("//a[text()='App developers']")).click();
        System.out.println(driver.findElement(By.cssSelector(".ruby.hljs")).getText());
    }
    @Test
    public void testGetTextFromOberloPage()
    {
        String url = "https://www.shopify.com/";
        driver.get(url);
        driver.findElement(By.xpath("//a[text()='Oberlo']")).click();
        System.out.println(driver.findElement(By.xpath("//*[@class='js']")).getText());
    }
    @Test
    public void testGetTermsOfService()
    {
        String url = "https://www.shopify.com/";
        driver.get(url);
        driver.findElement(By.xpath("//a[text()='Terms of Service']")).click();
        System.out.println(driver.findElement(By.xpath("//*[@class='js']")).getText());
    }
    @Test
    public void testPrivacyPolicy()
    {
        String url = "https://www.shopify.com/";
        driver.get(url);
        driver.findElement(By.xpath("//a[text()='Privacy Policy']")).click();
        System.out.println(driver.findElement(By.xpath("//*[@class='js']")).getText());
    }
}
