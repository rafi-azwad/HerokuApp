Feature: Open Account

  @Test2
  Scenario: Add Customer name and currency
    Given user in open account page
    When select customer name and currency
    And click process button
    Then navigate the successful popup page
