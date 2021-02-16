# example-react-java-and-h2
Basic example of full stack application using React, Java, and an H2 database

Things you will need to install:

Node.js:
https://nodejs.org/en/download/
- Literally the greatest javascript package management tool, you will never have to worry about it again after you install it.

npm:
https://docs.npmjs.com/downloading-and-installing-node-js-and-npm
- Stands for node package manager, comes with commandline tools for running applications locally and easily installing frameworks/plugins through node

Eclipse:
https://www.eclipse.org/downloads/
- You all probably have this already, it's just Eclipse

Visual Studio Code:
https://code.visualstudio.com/
- Glorified text editor with nice plugins, it's for our html, css, and react code

Java SRE:
https://www.oracle.com/java/technologies/javase-downloads.html
- You all probably have this already, it's just Java


How to run the project:

Step 1: Import the folder "spring-boot-fullstack-crud-full-stack-with-maven" as a project into eclipse through the following orders/types:
File >> Import >> Maven >> Existing Maven Projects >> 
Root Directory, Browse >> Select the "spring-boot-fullstack-crud-full-stack-with-maven" >> Finish

Step 2: right click on the following file: src/main/java/"long-annoying-package-name"/SpringBootFullstackCrudFullStackWithMavenApplication.java >> Run As >> 1 Java Application

A large amount of text saying "Spring" should show up in your console. The java backend is online now. If you make java code changes you will have to restart it by pressing the red square button, and repeating step 2.

Step 3: Open the folder "frontend-spring-boot-react-crud-full-stack-with-maven" in visual studio code by clicking: Open folder... >> navigate to and select "frontend-spring-boot-react-crud-full-stack-with-maven"

Step 4: Open up a new terminal/command line (in visual studio code or using it's own window) navigate to "frontend-spring-boot-react-crud-full-stack-with-maven" (if you are using a terminal in visual studio code, you will be automatically navigated) 

Step 5: Enter the command "npm install". A long process will start, might take a few minutes, wait until it's done.

Step 6: Enter the command "npm start". 

The react front end is online now. It should be online at the following url: "http://localhost:3000/". The great thing about react is when when we make changes we don't have to restart the server. To shut it down, just shut down the terminal/command line.

If both the react front end and the java backend are currently running the app should be fully functional at "http://localhost:3000/" 

