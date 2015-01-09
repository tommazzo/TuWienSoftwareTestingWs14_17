Feature: Add new member

Scenario: Add a new member
Given I want to add new user
When I write PERIC in the field Surname Nativ 
And When I write PERO in the field given Name Nativ
And When I write 2000-10-1 in the field Birthday
And When I write Bosnia Herzegovina [BIH] in the field Nationality
And When I select male for Gender
And When I write PERIC in the field Int Surname
And When I write PERO in the field Int Name given
And When I select ACTIVE for Status
And When I click on the Save button
Then the new member is added