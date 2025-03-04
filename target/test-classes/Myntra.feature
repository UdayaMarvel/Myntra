Feature: com.myntra.men

Background: 
	Given user launch the browser 
	And user gets the myntra url "https://www.myntra.com"
	
@smoke @regression
Scenario: Validating men module
#	Given user launch the browser
#	And user gets the myntra url
	Given user search for mens clothing with one dim map
	|first search|womens clothing|
	|second|mens clothing|
	|third|kids clothing|
	And user clicks on men
	Then validate the deals displayed
#	And validate the categories diplayed
#	And validate the Explore top brands diplayed
#	And verify the myntra luxe displayed
#	
@sanity @regression
Scenario: Validating men module
#	Given user launch the browser
#	And user gets the myntra url
	Given user search for mens clothing with one dim map
	|first search|womens clothing|
	|second|mens clothing|
	|third|kids clothing|
	And user clicks on men
	Then validate the deals displayed
#	And validate the categories diplayed
#	And validate the Explore top brands diplayed
#	And verify the myntra luxe displayed
	
@smoke
Scenario: Validating men module
#	Given user launch the browser
#	And user gets the myntra url
	Given user search for mens clothing with one dim map
	|first search|womens clothing|
	|second|mens clothing|
	|third|kids clothing|
	And user clicks on men
	Then validate the deals displayed
#	And validate the categories diplayed
#	And validate the Explore top brands diplayed
#	And verify the myntra luxe displayed
	
@sanity
Scenario Outline: Validating men module
#	Given user launch the browser
#	And user gets the myntra url
	Given user search for mens clothing "<Search>"
	And user clicks on men
	Then validate the deals displayed
#	And validate the categories diplayed
#	And validate the Explore top brands diplayed
#	And verify the myntra luxe displayed
	
	Examples:
	|Search|
	|womens clothing|
	|mens clothing|
	|kids clothing|
	
	