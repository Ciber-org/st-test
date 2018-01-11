# Introduction

How to build with STS (Eclipse). 

## Install Java JDK

Install a Java Development Kit for either Java 8 or Java 9.

## Install Spring Tools Suite (STS)

STS is Pivotal's version of Eclipse which includes all the
main plugins and such which makes developing Spring Apps
very easy. 

Download the bundle from `https://spring.io/tools`

Unzip the tools so you have it in `C:\sts\`. I.e. you should
find the exe as `C:\sts\sts-bundle\sts-3.9.0.RELEASE\STS.exe`.

## Install Gradle

Install the lastest version of gradle in `C:\Gradle`. I.e.
you should find the start up bat file in 
`C:\Gradle\gradle-4.4.1\bin\gradle.bat`.


## Install Git for Windows

From `https://git-scm.com/downloads`

Just run the installer. No manual steps needed.


## Start STS (Eclipse) and create new Workspace

Start `sts` from the Windows menu.

When STS starts, create a new Workspace somewhere on your system.
(e.g. `c:\users\bob\documents\eclipseworkspace`)

## Check out code with git

Start `git-bash` from the start menu.

Change directory (`cd`) into the workspace location. 
(e.g. `cd c:\users\bob\documents\eclipseworkspace`)

Next type `get clone git@gitlab.com:markphahn/st-test-01.git`.

## Import project into STS

In STS, from the `File` menu choose:

`File` -> `Import . . . `

Then choose:

`Gradle` -> `Existing Gradle Project`

Click on `Next` until you have to enter the root directory which 
will be named `st-test-01` in your eclipse workspace directory.

Click on `Next` or `Finish` until the project is imported.

## Refresh the project with gradle.

For the parinoid.

The project should now show in the left hand pane. Right click on it
and choose `Gradle` -> `Refresh Gradle Project`.

The reallly parinoid will exit STS at this point a restart.

## Start the project with the Boot Dashboard in STS

Choose `Window` -> `Show View` -> `Other`

Choose `Spring` -> `Boot Dashboard`

In the `Boot Dashboard` window click on your project then press
the `(Re)Start` button. (it's the red square with the green triangle
in the bottom right.)

## Browse localhost:8080 test

The server should be running and listening for requests
on port 8080. 

Browse `http://localhost:8080` and you should get a json response of
a greeting object.
