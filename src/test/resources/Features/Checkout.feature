Feature: Checkout Products
  Background:
    Given User is Logged in
    And user clears the shopping cart

@regression
  Scenario: user is able to checkout product from cart
    Given user clicks on Show all Laptops and Notebooks link
    And user clicks on the HP laptop
    And user enters quantity of Product
    When user clicks on Add to cart button for HP
    And user clicks on Shopping Cart Link
    Then HP product is added to cart
    And user clicks on checkout button
    And user clicks on continue button on billing details
    And user clicks on Agree checkbox and delivery details
    And user clicks on Continue button on delivery method
    And user clicks on Terms checkbox on payment method
    And user clicks on Continue on payment method
    And user clicks on confirm order button
    And user gets a confirmation