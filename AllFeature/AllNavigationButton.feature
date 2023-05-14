@Navigation
Feature: Check that all the navigation buttons take you to their intended pages.

  Background: homepage
    Given user is on "http://spree.shiftedtech.com"

  Scenario: Validate all navigational links from product image
    Given user is on homepage
    When user captures name of first product
    And captures price of product
    Then user click on first product image
    And vaalidate title of product with captured on homepage
    And validate price with captured
    
  
