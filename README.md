# Driplane: Web Panel E2E Tests 

This project automates UI tests for the Driplane Panel using Java Selenium and TestNG.

## Tools Used:

Java 17
Selenium WebDriver 4.4.0
TestNG 7.4.0
Cucumber 7.9.0
IntelliJ IDEA 2023.3
## Test Coverage:

Visibility and functionality tests for all panel elements
Validation of transitions between pages
Login process testing with different scenarios
## Test Environment:

IntelliJ IDEA 2023.3
Localhost
## Code Example:

    }

    @Then("User confirms being on the Driplane Dashboard page")
    public void user_confirms_being_on_the_driplane_dashboard_page() {
        // Write code here to confirm that the user is on the Driplane Dashboard page
        System.out.println("***** Confirming that the user is on the Driplane Dashboard Page (Test Case 002) *****");
        System.out.println(Driver.getDriver().getCurrentUrl().contains("/projects") ? "User is on the Driplane Dashboard Page" : "User is not on the Driplane Dashboard Page");
        System.out.println("***** Confirming that the user is on the Driplane Dashboard Page (Test Case 002) *****");
        System.out.println("---------------------------------------------------------------------------");
    }

    @Then("User sees the Driplane title")
    public void user_sees_the_driplane_title() {
        // Write code here to confirm that the user sees the Driplane title
        System.out.println("***** Confirming that the user sees the Driplane title (Test Case 003) *****");
        System.out.println(Driver.getDriver().getTitle().contains("Driplane") ? "User sees the Driplane title" : "User does not see the Driplane title");
        System.out.println("***** Confirming that the user sees the Driplane title (Test Case 003) *****");
        System.out.println("---------------------------------------------------------------------------");
    }

## Additional Information:

For detailed project documentation and code comments, please refer to the GitHub repository.
You can use the following email address for bug reports and contributions: [email address removed]
## GitHub Repository:

GitHub repository link: https://github.com/aytekinkaplan/Driplane.git
