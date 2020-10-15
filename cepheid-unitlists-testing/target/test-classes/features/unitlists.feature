Feature: Cepheid Unitlists 
Scenario: Testing Unitlists
Description: As a admin I want to navigate to spotify homepage and perform actions on elements of that page.
scenario Identifying the elements on Homepage
#Homepage elemnts
Given user is in spotify Homepage
When user click on premium 
Then user navigate to the premium checkout page
Then user navigate to spotify Homepage
#Helpbutton
Then when user clicks on Help button 
 Then user give the search keyword in search space
Then navigate back to spotify Homepage
#loading
Then user click on ladda ned
Then user navigate to download windows page
Then user navigate back to spotify Homepage
#registering in spotify
Then user click on Register dig
Then user navigate registerpage
When user fills the e postaddress
And user re fills the e postaddress
And user fills the password
And user fills the name 
And user fills day
And user fills month
And user fills year
And user click the radio button kvinna
And user click on option
Then user click on registeradig
Then user navigate to the spotify homepage