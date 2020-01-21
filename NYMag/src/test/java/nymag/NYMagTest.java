package nymag;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NYMagTest extends CommonAPI
{
   @Test
   public void testA()
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
}
