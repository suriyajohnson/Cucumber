Feature: Login to the demo application

  @smoke @positive
  Scenario: Valid user can log in
    Given the user opens the login page
    When the user enters username "tomsmith" and password "SuperSecretPassword!"
    And the user clicks the login button
    Then the success message should contain "You logged into a secure area!"

  @regression @negative
  Scenario Outline: Invalid login shows an error
    Given the user opens the login page
    When the user enters username "<username>" and password "<password>"
    And the user clicks the login button
    Then the error message should contain "<message>"

    Examples:
      | username | password             | message                  |
      | wrong    | SuperSecretPassword! | Your username is invalid! |
      | tomsmith | wrong                | Your password is invalid! |

     