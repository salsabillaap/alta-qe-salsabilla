Feature: Calculator
  Scenario Outline: Calculator Functionality
    When I want to count <Angka1> and <Angka2>
    And I am using "<Operator>" operator
    Then I receive <Result> from this count
    Examples:
      | Angka1    | Angka2       | Operator | Result |
      | 5         | 5            | +        | 10     |
      | 9         | 4            | -        | 5      |
      | 1         | 10           | *        | 10     |
      | 15        | 3            | /        | 5     |