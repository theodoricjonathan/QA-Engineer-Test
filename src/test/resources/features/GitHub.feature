@Web
Feature: Creating a Gist

  @Create
  Scenario: Create a public gist
    Given User open gist.github.com
    When User type "abc@email.com"
    And User type "a1b2c3d4e5"
    When User click save as public gist
    Then User at homepage


  @Edit
  Scenario: Edit existing gist
    Given User open gist.github.com
    When User type "abc@email.com"
    And User type "a1b2c3d4e5"
    When User click on gist
    And User click edit
    Then User click update


  @Delete
  Scenario: Edit existing gist
    Given User open gist.github.com
    When User type "abc@email.com"
    And User type "a1b2c3d4e5"
    When User click on gist
    And User click delete
    Then User type enter


  @List
  Scenario: See personal public gist list
    Given User open gist.github.com
    When User type "abc@email.com"
    And User type "a1b2c3d4e5"
    Then User at homepage






