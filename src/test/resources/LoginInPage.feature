Feature: Verify the Everlane login page



Scenario: User verify the everlane signin with valid username and password

Given User enter the everlane home page
When User enter the valid username and password
And User click continue button
Then User successfully signin to place the order
And User click the search button in home page
When User enter the product name in search box
And User click the product 
Then User click the add to bag options

