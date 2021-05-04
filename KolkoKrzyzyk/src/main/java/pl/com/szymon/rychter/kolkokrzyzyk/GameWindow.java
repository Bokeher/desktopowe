/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.szymon.rychter.kolkokrzyzyk;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import pl.com.szymon.rychter.kolkokrzyzyk.gameutils.DrawPlayer;

/**
 *
 * @author Szymon
 */
public class GameWindow extends javax.swing.JFrame {
    private Player p1, p2;
    private boolean player = false; 
    
    /**
     * Creates new form GameWindow
     */
    public GameWindow() {
        initComponents();
        initGame();
        setCircleOrCrossToAllButtons();
    }

    private void initGame(){
        player = DrawPlayer.randomPlayer();
        
        if(DrawPlayer.randomSign()) {
            jLabel_player1_sign.setText("O");
            jLabel_player2_sign.setText("X");
            
            p1 = new Player("O", jTextField_player1.getText());
            p2 = new Player("X", jTextField_player2.getText());
        }else {
            jLabel_player1_sign.setText("X");
            jLabel_player2_sign.setText("O");
            
            p1 = new Player("X", jTextField_player1.getText());
            p2 = new Player("O", jTextField_player2.getText());
        }
    }
    
    private void setCircleOrCrossToAllButtons(){
        jButton11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                setCircleOrCross(evt);
            }
        });
        jButton12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                setCircleOrCross(evt);
            }
        });
        jButton13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                setCircleOrCross(evt);
            }
        });
        jButton21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                setCircleOrCross(evt);
            }
        });
        jButton22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                setCircleOrCross(evt);
            }
        });
        jButton23.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                setCircleOrCross(evt);
            }
        });
        jButton31.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                setCircleOrCross(evt);
            }
        });
        jButton32.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                setCircleOrCross(evt);
            }
        });
        jButton33.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                setCircleOrCross(evt);
            }
        });
    }
    
    private void setCircleOrCross(java.awt.event.ActionEvent evt){
        JButton b = (JButton) evt.getSource();
        
        if(player) {
            b.setText(p1.getSign());
            jLabel_player1.setBackground(Color.GRAY);
            jLabel_player2.setBackground(Color.GREEN);
        }else {
            b.setText(p2.getSign());
            jLabel_player2.setBackground(Color.GRAY);
            jLabel_player1.setBackground(Color.GREEN);
        }
        
        if(player) b.setText(p1.getSign());
        else b.setText(p2.getSign());
        
        player = !player;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton_PvP = new javax.swing.JRadioButton();
        jRadioButton_PvC = new javax.swing.JRadioButton();
        jTextField_player1 = new javax.swing.JTextField();
        jTextField_player2 = new javax.swing.JTextField();
        jLabel_player1 = new javax.swing.JLabel();
        jLabel_player2 = new javax.swing.JLabel();
        jLabel_player1_sign = new javax.swing.JLabel();
        jLabel_player2_sign = new javax.swing.JLabel();
        jButton_reset = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        buttonGroup.add(jRadioButton_PvP);
        jRadioButton_PvP.setSelected(true);
        jRadioButton_PvP.setText("2 Graczy");

        buttonGroup.add(jRadioButton_PvC);
        jRadioButton_PvC.setText("vs Komputer");

        jLabel_player1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_player1.setText("Gracz 1");
        jLabel_player1.setOpaque(true);

        jLabel_player2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_player2.setText("Gracz 2");
        jLabel_player2.setOpaque(true);

        jLabel_player1_sign.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_player1_sign.setText("X");

        jLabel_player2_sign.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_player2_sign.setText("O");

        jButton_reset.setText("RESET");
        jButton_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_resetActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton11.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton11.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton11.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton11.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton21.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton21.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton21.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton21.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton12.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton12.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton12.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton12.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton22.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton22.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton22.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton22.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton31.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton31.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton31.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton31.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton32.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton32.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton32.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton32.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton33.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton33.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton33.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton33.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton23.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton23.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton23.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton23.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton13.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton13.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton13.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton13.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton_PvP, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jTextField_player1)
                            .addComponent(jLabel_player1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton_PvC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_reset))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_player1_sign)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_player2_sign)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel_player2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jTextField_player2)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(98, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(110, 110, 110)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton_PvP)
                        .addComponent(jRadioButton_PvC))
                    .addComponent(jButton_reset))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_player1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_player2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_player1_sign)
                    .addComponent(jLabel_player2_sign))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_player1)
                    .addComponent(jLabel_player2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_resetActionPerformed
        clearButtonText();
        initGame();
    }//GEN-LAST:event_jButton_resetActionPerformed
    
    private void clearButtonText(){
        jButton11.setText("");
        jButton12.setText("");
        jButton13.setText("");
        jButton21.setText("");
        jButton22.setText("");
        jButton23.setText("");
        jButton31.setText("");
        jButton32.setText("");
        jButton33.setText("");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton_reset;
    private javax.swing.JLabel jLabel_player1;
    private javax.swing.JLabel jLabel_player1_sign;
    private javax.swing.JLabel jLabel_player2;
    private javax.swing.JLabel jLabel_player2_sign;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton_PvC;
    private javax.swing.JRadioButton jRadioButton_PvP;
    private javax.swing.JTextField jTextField_player1;
    private javax.swing.JTextField jTextField_player2;
    // End of variables declaration//GEN-END:variables
}
