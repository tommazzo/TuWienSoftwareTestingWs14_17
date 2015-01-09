Feature: Log in as admin

Scenario: Log in as an admin
Given I want to log in with the user gruppe27a
When I write gruppe27a in the username field
And When I write thomas1234 in the password field
And When I click the Login button
Then the welcome page is shown