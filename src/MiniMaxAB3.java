import java.util.LinkedList;
import java.util.Random;


public class MiniMaxAB3 {

    int board[][], size;

    public MiniMaxAB3(int[][] board, int size) {
        this.board = board;
        this.size = size;
    }

    boolean canMove() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    int evaluate() {
        for (int r = 0; r < size; r++) {
            if (board[r][0] == board[r][1] && board[r][1] == board[r][2]) {
                if (board[r][0] == 2) {
                    return +10;
                } else if (board[r][0] == 1) {
                    return -10;
                }
            }
        }

        for (int col = 0; col < size; col++) {
            if (board[0][col] == board[1][col] && board[1][col] == board[2][col]) {
                if (board[0][col] == 2) {
                    return +10;
                } else if (board[0][col] == 1) {
                    return -10;
                }
            }
        }

        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            if (board[0][0] == 2) {
                return +10;
            } else if (board[0][0] == 1) {
                return -10;
            }
        }

        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            if (board[0][2] == 2) {
                return +10;
            } else if (board[0][2] == 1) {
                return -10;
            }
        }

        return 0;
    }

    int minimax(int depth, Boolean isMax) {
        int score = evaluate();
        if (score == 10) {
            return score;
        }
        if (score == -10) {
            return score;
        }
        if (canMove() == false) {
            return 0;
        }
        if (isMax) {
            int best = -1000;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == 0) {
                        board[i][j] = 2;
                        best = Math.max(best, minimax(depth + 1, !isMax));
                        board[i][j] = 0;
                    }
                }
            }
            return best;
        } else {
            int best = 1000;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == 0) {
                        board[i][j] = 1;
                        best = Math.min(best, minimax(depth + 1, !isMax));
                        board[i][j] = 0;
                    }
                }
            }
            return best;
        }
    }

    int[] findBestMove() {
        int bestVal = -1000;
        int[] bestMove = new int[2];
        bestMove[0] = -1;
        bestMove[1] = -1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0) {
                    board[i][j] = 2;
                    int moveVal = minimax(0, false);
                    board[i][j] = 0;
                    if (moveVal > bestVal) {
                        bestMove[0] = i;
                        bestMove[1] = j;
                        bestVal = moveVal;
                    }
                }
            }
        }


        return bestMove;
    }
    
    
    public static void main(String[] args) {
        int board[][] = {
            {1, 0, 2, 1, 0},
            {1, 0, 0, 1, 2},
            {1, 0, 2, 0, 1},
            {0, 2, 0, 2, 2},
            {1, 0, 0, 1, 1}
            // for testing no choice: make 4, 2 = 1
            // for testing computer win: make 3, 2 = 1;
            // for testing safe of next-move-win: make previous two points = 0
            
        };
        /*
                {2, 1, 2, 0, 1}
                {2, 2, 0, 1, 0}, 
                {0, 0, 1, 0, 0}, 
                {0, 1, 0, 0, 0} 
                {0, 0, 0, 0, 0} 
        */
        int board2[][] = {
                {2, 2, 2, 0, 1},
                {2, 2, 1, 2, 1}, 
                {2, 2, 1, 2, 1}, 
                {0, 1, 0, 0, 0},
                {1, 0, 0, 0, 1} 
        };
        
        int [] bm = bestMoveIn5x5(board2);
        System.out.println(bm[0]);
        System.out.println(bm[1]);
        
    }
    
    static int[] bestMoveIn5x5(int [][] board){
        
//        System.out.println("Given board: ");
//        for(int i=0; i<5; i++){
//            for(int j=0; j<5; j++){
//                System.out.print(board[i][j]+" ");
//            }
//            System.out.println("");
//        }
        int noChoiceX = -1;
        int noChoiceY = -1;
        LinkedList<Integer> p1 = new LinkedList<Integer>();
        LinkedList<Integer> p2 = new LinkedList<Integer>();
        for(int r=0; r<3; r++){
            for(int c=0; c<3; c++){
                p1.add(r);
                p2.add(c);
            }
        }
        //System.out.println(p1);
        //System.out.println(p2);
        Random rand = new Random();
        while(p1.size()>0){
            int rx = rand.nextInt(p1.size());
            int r = p1.get(rx);
            int c = p2.get(rx);
            p1.remove(rx);
            p2.remove(rx);
            
            
            int ar[][] = new int[3][3];
            for(int i=r; i<r+3; i++){
                for(int j=c; j<c+3; j++){
                    ar[i-r][j-c] = board[i][j];
                }
            }

            MiniMaxAB3 ob = new MiniMaxAB3(ar, 3);
            int bestMove[] = ob.findBestMove();
            if(bestMove[0] == -1) continue;
            int x = bestMove[0] + r;
            int y = bestMove[1] + c;
            if(noChoiceX == -1){
                noChoiceX = x;
                noChoiceY = y;
            }
            //System.out.println(bestMove[0]);
            //System.out.println(bestMove[1]);
            board[x][y] = 2;
            //System.out.printf("Best Move: ROW-%d COL-%d\n",x, y);
            int w = Checker.whoWon(board);
            //System.out.println("Winner: "+w);
            //******* computer wins so it is the best move.
            if(w == 2) {
                board[x][y] = 0;
                return bm(x, y);
            }
            boolean ok = true;
            for(int i=0; i<board.length; i++){
                for(int j=0; j<board.length; j++){
                    if(board[i][j] == 0){
                        board[i][j] = 1;
                        int nw = Checker.whoWon(board);
                        //System.out.println("for "+i+", "+j+", winner = "+nw);
                        //****** opponnent can win in next move, not a good move.
                        if(nw == 1) {
                            ok = false;
                            board[i][j] = 0;
                            i = board.length;
                            break;
                        }
                        board[i][j] = 0;
                    }
                }
            }
            if(ok){
                //System.out.println("No problem, can take this move.");
                board[x][y] = 0;
                return bm(x, y);
            }
            else{
                //System.out.println("Risky move!");
            }
            board[x][y] = 0;

            //System.out.println("");
        }
        
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(board[i][j] == 0){
                    board[i][j] = 1;
                    int w = Checker.whoWon(board);
                    if(w == 2 || w == 1) {
                        board[i][j] = 0;
                        return bm(i,j);
                    }
                    board[i][j] = 0;
                }
            }
        }
        return bm(noChoiceX, noChoiceY);
    }
    
    private static int[] bm(int x, int y){
        int bm[] = new int[2];
        bm[0] = x;
        bm[1] = y;
        return bm;
    }

}
