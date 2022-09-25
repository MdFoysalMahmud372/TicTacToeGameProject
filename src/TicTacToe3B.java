
import java.awt.Color;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.JOptionPane;




public class TicTacToe3B extends javax.swing.JFrame {
    
    boolean computer = false;
    boolean computersMove = false;
    int difficulty;
    LinkedList<Integer> moves = new LinkedList<Integer>();

    int board[][] = {
        {0,0,0},
        {0,0,0},
        {0,0,0}
    };
    
    public TicTacToe3B(int dif){
        computer = true;
        difficulty = dif;
        initComponents();
        String T = "<html>"
                + "<font color='#f07056'>Tic </font>"
                + "<font color='#70c257'>Tac </font>"
                + "<font color='#7457c2'>Toe </font>"
                + "</html>";
        title.setText(T);
        T = "<html>"
            + "<font color='#7457c2'>Player 1 - O</font>"
            + "<font color='#70c257'> | </font>"
            + "<font color='#f07056'>Player 2 - X</font>"
            + "</html>";
        des.setText(T);
        
        for(int i=1; i<10; i++){
            moves.add(i);
        }
        
        loadBoard();
        
        Random r = new Random();
        currentPlayer = r.nextInt(2)+1;
        if(currentPlayer == 2) {
            makeMoveOfComputer();
        }
    }
    
    public TicTacToe3B() {
        initComponents();
        for(int i=1; i<10; i++){
            moves.add(i);
        }
        String T = "<html>"
                + "<font color='#f07056'>Tic </font>"
                + "<font color='#70c257'>Tac </font>"
                + "<font color='#7457c2'>Toe </font>"
                + "</html>";
        title.setText(T);
        T = "<html>"
            + "<font color='#7457c2'>Player 1 - O</font>"
            + "<font color='#70c257'> | </font>"
            + "<font color='#f07056'>Player 2 - X</font>"
            + "</html>";
        des.setText(T);
        
        loadBoard();
        
        Random r = new Random();
        currentPlayer = r.nextInt(2)+1;
        System.out.println(currentPlayer);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        bg = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        des = new javax.swing.JLabel();
        move = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();

        jButton7.setBackground(new java.awt.Color(51, 102, 0));
        jButton7.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Hard");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(720, 720));

        title.setFont(new java.awt.Font("High Tower Text", 1, 36)); // NOI18N
        title.setText("Tic Tac Toe");
        title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titleMouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Felix Titling", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("x");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        des.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        des.setText("Player 1 - O | Player 2 - X");

        move.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        move.setText("Player x Move...");

        b1.setBackground(new java.awt.Color(51, 51, 51));
        b1.setFont(new java.awt.Font("Comic Sans MS", 1, 56)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.setText("O");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(51, 51, 51));
        b2.setFont(new java.awt.Font("Comic Sans MS", 1, 56)); // NOI18N
        b2.setForeground(new java.awt.Color(255, 255, 255));
        b2.setText("O");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(51, 51, 51));
        b3.setFont(new java.awt.Font("Comic Sans MS", 1, 56)); // NOI18N
        b3.setForeground(new java.awt.Color(255, 255, 255));
        b3.setText("O");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(51, 51, 51));
        b4.setFont(new java.awt.Font("Comic Sans MS", 1, 56)); // NOI18N
        b4.setForeground(new java.awt.Color(255, 255, 255));
        b4.setText("O");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(51, 51, 51));
        b5.setFont(new java.awt.Font("Comic Sans MS", 1, 56)); // NOI18N
        b5.setForeground(new java.awt.Color(255, 255, 255));
        b5.setText("O");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(51, 51, 51));
        b6.setFont(new java.awt.Font("Comic Sans MS", 1, 56)); // NOI18N
        b6.setForeground(new java.awt.Color(255, 255, 255));
        b6.setText("O");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(51, 51, 51));
        b7.setFont(new java.awt.Font("Comic Sans MS", 1, 56)); // NOI18N
        b7.setForeground(new java.awt.Color(255, 255, 255));
        b7.setText("O");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(51, 51, 51));
        b8.setFont(new java.awt.Font("Comic Sans MS", 1, 56)); // NOI18N
        b8.setForeground(new java.awt.Color(255, 255, 255));
        b8.setText("O");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(51, 51, 51));
        b9.setFont(new java.awt.Font("Comic Sans MS", 1, 56)); // NOI18N
        b9.setForeground(new java.awt.Color(255, 255, 255));
        b9.setText("O");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(des)
                        .addGap(105, 105, 105)
                        .addComponent(move))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(des)
                    .addComponent(move))
                .addGap(161, 161, 161)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(185, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void titleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_titleMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        new Game().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        makeMove(1);
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        makeMove(2);
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        makeMove(3);
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        makeMove(4);
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        makeMove(5);
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        makeMove(6);
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        makeMove(7);
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        makeMove(8);
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        makeMove(9);
    }//GEN-LAST:event_b9ActionPerformed

    int currentPlayer = 0;
    private void makeMove(int button){
        if(done) return;
        //System.out.println("new move: "+button);
        Object m = button;
        moves.remove(m);
        //System.out.println(moves);
        int x=(int)m-1;
        int i=x/3;
        int j=x%3;
                    board[i][j] = currentPlayer;
                    if(currentPlayer == 1) 
                        currentPlayer = 2;
                    else currentPlayer = 1;
                    loadBoard();
                    winCheck();
                    if(computer && currentPlayer == 2 && !done){
                        makeMoveOfComputer();
                    }
                    return;
    }
    
    boolean done = false;
    private void winCheck(){
        if(done) return;
        int status = Checker.whoWon(board);
        if(status == -1){
            JOptionPane.showMessageDialog(this, "Its a draw!");
            done = true;
            setVisible(false);
            new Game().setVisible(true);
            return;
        }
        if(status != 0){
            JOptionPane.showMessageDialog(this, "Player "+status+" has won!");
            if(computer){
                if(status == 2)
                    WinHistory.computer++;
                else WinHistory.player++;
            }
            else{
                if(status == 2)
                    WinHistory.player2++;
                else WinHistory.player1++;
            }
            done = true;
            setVisible(false);
            new Game().setVisible(true);
            return;
        }
    }
    
    int dif = 1;
    int bs = 3;
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe3B().setVisible(true);
            }
        });
    }
    
    private void loadBoard(){
        
        if(done) return;
        
        if(currentPlayer == 1){
            move.setText("Player 1 Move...");
        }
        else {
            move.setText("Player 2 Move...");
        }
        
        switch (board[0][0]) {
            case 2:
                b1.setText("X");
                b1.setBackground(Color.decode("#f07056"));
                break;
            case 1:
                b1.setText("O");
                b1.setBackground(Color.decode("#7457c2"));
                break;
            default:
                b1.setText("");
                break;
        }
        
        switch (board[0][1]) {
            case 2:
                b2.setText("X");
                b2.setBackground(Color.decode("#f07056"));
                break;
            case 1:
                b2.setText("O");
                b2.setBackground(Color.decode("#7457c2"));
                break;
            default:
                b2.setText("");
                break;
        }
        
        switch (board[0][2]) {
            case 2:
                b3.setText("X");
                b3.setBackground(Color.decode("#f07056"));
                break;
            case 1:
                b3.setText("O");
                b3.setBackground(Color.decode("#7457c2"));
                break;
            default:
                b3.setText("");
                break;
        }
        
        switch (board[1][0]) {
            case 2:
                b4.setText("X");
                b4.setBackground(Color.decode("#f07056"));
                break;
            case 1:
                b4.setText("O");
                b4.setBackground(Color.decode("#7457c2"));
                break;
            default:
                b4.setText("");
                break;
        }
        
        switch (board[1][1]) {
            case 2:
                b5.setText("X");
                b5.setBackground(Color.decode("#f07056"));
                break;
            case 1:
                b5.setText("O");
                b5.setBackground(Color.decode("#7457c2"));
                break;
            default:
                b5.setText("");
                break;
        }
        
        switch (board[1][2]) {
            case 2:
                b6.setText("X");
                b6.setBackground(Color.decode("#f07056"));
                break;
            case 1:
                b6.setText("O");
                b6.setBackground(Color.decode("#7457c2"));
                break;
            default:
                b6.setText("");
                break;
        }
        
        switch (board[2][0]) {
            case 2:
                b7.setText("X");
                b7.setBackground(Color.decode("#f07056"));
                break;
            case 1:
                b7.setText("O");
                b7.setBackground(Color.decode("#7457c2"));
                break;
            default:
                b7.setText("");
                break;
        }
        
        switch (board[2][1]) {
            case 2:
                b8.setText("X");
                b8.setBackground(Color.decode("#f07056"));
                break;
            case 1:
                b8.setText("O");
                b8.setBackground(Color.decode("#7457c2"));
                break;
            default:
                b8.setText("");
                break;
        }
        
        switch (board[2][2]) {
            case 2:
                b9.setText("X");
                b9.setBackground(Color.decode("#f07056"));
                break;
            case 1:
                b9.setText("O");
                b9.setBackground(Color.decode("#7457c2"));
                break;
            default:
                b9.setText("");
                break;
        }
        
        
    }
    
    
    private void makeMoveOfComputer() {
        if(moves.size() == 0 || done) {
            winCheck();
            return;
        }
        
        MiniMaxAB3 AI = new MiniMaxAB3(board, 3);
        int pos[] = AI.findBestMove();
        int bestMove = pos[0]*3 + pos[1] + 1;
        
        Random r = new Random();
        int randomMove = moves.get(r.nextInt(moves.size()));
        
        if(difficulty == 3){
            makeMove(bestMove);
        }
        else if(difficulty == 2){
            if(r.nextInt(100)<60){
                makeMove(bestMove);
            }
            else makeMove(randomMove);
        }
        else {
            if(r.nextInt(100)<25){
                makeMove(bestMove);
            }
            else makeMove(randomMove);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel des;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel move;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables


}
