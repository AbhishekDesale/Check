Feature: Testing the Registration Functionality of DemoWebShop
Scenario: verify whether valid url is opening
Given open the chrome
When Enter the url
Then page is displayed

Scenario: verify whether register button is working
Given user is on home page of demo web shop
When user clicks on Register_Button
Then Register page is Displayed

Scenario: Checking registration feature with valid details
Given user is on registration page of demo_web_shop 
When user enters Valid details
And user clicks on register-button
Then user is navigated to home page of demo web shop

Scenario: Checking registration feature with valid details and invalid email
Given user is on Registration page of demo-web-shop 
When user enters Valid details and invalid email
And user clicks on register__button
Then error messsage displays wrong email

Scenario: Checking registration feature for password and confirm password
Given user is on Registration_page of demo web shop 
When user enters Valid details mismatch passwords
And user clicks on register btn
Then error messsage displays password mismatch

Scenario: Checking registration feature for valid details and invalid password
Given user is on Register page of demo web shop 
When user enters Valid details and invalid password
And user clicks on the register button
Then error messsage displays invalid password 

