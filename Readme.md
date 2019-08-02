# Patronage 2019 - Automated tests
This repository is created for tracking my progress during Patronage 2019 program. The main build was provided by our Team Leader.  
Main goal was to create tests for **Android** and **iOS** application, but unfortunately iOS dev team has been disbanded.

**Repository contains mostly my work, however if some source code is important to proper work of repo, and it wasn't written by me, it will be included and marked.**
# Getting started
This simple guide will help you create your entire environment for running tests on **macOS**.
***
[Install HomeBrew](https://brew.sh) - The missing package manager for macOS.   
`/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"`
***
[Install GIT](https://git-scm.com/downloads)  
`$ brew install git`

[Install IntelliJ IDEA](https://www.jetbrains.com/idea/download/#section=mac)  
`$ brew cask install intellij-idea-ce`

[Install Xcode](https://developer.apple.com/xcode/)  
`$ xcode-select --install`

[Install Carthage](https://github.com/Carthage/Carthage)  
`$ brew install carthage`

[Install AndroidStudio](http://macappstore.org/android-studio/)  
`$ brew cask install android-studio`

[Install Apache Maven](https://maven.apache.org/download.cgi)  
`$ brew install maven`

[Install Java JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk12-downloads-5295953.html)  
`$ brew cask install java`

[Install Node.JS](https://nodejs.org/en/download/)  
`$ brew install node`

[Install NPM](https://treehouse.github.io/installation-guides/mac/node-mac.html)  
`$ npm install`

[Install Appium](http://appium.io)  
`$ npm install -g appium`  
`$ npm install wd`

[Install AppiumDoctor](https://github.com/appium/appium-doctor)  
`$ npm install appium-doctor -g`
***
Check if everything is properly installed
```
git --version
mvn --version
java --version
node --version
npm --version
```
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
# Running tests
Run all test: `mvn clean test -Dmobile="Android"`  