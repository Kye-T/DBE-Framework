/*
 * Created by JFormDesigner on Wed Sep 18 20:29:10 AFT 2019
 */

package dreambot.guis;

import dreambot.main.Provider;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * Copyright (C) <2019>  <Kye-T>
 * See dtohh.main.Script for GNU license.
 *
 * Example GUI
 */

public class AntiBan extends JFrame {

    private Provider provider;

    public AntiBan() {
        initComponents();
    }

    public AntiBan setProvider(Provider p) {
        provider = p;
        return this;
    }

    // TODO("Add Configuration and access methods to the Labels")
    public AntiBan start() {
        // Set the player name
        label24.setText(provider.getLocalPlayer().getName());

        // Display the GUI
        pack();
        setVisible(true);

        // Return the instance for OOP
        return this;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Foo
        label1 = new JLabel();
        label2 = new JLabel();
        checkBox1 = new JCheckBox();
        label3 = new JLabel();
        checkBox2 = new JCheckBox();
        label4 = new JLabel();
        progressBar1 = new JProgressBar();
        label5 = new JLabel();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        label6 = new JLabel();
        label7 = new JLabel();
        checkBox3 = new JCheckBox();
        label8 = new JLabel();
        checkBox4 = new JCheckBox();
        label9 = new JLabel();
        checkBox5 = new JCheckBox();
        label10 = new JLabel();
        label11 = new JLabel();
        checkBox6 = new JCheckBox();
        label12 = new JLabel();
        checkBox7 = new JCheckBox();
        label13 = new JLabel();
        textField1 = new JTextField();
        label14 = new JLabel();
        checkBox8 = new JCheckBox();
        label15 = new JLabel();
        label16 = new JLabel();
        label17 = new JLabel();
        checkBox9 = new JCheckBox();
        checkBox10 = new JCheckBox();
        checkBox11 = new JCheckBox();
        label18 = new JLabel();
        label19 = new JLabel();
        comboBox1 = new JComboBox();
        label20 = new JLabel();
        comboBox2 = new JComboBox();
        label21 = new JLabel();
        textField2 = new JTextField();
        label22 = new JLabel();
        checkBox12 = new JCheckBox();
        checkBox13 = new JCheckBox();
        checkBox14 = new JCheckBox();
        checkBox15 = new JCheckBox();
        checkBox16 = new JCheckBox();
        label23 = new JLabel();
        label24 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Anti-Ban Configuration - V1.0.1");
        label1.setFont(new Font("Segoe UI", Font.BOLD, 22));

        //---- label2 ----
        label2.setText("Change Camera Angle");

        //---- label3 ----
        label3.setText("Long/Short Sleeps");

        //---- label4 ----
        label4.setText("Talk Lines When Spoken To:");

        //---- label5 ----
        label5.setText("0%");

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(textArea1);
        }

        //---- label6 ----
        label6.setText("Locations To Visit: (X,Y,Z)");

        //---- label7 ----
        label7.setText("Log-out if persistently spoke to");

        //---- label8 ----
        label8.setText("Check XP Stats");

        //---- label9 ----
        label9.setText("Move mouse off screen");

        //---- label10 ----
        label10.setText("Change worlds when:");

        //---- label11 ----
        label11.setText("Cannon Present");

        //---- label12 ----
        label12.setText("Players interacting you");

        //---- label13 ----
        label13.setText("More than");

        //---- textField1 ----
        textField1.setText("5");

        //---- label14 ----
        label14.setText("players");

        //---- label15 ----
        label15.setText("Bank");

        //---- label16 ----
        label16.setText("Store");

        //---- label17 ----
        label17.setText("NPC");

        //---- label18 ----
        label18.setText("Current Action");

        //---- label19 ----
        label19.setText("NPCs to visit or show store");

        //---- label20 ----
        label20.setText("Buy");

        //---- label21 ----
        label21.setText("Max script run time");

        //---- textField2 ----
        textField2.setText("6");

        //---- label22 ----
        label22.setText("hours");

        //---- label23 ----
        label23.setText("User:");

        //---- label24 ----
        label24.setText("SomeUserName");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(166, 166, 166)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(progressBar1, GroupLayout.PREFERRED_SIZE, 421, GroupLayout.PREFERRED_SIZE)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label5)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label18, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
                                    .addGap(22, 22, 22))))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label2)
                                .addComponent(label3)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(scrollPane1, GroupLayout.Alignment.LEADING)
                                    .addComponent(label4, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label15, GroupLayout.Alignment.LEADING))
                                .addComponent(label6)
                                .addComponent(label16)
                                .addComponent(label17))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(checkBox1)
                                        .addComponent(checkBox2)))
                                .addComponent(checkBox9)
                                .addComponent(checkBox10)
                                .addComponent(checkBox11))
                            .addGap(46, 46, 46)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label10)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(label7))
                                        .addComponent(label8)
                                        .addComponent(label9)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addGap(36, 36, 36)
                                            .addGroup(contentPaneLayout.createParallelGroup()
                                                .addComponent(label12)
                                                .addComponent(label11)
                                                .addGroup(contentPaneLayout.createSequentialGroup()
                                                    .addComponent(label13)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(label14)))))
                                    .addGap(40, 40, 40)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(checkBox15)
                                        .addComponent(checkBox14)
                                        .addComponent(checkBox13)
                                        .addComponent(checkBox12)
                                        .addComponent(checkBox16))))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(checkBox5)
                                .addComponent(checkBox4)
                                .addComponent(checkBox3)
                                .addComponent(checkBox6)
                                .addComponent(checkBox7)
                                .addComponent(checkBox8)))))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(label1)
                    .addGap(40, 40, 40)
                    .addComponent(label23)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(label24, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 8, Short.MAX_VALUE))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label19)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label20)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                    .addComponent(label21, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(label22)
                    .addGap(103, 103, 103))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label1)
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label23)
                            .addComponent(label24)))
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(label4)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(label6)
                            .addGap(18, 18, 18)
                            .addComponent(label15)
                            .addGap(0, 0, 0)
                            .addComponent(label16)
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(label17)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(label19)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(label2)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(checkBox3)))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label3)
                                .addComponent(checkBox4))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(checkBox5)
                            .addGap(40, 40, 40)
                            .addComponent(checkBox6)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(checkBox7)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(checkBox8)
                            .addGap(93, 93, 93))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(checkBox1)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(checkBox2)
                                    .addGap(240, 240, 240))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addGap(189, 189, 189)
                                            .addComponent(checkBox9)
                                            .addGap(0, 0, 0)
                                            .addComponent(checkBox10)
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(checkBox11))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addGroup(contentPaneLayout.createParallelGroup()
                                                .addComponent(label7)
                                                .addComponent(checkBox12))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(contentPaneLayout.createParallelGroup()
                                                .addComponent(label8)
                                                .addComponent(checkBox13))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(contentPaneLayout.createParallelGroup()
                                                .addComponent(label9)
                                                .addComponent(checkBox14))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(label10)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(label11)
                                                .addComponent(checkBox15))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(contentPaneLayout.createParallelGroup()
                                                .addComponent(label12)
                                                .addComponent(checkBox16))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(label13)
                                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label14))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(label21, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label22))))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))))
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label20)
                        .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label5)
                        .addComponent(label18))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(progressBar1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Foo
    private JLabel label1;
    private JLabel label2;
    private JCheckBox checkBox1;
    private JLabel label3;
    private JCheckBox checkBox2;
    private JLabel label4;
    private JProgressBar progressBar1;
    private JLabel label5;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JLabel label6;
    private JLabel label7;
    private JCheckBox checkBox3;
    private JLabel label8;
    private JCheckBox checkBox4;
    private JLabel label9;
    private JCheckBox checkBox5;
    private JLabel label10;
    private JLabel label11;
    private JCheckBox checkBox6;
    private JLabel label12;
    private JCheckBox checkBox7;
    private JLabel label13;
    private JTextField textField1;
    private JLabel label14;
    private JCheckBox checkBox8;
    private JLabel label15;
    private JLabel label16;
    private JLabel label17;
    private JCheckBox checkBox9;
    private JCheckBox checkBox10;
    private JCheckBox checkBox11;
    private JLabel label18;
    private JLabel label19;
    private JComboBox comboBox1;
    private JLabel label20;
    private JComboBox comboBox2;
    private JLabel label21;
    private JTextField textField2;
    private JLabel label22;
    private JCheckBox checkBox12;
    private JCheckBox checkBox13;
    private JCheckBox checkBox14;
    private JCheckBox checkBox15;
    private JCheckBox checkBox16;
    private JLabel label23;
    private JLabel label24;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
