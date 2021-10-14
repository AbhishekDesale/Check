$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/Features/Check.feature");
formatter.feature({
  "name": "Testing the Registration Functionality of DemoWebShop",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "verify whether valid url is opening",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "open the chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "performers.UrlFunctionality.open_the_chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the url",
  "keyword": "When "
});
formatter.match({
  "location": "performers.UrlFunctionality.enter_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "performers.UrlFunctionality.page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify whether register button is working",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on home page of demo web shop",
  "keyword": "Given "
});
formatter.match({
  "location": "performers.RegisterButtonFunctional.user_is_on_home_page_of_demo_web_shop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Register_Button",
  "keyword": "When "
});
formatter.match({
  "location": "performers.RegisterButtonFunctional.user_clicks_on_Register_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Register page is Displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "performers.RegisterButtonFunctional.register_page_is_Displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Checking registration feature with valid details",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on registration page of demo_web_shop",
  "keyword": "Given "
});
formatter.match({
  "location": "performers.ValidDetailsFunctionality.user_is_on_registration_page_of_demo_web_shop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Valid details",
  "keyword": "When "
});
formatter.match({
  "location": "performers.ValidDetailsFunctionality.user_enters_Valid_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on register-button",
  "keyword": "And "
});
formatter.match({
  "location": "performers.ValidDetailsFunctionality.user_clicks_on_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to home page of demo web shop",
  "keyword": "Then "
});
formatter.match({
  "location": "performers.ValidDetailsFunctionality.user_is_navigated_to_home_page_of_demo_web_shop()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Checking registration feature with valid details and invalid email",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on Registration page of demo-web-shop",
  "keyword": "Given "
});
formatter.match({
  "location": "performers.InvalidEmailFunctionality.user_is_on_Registration_page_of_demo_web_shop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Valid details and invalid email",
  "keyword": "When "
});
formatter.match({
  "location": "performers.InvalidEmailFunctionality.user_enters_Valid_details_and_invalid_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on register__button",
  "keyword": "And "
});
formatter.match({
  "location": "performers.InvalidEmailFunctionality.user_clicks_on_register__button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "error messsage displays wrong email",
  "keyword": "Then "
});
formatter.match({
  "location": "performers.InvalidEmailFunctionality.error_messsage_displays_wrong_email()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Checking registration feature for password and confirm password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on Registration_page of demo web shop",
  "keyword": "Given "
});
formatter.match({
  "location": "performers.MismatchPasswordFunctionlity.user_is_on_Registration_page_of_demo_web_shop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Valid details mismatch passwords",
  "keyword": "When "
});
formatter.match({
  "location": "performers.MismatchPasswordFunctionlity.user_enters_Valid_details_mismatch_passwords()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on register btn",
  "keyword": "And "
});
formatter.match({
  "location": "performers.MismatchPasswordFunctionlity.user_clicks_on_register_btn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "error messsage displays password mismatch",
  "keyword": "Then "
});
formatter.match({
  "location": "performers.MismatchPasswordFunctionlity.error_messsage_displays_password_mismatch()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Checking registration feature for valid details and invalid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on Register page of demo web shop",
  "keyword": "Given "
});
formatter.match({
  "location": "performers.InvalidPasswordFunctionality.user_is_on_Register_page_of_demo_web_shop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Valid details and invalid password",
  "keyword": "When "
});
formatter.match({
  "location": "performers.InvalidPasswordFunctionality.user_enters_Valid_details_and_invalid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the register button",
  "keyword": "And "
});
formatter.match({
  "location": "performers.InvalidPasswordFunctionality.user_clicks_on_the_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "error messsage displays invalid password",
  "keyword": "Then "
});
formatter.match({
  "location": "performers.InvalidPasswordFunctionality.error_messsage_displays_invalid_password()"
});
formatter.result({
  "status": "passed"
});
});