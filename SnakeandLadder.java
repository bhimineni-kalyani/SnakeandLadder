public class SnakeandLadder {
    public static final int Snake = 1;
    public static final int Ladder = 2;
    
 public static void main(String args[]) {
    int Playerposition = 10;
    int Option = (int) Math.floor((Math.random() * 10) % 3);
    int dies = (int) Math.floor(((Math.random() * 10) % 6) + 1);
    System.out.println("Playerposition : " +Playerposition);
    
    switch (Option) {
        case Ladder:
            System.out.println("Number of dies are : " +dies); 
            Playerposition += dies ;
            System.out.println("Ladder,player moves ahead by the number of position : " +Playerposition);
            break;
        
        case Snake:
            System.out.println("Number of dies are : " +dies); 
            Playerposition -= dies ;
            System.out.println("Snake,player moves behind by the number of position : " +Playerposition);
            break;
                    
        default:
            Playerposition = Playerposition;
            System.out.println("No play,player stays in the same position : " +Playerposition);
    }
 }
}
