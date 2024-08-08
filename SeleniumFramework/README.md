# ECMC Project

I will use Page Object Model (POM) to construct 3 website tests using Selenium, Maven, and Java.

POM can be visualized, at a high level, as fitting into a Page Factory design pattern. (See Figure 1)

![POM](./images/POM.png)
**Figure 1.** Abstract Visualization of the Page Object Model

Lets define our POM more concretely and make it relevant to our current project.
Each webpage is its own class. Instance variables of each class are webpage components (aka "locators") that a user interacts with.

![myPOM](./images/myPOM.png)
**Figure 2.** Defining the Page Object Model More Specifically to this Use Case

There is some variation in the types assigned to our instance variables inside our website's source code. There are qualifiers that might be relevant for testing purposes, so I included them in figure 3. HTML tags help us identify specific webpage components. Those identified in figure 3 are id, required id, name, data-testid 

What is a data-testid? https://medium.com/@automationTest/why-your-development-team-should-use-data-testid-attributes-a83f1ca27ebb

I construct the POM as illustrated in figure 3. The website has three pages, therefore a class diagram has three classes. Instance variables for classes we intend to test are shown in black. Untested classes have white instance variables.

![specific_POM_v3](./images/specific_POM_v3.png)
**Figure 3.** Three Page Classes - Home class, Contact class, and Waiting class
  

We construct 3 tests listed below:
--------------------------------------------------------------------------------------------------------------------------

Test 1.) Submit a successful Contact Us request, and verify the message on the success page.
Test 2a.) Fill out the Contact Us form's First and Last name fields, then click Submit. 
	2b.) Verify the validation message for First name. 
	2c.) Verify the error message under the Terms and Conditions checkbox.
Test 3.) On the Waiting page, please wait for the page to load, and then follow the instructions to verify the two alerts.

An illustration of how we incorporate those tests is shown below in figure 4.

![some_pic_4](./images/some_pic_4.png)
**Figure 4.** Some pic that incorporates the tests

##Test 1 Details


##Test 2 Details

Figure 5 shows output from the Contact Us webpage after input is entered by the user.

![Test 2 Output](./images/test2_output.png)
**Figure 5.** Test 2

Figure 6 illustrates test output. 

![Test 2 Details](./images/Test_2.png)
**Figure 6.** Test 2

Figure 7 shows where to find files related to the test inside the eclipse package. The 'Contact Us' webpage has a corresponding class at /SeleniumFramework/src/test/java/pages/Contact_page.java inside the eclipse project. Code related to test 2 exists at the following location: /SeleniumFramework/src/test/java/myTests/test_2.java.

![Test 2 package structure](./images/test2_package_structure.png)
**Figure 7.** Test 2 files inside the java package structure

##Test 3 Details

```
git add .
git commit -am "I have made some changes."
// git checkout develop
//git merge --no-ff my-feature-branch
git push origin develop
git status
```
