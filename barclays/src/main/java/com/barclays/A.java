package com.barclays;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;

public class A {
  @Given("^some precondition$")
  public void given() throws Throwable {
  }

  @When("^some action by the actor$")
  public void when() throws Throwable {
  }

  @Then("^some testable outcome is achieved$")
  public void then() throws Throwable {
  }

  @And("^you are in And annotation$")
  public void and() throws Throwable {
  }

  @But("^you are in But annotation$")
  public void but() throws Throwable {
  }

}
