
Feature: E2E_87_PM Alusta integration with budgets

  Scenario Outline: Verify PM Alusta integration with budgets
    Given Launch browser for "https://pm.baswareqa.com/qapd/cfms/security/login.cfm"
    When Login with <Username> and <Password>
    Then Add a New Budget
    Then Click on SearchCatalog button
    Then Click on SearchIcon
    Then Click on Add to Cart button
    Then Click on Shopping Cart button
    Then Click on Finish Request button
    Then Get Purchase Order Total
    Then Receive Purchase Order
    
   # Then Get Purchase Order Total
   # Then Click on AP Automation Approval
   # Then Click on Retrieve Purchase Order Data
   # Then Create Invoice
    #And Close the testcase

    Examples: 
      | Username  | Password   |
      | T3043admin | 1$hockedMonk3y |