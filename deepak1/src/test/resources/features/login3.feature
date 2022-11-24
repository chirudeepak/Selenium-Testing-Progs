Feature: webapplication

  Scenario: amazon web app
    Given user need to enter amazon page
    When user capture all links and navigate back and capture all links
    Then capture the screen shot
    Then closeing the browser
