# Patronage 2019 - Mobile automated tests
This repository is created for tracking my progress during Patronage 2019 program. The main build was created by our Team Leader.

**Repository contains mostly my work, however if some source code is important to proper build and code wasn't written by me, it will be included and marked.**
# GETTING STARTED
This simple guide will help you create your entire environment for running tests on **macOS**.
***
[Install HomeBrew](https://brew.sh) - The missing package manager for macOS.   
`/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"`
***
Step 1) [Install GIT]()  
Step 2) [Install IntelliJ IDEA]()  
Step 3) [Install AndroidStudio]()  
Step 4) [Install Apache Maven]()  
Step 5) [Install Java JDK]()  
Step 6) [Install Node.JS]()  
Step 7) [Install Appium]()  
***
<<<<<<< Updated upstream
Check if everything is properly installed nas has environment patches.  

=======
Set environment patches.   
`$ open .bash_profile`   
If file isn't available - create one and set variables.  
`$ touch .bash_profile`
```
export M2_HOME=/usr/local/Cellar/maven/3.6.0/libexec
export PATH=$PATH:$M2_HOME/bin
export ANDROID_HOME=/Users/user/Library/Android/sdk
export PATH=$PATH:$ANDROID_HOME/tools:$ANDROID_HOME/platform-tools
export JAVA_HOME=$(/usr/libexec/java_home)
export PATH=${JAVA_HOME}/bin:$PATH
```
***
At the end run AppiumDoctor. It will check if you are able to write and run automated test.   
`$ appium-doctor`
***
![](http://i.imgur.com/hnr4NWw.png)
final
>>>>>>> Stashed changes
