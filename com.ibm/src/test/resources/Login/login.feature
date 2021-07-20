Feature: To validate login application
Scenario: To test login with valid creds	

Background:

Given Login Page


#When Enter valid Name "Admin" 
#And Enter valid password "admin123" 
 #And click submit
#Then Login success - username "Welcome Paul"
#
#When Enter valid Name "Admin" 
#And Enter valid password "admin123" 
 #And click submit
#Then Login success - username "Welcome Paul"

Scenario Outline: To test login with valid creds

When Enter valid Name "<name>"
And Enter valid password "<pwd>"
 And click submit
Then Login success - username "<loginname>"

#this will be like data driven test
Examples:
|name|pwd	|loginname|
|Admin|admin123|Welcome Paul|
|Admin|admin123|Welcome Paul|

Scenario: To test invlid credentials 
When Enter Invalid Name "Sagar" 
And Enter invalid password "admin123" 
 And click submit
Then I should see message as  "Invalid credentials"