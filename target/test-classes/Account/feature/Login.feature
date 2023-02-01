Feature: Application Login

Scenario: Home page default login
Given User is on banking landing page
When User login into application with username as "abc" and password as "1254"
Then Home page is populated
And Cards displayed are "true"

Scenario: Home page default login
Given User is on banking landing page
When User login in to application with username as "abnbc" and password as "1459254"
Then Home page is populated
And Cards displayed are "false"

Scenario: Home page default login
Given User is on banking landing page
When User sign with following details
|jenny|abcd|john@abcd.com|autralia|23456|
Then Home page is populated
And Cards displayed are "false"

Scenario Outline: Home page default login
Given User is on banking landing page
When User login into application with <Username> and <password>
Then Home page is populated
And Cards displayed are "true"

Examples:
|Username|password|
|user1|pass1|
|user2|pass2|
|user3|pass3|
|user4|pass4|
