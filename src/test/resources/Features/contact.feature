Feature: Contact Page Feature





Scenario: Contact Page Title
Given User is already on the home Page
|pednekarmayuriuk@gmail.com|Test@123|

Given user is on the Contact Page
When user gets the title of the page
Then page title should be "Contacts"
