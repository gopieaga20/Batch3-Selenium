@Test
Feature: Test Feature

Background:
Given Launch the url "https://opensource-demo.orangehrmlive.com/index.php/auth/login"
When Enter user credential "Admin" , "admin123"
And Login into application
Then Validate the homepage

Scenario: Am learning cucumber feature file
Given create new project in eclipse
When Install cucumber plugin
And Restart eclipse
Then Convert to cucumberproject
And Validate C symbol

Scenario: Am learning cucumber feature file with data
Given create new project in eclipse "test1", "test2"
When Install cucumber plugin "test2"
And Restart eclipse "test2"
Then Convert to cucumberprojects
And Validate C symbols

Scenario: Am learning cucumber feature file with data's
Given create new project in eclipse <username>, <password>
|Admin|admin123|
|AdminA|admin1234|
When Install cucumber plugin 
And Convert to cucumberprojects
Then Restart eclipse
And Validate C symbols

Scenario Outline: Am learning cucumber feature file with data's
Given create new project in eclipse "<username>" and  "<password>"


Examples:
|username|password|
|Test|Test123|
|Test1|Test1234|
|Test2|Test12345|
|Test3|Test123456|

