# Mars Rover KATA

###Origin
This is the same project done in Java and converted to Kotlin using IntelliJ

## The Exercise
A squad of robotic rovers is to be landed by NASA on a plateau on Mars. This plateau, which is curiously rectangular, must be navigated by the rovers so that their on-board cameras can get a
complete view of the surrounding terrain to send back to Earth.

A rover's position and location is represented by a combination of x and y co-ordinates and a letter representing one of the four cardinal compass points. The plateau is divided up into a grid to simplify navigation. An example position might be 0, 0, N, which means the rover is in the bottom left corner and facing North.

In order to control a rover, NASA sends a simple string of letters. The possible letters are 'L', 'R' and 'M'. 'L' and 'R' makes the rover spin 90 degrees left or right respectively, without moving from its current spot. 'M' means move forward one grid point, and maintains the same heading.

Assume that the square directly North from (x, y) is (x, y+1).

**INPUT:** The first line of input is the upper-right coordinates of the plateau, the lower-left coordinates are assumed to be 0,0. The rest of the input is information pertaining to the rovers that have been deployed. Each rover has two lines of input. The first line gives the rover's position, and the second line is a series of instructions telling the rover how to explore the plateau. The position is made up of two integers and a letter separated by spaces, corresponding to the x and y co-ordinates and the rover's orientation. Each rover will be finished sequentially, which means that the second rover won't start to move until the first one has finished moving.

**OUTPUT:** The output for each rover should be its final co-ordinates and heading.

## Prerequisites
You need java 8 and gradle version 4.4 or newer

## Installing
```
gradle clean jar
```

## Running
Run the application using gradle.

### run as an application
at the moment only via Intellij

### run as a service
at the moment only via Intellij

Start the service (make sure there is no service running on port 8080)

Call the service via command line with cURL
```
curl -X POST -F "file=@./src/test/resources/inputData/inputData.txt" http://localhost:8080/marsRoverService/move
```
``./src/test/resources/inputData/inputData.txt`` is the reference to the file used for testing. Change the parameter to your test file.

## About the code

`MarsRoverServiceApplication` is responsible for starting the service using spring boot.

The classes `MarsRoverApp` is responsible for executing the application and `MarsRoverController` is the *controller* when using the spring boot version, both handle the inputs and call ``MarsMissionExecution``.

``MarsMissionExecution`` receives the input to set up the ``Plateau`` adding the ``Rover`` into ``Position`` and move each rover. The return is a ``String`` with the position of each ``Rover``.
