/*
 * Created by JFormDesigner on Wed Sep 18 21:13:35 AFT 2019
 */

package dreambot.guis;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * Copyright (C) <2019>  <Kye-T>
 * See dtohh.main.Script for GNU license.
 *
 * Example GUI
 */

public class Welcome extends JFrame {

    public Welcome() {
        initComponents();
        pack();
        setVisible(true);
    }

    public void startScript() {
        synchronized (this) {
            this.notifyAll();
        }
        setVisible(false);
        dispose();
    }

    private void button1ActionPerformed(ActionEvent e) {
        startScript();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Foo
        button1 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //---- button1 ----
        button1.setText("Start");
        button1.addActionListener(e -> button1ActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(151, 151, 151)
                    .addComponent(button1)
                    .addContainerGap(155, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(118, Short.MAX_VALUE)
                    .addComponent(button1)
                    .addGap(113, 113, 113))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Foo
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
