# Autor: Joel Rochel

@stories
Feature: Academy Choucair
  As a user, I want to register on the platform
  @scenario1
  Scenario: Register on the Utest site
    Given Joel wants to register on the Utest site
    When start the registration process in Utest
      | strName    | strLastName      | strEmail                | strMonth | strDay | strYear | strLanguagePage | strCity   | strZip    | strCountry  | strComputer | strVersion | strLanguage | strMobile | strModel     | strOS      | strPassword  |
      | Joel David | Rochel Hernandez | joelrochel300@gmail.com | August   | 24     | 1998    | Spanish         | Cereté    | 230550    | Colombia    | Windows     | Windows 10 | Spanish     | Xiaomi    | Redmi Note 8 | Android 11 | 123@PassReto |
    Then check the final registration process
      | strConfirmButton |
      | Complete Setup   |