package demo.pages.github;

import demo.webdriver.WebdriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GitHubPage {

  public void openGistPage() {
    WebdriverInstance.webdriver.get("https://gist.github.com");
  }

  public void useremail(String keyword) {
    WebElement inputSearch = WebdriverInstance.webdriver
        .findElement(By.id("login_field"));
    inputSearch.sendKeys(keyword + Keys.ENTER);
  }

  public void userpassword(String keyword) {
    WebElement inputSearch = WebdriverInstance.webdriver
            .findElement(By.id("password"));
    inputSearch.sendKeys(keyword + Keys.ENTER);
  }



  public void clickFirstSearchResult() {
    WebElement firstResult = WebdriverInstance.webdriver
            .findElement(By.xpath("(//h3)[1]"));
    firstResult.click();
  }

  public void clickSavePublic() {
    WebElement firstResult = WebdriverInstance.webdriver
            .findElement(By.xpath("//body/div[4]/div[1]/main[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/details[1]/details-menu[1]/label[2]/div[1]/span[1]"));
    firstResult.click();
  }

  public void clickList() {
    WebElement firstResult = WebdriverInstance.webdriver
            .findElement(By.xpath("//body/div[4]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[2]/a[1]"));
    firstResult.click();
  }

  public void clickEdit() {
    WebElement firstResult = WebdriverInstance.webdriver
            .findElement(By.xpath("//body/div[4]/div[1]/main[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]"));
    firstResult.click();
  }

  public void clickUpdate() {
    WebElement firstResult = WebdriverInstance.webdriver
            .findElement(By.xpath("//button[contains(text(),'Update public gist')]"));
    firstResult.click();
  }

  public void clickDelete() {
    WebElement firstResult = WebdriverInstance.webdriver
            .findElement(By.xpath("//body/div[4]/div[1]/main[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/form[1]/button[1]"));
    firstResult.click();
  }

  public void enterclick() {
    WebElement inputSearch = WebdriverInstance.webdriver
            .findElement(By.id(""));
    inputSearch.sendKeys(Keys.ENTER);
  }
}
