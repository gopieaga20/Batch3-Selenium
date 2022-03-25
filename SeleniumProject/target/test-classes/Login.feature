Feature: Login

Scenario: Login user with valid data
Given Launch the url "https://opensource-demo.orangehrmlive.com/index.php/auth/login"
When Enter user credential "Admin" , "admin123"
And Login into application
Then Validate the homepage

Scenario: Login user with valid data
Given Launch the url "https://opensource-demo.orangehrmlive.com/index.php/auth/login"
When Enter user credentials
And Login into application
Then Validate the homepage