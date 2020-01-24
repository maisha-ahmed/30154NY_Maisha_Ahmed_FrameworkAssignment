package barnesandnoble1;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.testng.annotations.Test;

public class BarnesAndNoble1Test extends CommonAPI
{
    @Test
    public void testA()
    {
        String url = "https://www.barnesandnoble.com/";
        driver.get(url);
        System.out.println(driver.getTitle());
    }
    @Test
    public void testThatWeCanSearchForSeleniumBooks()
    {
        String url = "https://www.barnesandnoble.com/";
        driver.get(url);
        driver.findElement(By.id("searchBarBN")).sendKeys("selenium");
        driver.findElement(By.cssSelector(".icon-search-2")).click();
    }
    @Test
    public void testThatWeCanFindOnSaleItems() throws InterruptedException
    {
        String url = "https://www.barnesandnoble.com/";
        driver.get(url);
        driver.findElement(By.xpath("//*[@id='topNav13']")).click();
        driver.findElement(By.xpath("//*[@id='hotBooksWithDesc_50%OffCalendars&Planners']")).click();
        Thread.sleep(2000);
        //a[text()='Help']
    }
    @Test
    public void testThatBandNTop100PageWorks()
    {
        String url = "https://www.barnesandnoble.com/";
        driver.get(url);
        driver.findElement(By.xpath("//*[@id='topNav1']")).click();
        driver.findElement(By.linkText("B&N Top 100")).click();
    }
    @Test
    public void testThatTheGamesTabWorks() throws ElementClickInterceptedException
    {
        String url = "https://www.barnesandnoble.com/";
        driver.get(url);
        driver.findElement(By.xpath("//*[@id='topNav9']")).click();
        //driver.findElement(By.xpath("//a[@href='https://www.barnesandnoble.com/b/games-collectibles/strategy-games/catan-games/_/N-1glsZ1qnd']")).click();
        //driver.findElement(By.xpath("//a[text()='Catan Games']")).click();
    }
    @Test
    public void testSearchForBooksAboutTrojanWar()
    {
        String url = "https://www.barnesandnoble.com/";
        driver.get(url);
        driver.findElement(By.id("searchBarBN")).sendKeys("the trojan war");
        driver.findElement(By.cssSelector(".icon-search-2")).click();
    }
    //I could not figure out what went wrong with testC and testB.
    // I kept getting exception errors even I when I add 'throws exception'.
   @Test
   public void testD()
   {
       String url = "https://www.barnesandnoble.com/";
       driver.get(url);
       driver.findElement(By.id("searchBarBN")).sendKeys("agatha christie poirot");
       driver.findElement(By.cssSelector(".icon-search-2")).click();
   }
    @Test
    public void testE()
    {
        String url = "https://www.barnesandnoble.com/";
        driver.get(url);
        driver.findElement(By.id("searchBarBN")).sendKeys("harry potter and the chamber of secrets");
        driver.findElement(By.cssSelector(".icon-search-2")).click();
    }
    @Test
    public void testF()
    {
        String url = "https://www.barnesandnoble.com/";
        driver.get(url);
        driver.findElement(By.id("searchBarBN")).sendKeys("lord of the rings dvd");
        driver.findElement(By.cssSelector(".icon-search-2")).click();
    }
    @Test
    public void testG()
    {
        String url = "https://www.barnesandnoble.com/";
        driver.get(url);
        driver.findElement(By.id("searchBarBN")).sendKeys("dr. seuss");
        driver.findElement(By.cssSelector(".icon-search-2")).click();
    }
    @Test
    public void testH()
    {
        String url = "https://www.barnesandnoble.com/";
        driver.get(url);
        driver.findElement(By.id("searchBarBN")).sendKeys("puzzle books");
        driver.findElement(By.cssSelector(".icon-search-2")).click();
    }

    /*@Test
    public void testC() throws InterruptedException
    {
        String url = "https://www.barnesandnoble.com/";
        driver.get(url);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()='Terms of Use']")).click();
    }*/
   /* @Test
    public void testB() throws ElementClickInterceptedException
    {
        String url = "https://www.barnesandnoble.com/";
        driver.get(url);
        driver.findElement(By.id("signInLink")).click();
        driver.findElement(By.linkText("Sign In")).click();
        //driver.findElement(By.cssSelector(".acct-link-sign-in")).click();
        driver.findElement(By.id("email")).sendKeys("charlotte.russel@blank.com");
        driver.findElement(By.id("password")).sendKeys("charlotterussel");
        driver.findElement(By.cssSelector(".btn.btn--large")).click();
        driver.findElement(By.id("createAcctLink")).click();
        driver.findElement(By.id("fName")).sendKeys("Charlotte");
        driver.findElement(By.id("lName")).sendKeys("Russel");
        driver.findElement(By.id("email")).sendKeys("charlotte.russel@blank.com");
        driver.findElement(By.id("confirmEmail")).sendKeys("charlotte.russel@blank.com");
        driver.findElement(By.id("password")).sendKeys("charlotterussel");
        driver.findElement(By.id("confPassword")).sendKeys("charlotterussel");
        driver.findElement(By.id("btnCreateAccount")).click();
    }*/
}
