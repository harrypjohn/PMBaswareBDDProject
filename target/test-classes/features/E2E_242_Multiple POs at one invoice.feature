   Feature: E2E_242_Multiple POs at one invoice
   Scenario Outline: Verify Multiple POs at one invoice
   Given Launch browser for "https://pm.baswareqa.com/qapd/cfms/security/login.cfm"
   When Login with <Username> and <Password>
    Then Click on SearchCatalog button
    Then Click on SearchIcon
    Then Click on Add to Cart button
    Then Click on Shopping Cart button
    Then Click on Finish Request button
    Then Get Purchase Order Total
    Then Receive Purchase Order
    Then Click on SearchCatalog button
    Then Click on SearchIcon
    Then Click on Add to Cart button
    Then Click on Shopping Cart button
    Then Click on Finish Request button for second Purchase Order
    Then Get Purchase Order Total for second Purchase Order
    Then Receive Purchase Order for second Purchase Order
    Then Click on AP Automation Approval
    Then Click on Retrieve Purchase Order Data
    Then Click on Accounts Payable
    Then Click on Retrieve Second Purchase Order Data
    Then Create Invoice
    Then Search and Verify processed invoice
    Then Get Purchase Order Total
    Then Click on AP Automation Approval
    Then Click on Retrieve Purchase Order Data
    Then Create Invoice
   # And Close the testcase

   Examples: 
      | Username  | Password   |
      | T3043admin | 1$hockedMonk3y |