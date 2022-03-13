Feature: PM-6668 View request - View OR details

  Scenario Outline: View request - View OR details
    Given Launch browser for "https://pm.baswareqa.com/qapd/cfms/security/login.cfm"
    When Login with <Username> and <Password>
    Then Click on SearchCatalog button
    Then Click on SearchIcon
    Then Click on Add to Cart button
    Then Click on Shopping Cart button
    Then Click on Finish Request button
    Then Get Purchase Order Total
    Then Click on AP Automation Approval
    Then Click on Retrieve Purchase Order Data
    Then Create Invoice
    #And Close the testcase

    Examples: 
      | Username  | Password   |
      | T3043admin | 1h@ppyseal |
