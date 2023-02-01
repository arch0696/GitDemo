Feature: Portal Login

Background:
Given Validate the browser
When Browser is triggered
Then Check if browser is started

@PortalTest
Scenario: Home page default login
Given User is on banking landing page
When User login into application with username as "abc" and password as "1254"
Then Home page is populated
And Cards displayed are "true"

@PortalTest
Scenario: Home page default login
Given User is on banking landing page
When User login in to application with username as "abnbc" and password as "1459254"
Then Home page is populated
And Cards displayed are "false"

@PortalTest
Scenario: Home page default login
Given User is on banking landing page
When User sign with following details
|jenny|abcd|john@abcd.com|autralia|23456|
Then Home page is populated
And Cards displayed are "false"

@PortalTest
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


@PortalTest
Scenario: Home page default login
Given User is on banking landing page
When User login into application with username as "abc" and password as "1254"
Then Home page is populated
And Cards displayed are "true"

