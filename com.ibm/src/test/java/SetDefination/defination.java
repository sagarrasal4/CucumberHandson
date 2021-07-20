package SetDefination;
import java.lang.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
	
import junit.framework.Assert;

public class defination {

	//WebDriver dr = new ChromeDriver ();
	WebDriver dr;

@Given("Login Page")
public void login_page() throws InterruptedException {
  System.setProperty("webdriver.chrome.driver" , "C:\\Users\\0013OO744\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    WebDriver dr = new ChromeDriver ();
		   dr.get("https://opensource-demo.orangehrmlive.com/");
		  }

@When("Enter valid Name {string}")
public void enter_valid_name(String name) {

dr.findElement(By.id("txtUsername")).sendKeys(name);

}

@When("Enter valid password {string}")
public void enter_valid_password(String password) {
     dr.findElement(By.id("txtPassword")).sendKeys(password);
}
@When("click submit")
public void click_submit() {
    dr.findElement(By.id("btnLogin")).click();
}
@Then("Login success - username {string}")
public void login_success_username(String username) {
    
			String actual =dr.findElement(By.id("welcome")).getText();
			String expected = username;
			Assert.assertEquals(expected, actual);
			dr.findElement(By.id("welcome")).click();
			dr.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
			dr.quit();
}



@When("Enter Invalid Name {string}")
public void enter_invalid_name(String loginname) {
	dr.findElement(By.id("txtUsername")).sendKeys(loginname);
}


@When("Enter invalid password {string}")
public void enter_invalid_password(String pwd) {
	 dr.findElement(By.id("txtPassword")).sendKeys(pwd);
}
@Then("I should see message as  {string}")
public void i_should_see_message_as(String expected) {
	
	String msg= dr.findElement(By.id("spanMessage")).getText();
	Assert.assertEquals(expected, msg);}





}
