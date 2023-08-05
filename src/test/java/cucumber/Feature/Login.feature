Feature: Validate the login page of Sauce demo site

Scenario: Already registrated user should be allowed to login without any error
Given user navigate to the application URL
When User enter the valid credentials "standard_user" and "secret_sauce"
Then user should able to login



