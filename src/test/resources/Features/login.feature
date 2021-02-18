Feature: Login Page feature

Scenario: Login Page title
Given user is on login page
When user get the title of the page
Then page title should be "Cogmento CRM"


Scenario: Forgot Password link
Given user is on login page
Then forgot password link should be displayed

Scenario: Login with correct credentials
Given user is on login page
When user enters username "pednekarmayuriuk@gmail.com"
And user enters password "Test@123"
And user clicks on Login button
Then user gets the title of the page
