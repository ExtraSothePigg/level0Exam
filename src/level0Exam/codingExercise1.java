package level0Exam;

import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class codingExercise1 {

    public static void main(String[] args) {
    	Robot rbt = new Robot();
    	 rbt.penDown();
    	  rbt.setPenWidth(10);
    	    rbt.setSpeed(10);
   	 // 3. ask the user what color they would like the Robot to draw
    String color = JOptionPane.showInputDialog("What color do you want the square to be?");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
    if(color.equals("red")){
    	rbt.setPenColor(255,0,0);
    	 for(int i = 0; i < 4; i++){
    	    	rbt.move(100);
    	    	rbt.turn(90);
    	    }
    }
    else if(color.equals("blue")){
    	rbt.setPenColor(0,0,255);
    	 for(int i = 0; i < 4; i++){
    	    	rbt.move(100);
    	    	rbt.turn(90);
    	    }
    }else if(color.equals("black")){
    	rbt.setPenColor(0,0,0);
    	 for(int i = 0; i < 4; i++){
    	    	rbt.move(100);
    	    	rbt.turn(90);
    	    }
    }else{
    	JOptionPane.showMessageDialog(null, "That is ever-so-clearly not a color that exists in this world. Only red, blue, and black.");
    }
   	 // 2. set the pen width to 10
  
   	 // 1. make the Robot draw a shape
   
   
    
   }
}
