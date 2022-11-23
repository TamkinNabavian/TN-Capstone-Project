@test3
Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'osmannabavian123@gmail.com' and password 'Tawab123@'
    And User click on login button
    And User should be logged in into Account
    When User click on Account option

  Scenario: Verify User can update Profile Information
    And User update Name 'Tamkin' and Phone '571-538-6882'
    And User click on Update button
    Then user profile information should be updated

  @test4
  Scenario: Verify User can Update password
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Tawab321@        | Tawab123@   | Tawab123@       |
    And User click on Change Password button
    Then a message should be displayed ‘Password Updated Successfully’

  @test5
  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1278345628435784 | Tamkin     |              03 |           2024 |          233 |
    And User click on Add your card button
    Then message should be displayed ‘Payment Method added successfully’

  @Besmullah
  Scenario: Verify User can edit Debit or Credit card
    And User click on Card
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 3668374372233078 | Mahmod     |              03 |           2024 |          564 |
    And user click on Update Your Card button
    Then a message should displayed ‘Payment Method updated Successfully’

  @tag
  Scenario: Verify User can remove Debit or Credit card
    And User click on remove option of card section
    Then payment detail should be removed

  @tag1
  Scenario: Verify User can add an Address
    And User click on Add address option
    And user fill new address form with below information
      | country       | fullName        | phoneNumber  | streetAddress    | apt | city       | state    | zipCode |
      | United States | Tamkin Nabavian | 571-538-6882 | 1298 Bayside Ave |  12 | Woodbridge | Virginia |   22191 |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully’

  @tag2
  Scenario: Verify User can edit an Address added on account
    And User click on edit address option
    And user should fill new address form with below information
      | country       | fullName | phoneNumber | streetAddress | apt | city       | state    | zipCode |
      | United States | Ahmad    |  5715387855 |          1145 |  11 | Woodbridge | Virginia |   22192 |
    And User click update Your Address button
    Then message should be displayed ‘Address Updated Successfully’

@tag3
  Scenario: Verify User can remove Address from Account
    
    And User click on remove option of Address section
    Then Address details should be removed
