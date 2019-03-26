# Basic Install
#-0----------------
#Jython 2.7.1 is distributed via an executable jar file installer. After downloading it, either double click the jython_installer-2.7.1.jar or run java with the -jar option

java -jar jython_installer-2.7.1.jar

#This will start the regular GUI installer on most systems, or a console installer on headless systems. To force the installer to work in headless mode invoke the installer as:

java -jar jython_installer-2.7.1.jar --console
#The installer will then walk through a similar set of steps in graphical or console mode: showing the license, selecting an install directory and JVM and actually copying Jython to the filesystem. After this completes, Jython is installed in the directory you selected. Executing a script in the install directory, jython on Unix-like systems or jython.exe on Windows, will start up the Jython console, which can be used to dynamically explore Jython and the Java runtime, or to run Jython scripts.

# see :
# https://wiki.python.org/jython/InstallationInstructions

# For download :
# https://www.jython.org/downloads.html