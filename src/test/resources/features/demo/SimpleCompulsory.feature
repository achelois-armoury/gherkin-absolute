Feature: User Access
  # Enter feature description here
  Scenario: The user logs in and sees the Home page
    # perfect example
    Given the "Log In" page is displayed
    When the correct user credentials are entered
    And the "Login" button is pressed
    Then the "Home" page is displayed
    And the user details are displayed in the "Profile" section
    And the "Home" page contains the following:
      | 'Logout' button   |
      | 'Profile' section |
      | 'News' section    |
      | 'Report' button   |
      | 'Home' title      |