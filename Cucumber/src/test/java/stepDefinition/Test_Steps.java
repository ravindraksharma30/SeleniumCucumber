package stepDefinition;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.PendingException;
 
import cucumber.api.java.en.Given;
 
import cucumber.api.java.en.Then;
 
import cucumber.api.java.en.When;
public class Test_Steps
 
{
 
public static WebDriver driver;
@Given("^User is on Home Page$")
 
public void user_is_on_Home_Page() throws Throwable
 
{
 
driver = new FirefoxDriver();
 
driver.manage().window().maximize();
 
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 
driver.get("http://www.store.demoqa.com");
 
throw new PendingException();
 
}
@When("^User Navigate to LogIn Page$")
 
public void user_Navigate_to_LogIn_Page() throws Throwable
 
{
 
driver.findElement(By.xpath(".//*[@id='account']/a")).click();
 
throw new PendingException();
 
}
@When("^User enters UserName and Password$")
 
public void user_enters_UserName_and_Password() throws Throwable
 
{
 
driver.findElement(By.id("log")).sendKeys("abcdefg");
 
driver.findElement(By.id("pwd")).sendKeys("123456789");
 
driver.findElement(By.id("login")).click();
 
throw new PendingException();
 
}
@Then("^Message displayed Login Successfully$")
 
public void message_displayed_Login_Successfully() throws Throwable
 
{
 
System.out.println("Login Successfully");
 
throw new PendingException();
 
}
@When("^User LogOut from the Application$")
 
public void user_LogOut_from_the_Application() throws Throwable
 
{
 
driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
 
throw new PendingException();
 
}
@Then("^Message displayed LogOut Successfully$")
 
public void message_displayed_LogOut_Successfully() throws Throwable
 
{
 
System.out.println("LogOut Successfully");
 
driver.close();
 
throw new PendingException();
 
}
 
}
