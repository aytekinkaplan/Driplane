@DriplaneDashboardTests
Feature: Driplane Dashboard Page Functionality

  Scenario: Navigating to Driplane Dashboard Page (Test Case 001)
    Given User is on the Driplane Dashboard page

  Scenario: Confirming Presence on Driplane Dashboard Page (Test Case 002)
    Then User confirms being on the Driplane Dashboard page

  Scenario: Verifying the Title on Driplane Dashboard Page (Test Case 003)
    Then User sees the Driplane title

  Scenario: Verifying Email Text on Driplane Dashboard Page (Test Case 004)
    Then User sees the email text on the Driplane Dashboard page

  Scenario: Verifying Visibility of Dashboard Button on Driplane Dashboard Page (Test Case 005)
    Then User sees the Dashboard button on the Driplane Dashboard page

  Scenario: Clicking on Dashboard Button on Driplane Dashboard Page (Test Case 006)
    When User clicks on the Dashboard button

  Scenario: Verifying Visibility of Settings Button on Driplane Dashboard Page (Test Case 007)
    Then User sees the Settings button on the Driplane Dashboard page

  Scenario: Clicking on Settings Button on Driplane Dashboard Page (Test Case 008)
    When User clicks on the Settings button

  Scenario: Verifying Default Project Text on Driplane Dashboard Page (Test Case 009)
    Then User sees the Default Project text on the Driplane Dashboard page

  Scenario: Verifying Presence of Specific Text on Driplane Dashboard Page (Test Case 010)
    Then User sees "Did you add your tracker code to your website?" on the Driplane Dashboard page

  Scenario: Verifying Presence of "No Data" Text on Driplane Dashboard Page (Test Case 011)
    Then User sees "No Data" text on the Driplane Dashboard page

  Scenario: Verifying Specific Instruction Text on Driplane Dashboard Page (Test Case 012)
    Then User sees "You can put the code below before </head> tag in your website:" on the Driplane Dashboard page

  Scenario: Verifying Presence of Code Area on Driplane Dashboard Page (Test Case 013)
    Then User verifies the presence of the code area on the Driplane Dashboard page

  Scenario: Verifying Specific Guidance Text on Driplane Dashboard Page (Test Case 014)
    Then User sees "Then you will start to see your visitor insights in this dashboard." on the Driplane Dashboard page

  Scenario: Verifying Visibility of Default Project Button on Driplane Dashboard Page (Test Case 015)
    Then User sees the Default Project button on the Driplane Dashboard page

  Scenario: Clicking on Default Project Button on Driplane Dashboard Page (Test Case 016)
    When User clicks on the Default Project button

  Scenario: Verifying Visibility of Account Settings Button on Driplane Dashboard Page (Test Case 017)
    Then User sees the Account Settings button on the Driplane Dashboard page

  Scenario: Clicking on Account Settings Button on Driplane Dashboard Page (Test Case 018)
    When User clicks on the Account Settings button

  Scenario: Verifying Visibility of "Last Month" Button on Driplane Dashboard Page (Test Case 019)
    Then User sees the "Last Month" button on the Driplane Dashboard page

  Scenario: Clicking on "Last Month" Button on Driplane Dashboard Page (Test Case 020)
    When User clicks on the "Last Month" button

  Scenario: Verifying Visibility of "Live" Button on Driplane Dashboard Page (Test Case 021)
    Then User sees the "Live" button on the Driplane Dashboard page

  Scenario: Clicking on "Live" Button on Driplane Dashboard Page (Test Case 022)
    When User clicks on the "Live" button

  Scenario: Verifying Visibility of "Today" Button on Driplane Dashboard Page (Test Case 023)
    Then User sees the "Today" button on the Driplane Dashboard page

  Scenario: Clicking on "Today" Button on Driplane Dashboard Page (Test Case 024)
    When User clicks on the "Today" button

  Scenario: Verifying Visibility of "Yesterday" Button on Driplane Dashboard Page (Test Case 025)
    Then User sees the "Yesterday" button on the Driplane Dashboard page

  Scenario: Clicking on "Yesterday" Button on Driplane Dashboard Page (Test Case 026)
    When User clicks on the "Yesterday" button

  Scenario: Verifying Visibility of "Last Week" Button on Driplane Dashboard Page (Test Case 027)
    Then User sees the "Last Week" button on the Driplane Dashboard page

  Scenario: Clicking on "Last Week" Button on Driplane Dashboard Page (Test Case 028)
    When User clicks on the "Last Week" button

  Scenario: Verifying Visibility of "Sign Out" Button on Driplane Dashboard Page (Test Case 029)
    Then User sees the "Sign Out" button on the Driplane Dashboard page

  Scenario: Clicking on "Sign Out" Button on Driplane Dashboard Page (Test Case 030)
    When User clicks on the "Sign Out" button

  Scenario: Redirected to Driplane Login Page and Confirmation (Test Case 031)
    Then User is redirected to the Driplane Login page and confirms being on the Login page, and User confirms "Sign Out"
