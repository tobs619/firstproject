Feature: Add products in cart

  Background:
    Given User is Logged in
    And user clears the shopping cart



@smoke
Scenario:
  Given user clicks on Show all Laptops and Notebooks link
  And user clicks on the Macbook Product
  And user enters quantity of Product
  When user clicks on Add to cart button for Macbook
  And user clicks on Shopping Cart Link
  Then Macbook is added to cart