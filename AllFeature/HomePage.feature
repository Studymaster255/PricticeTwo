Feature: Validate homepage

  Background: homepage
    Given user is on "http://spree.shiftedtech.com"
@homepage
  Scenario: validate home page
    When user is on homepage
    Then validate title is "Spree Demo Site"
    And validate logo image
    And validate HOME button is avalaible
    And validate search box is available
    And validate search button is available
    And validate shop by catagies contains 3 link
    And validate shop by brand contains 4 links
    And validate dropdown content
    And validate cart button is available
    And validate cart shows "EMPTY"
    And validate page number should be 2


@catagiry
  Scenario: validate shop by catagiry all links
    When user clicks on Bags
    Then validate title "Categories - Bags - Spree Demo Site"
    And validate number of iteams shows 4
    And user click on Mugs 
    And validate title "Categories - Mugs - Spree Demo Site"
    And validate number of iteams shows 4
		And user click on clothing
    And validate title "Categories - Clothing - Spree Demo Site"
    And validate number of iteams shows 14
    
    Scenario: validate shop by Brand all links
    When user click on Ruby
    then validate title "Brand - Ruby - Spree Demo Site"
    And validate nouber of iteams shows in ruby 1 
    And user click on apache
    And validate title "Brand - Apache - Spree Demo Site"
    And validate number of iteams apache 1
    And user click on spree
    And validate title "Brand - Spree - Spree Demo Site"
		And validate number if uteams soree 7
		And user click on Rails
		And validate title "Brand - Rails - Spree Demo Site"
		And validate number of items Rails 7
		   

   