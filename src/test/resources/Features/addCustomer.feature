Feature: Add Customer

  @Test1
  Scenario Outline: Add new customer with valid data
    Given user in add customer page
    When user enters '<firstName>' and '<lastName>' and '<postCode>'
    And click add customer button
    Then manager will navigate to successful popup page

    Examples:
      | firstName | lastName | postCode |
      | Rafi      | Azwad    | 2200     |

