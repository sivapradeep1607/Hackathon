*****************************************************PROJECT DESCRIPTION*****************************************************************
 
Problem Statement: Travel Insurance for students 

1. Open travel insurance
2. Open car insurance
3. Open health insurance
 
Detailed description: Main Project 
 
1.Navigate to policybazar
2. Click the insurance product
3. Click the travel insurance
4. Click Select the European country
5. Select the start date and end date
6. Select count and age of the people
7. Select a medical condition
8. Provide phone number
9. Select Student plan
10. Select the number of days for the selected persons
11. Click Filter for low-cost insurance
12. Print print the lowest three travel insurance 
13. Click car insurance
13. Click buying a new car
14. Select location
15. Select RTO No
16. Select car brand
17. Select car model
18. Select the Fuel type
19. Select variant 
20. Select enter a user name, email ID, and phone 
21. Print one error message
22. Click insurance product 
23. Print the list of health insurance product

Key  Automation Scope:

-Capturing the screenshot
-Navigation to a new page
-Printing all the values in the console and Excel sheet

**********************************************************STEPS TO EXECUTE*************************************************************
 
-unzip the folder
-On eclipse, goto file->import->select the maven->click on existing maven project->next->browse the location unzip the folder-> click on finish
-Now go to the testRunner file (or) TestNG XML file and run.
-Now the file will Execute and we get the expected output as shown below.

*******************************************************FILES DESCRIPTION**************************************************************

1. src/test/java: There are seven packages in this folder- factory, page object, step definition, test base, test case, test runner, and utilities.
the factory contains a base class that chooses the browser and gets the URL in this package, The page object package contains travel insurance, car insurance, health insurance, and a base page in which the base page initializes the driver and travel insurance, car insurance, health insurance which contains method and functions in it, step definition which contains insurance and hooks, insurance contains step definitions which calls the methods in actions class to perform the required conditions then hooks contain the properties for execution, test base contains browser execution and grid execution for testNG, test case contains case1,case2, and case3 which contains testNg functions and methods test runner contains test runner class which runs the program in junit and utilities contain read excel and writexcel classes for reading and writing the data.
2. src/test/resources: Properties that are configured for setting the properties for execution.
3. Maven Dependencies: In this File, we have all the directories on the local machine, where all the project artifacts are stored. when a Maven build is executed,
   Maven automatically downloads all the dependency jars into the local repository. Usually, this directory is named.
3. excel sheet: In this folder, we have .xlsx files for reading and writing.
4. feature file: In this, we have a feature file with four scenarios.
5.readme: In this, we have a readme file which is for description.
6. screenshots: This folder stores the resulting screenshots.
5. target: In this folder, we have cucumber reports.
6. test-output: This folder contains spark reports.
7.pom.xml: The pom.xml file contains information on the project and configuration information for the maven to build the project such as dependencies,
  build directory, source directory, test source directory, plugin, goals, etc. Maven reads the pom.xml file and then executes the goal.
