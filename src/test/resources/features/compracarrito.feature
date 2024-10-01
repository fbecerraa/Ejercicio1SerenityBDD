@Suite
Feature: Login and add items to kart and make purchase

  Scenario: Enter the page and log in
    Given Freddy enter the page
    When he logs in with "standard_user" and "secret_sauce"
    Then he sees the title "Products"
    Then he adds to cart two products
    And he makes checkout
    And he completes the purchase  with the following details:
      | firstName | lastName | postalCode |
      | Freddy    | Becerra  | 12345      |
    Then confirm purchase with alert "Thank you for your order!"

  Scenario: Enter the page and log in with wrong credentials
    Given Freddy attempts to enter de page
    When he type wrong credentials "standard_user" and "passx"
    Then the alert is presented "Epic sadface: Username and password do not match any user in this service"