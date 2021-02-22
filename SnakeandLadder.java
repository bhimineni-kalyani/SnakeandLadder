public class SnakeandLadder {
 public static void main(String[] args) {
     int Startposition = 0 ;
     int dies = (int) Math.floor(((Math.random() * 10) % 6) + 1);
     System.out.println("Playerposition : " +Startposition);
     System.out.println("Number of dies are : " +dies); 
  } 
} 
