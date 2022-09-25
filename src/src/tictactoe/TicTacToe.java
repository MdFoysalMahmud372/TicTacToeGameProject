package tictactoe;

//import java.util.*;

public class TicTacToe {

    public static void main(String[] args) {
        ComputerAI AI= new ComputerAI(); 
        Board b = new Board();

        b.displayBoard();

        System.out.println("Who will make the first move? \nChoose (1) for Computer or Choose (2) for User: ");
        int choice = b.scan.nextInt();
        if(choice == 1){
            AI.callMinimax(0, 1, b, 4); 
            
	  for (PointsAndScores pas : AI.rootsChildrenScores) {
       System.out.println("Point: " + pas.point + " Score: " + pas.score);
   }
            b.placeAMove(AI.returnBestMove(), 1); 
            b.displayBoard();
        }
        
        while (!b.isGameOver()) {
            System.out.println("Your move: row (1, 2, 3, 4 or 5) and column (1, 2, 3, 4 or 5)");
            Point userMove = new Point(b.scan.nextInt()-1, b.scan.nextInt()-1);
	    while (b.getState(userMove)!=0) {
	    	System.out.println("Invalid move. Make your move again: ");
	    	userMove.x=b.scan.nextInt()-1;
	    	userMove.y=b.scan.nextInt()-1;
	    }
	    b.placeAMove(userMove, 2);  
            b.displayBoard();
            
            if (b.isGameOver()) {
                break;
            } 
            
            AI.callMinimax(0, 1, b, 4);  
        for (PointsAndScores pas : AI.rootsChildrenScores) {
               System.out.println("Point: " + pas.point + " Score: " + pas.score);
           }   
            b.placeAMove(AI.returnBestMove(), 1); 
            b.displayBoard();
        }
        if (b.hasXWon()) {
            System.out.println("You lost!   :D ");
        } else if (b.hasOWon()) {
            System.out.println("You win!   :( ");
        } else {
            System.out.println("It's a draw! :P ");
        }
    }    
}


/*  
r/c   1 2 3 4 5

1     * * * * *

2     * * * * *

3     * * * * *       5 X 5 tic tac toe grid

4     * * * * *

5     * * * * *



*/