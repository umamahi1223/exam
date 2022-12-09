Feature:Loginfor addcity
Scenario:Successfull Login With Credentials
Given Chrome browser
When User opens URL "https://xlogist.pisystindia.com/admin/login"
And User enters Email as "admin@gmail.com" and password as "123456" and click on Login
When  user click on Location
Then click on city
And click on add city and enter the city as "vizag"
Then click on add
Then Page Title should be "admin"
Then close browser