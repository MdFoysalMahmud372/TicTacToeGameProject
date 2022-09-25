public class Checker {
    
    static int whoWon(int B[][]){
        if(checkRows(B) > 0) return checkRows(B);
        if(checkCols(B) > 0) return checkCols(B);
        if(checkDiagonal(B) > 0) return checkDiagonal(B);
        
        int filled = 0;
        for(int i=0; i<B.length; i++){
            for(int j=0; j<B.length; j++){
                if(B[i][j] > 0){
                    filled++;
                }
            }
        }
        if(filled == B.length * B.length) return -1;
        return 0;
    }
    
    private static int checkRows(int [][] B){
        for(int i=0; i<B.length; i++){
            boolean all1 = true;
            boolean all2 = true;
            for(int j=0; j<B.length; j++){
                if(B[i][j] != 1) all1 = false;
                if(B[i][j] != 2) all2 = false;
            }
            if(all1) return 1;
            if(all2) return 2;
        }
        return 0;
    }
    
    private static int checkCols(int [][] B){
        for(int i=0; i<B.length; i++){
            boolean all1 = true;
            boolean all2 = true;
            for(int j=0; j<B.length; j++){
                if(B[j][i] != 1) all1 = false;
                if(B[j][i] != 2) all2 = false;
            }
            if(all1) return 1;
            if(all2) return 2;
        }
        return 0;
    }
    
    private static int checkDiagonal(int [][] B){
        boolean all1 = true;
        boolean all2 = true;
        for(int i=0; i<B.length; i++){
           if(B[i][i] != 1) all1 = false;
           if(B[i][i] != 2) all2 = false;
        }
        if(all1) return 1;
        if(all2) return 2;
        
        
        all1 = true;
        all2 = true;
        for(int i=0, j=B.length-1; i<B.length && j>=0; i++, j--){
           if(B[i][j] != 1) all1 = false;
           if(B[i][j] != 2) all2 = false;
        }
        if(all1) return 1;
        if(all2) return 2;
        
        
        return 0;
    }
    
}
