Feature: Login to QA

Scenario: Login with user1
Given Navigate to Lgin page "https://qaclickacademy.com"
When Enter Id "userid" and pwd "pwd" in login page
Then User will be logged in


|userid 	|pwd|
|1234@test.com	|123456|