# ConfR_QA_mobile - Android Testing
## Getting Started

This instruction is a set of useful information which will help you configure your entire environment, make a copy of the ConfR Android app and run automated tests on your local machine.

## Installation - step by step
You will need the following tools:
* Step 1[Install GIT](https://git-scm.com/download/)

Run Git Bash and clone repository from [GitLab](https://intive-patronage.westeurope.cloudapp.azure.com/) using:

`$ git clone git@intive-patronage.westeurope.cloudapp.azure.com:patronage/confr_qa_mobile.git`

* Step 2 [Install IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/downloadthanks.html?platform=windows&code=IIC)

* Step 3 [Install Java](https://www.java.com/pl/download/win10.jsp)
& [Java JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

* Step 4 (ChromeDriver, GeckoDriver, Web Inspector):

[Install Chromedriver](http://chromedriver.chromium.org/) and add into Path
Check if Chromedriver is correctly installed

`$ chromedriver`

[Install Geckodriver](https://github.com/mozilla/geckodriver/releases) and put the Geckodriver path into PATH

`$ npm install geckodriver`

[Install Web Inspector](https://chrome.google.com/webstore/detail/web-inspector/enibedkmbpadhfofcgjcphipflcbpelf)

* Step 5 (Java into the PATH):
> Set the JAVA_HOME Variable

* Step 6 [Download Apache Maven](http://maven.apache.org/download.cgi)

Check: `$ mvn -version`
> add MAVEN_HOME Variable

* Step 7 [Install Android Studio](https://developer.android.com/studio)
> add ANDROID_HOME Variable

* Step 8 [Install Appium](https://github.com/appium/appium-desktop/releases/latest)
& [Node.js](https://nodejs.org/en/)

`$ npm install -g appium`

Check: `$ appium`

Check: `$ node -v`

Check: `$ npm -v`

[Install Appium-doctor]

`$ npm install appium-doctor -g`

Check: `appium-doctor`
***
If everything went properly you shouldn't get any errors.
![](https://i0.wp.com/www.softwaretestingmaterial.com/wp-content/uploads/2017/09/Appium-With-NodeJs-9.png?resize=891%2C459&ssl=1)
***
## Running tests
***
Remember to manually update "ConfR-v1.0-build-1-debug.apk" file in repository.
***
Run all tests in repository using `mvn clean test -Dmobile="android"`

Run specific test `mvn test -Dcucumber.options="--tags @TAG"`  
(Remember to add your own tag before scenario)
