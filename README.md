# ConfR_QA_mobile - Android Testing
## Getting Started

This instruction is a set of useful information which will help you configure your environment, make a copy of the ConfR project for android and run automated tests on your local machine.

## Installation - step by step
You will need the following tools:
* Step 1 (GIT):

[Install GIT](https://git-scm.com/download/win)

Run Git Bash and clone repository from GitLab.

[Link to GitLab](https://intive-patronage.westeurope.cloudapp.azure.com/)

`$ git clone git@intive-patronage.westeurope.cloudapp.azure.com:patronage/confr_qa_mobile.git` 	

* Step 2 (IntelliJ IDEA Community Edition):

[Install IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/downloadthanks.html?platform=windows&code=IIC)

* Step 3 (Java & Java JDK):
[Install Java](https://www.java.com/pl/download/win10.jsp)
[Java JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

* Step 4 (Chromedriver, Geckodriver, Web Inspector):
[Install Chromedriver](http://chromedriver.chromium.org/) and add into Path
Check if Chromedriver is correctly installed

`$ chromedriver`

[Install Geckodriver](https://github.com/mozilla/geckodriver/releases) and put the Geckodriver path into PATH

`$ npm install geckodriver`

[Install Web Inspector](https://chrome.google.com/webstore/detail/web-inspector/enibedkmbpadhfofcgjcphipflcbpelf)

* Step 5 (Java into the PATH):
> Set the JAVA_HOME Variable

* Step 6 (MAVEN):
[Download Apache Maven](http://maven.apache.org/download.cgi)

Check: `$ mvn -version`
> add MAVEN_HOME Variable

* Step 7 (Android Studio):
[Install Android Studio](https://developer.android.com/studio)
> add ANDROID_HOME Variable

* Step 8 (Appium, Appium-doctor, Node.js):
[Install Appium](https://github.com/appium/appium-desktop/releases/latest)

`$ npm install -g appium`

Check: `$ appium`

[Install Node.js](https://nodejs.org/en/)

Check: `$ node -v`

Check: `$ npm -v`

[Install Appium-doctor]

`$ npm install appium-doctor -g`

Check: `appium-doctor`

***
If everything went properly you shouldn't get any errors.
![](https://i0.wp.com/www.softwaretestingmaterial.com/wp-content/uploads/2017/09/Appium-With-NodeJs-9.png?resize=891%2C459&ssl=1)
