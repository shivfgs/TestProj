package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	
	
	@Given("^launch the browser$")
	public void launch_the_browser() throws Throwable {
	   System.out.println("A");
	}

	@Given("^open the application$")
	public void open_the_application() throws Throwable {
		System.out.println("B");
	}

	@When("^Click on the page$")
	public void click_on_the_page() throws Throwable {
		System.out.println("C");
	}

	@Then("^Verify the title$")
	public void verify_the_title() throws Throwable {
		System.out.println("D"); 
	}

}
