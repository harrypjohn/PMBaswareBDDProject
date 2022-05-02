Feature: E2E_180 PO Send to Network via REST API

  Scenario Outline: E2E_180 PO Send to Network via REST API
    Given Launch browser for "https://pm.baswareqa.com/qapd/cfms/security/login.cfm"
    When Login with <Username> and <Password>
    Then Click on SearchCatalog button
    Then Click on SearchIcon
    Then Click on Add to Cart button
    Then Click on Shopping Cart button
    Then Click on Finish Request button
    Then Get Purchase Order Total
    Then Receive Purchase Order
    Then Launch browser for "https://sie-portal.eu.baswareqa.com/home"
    Then SIE Login with <Username> and <Password>
    #And Close the testcase

    Examples: 
      | Username  | Password   |
      | T3043admin | 1$hockedMonk3y |
