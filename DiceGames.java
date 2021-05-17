import java.util.*;
import java.lang.*;
import java.io.*;

/* 

Dice game
2 players with 3 dices each
they roll all 3 at the same time
the one who scores mores gets 1 point
the one who reaches 100 the first wins the game

*/
class Codechef
{
public static void main (String[] args) throws java.lang.Exception
{
// your code goes here

    Player p1 = new Player();
    Player p2 = new Player();
   
    do{
    if( p1.plays() > p2.plays()){
        p1.totalScore++;
    }else{
        p2.totalScore++;
    }
    }while(p1.totalScore!=100 || p2.totalScore!=100);
     
     if(p1.totalScore ==100){
         System.out.println("P1 won - total score is " + p1.totalScore);
     }else{
         System.out.println("P2 won - total score is " + p2.totalScore);
     }

}

public static class Die{
   int value;
   
public void roll(){
   this.value = (int)(Math.random()*6 +1);
}

public int getValue(){
   return this.value;
}
}

public static class Player{

   int totalScore;
   Die die[] = {new Die(), new Die(), new Die()};
   
   public int plays(){
       
       die[0].roll();
       die[1].roll();
       die[2].roll();
       
       return die[0].getValue()+ die[1].getValue() + die[2].getValue();
   }
}
}
