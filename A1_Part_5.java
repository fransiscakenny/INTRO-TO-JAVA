//Fransisca K Larasati
//BIT 115 - WINTER 2016
//Assignment 1, Part 5
import becker.robots.*;
/*
Starting Template: This file was created in order to provide you with a pre-made 'starter' program

1)  Make absolutely sure that your becker.jar file is in the list of jGRASP's custom classpaths:
You can check by clicking on the "Settings" menu, then clicking on the "PATH/CLASSPATH" menu option, 
then "Workspace", then the "CLASSPATHs" tab and then making sure that the becker.jar file is in the list.
If not, click "New" to add becker.jar to jGRASP

2)  Make sure that the name of the file is the same as the name of the class that holds main.
The name of the class is found betwen the words "class", and "extends".
For exmaple, the name of this class is "Starting_Template", and it's found in a file named 
"Starting_Template.java".  You can see the name of the file (in jGRASP) in the titlebar 
(at the very top of the window). You'll notice that the name of the file has ".java" on the end, 
yet the name of the class (here in the file) leaves the ".java" file extension off.

3)  Remember: Streets go left and right (West and East), while Avenues go up and down (North and South)
*/

public class A1_Part_5 extends Robot
{ 
   public A1_Part_5(City theCity, int street, int avenue, Direction aDirection)
   {  super(theCity, street, avenue, aDirection);
   }
      
   public void turnRight()
   { this.turnLeft();
     this.turnLeft();
     this.turnLeft();
   }
   
   public void move3()
   {  this.move();
      this.move();
      this.move();
   }
   public static void main(String[] args)
   {  City toronto = new City();
      A1_Part_5 Jo = new A1_Part_5(toronto, 1, 1, Direction.EAST); 
      // city, street, avenue, direction faced, number things in backpack   
      //new Thing(toronto, 3, 2); // <-- You can create Things following this format
      //new Wall(toronto, 3, 1, Direction.EAST); // <-- You can create Walls following this format    
      
      // To learn about the Robot class and its methods, you can access 
      // http://www.learningwithrobots.com/doc/
      // then select becker.robots from the upper lefthand column, then Robot from the lower lefthand column,
      // then scroll down in the righthand section to see the Robot Constructor and Method Summaries (e.g., move(),
      // turnLeft(), putThing(), pickThing(), frontIsClear(), etc.)
      
      // Remember: There is no turnRight() in the Robot class, so if you want Robot to turn right, use turnLeft() three times
      
      // You can change the code or add to code below as needed to build out your program
      
      //WEST WALLS
      new Wall(toronto,2,1,Direction.WEST);
      new Wall(toronto,3,1,Direction.WEST);
      //EAST WALLS
      new Wall(toronto,2,2,Direction.EAST);
      new Wall(toronto,3,2,Direction.EAST);
      //NORTH WALLS
      new Wall(toronto,2,1,Direction.NORTH);
      new Wall(toronto,2,2,Direction.NORTH);
      //SOUTH WALLS
      new Wall(toronto,3,1,Direction.SOUTH);
      new Wall(toronto,3,2,Direction.SOUTH);
      
      //the robot is driving past the NORTH WALLS
      Jo.move();
      Jo.move();
      
      //the robot is turning right to the EAST WALLS
      Jo.turnRight();
      
      //the robot is driving past the EAST WALLS
      Jo.move3();
      
      //the robot is turning right to the SOUTH WALLS
      Jo.turnRight();
      
      //the robot is driving past the SOUTH WALLS
      Jo.move3();
      
      //the robot is turning right to the WEST WALLS
      Jo.turnRight();
      
      //the robot is driving past the WEST WALLS
      Jo.move3();
      
      //the robot is going back to its initial position
      Jo.turnRight();
      Jo.move();
      
   } 
}