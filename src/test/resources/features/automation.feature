@Account
Feature: User Creates an account

  @RegisterAccount
  Scenario Outline: User can create an account
    Given The user is on Homepage
    Then the user clicks on Sign in
    And user enters email
      | <Email> |
    And User Clicks create an account
    And User fills sign up form
      | <FirstName> | <LastName> | <Email> | <Pass> | <Company> | <AddressOne> | <AddressTwo> | <City> | <PostalCode> | <OtherInfo> | <HomePhone> | <MobilePhone> | <Alias> |
    And user clicks register
    Then the user is taken my account page
      | <ConfirmAccount> |

    Examples:
      | FirstName | LastName | Email                               | Pass      | Company  | AddressOne  | AddressTwo  | City     | PostalCode | OtherInfo | HomePhone | MobilePhone | Alias          | ConfirmAccount |
      | Valeria | Rivera  | Vale0299200@gmail.com | Choucair. | Choucair | Cr87a#32-81 | Cr87a#32-81 | Medellin | 33206      | Hiring    | 7748954   | 3005647895  | TestAutomation | MY ACCOUNT     |


  @LogInAccount
  Scenario Outline: user can log in account
    Given the user has a valid account
    Then the clicks on sign in
    And enters email
      | <Email> |
    And enters password
      | <Pass> |
    And clicks sign in
    Then the user is successfully logged in
      | <ConfirmAccount> |
    Examples:
      | Email                   | Pass      | ConfirmAccount                                                                            |
      | Vale0299200@gmail.com   | Choucair. | MY ACCOUNT  |


  @RegisterAccountWithEmailUsed
  Scenario Outline: the user cannot create an account with email already registered
    Given The user is on Homepage
    Then the user clicks on Sign in
    And user enters email
      | <Email> |
    Examples:
      | FirstName | LastName | Email                               | Pass      | Company  | AddressOne  | AddressTwo  | City     | PostalCode | OtherInfo | HomePhone | MobilePhone | Alias          | ConfirmAccount |
      | Valeria | Rivera  | Vale0299200@gmail.com | Choucair. | Choucair | Cr87a#32-81 | Cr87a#32-81 | Medellin | 33206      | Hiring    | 7748954   | 3005647895  | TestAutomation | MY ACCOUNT     |

  @DressWithCreditCard
  Scenario Outline: Purchase of dress with credit card
    Given the user has a valid account
    Then the clicks on sign in
    And enters email
      | <Email> |
    And enters password
      | <Pass> |
    And clicks sign in
    Then the user is successfully logged in
      | <ConfirmAccount> |
    And select dress
    And select type of credit card payment
    Examples:
      | Email                   | Pass      | ConfirmAccount                                                                             |
      | Vale0299200@gmail.com   | Choucair. | MY ACCOUNT  |

  @DressWithCheque
  Scenario Outline: Purchase of dress with cheque
    Given the user has a valid account
    Then the clicks on sign in
    And enters email
      | <Email> |
    And enters password
      | <Pass> |
    And clicks sign in
    Then the user is successfully logged in
      | <ConfirmAccount> |
    And select dress
    And select type of cheque payment
    Examples:
      | Email                   | Pass      | ConfirmAccount                                                                             |
      | Vale0299200@gmail.com   | Choucair. | MY ACCOUNT  |


  @TopsWithCreditCard
  Scenario Outline: Purchase of Tops with credit card
    Given the user has a valid account
    Then the clicks on sign in
    And enters email
      | <Email> |
    And enters password
      | <Pass> |
    And clicks sign in
    Then the user is successfully logged in
      | <ConfirmAccount> |
    And select tops
    And select type of credit card payment
    Examples:
      | Email                   | Pass      | ConfirmAccount                                                                             |
      | Vale0299200@gmail.com  | Choucair. | MY ACCOUNT  |

  @TopsWithCheque
  Scenario Outline: Purchase of tops with cheque
    Given the user has a valid account
    Then the clicks on sign in
    And enters email
      | <Email> |
    And enters password
      | <Pass> |
    And clicks sign in
    Then the user is successfully logged in
      | <ConfirmAccount> |
    And select tops
    And select type of cheque payment
    Examples:
      | Email                   | Pass      | ConfirmAccount                                                                             |
      | Vale0299200@gmail.com   | Choucair. | MY ACCOUNT  |

  @SearchDressWithCheque
  Scenario Outline: search and purchase of dress with cheque
    Given the user has a valid account
    Then the clicks on sign in
    And enters email
      | <Email> |
    And enters password
      | <Pass> |
    And clicks sign in
    Then the user is successfully logged in
      | <ConfirmAccount> |
    And look for clothes
    And select type of cheque payment
    Examples:
      | Email                   | Pass      | ConfirmAccount                                                                             |
      | Vale0299200@gmail.com   | Choucair. | MY ACCOUNT  |

  @SearchTopsWithCreditCard
  Scenario Outline: search and purchase of dress with credit card
    Given the user has a valid account
    Then the clicks on sign in
    And enters email
      | <Email> |
    And enters password
      | <Pass> |
    And clicks sign in
    Then the user is successfully logged in
      | <ConfirmAccount> |
    And look for clothes
    And select type of credit card payment
    Examples:
      | Email                   | Pass      | ConfirmAccount                                                                             |
      | Vale0299200@gmail.com  | Choucair. | MY ACCOUNT  |