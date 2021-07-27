## Description:
Web Test Automation Suite for validating the end to end user journey of joining as a new user, completing covid challenges and getting successfully added to the leaderboard.


## Key Features:
1. Multi browser test execution
1. Capability to run on multiple environments since environment details are fetched from env.properties file   
1. Simple Cucumber Report that can be accessed under test-output/cucumber-reports/cucumber-pretty/index.html
1. Detailed Cucumber Report that can be accessed under test-output/cucumber-reports/advanced-reports/overview-features.html
   Reports from last run have been retained under the above mentioned directories for reference.


## Pre-Requisites:
1.JAVA_HOME ,M2 and PATH environment variables should be set up correctly on the system where the test needs to be run.

 
## Note:
1. For Multi browser support feature in Firefox browser had to use the antipattern of using Thread.sleep before clicking on the Covid Challenge Answers
1. Tried the below solutions to overcome this issue , but did not provide a robust solution: <br>
   a) Using Actions Library- Even though this approach clicked the answer correctly , the behaviour was not consistent for multiple runs <br>
   b) Changing the Expected Conditions wait criteria before interacting within an element to visibilityOf, elementToBeClickable etc... <br>
   c) Implicit Wait - By waiting for a predefined amount of time before clicking the element <br>
   d) Firefox Options - By adding capability of overlappingCheckDisabled to true <br>
   e) Using JavaScript executor - Even though this approach clicked the answer correctly , the behaviour was not consistent for multiple runs <br>


   
## Instruction:
To trigger the test first please clone the repository to any machine satisfying the conditions mentioned in Pre-Requisites section and thereafter navigate to the project directory. Please type in the below command and hit Enter to launch the tests:
 
 mvn clean install
 
