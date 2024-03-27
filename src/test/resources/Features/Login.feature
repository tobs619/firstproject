Feature: User Login

   @smoke @regression
  Scenario: User is able to login with valid credentials

    Given user enters valid email in the email  field
    And user enters valid password in the password field
    When user clicks on the login button
    Then user is logged in successfully



   @regression
  Scenario Outline: user not able to login with invalid credentials
      Given user enters invalid <username> in the email field
      And user enters invalid <password> in the password field
      When user clicks on the login button
      Then error <message> is displayed
      Examples:
        |username          | password| message                                                                                 |
        |tobs468@gmail.com | test1234| Warning: No match for E-Mail Address and/or Password. |
        |tobs619@gmail.com | test@123| Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour. |
        |test@gmail.com    | test1234| Warning: No match for E-Mail Address and/or Password. |


