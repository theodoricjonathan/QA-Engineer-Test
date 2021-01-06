package demo.steps_definition;

import demo.pages.github.GitHubPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GithubStepDefinitions {

  private GitHubPage gitPage = new GitHubPage();

  @Given("User open gist.github.com")
  public void userOpenGistGithubCom() {
    gitPage.openGistPage();
  }

  @When("User type {string}")
  public void userType(String keyword) {
    gitPage.useremail(keyword);
    gitPage.userpassword(keyword);
  }


  @When("User select first search result")
  public void userSelectFirstSearchResult() {
    gitPage.clickFirstSearchResult();
  }


  @When("User click save as public gist")
  public void userClickSaveAsPublicGist() {
    gitPage.clickSavePublic();
  }

  @Then("User at homepage")
  public void userAtHomepage() {

  }

  @When("User click on gist")
  public void userClickOnGist() {
    gitPage.clickList();
  }

  @And("User click edit")
  public void userClickEdit() {
    gitPage.clickEdit();
  }


  @Then("User click update")
  public void userClickUpdate() {
    gitPage.clickUpdate();
  }


  @And("User click delete")
  public void userClickDelete() {
    gitPage.clickDelete();
  }

  @Then("User type enter")
  public void userTypeEnter() {
    gitPage.enterclick();
  }
}
