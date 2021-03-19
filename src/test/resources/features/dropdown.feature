Feature: select from dropdown menu

  Background:
  Given I open chrome

  @select
  Scenario: Select from dropdown menu
    Given I go to the product page
    When I select size S in the dropdown menu