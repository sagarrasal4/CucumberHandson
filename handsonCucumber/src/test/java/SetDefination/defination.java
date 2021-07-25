package SetDefination;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
	


public class defination {

	WebDriver dr;

		@Given("Registration site is loaded.")
		public void registration_site_is_loaded() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver" , "C:\\Users\\0013OO744\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    dr = new ChromeDriver ();
		   dr.get("http://elearningm1.upskills.in/");
		   Thread.sleep(3000);
		}


		

		@When("click on registration link")
		public void click_on_registration_link() {
			
			//dr.findElement(By.linkText("http://elearningm1.upskills.in/main/auth/inscription.php")).click();
		   dr.findElement(By.xpath("//*[@id=\"login-block\"]/div/ul/li[1]/a")).click(); 
		}
		@When("enter details in field  firstname as {string} lastname as {string}")
		public void enter_details_in_field_firstname_as_lastname_as(String fname, String lname) {
		 dr.findElement(By.id("registration_firstname")).sendKeys(fname); 
		 dr.findElement(By.id("registration_lastname")).sendKeys(lname); 
		}
		
				
		@When("e-mail {string}")
		public void e_mail(String email) {
			 dr.findElement(By.id("registration_email")).sendKeys(email);
		}
		@When("Username {string}")
		public void username(String usernm) {
			 dr.findElement(By.id("username")).sendKeys(usernm);
		}
		@When("password as {string}")
		public void password_as(String pass1) {
			 dr.findElement(By.id("pass1")).sendKeys(pass1);
		}
		@When("Confirm password {string}")
		public void confirm_password(String pass2) throws InterruptedException {
			 dr.findElement(By.id("pass2")).sendKeys(pass2);
			 Thread.sleep(2000);
		}
		
				
		@When("click on Register button")
		public void click_on_register_button() {
			 dr.findElement(By.id("registration_submit")).click(); 	
		}
		   
		
		@Then("verify name after login with email id at profile")
		public void verify_name_after_login_with_email_id_at_profile() {
		 
		  
		}
		@Then("check if same mailid is displayed at profile")
		public void check_if_same_mailid_is_displayed_at_profile() {
		    
		}
		
		
		@Then("verify name after login with email id at profile {string}")
		public void verify_name_after_login_with_email_id_at_profile(String email) {
			String actual = dr.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/p[1]")).getText();
			
					   String newLine = System.getProperty("line.separator");
		
					   boolean result=	dr.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/p[1]")).getText().contains(email + newLine + newLine +"Your personal settings have been registered.");
						  System.out.println(result);
			//   System.out.println(email + newLine + newLine +"Your personal settings have been registered.");
			  String expected = email + newLine + newLine +"Your personal settings have been registered.";
			   // System.out.println(actual);
			//System.out.println(expected);
			// String expected = email;
			 //Assert.assertEquals(expected, actual);
		}
		@Then("check if same mailid is displayed at profile  {string}")
		public void check_if_same_mailid_is_displayed_at_profile(String name) {
			dr.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/a")).click();
			
						String actual = dr.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/ul/li[1]/div/p")).getText();
						String expected = name;
						System.out.println(actual);
						Assert.assertEquals(expected, actual);
						
		}

//2nd scenario
		

			@Given("user is registed and logged in")
			public void user_is_registed_and_logged_in() {
				 
			}

			
			@When("user visits homepage")
			public void user_visits_homepage() { 
		System.out.println(dr.findElement(By.xpath(" //*[@id=\"navbar\"]/ul[1]/li[1]/a")).isDisplayed());
			//	dr.findElement(By.xpath(" //*[@id=\"navbar\"]/ul[1]/li[1]/a")).click();	
				
			}
			@When("clicks on compose options")
			public void clicks_on_compose_options() throws InterruptedException {
				Thread.sleep(3000);
				dr.findElement(By.xpath("//*[@id=\"profileCollapse\"]/div/ul/li[2]/a")).click();	  
			}
			@When("fills details as send to {string}")
			public void fills_details_as_send_to(String receiver) {
			 dr.findElement(By.className("select2-search__field")).sendKeys(receiver);  
			}
			@When("Subject {string}")
			public void subject(String sub) {
			   dr.findElement(By.id("compose_message_title")).sendKeys("sub");
			}
			/*@When("Message {string}")
			public void message(String start) {
				String newline = System.getProperty("line.separator");
	dr.findElement(By.xpath("/html/body")).sendKeys( start + newline +"This is test" + newline + "From,"+ newline + "Test")	;	    
			}*/
			
			@When("Message {string} {string}  {string} {string}")
			public void message(String a, String b, String c, String d) {
				String newline = System.getProperty("line.separator");
				dr.findElement(By.xpath("/html/body")).sendKeys( a + newline +b + newline + c+ newline + d)	;	       
			}
			
			@When("user sends message")
			public void user_sends_message() throws InterruptedException {
			 Thread.sleep(2000);
				dr.findElement(By.id("compose_message_compose")).click();
			 Thread.sleep(3000);
			}
					
		
			@Then("user shoud get acknowledgement message as {string}")
			public void user_shoud_get_acknowledgement_message_as(String msg) {
			//UI not working to inspect element 
				
				
			}



	


}
