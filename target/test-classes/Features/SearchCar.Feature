

@SearchCars_Positive
Feature: Acceptance Testing to validate Search CAR functionality
  

  @SearchCars_Positive
  Scenario: Validate Search Car PAge
    Given I am on the Home Page "https://www.carsguide.com.au/"
    When I Enter Make as "Alfa Romeo"
    When I ENter Model as "GT"
    And I Click Show 
    Then I am in new page

  