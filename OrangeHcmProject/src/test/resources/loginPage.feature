Feature:Login Functionality For Orangehcm

  Background:
    Given I am in the login Page

    Scenario:
      Given : I have entered valid id and password
      When I click oon the login button
      Then I should login successfully

  Scenario Outline:
    Given : I have entered invalid "<id>" and "<password>"
    When I click oon the login button
    Then I should see an error message "<error message>"

    Examples:
      | id  | password | error message       |
      | adm | adm      | Invalid credentials |
      | adn | adn      | Invalid credentials |
      | awe | aqw      | Invalid credentials |

