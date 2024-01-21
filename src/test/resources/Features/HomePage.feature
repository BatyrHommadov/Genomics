Feature: Home Page

  Scenario: Verify homepage and navigation options
#    we are using open browser in hooks and close browser in hooks so we don't need this given now
#    Given the user navigates to the Genomics England homepage
    Then  the title is "Homepage | Genomics England"
    And the following navigation options are displayed
      |options|
      |Genomic Medicine |
      |Our Initiatives  |
      |Patients and Participants|
      |Research and Partnerships|
      |News and Events|
      |About Us |