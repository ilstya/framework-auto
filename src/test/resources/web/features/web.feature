Feature: Testing DemoBlaze Website

  @web
  Scenario: Open DemoBlaze homepage
    Given I open the demo website "https://www.demoblaze.com/"
    Then The page title should be "STORE"

  Scenario: View product details
    Given I open the demo website "https://www.demoblaze.com/"
    When I click on the first product
    Then I should be taken to the product detail page
    And The product title should be visible

  Scenario: Navigate to the Contact page
    Given I open the demo website "https://www.demoblaze.com/"
    When I click on the "Cart" link
    Then I should be taken to the Contact page
    And The contact form should be displayed
