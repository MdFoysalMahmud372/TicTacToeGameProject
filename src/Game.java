import java.awt.Color;
import javax.swing.JOptionPane;


public class Game extends javax.swing.JFrame {

    public Game() {
        initComponents();
        String T = "<html>"
                + "<font color='#f07056'>Tic </font>"
                + "<font color='#70c257'>Tac </font>"
                + "<font color='#7457c2'>Toe </font>"
                + "</html>";
        title.setText(T);
        de.setBackground(Color.decode("#336600"));
        dm.setBackground(Color.decode("#666666"));
        dh.setBackground(Color.decode("#666666"));
        
        String w = "";
        w += "<html><font color='#990099'>(Multiplayer)</font><br>Player 1: "+WinHistory.player1;
        w += "<br>Player 2: "+WinHistory.player2;
        w += "<br><br><font color='#006633'>(Against computer)</font><br>Player: "+WinHistory.player;
        w += "<br>Computer: "+WinHistory.computer+"</html>";
        wb.setText(w);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        title1 = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        bs5 = new javax.swing.JButton();
        bs3 = new javax.swing.JButton();
        dh = new javax.swing.JButton();
        dm = new javax.swing.JButton();
        de = new javax.swing.JButton();
        wb = new javax.swing.JLabel();

        jButton7.setBackground(new java.awt.Color(51, 102, 0));
        jButton7.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Hard");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(720, 720));

        title.setFont(new java.awt.Font("High Tower Text", 1, 36)); // NOI18N
        title.setText("Tic Tac Toe");
        title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titleMouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 51));
        jButton1.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Play Against Computer");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 0, 153));
        jButton2.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Multiplayer (2v2)");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(51, 51, 51));
        exit.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("Exit");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        title1.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        title1.setForeground(new java.awt.Color(51, 51, 51));
        title1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        title1.setText("Board size");
        title1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                title1MouseClicked(evt);
            }
        });

        title2.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        title2.setForeground(new java.awt.Color(51, 51, 51));
        title2.setText("Difficulty");
        title2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                title2MouseClicked(evt);
            }
        });

        bs5.setBackground(new java.awt.Color(102, 102, 102));
        bs5.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        bs5.setForeground(new java.awt.Color(255, 255, 255));
        bs5.setText("5 x 5");
        bs5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bs5ActionPerformed(evt);
            }
        });

        bs3.setBackground(new java.awt.Color(51, 102, 0));
        bs3.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        bs3.setForeground(new java.awt.Color(255, 255, 255));
        bs3.setText("3 x 3");
        bs3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bs3ActionPerformed(evt);
            }
        });

        dh.setBackground(new java.awt.Color(51, 102, 0));
        dh.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        dh.setForeground(new java.awt.Color(255, 255, 255));
        dh.setText("Hard");
        dh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dhActionPerformed(evt);
            }
        });

        dm.setBackground(new java.awt.Color(51, 102, 0));
        dm.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        dm.setForeground(new java.awt.Color(255, 255, 255));
        dm.setText("Medium");
        dm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dmActionPerformed(evt);
            }
        });

        de.setBackground(new java.awt.Color(51, 102, 0));
        de.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        de.setForeground(new java.awt.Color(255, 255, 255));
        de.setText("Easy");
        de.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deActionPerformed(evt);
            }
        });

        wb.setFont(new java.awt.Font("Lucida Fax", 1, 16)); // NOI18N
        wb.setForeground(new java.awt.Color(102, 102, 102));
        wb.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        wb.setText("abc");
        wb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                wbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                wbMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bs3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bs5)
                .addGap(165, 165, 165))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(111, 111, 111)
                            .addComponent(wb, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exit))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(111, 111, 111)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(title2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(de)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dh))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bs3)
                    .addComponent(bs5)
                    .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dh)
                    .addComponent(dm)
                    .addComponent(de)
                    .addComponent(title2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exit)
                    .addComponent(wb, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
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
        title.setForeground(Color.BLACK);
    }//GEN-LAST:event_titleMouseClicked

    private void title1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_title1MouseClicked
        title1.setForeground(Color.BLACK);
    }//GEN-LAST:event_title1MouseClicked

    private void title2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_title2MouseClicked
        title2.setForeground(Color.BLACK);
    }//GEN-LAST:event_title2MouseClicked

    private void bs3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bs3ActionPerformed
        bs3.setBackground(Color.decode("#336600"));
        bs5.setBackground(Color.decode("#666666"));
        bs = 3;
    }//GEN-LAST:event_bs3ActionPerformed

    private void bs5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bs5ActionPerformed
        bs5.setBackground(Color.decode("#336600"));
        bs3.setBackground(Color.decode("#666666"));
        bs = 5;
    }//GEN-LAST:event_bs5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        startGameComputer();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        startGame();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void deActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deActionPerformed
        de.setBackground(Color.decode("#336600"));
        dm.setBackground(Color.decode("#666666"));
        dh.setBackground(Color.decode("#666666"));
        dif = 1;
    }//GEN-LAST:event_deActionPerformed

    private void dmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dmActionPerformed
        de.setBackground(Color.decode("#666666"));
        dm.setBackground(Color.decode("#336600"));
        dh.setBackground(Color.decode("#666666"));
        dif = 2;
    }//GEN-LAST:event_dmActionPerformed

    private void dhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dhActionPerformed
        de.setBackground(Color.decode("#666666"));
        dm.setBackground(Color.decode("#666666"));
        dh.setBackground(Color.decode("#336600"));
        dif = 3;
    }//GEN-LAST:event_dhActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setBackground(Color.RED);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setBackground(Color.decode("#333333"));
    }//GEN-LAST:event_exitMouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBackground(Color.RED);
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(Color.decode("#990099"));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(Color.RED);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(Color.decode("#006633"));
    }//GEN-LAST:event_jButton1MouseExited

    private void wbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wbMouseEntered
        wb.setForeground(Color.decode("#aa0000"));
    }//GEN-LAST:event_wbMouseEntered

    private void wbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wbMouseExited
        wb.setForeground(Color.decode("#666666"));
    }//GEN-LAST:event_wbMouseExited

    
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
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bs3;
    private javax.swing.JButton bs5;
    private javax.swing.JButton de;
    private javax.swing.JButton dh;
    private javax.swing.JButton dm;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel wb;
    // End of variables declaration//GEN-END:variables

    private void startGame() {
        setVisible(false);
        if(bs == 3)
            new TicTacToe3B().setVisible(true);
            else new TicTacToe5B().setVisible(true);
            
    }

    private void startGameComputer() {
        if(bs == 3){
         setVisible(false);
          new TicTacToe3B(dif).setVisible(true);
        }
    
        
      setVisible(false);
      if(bs == 3)
       new TicTacToe3B(dif).setVisible(true);    
   else new TicTacToe5BComputer(dif).setVisible(true);
    }
}
