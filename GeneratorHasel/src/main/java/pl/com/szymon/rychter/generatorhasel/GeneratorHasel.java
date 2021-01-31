/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.szymon.rychter.generatorhasel;

import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Szymon
 */
public class GeneratorHasel extends javax.swing.JFrame {

    /**
     * Creates new form GeneratorHasel
     */
    public GeneratorHasel() {
        initComponents();
        letterOptions();
        sr_jLabel_error.setText("");
        sr_jLabel_img.setText("");
        sr_jLabel_img.setIcon(new javax.swing.ImageIcon("src\\main\\java\\pl\\com\\szymon\\rychter\\res\\logo.png"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sr_buttonGroup_lettersType = new javax.swing.ButtonGroup();
        sr_jPanel_main = new javax.swing.JPanel();
        sr_jLabel_generatePasswordTitle = new javax.swing.JLabel();
        sr_jLabel_chooseTypeOfCharacters = new javax.swing.JLabel();
        sr_jCheckBox_letters = new javax.swing.JCheckBox();
        sr_jCheckBox_numbers = new javax.swing.JCheckBox();
        sr_jCheckBox_specialSigns = new javax.swing.JCheckBox();
        sr_jButton_generatePassword = new javax.swing.JButton();
        sr_jCheckBox_polishLetters = new javax.swing.JCheckBox();
        sr_jCheckBox_lowerCase = new javax.swing.JCheckBox();
        sr_jCheckBox_upperCase = new javax.swing.JCheckBox();
        sr_jCheckBox_randomCase = new javax.swing.JCheckBox();
        sr_jLabel_error = new javax.swing.JLabel();
        sr_jSlider_passwordLength = new javax.swing.JSlider();
        sr_jLabel_passwordLength = new javax.swing.JLabel();
        sr_jTextField_passwordLength = new javax.swing.JTextField();
        sr_jLabel_chooseLengthOfPassword = new javax.swing.JLabel();
        sr_jLabel_generatedPassword = new javax.swing.JLabel();
        sr_jTextField_generatedPassword = new javax.swing.JTextField();
        sr_jLabel_img = new javax.swing.JLabel();
        sr_jMenuBar = new javax.swing.JMenuBar();
        sr_jMenu_file = new javax.swing.JMenu();
        sr_jMenuItem_saveSettings = new javax.swing.JMenuItem();
        sr_jMenuItem_loadSettings = new javax.swing.JMenuItem();
        sr_jMenuItem_exit = new javax.swing.JMenuItem();
        sr_jMenu_edit = new javax.swing.JMenu();
        sr_jMenuItem_changeFont = new javax.swing.JMenuItem();
        sr_jMenuItem_changeBackground = new javax.swing.JMenuItem();
        sr_jMenu_info = new javax.swing.JMenu();
        sr_jMenuItem_info = new javax.swing.JMenuItem();
        sr_jMenuItem_help = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generator haseł");
        setBackground(new java.awt.Color(102, 102, 102));
        setResizable(false);

        sr_jPanel_main.setBackground(new java.awt.Color(102, 102, 102));
        sr_jPanel_main.setForeground(new java.awt.Color(102, 102, 102));

        sr_jLabel_generatePasswordTitle.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        sr_jLabel_generatePasswordTitle.setForeground(new java.awt.Color(255, 255, 255));
        sr_jLabel_generatePasswordTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sr_jLabel_generatePasswordTitle.setText("Generator haseł");

        sr_jLabel_chooseTypeOfCharacters.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        sr_jLabel_chooseTypeOfCharacters.setForeground(new java.awt.Color(255, 255, 255));
        sr_jLabel_chooseTypeOfCharacters.setText("Wybierz co ma zawierać hasło: ");

        sr_jCheckBox_letters.setBackground(new java.awt.Color(102, 102, 102));
        sr_jCheckBox_letters.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        sr_jCheckBox_letters.setForeground(new java.awt.Color(255, 255, 255));
        sr_jCheckBox_letters.setText("Litery");
        sr_jCheckBox_letters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jCheckBox_lettersActionPerformed(evt);
            }
        });

        sr_jCheckBox_numbers.setBackground(new java.awt.Color(102, 102, 102));
        sr_jCheckBox_numbers.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        sr_jCheckBox_numbers.setForeground(new java.awt.Color(255, 255, 255));
        sr_jCheckBox_numbers.setText("Cyfry");
        sr_jCheckBox_numbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jCheckBox_numbersActionPerformed(evt);
            }
        });

        sr_jCheckBox_specialSigns.setBackground(new java.awt.Color(102, 102, 102));
        sr_jCheckBox_specialSigns.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        sr_jCheckBox_specialSigns.setForeground(new java.awt.Color(255, 255, 255));
        sr_jCheckBox_specialSigns.setText("Znaki specjalne");
        sr_jCheckBox_specialSigns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jCheckBox_specialSignsActionPerformed(evt);
            }
        });

        sr_jButton_generatePassword.setText("Generuj hasło");
        sr_jButton_generatePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jButton_generatePasswordActionPerformed(evt);
            }
        });

        sr_jCheckBox_polishLetters.setBackground(new java.awt.Color(102, 102, 102));
        sr_jCheckBox_polishLetters.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        sr_jCheckBox_polishLetters.setForeground(new java.awt.Color(255, 255, 255));
        sr_jCheckBox_polishLetters.setText("Polskie litery");
        sr_jCheckBox_polishLetters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jCheckBox_polishLettersActionPerformed(evt);
            }
        });

        sr_jCheckBox_lowerCase.setBackground(new java.awt.Color(102, 102, 102));
        sr_buttonGroup_lettersType.add(sr_jCheckBox_lowerCase);
        sr_jCheckBox_lowerCase.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        sr_jCheckBox_lowerCase.setForeground(new java.awt.Color(255, 255, 255));
        sr_jCheckBox_lowerCase.setText("Małe litery");

        sr_jCheckBox_upperCase.setBackground(new java.awt.Color(102, 102, 102));
        sr_buttonGroup_lettersType.add(sr_jCheckBox_upperCase);
        sr_jCheckBox_upperCase.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        sr_jCheckBox_upperCase.setForeground(new java.awt.Color(255, 255, 255));
        sr_jCheckBox_upperCase.setText("Duże litery");

        sr_jCheckBox_randomCase.setBackground(new java.awt.Color(102, 102, 102));
        sr_buttonGroup_lettersType.add(sr_jCheckBox_randomCase);
        sr_jCheckBox_randomCase.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        sr_jCheckBox_randomCase.setForeground(new java.awt.Color(255, 255, 255));
        sr_jCheckBox_randomCase.setText("Małe i duże litery");

        sr_jLabel_error.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        sr_jLabel_error.setForeground(new java.awt.Color(255, 255, 255));
        sr_jLabel_error.setText("error");

        sr_jSlider_passwordLength.setForeground(new java.awt.Color(255, 255, 255));
        sr_jSlider_passwordLength.setMajorTickSpacing(4);
        sr_jSlider_passwordLength.setMaximum(32);
        sr_jSlider_passwordLength.setMinimum(8);
        sr_jSlider_passwordLength.setMinorTickSpacing(1);
        sr_jSlider_passwordLength.setPaintLabels(true);
        sr_jSlider_passwordLength.setPaintTicks(true);
        sr_jSlider_passwordLength.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sr_jSlider_passwordLengthStateChanged(evt);
            }
        });

        sr_jLabel_passwordLength.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        sr_jLabel_passwordLength.setForeground(new java.awt.Color(255, 255, 255));
        sr_jLabel_passwordLength.setText("Długość hasła:");

        sr_jTextField_passwordLength.setText("32");
        sr_jTextField_passwordLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jTextField_passwordLengthActionPerformed(evt);
            }
        });

        sr_jLabel_chooseLengthOfPassword.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        sr_jLabel_chooseLengthOfPassword.setForeground(new java.awt.Color(255, 255, 255));
        sr_jLabel_chooseLengthOfPassword.setText("Wybierz jak długie ma być hasło: ");

        sr_jLabel_generatedPassword.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        sr_jLabel_generatedPassword.setForeground(new java.awt.Color(255, 255, 255));
        sr_jLabel_generatedPassword.setText("Wygenerowne hasło:");

        sr_jLabel_img.setForeground(new java.awt.Color(255, 255, 255));
        sr_jLabel_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sr_jLabel_img.setText("img");
        sr_jLabel_img.setPreferredSize(new java.awt.Dimension(64, 64));

        javax.swing.GroupLayout sr_jPanel_mainLayout = new javax.swing.GroupLayout(sr_jPanel_main);
        sr_jPanel_main.setLayout(sr_jPanel_mainLayout);
        sr_jPanel_mainLayout.setHorizontalGroup(
            sr_jPanel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sr_jPanel_mainLayout.createSequentialGroup()
                .addGroup(sr_jPanel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sr_jPanel_mainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(sr_jPanel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sr_jLabel_chooseTypeOfCharacters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(sr_jPanel_mainLayout.createSequentialGroup()
                                .addGroup(sr_jPanel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(sr_jPanel_mainLayout.createSequentialGroup()
                                        .addComponent(sr_jLabel_passwordLength, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sr_jTextField_passwordLength, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(sr_jPanel_mainLayout.createSequentialGroup()
                                        .addComponent(sr_jCheckBox_letters)
                                        .addGap(18, 18, 18)
                                        .addComponent(sr_jCheckBox_numbers)
                                        .addGap(18, 18, 18)
                                        .addComponent(sr_jCheckBox_specialSigns))
                                    .addGroup(sr_jPanel_mainLayout.createSequentialGroup()
                                        .addComponent(sr_jCheckBox_lowerCase)
                                        .addGap(18, 18, 18)
                                        .addComponent(sr_jCheckBox_upperCase)
                                        .addGap(18, 18, 18)
                                        .addComponent(sr_jCheckBox_randomCase)
                                        .addGap(18, 18, 18)
                                        .addComponent(sr_jCheckBox_polishLetters))
                                    .addComponent(sr_jLabel_chooseLengthOfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sr_jSlider_passwordLength, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(sr_jPanel_mainLayout.createSequentialGroup()
                                        .addComponent(sr_jButton_generatePassword)
                                        .addGap(18, 18, 18)
                                        .addComponent(sr_jLabel_error, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(sr_jPanel_mainLayout.createSequentialGroup()
                                        .addComponent(sr_jLabel_generatedPassword)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sr_jTextField_generatedPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(sr_jPanel_mainLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(sr_jLabel_generatePasswordTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(sr_jLabel_img, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        sr_jPanel_mainLayout.setVerticalGroup(
            sr_jPanel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sr_jPanel_mainLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(sr_jPanel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sr_jLabel_generatePasswordTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sr_jLabel_img, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(sr_jLabel_chooseLengthOfPassword)
                .addGap(4, 4, 4)
                .addComponent(sr_jSlider_passwordLength, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sr_jPanel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sr_jTextField_passwordLength)
                    .addComponent(sr_jLabel_passwordLength, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(sr_jLabel_chooseTypeOfCharacters)
                .addGap(4, 4, 4)
                .addGroup(sr_jPanel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sr_jCheckBox_letters)
                    .addComponent(sr_jCheckBox_numbers)
                    .addComponent(sr_jCheckBox_specialSigns))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sr_jPanel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sr_jCheckBox_lowerCase)
                    .addComponent(sr_jCheckBox_upperCase)
                    .addComponent(sr_jCheckBox_randomCase)
                    .addComponent(sr_jCheckBox_polishLetters))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addGroup(sr_jPanel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sr_jButton_generatePassword)
                    .addComponent(sr_jLabel_error))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sr_jPanel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sr_jTextField_generatedPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sr_jLabel_generatedPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        sr_jMenu_file.setText("Plik");

        sr_jMenuItem_saveSettings.setText("Zapisz ustawienia");
        sr_jMenuItem_saveSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jMenuItem_saveSettingsActionPerformed(evt);
            }
        });
        sr_jMenu_file.add(sr_jMenuItem_saveSettings);

        sr_jMenuItem_loadSettings.setText("Wczytaj ustawienia");
        sr_jMenuItem_loadSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jMenuItem_loadSettingsActionPerformed(evt);
            }
        });
        sr_jMenu_file.add(sr_jMenuItem_loadSettings);

        sr_jMenuItem_exit.setText("Zamknij program");
        sr_jMenuItem_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jMenuItem_exitActionPerformed(evt);
            }
        });
        sr_jMenu_file.add(sr_jMenuItem_exit);

        sr_jMenuBar.add(sr_jMenu_file);

        sr_jMenu_edit.setText("Edycja");

        sr_jMenuItem_changeFont.setText("Zmień czcionkę");
        sr_jMenuItem_changeFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jMenuItem_changeFontActionPerformed(evt);
            }
        });
        sr_jMenu_edit.add(sr_jMenuItem_changeFont);

        sr_jMenuItem_changeBackground.setText("Zmień tło");
        sr_jMenuItem_changeBackground.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jMenuItem_changeBackgroundActionPerformed(evt);
            }
        });
        sr_jMenu_edit.add(sr_jMenuItem_changeBackground);

        sr_jMenuBar.add(sr_jMenu_edit);

        sr_jMenu_info.setText("O programie");

        sr_jMenuItem_info.setText("O programie");
        sr_jMenuItem_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jMenuItem_infoActionPerformed(evt);
            }
        });
        sr_jMenu_info.add(sr_jMenuItem_info);

        sr_jMenuItem_help.setText("Help");
        sr_jMenuItem_help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jMenuItem_helpActionPerformed(evt);
            }
        });
        sr_jMenu_info.add(sr_jMenuItem_help);

        sr_jMenuBar.add(sr_jMenu_info);

        setJMenuBar(sr_jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sr_jPanel_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sr_jPanel_main, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sr_jCheckBox_lettersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jCheckBox_lettersActionPerformed
        letterOptions();
    }//GEN-LAST:event_sr_jCheckBox_lettersActionPerformed

    private void sr_jButton_generatePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jButton_generatePasswordActionPerformed
        buttonGeneratePassword();
    }//GEN-LAST:event_sr_jButton_generatePasswordActionPerformed

    private void sr_jCheckBox_polishLettersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jCheckBox_polishLettersActionPerformed

    }//GEN-LAST:event_sr_jCheckBox_polishLettersActionPerformed

    private void sr_jCheckBox_specialSignsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jCheckBox_specialSignsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sr_jCheckBox_specialSignsActionPerformed

    private void sr_jCheckBox_numbersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jCheckBox_numbersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sr_jCheckBox_numbersActionPerformed

    private void sr_jTextField_passwordLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jTextField_passwordLengthActionPerformed
        sr_jSlider_passwordLength.setValue(Integer.parseInt(sr_jTextField_passwordLength.getText()));
    }//GEN-LAST:event_sr_jTextField_passwordLengthActionPerformed

    private void sr_jSlider_passwordLengthStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sr_jSlider_passwordLengthStateChanged
        sr_jTextField_passwordLength.setText(""+sr_jSlider_passwordLength.getValue());
    }//GEN-LAST:event_sr_jSlider_passwordLengthStateChanged

    private void sr_jMenuItem_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jMenuItem_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sr_jMenuItem_exitActionPerformed

    private void sr_jMenuItem_saveSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jMenuItem_saveSettingsActionPerformed
        saveSettings();
    }//GEN-LAST:event_sr_jMenuItem_saveSettingsActionPerformed

    private void sr_jMenuItem_loadSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jMenuItem_loadSettingsActionPerformed
        if(!sr_jCheckBox_letters.isSelected()) letterOptions();
        loadSettings();
    }//GEN-LAST:event_sr_jMenuItem_loadSettingsActionPerformed

    private void sr_jMenuItem_changeFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jMenuItem_changeFontActionPerformed
        if(font.equals("Corbel")) font = "Calibri";
        else font = "Corbel";
        
        Font newFont = new Font(font, Font.PLAIN, 18);
        Font newFontBold = new Font(font, Font.BOLD, 24);
        Font newFontBig = new Font(font, Font.BOLD, 36);
        
        sr_jLabel_chooseLengthOfPassword.setFont(newFontBold);
        sr_jSlider_passwordLength.setFont(newFont);
        sr_jLabel_passwordLength.setFont(newFont);
        sr_jLabel_chooseTypeOfCharacters.setFont(newFontBold);
        sr_jCheckBox_letters.setFont(newFont);
        sr_jCheckBox_numbers.setFont(newFont);
        sr_jCheckBox_specialSigns.setFont(newFont);
        sr_jCheckBox_lowerCase.setFont(newFont);
        sr_jCheckBox_upperCase.setFont(newFont);
        sr_jCheckBox_randomCase.setFont(newFont);
        sr_jCheckBox_polishLetters.setFont(newFont);
        sr_jLabel_generatedPassword.setFont(newFont);
        sr_jLabel_error.setFont(newFont);
        sr_jLabel_generatePasswordTitle.setFont(newFontBig);
        
    }//GEN-LAST:event_sr_jMenuItem_changeFontActionPerformed

    private void sr_jMenuItem_changeBackgroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jMenuItem_changeBackgroundActionPerformed
        if(bgcolor == 102) bgcolor = 51;
        else bgcolor = 102;
        
        sr_jPanel_main.setBackground(new java.awt.Color(bgcolor, bgcolor, bgcolor));
        sr_jCheckBox_letters.setBackground(new java.awt.Color(bgcolor, bgcolor, bgcolor));
        sr_jCheckBox_numbers.setBackground(new java.awt.Color(bgcolor, bgcolor, bgcolor));
        sr_jCheckBox_specialSigns.setBackground(new java.awt.Color(bgcolor, bgcolor, bgcolor));
        sr_jCheckBox_lowerCase.setBackground(new java.awt.Color(bgcolor, bgcolor, bgcolor));
        sr_jCheckBox_upperCase.setBackground(new java.awt.Color(bgcolor, bgcolor, bgcolor));
        sr_jCheckBox_randomCase.setBackground(new java.awt.Color(bgcolor, bgcolor, bgcolor));
        sr_jCheckBox_polishLetters.setBackground(new java.awt.Color(bgcolor, bgcolor, bgcolor));
    }//GEN-LAST:event_sr_jMenuItem_changeBackgroundActionPerformed

    private void sr_jMenuItem_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jMenuItem_infoActionPerformed
        JOptionPane.showMessageDialog(this, "Program został zrobiony przez Szymona Rychtera", "O programie", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_sr_jMenuItem_infoActionPerformed

    private void sr_jMenuItem_helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jMenuItem_helpActionPerformed
        JOptionPane.showMessageDialog(this, "Wybierz długość hasła, następnie wybierz z czego ma się twoje hasło składać i kliknij 'Generuj hasło'", "Help", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_sr_jMenuItem_helpActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(GeneratorHasel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneratorHasel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneratorHasel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneratorHasel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeneratorHasel().setVisible(true);
            }
        });
    }
    
    public void letterOptions(){
        boolean state;
        state = !sr_jCheckBox_lowerCase.isVisible();
        
        sr_jCheckBox_lowerCase.setVisible(state);
        sr_jCheckBox_upperCase.setVisible(state);
        sr_jCheckBox_randomCase.setVisible(state);
        sr_jCheckBox_polishLetters.setVisible(state);
        sr_jCheckBox_lowerCase.setSelected(state);
        sr_jCheckBox_polishLetters.setSelected(false);
    }
    
    Random rand = new Random();
    
    private void buttonGeneratePassword(){
        sr_jLabel_error.setText("");
        String characters = ""; 
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String polishLetters = "ąćęłńóśźż";
        
        if(sr_jCheckBox_letters.isSelected()){
            if(sr_jCheckBox_lowerCase.isSelected()) characters += alphabet;
            else if(sr_jCheckBox_upperCase.isSelected()) characters += alphabet.toUpperCase();
            else if(sr_jCheckBox_randomCase.isSelected()) characters += alphabet;
            
            if(sr_jCheckBox_polishLetters.isSelected()) {
                if(sr_jCheckBox_lowerCase.isSelected()) characters += polishLetters;
                else if(sr_jCheckBox_upperCase.isSelected()) characters += polishLetters.toUpperCase();
                else if(sr_jCheckBox_randomCase.isSelected()) characters += polishLetters;
            }
        }
        if(sr_jCheckBox_numbers.isSelected()) characters += "1234567890";
        if(sr_jCheckBox_specialSigns.isSelected()) characters += "!@#$%^&*(){}[]\\|:\";'<>?,./";
        
        int len = sr_jSlider_passwordLength.getValue();
        
        if(characters.equals("")) sr_jLabel_error.setText("Wybierz poprawne znaki");
        else{
            String password = generatePassword(characters, len);
            sr_jTextField_generatedPassword.setText(password);
        }
    }
    
    private String generatePassword(String characters, int len){
        String password = "";
        
        for(int i=0; i<len; i++){
            int randNumb = rand.nextInt(characters.length());
            String character = characters.substring(randNumb, randNumb+1);
            
            if(sr_jCheckBox_randomCase.isSelected()) character = randomCase(character);
          
            password += character;
        }
        return password;
    }
    
    private String randomCase(String letter){
        int randNumb = rand.nextInt(2);
        
        if(randNumb == 0) return letter;
        else return letter.toUpperCase();
    }
    
    private void saveSettings(){
        try{
            FileWriter fw = new FileWriter(fileSettings);
            
            int passwordLength = sr_jSlider_passwordLength.getValue();
            
            String letters = "n";
            if(sr_jCheckBox_lowerCase.isSelected()) letters = "l";
            else if(sr_jCheckBox_upperCase.isSelected()) letters = "u";
            else if(sr_jCheckBox_randomCase.isSelected()) letters = "r";
            
            String numbers = "n";
            if(sr_jCheckBox_numbers.isSelected()) numbers = "y";
            
            String specialSigns = "n";
            if(sr_jCheckBox_specialSigns.isSelected()) specialSigns = "y";
            
            String polishLetters = "n";
            if(sr_jCheckBox_polishLetters.isSelected()) polishLetters = "y";
            
            fw.write(passwordLength+";"+letters+";"+numbers+";"+specialSigns+";"+polishLetters);
            fw.close();
        }catch(IOException e){
            System.out.print(e.toString());
        }
    }
    
    private void loadSettings(){
        try{
            Scanner sc = new Scanner(fileSettings);
            
            String data[] = sc.nextLine().split(";");
            if(data[0].equals("")) sr_jLabel_error.setText("Nie ma ustawień do wczytania");
            else{
                sr_jTextField_passwordLength.setText(data[0]);
                sr_jSlider_passwordLength.setValue(Integer.parseInt(data[0]));

                if(data[1].equals("n")) {
                    sr_jCheckBox_letters.setSelected(false);
                    sr_jCheckBox_lowerCase.setSelected(false);
                    sr_jCheckBox_upperCase.setSelected(false);
                    sr_jCheckBox_randomCase.setSelected(false);
                }else{
                    sr_jCheckBox_letters.setSelected(true);
                    if(data[1].equals("l")) sr_jCheckBox_lowerCase.setSelected(true);
                    else if(data[1].equals("u")) sr_jCheckBox_upperCase.setSelected(true);
                    else if(data[1].equals("r")) sr_jCheckBox_randomCase.setSelected(true);
                }

                if(data[2].equals("y")) sr_jCheckBox_numbers.setSelected(true);
                else sr_jCheckBox_numbers.setSelected(false);

                if(data[3].equals("y")) sr_jCheckBox_specialSigns.setSelected(true);
                else sr_jCheckBox_specialSigns.setSelected(false);

                if(data[4].equals("y")) sr_jCheckBox_polishLetters.setSelected(true);
                else sr_jCheckBox_polishLetters.setSelected(false);
            }
        }catch(FileNotFoundException e){
            System.out.print(e.toString());
        }
    }
    
    String font = "Corbel";
    int bgcolor = 102;
    File fileSettings = new File("settings.txt");
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup sr_buttonGroup_lettersType;
    private javax.swing.JButton sr_jButton_generatePassword;
    private javax.swing.JCheckBox sr_jCheckBox_letters;
    private javax.swing.JCheckBox sr_jCheckBox_lowerCase;
    private javax.swing.JCheckBox sr_jCheckBox_numbers;
    private javax.swing.JCheckBox sr_jCheckBox_polishLetters;
    private javax.swing.JCheckBox sr_jCheckBox_randomCase;
    private javax.swing.JCheckBox sr_jCheckBox_specialSigns;
    private javax.swing.JCheckBox sr_jCheckBox_upperCase;
    private javax.swing.JLabel sr_jLabel_chooseLengthOfPassword;
    private javax.swing.JLabel sr_jLabel_chooseTypeOfCharacters;
    private javax.swing.JLabel sr_jLabel_error;
    private javax.swing.JLabel sr_jLabel_generatePasswordTitle;
    private javax.swing.JLabel sr_jLabel_generatedPassword;
    private javax.swing.JLabel sr_jLabel_img;
    private javax.swing.JLabel sr_jLabel_passwordLength;
    private javax.swing.JMenuBar sr_jMenuBar;
    private javax.swing.JMenuItem sr_jMenuItem_changeBackground;
    private javax.swing.JMenuItem sr_jMenuItem_changeFont;
    private javax.swing.JMenuItem sr_jMenuItem_exit;
    private javax.swing.JMenuItem sr_jMenuItem_help;
    private javax.swing.JMenuItem sr_jMenuItem_info;
    private javax.swing.JMenuItem sr_jMenuItem_loadSettings;
    private javax.swing.JMenuItem sr_jMenuItem_saveSettings;
    private javax.swing.JMenu sr_jMenu_edit;
    private javax.swing.JMenu sr_jMenu_file;
    private javax.swing.JMenu sr_jMenu_info;
    private javax.swing.JPanel sr_jPanel_main;
    private javax.swing.JSlider sr_jSlider_passwordLength;
    private javax.swing.JTextField sr_jTextField_generatedPassword;
    private javax.swing.JTextField sr_jTextField_passwordLength;
    // End of variables declaration//GEN-END:variables
}
