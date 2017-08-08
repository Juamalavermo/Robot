package becker;

import becker.robots.*;

public class DeliverParcel
{
   public static void main(String[] args)
   {  
     // Set up the initial situation
      City prague = new City();
       for (int i = 1; i < 6; i++) {
           for (int j = 2; j < 5; j++) {
               if (i!=3 || j!=3) {
                   if (i!=2 || j!=3) {
                       if (i!=4 || j!=3) {
                            Thing t1 = new Thing(prague, i, j); 
                       }  
                   }
               }
           }
         }
       for (int i = 1; i < 6; i++) {
           for (int j = 5; j < 8; j++) {
               if (i!=2 || j!=7) {
                   if (i!=4 || j!=5) {
                       if (i!=2 || j!=6) {
                           if (i!=4 || j!=6) {
                                Thing t1 = new Thing(prague, i, j);  
                           }
                       }
  
                   }
               }
           }
         }
       
       for (int i = 1; i < 6; i++) {
           for (int j = 8; j < 11; j++) {
               if (i!=2 || j!=9) {
                   if (i!=3 || j!=9) {
                       if (i!=4 || j!=9) {
                            Thing t1 = new Thing(prague, i, j); 
                       }  
                   }
               }
           }
         }
      //Thing t1 = new Thing(prague, 1, 2);
      //Thing t2 = new Thing(prague, 2, 2);
      //Thing t3 = new Thing(prague, 2, 3);
      //Thing t4 = new Thing(prague, 2, 4);
      //Thing t5 = new Thing(prague, 1, 2);
      //Thing t6 = new Thing(prague, 2, 2);
      //Thing t7 = new Thing(prague, 1, 3);
      //Thing t8 = new Thing(prague, 3, 4);
      //Thing t9 = new Thing(prague, 3, 3);
      Robot karel = new Robot(prague, 1, 0, Direction.EAST,20);
      Wall P1 = new Wall(prague, 1, 2, Direction.WEST);
      // Direct the robot to the final situation
      //Si puedo tomar cosa
      //karel.canPickThing();
      //Coja algo
      //karel.pickThing();
      //ponga una
      //karel.putThing();
      //Moverse
      //karel.move();
      //karel.turnLeft();
      //karel.frontIsClear();
      
      karel.move();
      karel.move();
      karel.pickThing();
      karel.move();
      karel.turnLeft();	// start turning right as three turn lefts
      karel.turnLeft();
      karel.turnLeft();	// finished turning right
      karel.move();
     // karel.putThing();
      karel.move();
      System.out.println(karel.countThingsInBackpack());
   }
}
