Feature: Create blanket PO request from a single Off catalog item

# Create blanket PO request from a single Off catalog item in shopping cart based on permission

Scenario Outline: Create blanket PO request from a single Off catalog item
	Given Launch browser for "https://pm.baswareqa.com/qapd/cfms/security/login.cfm"
	When Login with <Username> and <Password>
	Then Select <OffCatalog> menu option1
	And Configure Off Catalog Request with name <VendorName> desc <ItemDesc> cat <Category> Qty <Qty> UnitPrice <UnitPrice>
	And Validate that Order request is created successfully
	And Close the testcase

	
Examples:
  	| Username | Password | OffCatalog | VendorName | ItemDesc | Category | Qty | UnitPrice |
    | T3043admin | 1$hockedMonk3y | Requisitions - Off Catalog Request | Hotel Glo | Samsung mobile | 123Hallway | 1 | 100 | 