## About
This is a Data Entry Project for Object Oriented Programming based on some parts of the existing Library Management system of PUP extending some functionality to record the currently manual procedure of the borrowed book form as well as retrieve the currently restricted access to the names of both the students and professors so that we may inspect and record who and where the books are currently. It aims to perform two (2) main functions in the CRUD statement, (1)Read and (2)Create. 
(1) To READ or DISPLAY each values so that the user who uses this system may see the changes they've made.
(2) To CREATE or INSERT new values that are associated in each task to formulate the workflow and ease the use for each user.

## How it works
The Library Management System currently works as a basic Data Entry Module that creates and reads each data for transparency as per the requirements specified in the Project.txt given by our Professor.

# Setup
## Dependencies
**Database Used:** MySQL
**Database Dependencies:**
1. MySQL Server
1. MySQL connector for java
1. (OPTIONAL) MySQL Workbench

**Eclipse Dependecies:**
1. JDK 14
1. WindowsBuilder (Install this for frontend drag and drop plugin)

## Importing the dump files
After installing MySQL Server and have it up and running, import the dumpfiles in this repository. These dumpfiles serves as the main framework of the database that supports the whole system. It contains all the data entry modules we worked on for this System as well as the functionality for our Data INSERTION.
**To Import(Methods)**
1. Import by Folder:
    - you can set up each dumpfiles by importing the 11 data entry modules via whole folder path.
2. Import by one File on the folder after creating a schema called *Library*
    - you can set this up via import dump file if the folder import fails. Take any dump file then create a schema called *Library*. This should  enable you to import the rest of the fiels via folder import.

## Setting up Eclipse
1. Import the Library File and make sure that the jar file used for the SQL connection is working, you can test it so by including a main function within the connection.DBConnection file.
1. Change the credentials needed to be changed as stated in the documentation. After that test print it if there are some errors.
```TAKE NOTE: make sure that the dump files are imported and the jar file is in the Library folder. 
    You can confirm it by looking at your Buildpath. It should be in modulepath along with jre files.
``` 
1. After making sure that your SQL connection is all set up, make sure to install WindowsBuilder Plugin in eclipse. You can do so by looking at the start page then look for the the feature of Eclipse Marketplace. Search for the plugin called *Windows Builder* to traverse 
1. After installing Windows builder put a test run on the LibraryHome.java then run it. If it works then that means your installation was successful.
1. You can now work on Project Frontends on projects tab of this repository.


## Clone this Repository
To clone this repository,  use `git clone https://github.com/spitzc32/LibraryManagementSystem.git`

## How to Update/make changes on this Repository
to update or make changes on this reporsitory please follow the following instructions:
1. Make sure that before you do a certain work, always pull `git pull` do remember that our base branch is `main`
1. If you are finished with your changes please mind that you need to ask a merge request so do the following
``` git checkout -b branch
    git add <file you changed>
    git commit -m <message>
    git log // to check if you did not get another branch commit to keep track of your changes
    git push -u origin <branchname>
```
1. Do remember after doing these steps a merge request url will appear paste that in your browser then submit it
