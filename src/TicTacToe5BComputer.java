
import java.awt.Color;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.JOptionPane;




public class TicTacToe5BComputer extends javax.swing.JFrame {
    
    int currentPlayer = 0;
    int difficulty;
    LinkedList<Integer> moves = new LinkedList<Integer>();

    int board[][] = {
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0}
    };
    
    public TicTacToe5BComputer(int dif){
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
        
        for(int i=1; i<26; i++){
            moves.add(i);
        }
        
        loadBoard();
        Random r = new Random();
        currentPlayer = r.nextInt(2)+1;
        move();
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
        b10 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        b17 = new javax.swing.JButton();
        b18 = new javax.swing.JButton();
        b19 = new javax.swing.JButton();
        b20 = new javax.swing.JButton();
        b21 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        b23 = new javax.swing.JButton();
        b24 = new javax.swing.JButton();
        b25 = new javax.swing.JButton();

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

        b10.setBackground(new java.awt.Color(51, 51, 51));
        b10.setFont(new java.awt.Font("Comic Sans MS", 1, 56)); // NOI18N
        b10.setForeground(new java.awt.Color(255, 255, 255));
        b10.setText("O");
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });

        b11.setBackground(new java.awt.Color(51, 51, 51));
        b11.setFont(new java.awt.Font("Comic Sans MS", 1, 56)); // NOI18N
        b11.setForeground(new java.awt.Color(255, 255, 255));
        b11.setText("O");
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });

        b12.setBackground(new java.awt.Color(51, 51, 51));
        b12.setFont(new java.awt.Font("Comic Sans MS", 1, 56)); // NOI18N
        b12.setForeground(new java.awt.Color(255, 255, 255));
        b12.setText("O");
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });

        b13.setBackground(new java.awt.Color(51, 51, 51));
        b13.setFont(new java.awt.Font("Comic Sans MS", 1, 56)); // NOI18N
        b13.setForeground(new java.awt.Color(255, 255, 255));
        b13.setText("O");
        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });

        b14.setBackground(new java.awt.Color(51, 51, 51));
        b14.setFont(new java.awt.Font("Comic Sans MS", 1, 56)); // NOI18N
        b14.setForeground(new java.awt.Color(255, 255, 255));
        b14.setText("O");
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });

        b15.setBackground(new java.awt.Color(51, 51, 51));
        b15.setFont(new java.awt.Font("Comic Sans MS", 1, 56)); // NOI18N
        b15.setForeground(new java.awt.Color(255, 255, 255));
        b15.setText("O");
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });

        b16.setBackground(new java.awt.Color(51, 51, 51));
        b16.setFont(new java.awt.Font("Comic Sans MS", 1, 56)); // NOI18N
        b16.setForeground(new java.awt.Color(255, 255, 255));
        b16.setText("O");
        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });

        b17.setBackground(new java.awt.Color(51, 51, 51));
        b17.setFont(new java.awt.Font("Comic Sans MS", 1, 56)); // NOI18N
        b17.setForeground(new java.awt.Color(255, 255, 255));
        b17.setText("O");
        b17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b17ActionPerformed(evt);
            }
        });

        b18.setBackground(new java.awt.Color(51, 51, 51));
        b18.setFont(new java.awt.Font("Comic Sans MS", 1, 56)); // NOI18N
        b18.setForeground(new java.awt.Color(255, 255, 255));
        b18.setText("O");
        b18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b18ActionPerformed(evt);
            }
        });

        b19.setBackground(new java.awt.Color(51, 51, 51));
        b19.setFont(new java.awt.Font("Comic Sans MS", 1, 56)); // NOI18N
        b19.setForeground(new java.awt.Color(255, 255, 255));
        b19.setText("O");
        b19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b19ActionPerformed(evt);
            }
        });

        b20.setBackground(new java.awt.Color(51, 51, 51));
        b20.setFont(new java.awt.Font("Comic Sans MS", 1, 56)); // NOI18N
        b20.setForeground(new java.awt.Color(255, 255, 255));
        b20.setText("O");
        b20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b20ActionPerformed(evt);
            }
        });

        b21.setBackground(new java.awt.Color(51, 51, 51));
        b21.setFont(new java.awt.Font("Comic Sans MS", 1, 56)); // NOI18N
        b21.setForeground(new java.awt.Color(255, 255, 255));
        b21.setText("O");
        b21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b21ActionPerformed(evt);
            }
        });

        b22.setBackground(new java.awt.Color(51, 51, 51));
        b22.setFont(new java.awt.Font("Comic Sans MS", 1, 56)); // NOI18N
        b22.setForeground(new java.awt.Color(255, 255, 255));
        b22.setText("O");
        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22ActionPerformed(evt);
            }
        });

        b23.setBackground(new java.awt.Color(51, 51, 51));
        b23.setFont(new java.awt.Font("Comic Sans MS", 1, 56)); // NOI18N
        b23.setForeground(new java.awt.Color(255, 255, 255));
        b23.setText("O");
        b23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b23ActionPerformed(evt);
            }
        });

        b24.setBackground(new java.awt.Color(51, 51, 51));
        b24.setFont(new java.awt.Font("Comic Sans MS", 1, 56)); // NOI18N
        b24.setForeground(new java.awt.Color(255, 255, 255));
        b24.setText("O");
        b24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b24ActionPerformed(evt);
            }
        });

        b25.setBackground(new java.awt.Color(51, 51, 51));
        b25.setFont(new java.awt.Font("Comic Sans MS", 1, 56)); // NOI18N
        b25.setForeground(new java.awt.Color(255, 255, 255));
        b25.setText("O");
        b25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b25ActionPerformed(evt);
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
                        .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b23, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b24, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b25, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(b16, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b17, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b18, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b19, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b20, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(des)
                        .addGap(105, 105, 105)
                        .addComponent(move))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b14, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b15, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(92, Short.MAX_VALUE))
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
                .addGap(45, 45, 45)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b15, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b14, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b16, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b17, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b18, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b19, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b20, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b23, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b24, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b25, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
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

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        makeMove(10);
    }//GEN-LAST:event_b10ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        makeMove(11);
    }//GEN-LAST:event_b11ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        makeMove(12);
    }//GEN-LAST:event_b12ActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
        makeMove(13);
    }//GEN-LAST:event_b13ActionPerformed

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
        makeMove(14);
    }//GEN-LAST:event_b14ActionPerformed

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
        makeMove(15);
    }//GEN-LAST:event_b15ActionPerformed

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b16ActionPerformed
        makeMove(16);
    }//GEN-LAST:event_b16ActionPerformed

    private void b17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b17ActionPerformed
        makeMove(17);
    }//GEN-LAST:event_b17ActionPerformed

    private void b18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b18ActionPerformed
        makeMove(18);
    }//GEN-LAST:event_b18ActionPerformed

    private void b19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b19ActionPerformed
        makeMove(19);
    }//GEN-LAST:event_b19ActionPerformed

    private void b20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b20ActionPerformed
        makeMove(20);
    }//GEN-LAST:event_b20ActionPerformed

    private void b21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b21ActionPerformed
        makeMove(21);
    }//GEN-LAST:event_b21ActionPerformed

    private void b22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b22ActionPerformed
        makeMove(22);
    }//GEN-LAST:event_b22ActionPerformed

    private void b23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b23ActionPerformed
        makeMove(23);
    }//GEN-LAST:event_b23ActionPerformed

    private void b24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b24ActionPerformed
        makeMove(24);
    }//GEN-LAST:event_b24ActionPerformed

    private void b25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b25ActionPerformed
        makeMove(25);
    }//GEN-LAST:event_b25ActionPerformed

    private void makeMove(int button){
        Object m = button;
        moves.remove(m);
        int p = 1;
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(p == button && board[i][j] == 0) {
                    board[i][j] = currentPlayer;
                    if(currentPlayer == 1) 
                        currentPlayer = 2;
                    else currentPlayer = 1;
                    loadBoard();
                    winCheck();
                    move();
                    return;
                }
                p++;
            }
        }
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
            done = true;
            if(status == 1) WinHistory.player++;
            if(status == 2) WinHistory.computer++;
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
                new TicTacToe5BComputer(3).setVisible(true);
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
            switch (board[0][3]) {
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
            switch (board[0][4]) {
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
            switch (board[1][0]) {
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
            switch (board[1][1]) {
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
            switch (board[1][2]) {
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
            switch (board[1][3]) {
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
            switch (board[1][4]) {
            case 2:
                b10.setText("X");
                b10.setBackground(Color.decode("#f07056"));
                break;
            case 1:
                b10.setText("O");
                b10.setBackground(Color.decode("#7457c2"));
                break;
            default:
                b10.setText("");
                break;
        }
            switch (board[2][0]) {
            case 2:
                b11.setText("X");
                b11.setBackground(Color.decode("#f07056"));
                break;
            case 1:
                b11.setText("O");
                b11.setBackground(Color.decode("#7457c2"));
                break;
            default:
                b11.setText("");
                break;
        }
            switch (board[2][1]) {
            case 2:
                b12.setText("X");
                b12.setBackground(Color.decode("#f07056"));
                break;
            case 1:
                b12.setText("O");
                b12.setBackground(Color.decode("#7457c2"));
                break;
            default:
                b12.setText("");
                break;
        }
            switch (board[2][2]) {
            case 2:
                b13.setText("X");
                b13.setBackground(Color.decode("#f07056"));
                break;
            case 1:
                b13.setText("O");
                b13.setBackground(Color.decode("#7457c2"));
                break;
            default:
                b13.setText("");
                break;
        }
            switch (board[2][3]) {
            case 2:
                b14.setText("X");
                b14.setBackground(Color.decode("#f07056"));
                break;
            case 1:
                b14.setText("O");
                b14.setBackground(Color.decode("#7457c2"));
                break;
            default:
                b14.setText("");
                break;
        }
            switch (board[2][4]) {
            case 2:
                b15.setText("X");
                b15.setBackground(Color.decode("#f07056"));
                break;
            case 1:
                b15.setText("O");
                b15.setBackground(Color.decode("#7457c2"));
                break;
            default:
                b15.setText("");
                break;
        }
            switch (board[3][0]) {
            case 2:
                b16.setText("X");
                b16.setBackground(Color.decode("#f07056"));
                break;
            case 1:
                b16.setText("O");
                b16.setBackground(Color.decode("#7457c2"));
                break;
            default:
                b16.setText("");
                break;
        }
            switch (board[3][1]) {
            case 2:
                b17.setText("X");
                b17.setBackground(Color.decode("#f07056"));
                break;
            case 1:
                b17.setText("O");
                b17.setBackground(Color.decode("#7457c2"));
                break;
            default:
                b17.setText("");
                break;
        }
            switch (board[3][2]) {
            case 2:
                b18.setText("X");
                b18.setBackground(Color.decode("#f07056"));
                break;
            case 1:
                b18.setText("O");
                b18.setBackground(Color.decode("#7457c2"));
                break;
            default:
                b18.setText("");
                break;
        }
            switch (board[3][3]) {
            case 2:
                b19.setText("X");
                b19.setBackground(Color.decode("#f07056"));
                break;
            case 1:
                b19.setText("O");
                b19.setBackground(Color.decode("#7457c2"));
                break;
            default:
                b19.setText("");
                break;
        }
            switch (board[3][4]) {
            case 2:
                b20.setText("X");
                b20.setBackground(Color.decode("#f07056"));
                break;
            case 1:
                b20.setText("O");
                b20.setBackground(Color.decode("#7457c2"));
                break;
            default:
                b20.setText("");
                break;
        }
            switch (board[4][0]) {
            case 2:
                b21.setText("X");
                b21.setBackground(Color.decode("#f07056"));
                break;
            case 1:
                b21.setText("O");
                b21.setBackground(Color.decode("#7457c2"));
                break;
            default:
                b21.setText("");
                break;
        }
            switch (board[4][1]) {
            case 2:
                b22.setText("X");
                b22.setBackground(Color.decode("#f07056"));
                break;
            case 1:
                b22.setText("O");
                b22.setBackground(Color.decode("#7457c2"));
                break;
            default:
                b22.setText("");
                break;
        }
            switch (board[4][2]) {
            case 2:
                b23.setText("X");
                b23.setBackground(Color.decode("#f07056"));
                break;
            case 1:
                b23.setText("O");
                b23.setBackground(Color.decode("#7457c2"));
                break;
            default:
                b23.setText("");
                break;
        }
            switch (board[4][3]) {
            case 2:
                b24.setText("X");
                b24.setBackground(Color.decode("#f07056"));
                break;
            case 1:
                b24.setText("O");
                b24.setBackground(Color.decode("#7457c2"));
                break;
            default:
                b24.setText("");
                break;
        }
            switch (board[4][4]) {
            case 2:
                b25.setText("X");
                b25.setBackground(Color.decode("#f07056"));
                break;
            case 1:
                b25.setText("O");
                b25.setBackground(Color.decode("#7457c2"));
                break;
            default:
                b25.setText("");
                break;
        }
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b17;
    private javax.swing.JButton b18;
    private javax.swing.JButton b19;
    private javax.swing.JButton b2;
    private javax.swing.JButton b20;
    private javax.swing.JButton b21;
    private javax.swing.JButton b22;
    private javax.swing.JButton b23;
    private javax.swing.JButton b24;
    private javax.swing.JButton b25;
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

    private void move() {
        if(currentPlayer == 1){
            //System.out.println("Wait for player to make a move...");
        }
        else {
            int pos[] = MiniMaxAB3.bestMoveIn5x5(board);
            int bestMove = pos[0]*5 + pos[1] + 1;
            Random r = new Random();
            int randomMove = moves.get(r.nextInt(moves.size()));

            if(difficulty == 3){
                makeMove(bestMove);
            }
            else if(difficulty == 2){
                if(r.nextInt(100)<80){
                    makeMove(bestMove);
                }
                else makeMove(randomMove);
            }
            else {
                if(r.nextInt(100)<40){
                    makeMove(bestMove);
                }
                else makeMove(randomMove);
            }
        }
    }


}
