Feature: Login with valid credentials
Scenario: Login with valid credentials
Given Open Chrome browser
And Open URL "https://demo.guru99.com/V4/"
When Login ID Login Password
And click on submit
Then Redirect to bank page