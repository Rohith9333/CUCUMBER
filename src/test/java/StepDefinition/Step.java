package StepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Step
{
	WebDriver driver;
	
@Given("Open Chrome browser")
public void open_chrome_browser()
{
    driver=new EdgeDriver();
}

@Given("Open URL {string}")
public void open_url(String string) 
{
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}

@When("Login ID Login Password")
public void login_id_login_password()
{
	driver.findElement(By.name("uid")).sendKeys(" Admin");   
	driver.findElement(By.name("password")).sendKeys("admin123");   
}

@When("click on submit")
public void click_on_submit()
{
	driver.findElement(By.name("btnLogin")).click();
}
@Then("Redirect to bank page")
public void redirect_to_bank_page() {
   
}

}


