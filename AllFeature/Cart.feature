@cart
Feature: validate cart all functionality

  Background: homepage
    Given user is on "http://spree.shiftedtech.com"

  Scenario: validete item added to cart
    When user clicks on first item
    Then add item to cart
    Then click on checkout
    Then enter guest emailID as "abc@gmail.com"
    Then click on continue
    
    Then fill address "pavan" , "birajdar" , "lic colony" , "floreda" , "United States of America" , "Alaska" , "123456" ,"4561237"
     
    Then click on save and continue

    