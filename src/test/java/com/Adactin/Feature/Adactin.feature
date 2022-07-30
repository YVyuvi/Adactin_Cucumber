Feature: Hotel Booking In Adactin Application 

Scenario Outline: User Login In The Web Application 
	Given user Launch The Application 
	When user Enter The "<Username>" In Username Field 
	And user Enter The "<Password>" In Password Field 
	Then user Click The Login Button And It Navigates To Search Hotel Page 
	
	Examples: 
		|Username|Password|
		|yuvaraj12|yuvaraj12|
		|William1234|User@123| 
		
Scenario: User Enter The Details In Search Hotel Page 
	When user Select The Location In Location Option 
	And user Select The Hotel In Hotels Option 
	And user Select The Room Type In Room Type Option 
	And user Select Number Of Rooms In Number Of Rooms Option 
	And user Enter The Check In Date In Check In Date Field 
	And user Enter The Check Out Date In Check Out Date Field 
	And user Select Number Of Adults In Adults Per Room Option 
	And user Select Number Of Children In Children Per Room Option 
	Then user Click The Search Button And It Navigates To Select Hotel Page 
	
Scenario: User Select The Hotel In Select Hotel Page 
	When user Select The Hotel In Select Option 
	Then user Click The Continue Button And It Navigates To Book Hotel Page 
	
Scenario: User Enter The Details In Book Hotel Page 
	When user Enter The First Name In First Name Field 
	And user Enter The Last Name In Last Name Field 
	And user Enter The Billing Address In Billing Address Field 
	And user Enter The Credit Card Number In Credit Card No Field 
	And user Select The Credit Card Type In Credit Card Type Option 
	And user Select The Expiry Month In Select Month Option 
	And user Select The Expiry Year In Expiry Year Option 
	And user Enter The CVV Number In CVV Number Field 
	Then user Click The Book Now Button And It Navigates To Logout Page 
	
Scenario: User Logout In The Web Application 
	Then user Click The Logout Button And It Logged Out The Web Applicaton 
	
@Exclude 
Scenario: User Logout In The 2nd Web Application 
	Then user Click The Logout Button And It Logged Out The 2nd Web Applicaton 