Feature: Retail Order Page

  Background: 
    Given user is on retail website
    When user click on Sign in option
    And user enter email 'osmannabavian123@gmail.com' and password 'Tawab123@'
    And user click on Login button
    And user should be logged in into Account
    And user click on Orders section
    And user click on first order in list

  @testO1
  Scenario: Verify User can cancel the order
    And user click on Cancel The Order button
    And user select the cancelation Reason ‘Bought wrong item’
    And user click on Cancel Order button
    Then a cancelation message should be displayed ‘Your Order Has Been Cancelled’

  @testO2
  Scenario: Verify User can Return the order
    And User click on Return Items button
    And User select the Return Reason ‘Item damaged’
    And User select the drop off service ‘FedEx’
    And User click on Return Order button
    Then a cancelation message should be displayed ‘Return was successful’

@testO3
  Scenario: Verify User can write a review on order placed
    
    And User click on Review button
    And User write Review headline 'headline value' and 'review text'
    And User click Add your Review button
    Then a review message should be displayed ‘Your review was added successfully’
