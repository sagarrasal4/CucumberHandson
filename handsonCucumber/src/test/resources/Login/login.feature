
Feature: Register and validate 

@Test1
Scenario: Sign in new user and verify username,email id post register


Given Registration site is loaded.
When click on registration link
And enter details in field  firstname as "Test" lastname as "Test"
And e-mail "Test1@gmail.com" 
And Username "Cucutest906766"
And password as "abcd"
And Confirm password "abcd" 
And click on Register button
Then verify name after login with email id at profile "Dear Test Test,"
And check if same mailid is displayed at profile  "Test1@gmail.com" 

@Test2
Scenario: Send mail post registration
Given user is registed and logged in
When user visits homepage 
And clicks on compose options
And fills details as send to "Sagar1rasal@gmail.com" 
And Subject "Test mail" 
And Message "Hi Mr Xyz," "This is test mail."  "From," "Test"
And user sends message
Then user shoud get acknowledgement message as "The message has been sent to email sagar1rasal@gmail.com" 
