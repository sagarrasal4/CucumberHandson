Feature: To validate login application
Scenario: To test login with valid creds	

Given Login Page
When Enter valid Name "Admin" 
And Enter valid password "admin123" 
 And click submit
Then Login success - username "Welcome Paul"
