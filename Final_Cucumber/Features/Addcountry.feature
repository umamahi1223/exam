Feature: Login for adding country
Scenario: Successfull Login With Credentials and adding country
Given Chrome browser
When User opens URL "https://xlogist.pisystindia.com/admin/login"
And User enters Email as "admin@gmail.com" and password as "Charlie123" and click on Login
When  user click on Location
Then click on country
And click on add country and enter the country as "america"
Then click on add
Then Page Title should be "admin"
Then close browser