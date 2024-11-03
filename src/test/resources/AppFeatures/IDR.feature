Feature: Visualize IDR dashboard and its components

  Scenario: Check data is visible for brand overview page and identities overview page
    Given browser is open
    And user navigates to RE application
    When searches for IDR section
    And clicks on IDR
    Then data is visible for BO page
    And clicks on identities overview page  

    