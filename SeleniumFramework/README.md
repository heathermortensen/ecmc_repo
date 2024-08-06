# ECMC Project

I will use Page Object Model (POM) to construct 3 website tests using selenium.

POM can be visualized, at a high level, as fitting into a Page Factory design pattern. (See Figure 1)

`<figure><img src="./images/POM.png"><figcaption>Figure 1. Abstract Visualization of the Page Object Model</figcaption></figure>`

![POM](./images/POM.png)

Lets define our POM more concretley and make it relevent to our current project.
Each webpage is its own class. Instance variables of each class are webpage components that a user interacts with, termed "object locators," here. 

`<figure><img src="./images/myPOM.png"><figcaption>Figure 2. Defining the Page Object Model More Specifically to this Use Case</figcaption></figure>`

There is some variation in the types assigned to our instance variables inside our website's source code. There are some modifiers that might be relevant for testing purposes, so I included that in figure 3 as well. Instance variables may be of type id, required id, name, data-testid 

What is a data-testid data type? https://medium.com/@automationTest/why-your-development-team-should-use-data-testid-attributes-a83f1ca27ebb

I construct the POM as illustrated in figure 3. The website has three pages, therefore this class diagram has three classes. Instance variables for classes we test are shown in black. Untested classes have white instance variables.

`<figure><img src="./images/specific_POM_v3.png"><figcaption>Figure 3. Three Page Classes - Home class, Contact class, and Waiting class</figcaption></figure>`

If tests are performed on a class, then the class attributes are shown in black boxes. If tests are not performed on the class, then its class attributes are shown in white.  

The three tests we will construct are listed below:
----------------------------------------------------

Test 1.) Submit a successful Contact Us request, and verify the message on the success page.
Test 2.) Fill out the Contact Us form's First and Last name fields, then click Submit. 
	2a.) Verify the validation message for First name. 
	2b.) Verify the error message under the Terms and Conditions checkbox.
Test 3.) On the Waiting page, please wait for the page to load, and then follow the instructions to verify the two alerts.

An illustration of test 1 is shown below in figure 3.


```
git add .
git commit -am "I have made some changes."
// git checkout develop
//git merge --no-ff my-feature-branch
git push origin develop
git status
```
