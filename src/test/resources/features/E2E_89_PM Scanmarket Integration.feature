Feature: Verify PM Scanmarket Integration

  Scenario Outline: Verify PM Scanmarket Integration
    Given Launch browser for "https://testlogin.scanmarket.com/?msg=0&redirecturl=https%253a%252f%252ftestserver.scanmarket.com%252fEvent%252fEvents.aspx%253fid%253d85660"
    When  ScanMarket Login with <username> and <password> 
    Examples: 
      | username  | password   |
      | basware3043 | BaswareIntegration2019! |