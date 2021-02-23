public class SnakeandLadder {
    public static final int Ladder = 1;
    public static final int Snake = 2;
    
 public int chance(int Playerposition) {
   int Option = (int) Math.floor((Math.random() * 10) % 3);
   int dies = (int) Math.floor(((Math.random() * 10) % 6) + 1);
        
    switch (Option) {
        case Ladder:
            Playerposition += dies ;
            break;
        
        case Snake:
            Playerposition -= dies ;
            if (Playerposition < 0) {
                Playerposition = 0;
            }
            break;
                    
        default:
            Playerposition = Playerposition;
    }
    if (Playerposition > 100) {
          Playerposition -= dies;
    }
    if(Option == Ladder) {
        return chance(Playerposition);
    }
    else {
           return Playerposition;
    }
 }
 public static void main(String[] args){
    int Player1 = 0;
    int Player2 = 0;
    SnakeandLadder obj = new SnakeandLadder();
    while(Player1 != 100 && Player2 != 100) {
        Player1 = obj.chance(Player1);
        System.out.println("Player1 position : " +Player1);
        Player2 = obj.chance(Player2);
        System.out.println("Player2 position : " +Player2);
    }
    if(Player1 == 100) {
        System.out.println("Player1 exist : " +Player1);
        System.out.println("Player1 won");
    }
    else if(Player2 == 100) {
        System.out.println("Player2 exist : " +Player2);
        System.out.println("Player2 won");
    }
 } 
}
