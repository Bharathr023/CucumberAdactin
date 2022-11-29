Feature: Hotel Booking In Adactin Application

Scenario: User Login In The Web Application
Given user Launch The Web Application
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click The Login Button And It Navigate To Search Hotel

Scenario: User Search Hotel In Search Hotel Page
When user Select The Location In Select Location DropDown
And user Select The Hotel In Select Hotel DropDown
And user Select The Room Type In Select Room Type Dropdown
Then user Click The Search Button And It Will Navigate To Select Hotel

Scenario: User Select Hotel In Select Hotel Page
When user Click The Hotel To Be Selected
Then user Click The Continue Button And It Will Navigate To Book Hotel 

Scenario: User Book The Hotel In Book A Hotel Page
When user Enter The First Name In First Name Field
And user Enter The Last Name In Last Name Field
And user Enter The Billing Address In Billing Address field
And user Enter The Credit Card Number In Credit Card Field
And user Select The Credit Card Type
And user Select The Expire Month 
And user Select The Expire Year 
And user Enter The Cvv Number In Cvv Field
Then user Click The Book Now Button

Scenario: User Confirms The Booking Confirmation Page
Then user Logout The Conformation Page 
