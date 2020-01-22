package nymag;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NYMagTest extends CommonAPI
{
   @Test
   public void testA()  //Just an example test
   {
      String url = "http://nymag.com/";
      driver.get(url);
      System.out.println(driver.getTitle());
   }
   @Test
   public void testThatYouCannotSignUpWithAInvalidEmail() throws InterruptedException
   {
      String url = "http://nymag.com/";
      driver.get(url);
      driver.findElement(By.name("email")).sendKeys("pnt.com");
      driver.findElement(By.className("submit")).click();
      Thread.sleep(3000);
   }
   @Test
   public void testThatSubscribeButtonWorks() throws InterruptedException
   {
      String url = "http://nymag.com/";
      driver.get(url);
      driver.findElement(By.cssSelector(".subscribe-link.global-nav-track")).click();
      Thread.sleep(3000);
   }
   @Test
   public void testThatUserCannotLogInWithInvalidCredentials() throws InterruptedException
   {
      String url = "http://nymag.com/";
      driver.get(url);
      driver.findElement(By.cssSelector(".user-button.sign-in-button")).click();
      driver.findElement(By.name("email")).sendKeys("m@pnt.com");
      driver.findElement(By.name("password")).sendKeys("abcd1234");
      driver.findElement(By.cssSelector(".auth0-label-submit")).click();
      Thread.sleep(3000);
   }
   @Test
   public void testLatestNews() throws InterruptedException
   {
      String url = "http://nymag.com/";
      driver.get(url);
      driver.findElement(By.cssSelector(".tab-trigger")).click();
      Thread.sleep(1000);
      driver.findElement(By.cssSelector(".tab-trigger.intelligencer")).click();
      Thread.sleep(1000);
      driver.findElement(By.cssSelector(".tab-trigger.wwwthecut")).click();
      Thread.sleep(1000);
      driver.findElement(By.cssSelector(".tab-trigger.vulture")).click();
      Thread.sleep(1000);
      driver.findElement(By.cssSelector(".tab-trigger.grubstreet")).click();
      Thread.sleep(1000);
      driver.findElement(By.cssSelector(".tab-trigger.strategist")).click();
      Thread.sleep(1000);
   }
   @Test
   public void testThatBurgerIconAndSearchBarWorks() throws InterruptedException
   {
      String url = "http://nymag.com";
      driver.get(url);
      driver.findElement(By.cssSelector(".nav-dropdown-button-trigger")).click();
      Thread.sleep(1000);
      driver.findElement(By.cssSelector(".nav-search-input")).sendKeys("Daniel Golden");
      driver.findElement(By.cssSelector(".nav-search-submit-button")).click();
      Thread.sleep(1000);
   }
   @Test
   public void testGetTextFromDropDownMenu() throws InterruptedException
   {
      String url = "http://nymag.com";
      driver.get(url);
      driver.findElement(By.cssSelector(".nav-dropdown-button-trigger")).click();
      System.out.println(driver.findElement(By.cssSelector(".dropdown-body-scroll")).getText());
      Thread.sleep(1000);
   }
   @Test
   public void testThatHelpLinkWorks() throws InterruptedException
   {
      String url = "http://nymag.com/";
      driver.get(url);
      driver.findElement(By.xpath("//a[text()='Help']")).click();
      driver.findElement(By.id("query")).sendKeys("set up digital access");
      driver.findElement(By.id("query")).sendKeys(Keys.ENTER);
      Thread.sleep(3000);
   }
   @Test
   public void testGetTextFromAboutUsPage()
   {
      String url = "http://nymag.com/";
      driver.get(url);
      driver.findElement(By.xpath("//a[text()='About Us']")).click();
      System.out.println(driver.findElement(By.cssSelector(".layout-simple ")).getText());
   }
   @Test
   public void testGetTextFromContactPage()
   {
      String url = "http://nymag.com/";
      driver.get(url);
      driver.findElement(By.xpath("//a[text()='Contact']")).click();
      System.out.println(driver.findElement(By.cssSelector(".body")).getText());
   }
   @Test
   public void testGetPrivacyNotice()
   {
      String url = "http://nymag.com/";
      driver.get(url);
      driver.findElement(By.xpath("//a[text()='Privacy']")).click();
      System.out.println(driver.findElement(By.cssSelector(".body")).getText());
   }

}
