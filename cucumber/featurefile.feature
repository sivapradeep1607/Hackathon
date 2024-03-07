Feature: Travel insutance for students
@smoke
  Scenario: Travel insurance
    Given click of travel insurance
    When selecting of country
    Then selection of date
    Then selecting number of persons
    And selecting medical issue
    And phone number page
    And clicking of filter
    And clicking of sort by
@regression
  Scenario: car insurance
    Given click of policy bazaar icon
    Then click of new car
    Then click of location
    Then click of registration number
    Then click of car brand
    Then click of selected car model
    Then click of selected car edition
    And click of user name
    And click of user email
    And click of user mobile number
@sanity
  Scenario: helth insurance
    Given click of policy bazaar icon1
    Then click of insurance product
