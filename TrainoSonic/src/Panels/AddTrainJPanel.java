/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import java.awt.Color;
import java.util.Date;
import trainticketreservationsystem.Train;

/**
 *
 * @author welcome
 */
public class AddTrainJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddTrainJPanel
     */
    public AddTrainJPanel() {
        initComponents();
        jTimeChooser.setShowSeconds(false);
        jTimeChooser.setShowIcon(true);
       this.setSize(720,630); 

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        IDjTextField = new javax.swing.JTextField();
        NamejTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        AddTrainjButton = new javax.swing.JButton();
        jTimeChooser = new lu.tudor.santec.jtimechooser.JTimeChooser();
        TruejLabel = new javax.swing.JLabel();
        OPjTextField = new javax.swing.JComboBox<>();
        ComboBoxjLabel = new javax.swing.JLabel();
        BGjlabel = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel1.setText("Train ID");
        add(jLabel1);
        jLabel1.setBounds(190, 157, 52, 15);

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel2.setText("Train Name");
        add(jLabel2);
        jLabel2.setBounds(190, 195, 73, 15);

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel3.setText("Origin Point");
        add(jLabel3);
        jLabel3.setBounds(190, 231, 76, 15);

        jLabel4.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel4.setText("Leaving Time");
        add(jLabel4);
        jLabel4.setBounds(190, 269, 83, 15);

        IDjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDjTextFieldActionPerformed(evt);
            }
        });
        add(IDjTextField);
        IDjTextField.setBounds(320, 155, 164, 20);
        add(NamejTextField);
        NamejTextField.setBounds(320, 193, 164, 20);

        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("*from origin*");
        add(jLabel5);
        jLabel5.setBounds(190, 295, 80, 14);

        AddTrainjButton.setText("ADD");
        AddTrainjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTrainjButtonActionPerformed(evt);
            }
        });
        add(AddTrainjButton);
        AddTrainjButton.setBounds(434, 343, 70, 40);
        add(jTimeChooser);
        jTimeChooser.setBounds(320, 269, 60, 30);
        add(TruejLabel);
        TruejLabel.setBounds(190, 343, 240, 20);

        OPjTextField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cairo", "Alexandria", "Tanta", "Minya", "Assuit" }));
        add(OPjTextField);
        OPjTextField.setBounds(320, 231, 164, 20);
        add(ComboBoxjLabel);
        ComboBoxjLabel.setBounds(497, 155, 150, 20);

        BGjlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Panels/Images/adminbackground.png"))); // NOI18N
        add(BGjlabel);
        BGjlabel.setBounds(0, 0, 720, 630);
    }// </editor-fold>//GEN-END:initComponents

    private void IDjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDjTextFieldActionPerformed

    private void AddTrainjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTrainjButtonActionPerformed
        // TODO add your handling code here:
        boolean flag = true;
        if (!IDjTextField.getText().equals("") && !NamejTextField.getText().equals("")) {
            TruejLabel.setText("");
            Train x = new Train();
            x.SetTrainName(NamejTextField.getText());
            x.SetTrainId(IDjTextField.getText());
            x.SetTrainOriginPoint((String) OPjTextField.getSelectedItem());
            Date temp = new Date();
            x.SetTrainLeavingTime(jTimeChooser.getDateWithTime(temp));
            if (x.repeatedID(IDjTextField.getText())) {
                ComboBoxjLabel.setForeground(Color.RED);
                ComboBoxjLabel.setText("Error : Repeated ID");
                flag = false;
            }
            if(!flag){
                return;
            }
            if (x.AddTrain()) {
                TruejLabel.setText("Train added successfully !");
                resetPanelData();
                ComboBoxjLabel.setText("");
            } else {
                TruejLabel.setText("Failed to add");
            }

        } else {
            TruejLabel.setText("Missing required Fields ... ! ");
        }
    }//GEN-LAST:event_AddTrainjButtonActionPerformed
    protected void resetPanelData() {
        NamejTextField.setText("");
        IDjTextField.setText("");
        OPjTextField.setSelectedIndex(0);
        jTimeChooser = new lu.tudor.santec.jtimechooser.JTimeChooser();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddTrainjButton;
    private javax.swing.JLabel BGjlabel;
    private javax.swing.JLabel ComboBoxjLabel;
    private javax.swing.JTextField IDjTextField;
    private javax.swing.JTextField NamejTextField;
    private javax.swing.JComboBox<String> OPjTextField;
    private javax.swing.JLabel TruejLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private lu.tudor.santec.jtimechooser.JTimeChooser jTimeChooser;
    // End of variables declaration//GEN-END:variables
}
