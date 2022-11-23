Feature: Retail Home Page

  Background: 
    Given User is on retail website
    When User click on Sign In option
    And User can enter email 'osmannabavian123@gmail.com' and password 'Tawab123@'
    And user click on login button
    And User logged in into Account

  @testH1
  Scenario: Verify Shop by Department sidebar
    When User click on All section
    Then below options are present in Shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  @TestH2
  Scenario Outline: Verify department sidebar options
    When User can click on All section
    And User is on 'department'
    Then below option are present in department
      | TV & Videos | Video Games |

    Examples: 
      | department  | optionOne                      | optionTwo                |
      | Electronics | TV & Video                     | Video Games              |
      | Computers   | Accessories                    | Networking               |
      | Smart Home  | Smart Home Lightning           | Plugs and Outlets        |
      | Sports      | Athletic Clothing              | Exercise & Fitness       |
      | Automotive  | Automative Parts & Accessories | MotorCycle & Powersports |

  @testH3
  Scenario: Verify User can add an item to cart
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity ‘2’
    And User click on add to Cart button
    Then the cart icon quantity should change to ‘2’
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And User fill new address form with below information
      | country      | fullName | phoneNumber | streetAddress | apt | city       | state    | zipCode |
      | United State | Ahmad    |  5715478799 | 1298 bayside  |  11 | Woodbridge | Virginia |   22191 |
    And User Click Add Your Address button
    And User click Add a credit card or Debit Card for Payment method
    And user fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 2345678912345678 | Ahmad      |               2 |           2024 |          213 |
    And User Click on Add your card button
    And User click on Place Your Order
    Then message should be displayed ‘Order Placed, Thanks’


@testH4
  Scenario: Verify User can place an order with Shipping address and payment Method on file
  
    And User Change the category to 'Electronics'
    And User Search for an item 'Apex Legends'
    And user click on Search icon
    And user click on item
    And User select quantity ‘5’
    And User click add to Cart Btn
    Then the cart icon quantity should change to ‘5’
    And User click on Cart option
    And User click On Proceed to Checkout button
    And User can click on Place Your Order
    Then a Message should be displayed ‘Order Placed, Thanks’
