Feature: Verify the Hotel booking in Adactin

Scenario: Verify the login using valid username and invalid password

Given User is on Adactin login page

When User enters "Rakeshg6199" and "Rakesh123"

And User Clicks on login button

Then User sees Search Hotel page

Scenario: User Search for the hotel

Given User is on search page

When User selects "Melbourne" location

And User selects "Hotel Sunshine" hotels

And User selects "Double" room type

And User selects "3 - Three" of rooms

And User enters "06/05/2023" check-In and "08/05/2023" Check-out date

And User selects "3 - Three" adults and children "2 - Two" per room

And User clicks on search button

Then User should see select hotel page

Scenario: User Select for the hotel

Given User is on select page

When User click on select hotel checkbox

And User clicks continue button

Then User sees book a hotel

Scenario: User books a hotel

Given User is on book hotel page

When User Enters "Rakesh" first name

And User Enters "Kumar" last name

And User Enters "abc" address

And User Enters Credit card "1234567891234567" number

And User selects credit card "Master Card" type

And User select expiry "February" and "2022"

And User enters CVV "123" Number

And User clicks book now button

Then User gets the order id


	




