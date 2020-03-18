package io.github.achelois.stepdefs.demo;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import java.util.List;

public class SimpleCompulsory {

  @Given("the \"([^\"]*)\" page is displayed")
  public void theLogInPageIsDisplayed(String page) {
  }

  @When("the correct user credentials are entered")
  public void theCorrectUserCredentialsAreEntered() {


  }

  @And("the \"([^\"]*)\" button is pressed")
  public void theLoginButtonIsPressed(String button) {

  }

  @And("the user details are displayed in the \"([^\"]*)\" section")
  public void theUserDetailsAreDisplayedInTheProfileSection(String section) {

  }

  @And("the \"([^\"]*)\" page contains the following:$")
  public void theHomePageContainsTheFollowing(String page, List<String> criteria) {

  }

  @Given("I have {int} cucumber in my belly")
  public void iHaveCucumberInMyBelly(int arg0) {
  }

  @And("I have given a {color} color balloon")
  public void iHaveGivenAWhileColorBalloon() {

  }

}
