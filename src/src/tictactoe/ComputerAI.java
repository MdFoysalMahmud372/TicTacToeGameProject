package tictactoe;

import java.util.*;

class ComputerAI {

   
    List<PointsAndScores> rootsChildrenScores;
    
    public ComputerAI() {
    }

    public Point returnBestMove() {
        int MAX = -100000;
        int best = -1;

        for (int i = 0; i < rootsChildrenScores.size(); ++i) {
            if (MAX < rootsChildrenScores.get(i).score) {
                MAX = rootsChildrenScores.get(i).score;
                best = i;
            }
        }
        return rootsChildrenScores.get(best).point;
    }

    public int returnMin(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i) < min) {
                min = list.get(i);
                index = i;
            }
        }
        return list.get(index);
    }

    public int returnMax(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i) > max) {
                max = list.get(i);
                index = i;
            }
        }
        return list.get(index);
    }

    public void callMinimax(int depth, int turn, Board b, int depthLimit) {
        rootsChildrenScores = new ArrayList<>();
        minimax(depth, turn, b, depthLimit);
    }

    public int heuristicsCalculation(Board b) {
        int heuristicValue = 0;

        for (int i = 0; i < 5; ++i) {
            int rowNumberOfX = 0;
            int rowNumberOfO = 0;
            int colNumberOfX = 0;
            int colNumberOfO = 0;
            int diaNumberOfX = 0;


            for (int j = 0; j < 5; ++j) {

                if (b.board[j][i] == 1) {  
                    ++rowNumberOfX;
                }
                if (b.board[j][i] == 2) {  
                    ++rowNumberOfO;
                }

                if (b.board[i][j] == 1) {
                    ++colNumberOfX;
                }
                if (b.board[i][j] == 2) {
                    ++colNumberOfO;
                }

              
                if ((rowNumberOfO > 0 && rowNumberOfX > 0) || (colNumberOfO > 0 && colNumberOfX > 0)) {
                    break;
                } else {  
                    
                    heuristicValue += Math.pow(10, rowNumberOfX) - Math.pow(10, rowNumberOfO);
                    heuristicValue += Math.pow(10, colNumberOfX) - Math.pow(10, colNumberOfO);
                }

            }

            if (b.board[i][i] == 1) {
                heuristicValue += diaNumberOfX;
            }
            if (b.board[4 - i][4 - i] == 1) {
                heuristicValue += diaNumberOfX;
            }

            if ((rowNumberOfO == 3 && rowNumberOfX == 1) || (colNumberOfO == 3 && colNumberOfX == 1)) {
                heuristicValue = 1500;
            }

        }

        if (b.hasXWon()) {
            heuristicValue = 10000;  
        }

        return heuristicValue;
    }

    public int minimax(int depth, int turn, Board b, int depthLimit) {   

        if (b.hasXWon()) {
            return 1;
        }
        if (b.hasOWon()) {
            return -1;
        }
        List<Point> pointsAvailable = b.getAvailablePoints();
        if (pointsAvailable.isEmpty()) {
            return 0;
        }
        if (depth == depthLimit) {
            return heuristicsCalculation(b);
        }

        List<Integer> scores = new ArrayList<>();

        for (int i = 0; i < pointsAvailable.size(); ++i) {
            Point point = pointsAvailable.get(i);

            if (turn == 1) {
                b.placeAMove(point, 1);
                int currentScore = minimax(depth + 1, 2, b, depthLimit);
                scores.add(currentScore);
                if (depth == 0) {
                    rootsChildrenScores.add(new PointsAndScores(currentScore, point));
                }

            } else if (turn == 2) {
                b.placeAMove(point, 2);
                scores.add(minimax(depth + 1, 1, b, depthLimit));
            }
            b.placeAMove(point, 0);
        }
        return turn == 1 ? returnMax(scores) : returnMin(scores);
    }
}
