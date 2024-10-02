@Suite
Feature: Login and add items to kart and make purchase

  Scenario Outline: Enter the page and log in
    Given <actor> enter the page
    When he logs in with <username> and <password>
    Then he sees the title <expectedTitle>
    Then he adds to cart two products
    And he makes checkout
    And he completes the purchase with <firstName>,<lastName> and <postalCode>:
    Then confirm purchase with alert <expectedConfirmationMessage>
    Examples:
      | actor  | username        | password       | expectedTitle | expectedConfirmationMessage | firstName | lastName  | postalCode |
      | Freddy | "standard_user" | "secret_sauce" | "Products"    | "Thank you for your order!" | "Freddy"  | "Becerra" | "12345"    |


  Scenario Outline: Enter the page and log in with wrong credentials
    Given <actor> attempts to enter de page
    When he type wrong credentials <username> and <password>
    Then the alert is presented <expectedAlertMessage>
    Examples:
      | actor  | username        | password | expectedAlertMessage                                                        |
      | Freddy | "standard_user" | "passx"  | "Epic sadface: Username and password do not match any user in this service" |