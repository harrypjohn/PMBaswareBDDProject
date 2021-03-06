Feature: Verify autoreceiving is working fine during Alusta invoicing

  Scenario Outline: Verify autoreceiving is working fine during Alusta invoicing
    Given Launch browser for "https://pm.baswareqa.com/qapd/cfms/security/login.cfm"
    When Login with <Username> and <Password>
    Then Click on SearchCatalog button
    Then Click on SearchIcon
    Then Click on Add to Cart button with Item
    | Item_Name                               |
    | Item 3 wtih Category Hardware No        |
    | Item2 with Category Office Supplies Yes |
    | Item1 with Category Office Supplies Yes |
   Then Click on Shopping Cart button
   Then Click on Finish Request button
   Then Get Purchase Order Total
   Then Receive Purchase Order
   Then Click on AP Automation Approval
   Then Click on Retrieve Purchase Order Data
   Then Create Invoice
   Then Search and Verify processed invoice
  # And Close the testcase

    Examples: 
      | Username   | Password   |
      | t3043admin | 1$hockedMonk3y |
