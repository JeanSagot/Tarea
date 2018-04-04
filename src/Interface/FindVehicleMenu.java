/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import domain.Car;
import file.CarFile;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author richar
 */
public class FindVehicleMenu extends javax.swing.JFrame {

    /**
     * Creates new form FindVehicleMenu
     */
    
    File file = new File("./car.dat");
    CarFile carfile = new CarFile(file);
    Car  c;
    
    boolean american;
    
    public FindVehicleMenu() throws IOException {
        
        initComponents();
        this.setLocationRelativeTo(null);
        c = new Car();
        
        jTf_Name.setEnabled(false);
        jTf_Year.setEnabled(false);
        jRb_No.setEnabled(false);
        jRb_Yes.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLb_FindVehicle = new javax.swing.JLabel();
        jLb_SerialNumber = new javax.swing.JLabel();
        jTxf_SerialNumber = new javax.swing.JTextField();
        jBtn_Search = new javax.swing.JButton();
        jBtn_Update = new javax.swing.JButton();
        jBtn_Delete = new javax.swing.JButton();
        jBtn_Back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLb_Year = new javax.swing.JLabel();
        jRb_Yes = new javax.swing.JRadioButton();
        jRb_No = new javax.swing.JRadioButton();
        jLb_Year1 = new javax.swing.JLabel();
        jTf_Name = new javax.swing.JTextField();
        jTf_Year = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLb_FindVehicle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLb_FindVehicle.setText("Find Vehicle");

        jLb_SerialNumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLb_SerialNumber.setText("Serial Number:");

        jTxf_SerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxf_SerialNumberActionPerformed(evt);
            }
        });

        jBtn_Search.setText("Search");
        jBtn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_SearchActionPerformed(evt);
            }
        });

        jBtn_Update.setText("Update");
        jBtn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_UpdateActionPerformed(evt);
            }
        });

        jBtn_Delete.setText("Delete");
        jBtn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_DeleteActionPerformed(evt);
            }
        });

        jBtn_Back.setText("Back");
        jBtn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_BackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Name:");

        jLb_Year.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLb_Year.setText("Year:");

        jRb_Yes.setText("Yes");
        jRb_Yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRb_YesActionPerformed(evt);
            }
        });

        jRb_No.setText("No");
        jRb_No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRb_NoActionPerformed(evt);
            }
        });

        jLb_Year1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLb_Year1.setText("American:");

        jTf_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTf_NameActionPerformed(evt);
            }
        });

        jTf_Year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTf_YearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(217, 217, 217)
                                .addComponent(jLb_FindVehicle))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jBtn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jBtn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLb_SerialNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxf_SerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jBtn_Search))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLb_Year1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRb_Yes)
                                        .addGap(10, 10, 10)
                                        .addComponent(jRb_No))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLb_Year, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTf_Year, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTf_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 159, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtn_Back)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLb_FindVehicle)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLb_SerialNumber)
                    .addComponent(jTxf_SerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTf_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLb_Year)
                    .addComponent(jTf_Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLb_Year1)
                    .addComponent(jRb_Yes)
                    .addComponent(jRb_No))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtn_Back)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxf_SerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxf_SerialNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxf_SerialNumberActionPerformed

    private void jBtn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_SearchActionPerformed

        try {
            if(carfile.findCar(Integer.parseInt(jTxf_SerialNumber.getText())) == true){
                JOptionPane.showMessageDialog(null, "Car found!");
                jTf_Name.setEnabled(true);
                jTf_Year.setEnabled(true);
                jRb_No.setEnabled(true);
                jRb_Yes.setEnabled(true);
                    }else
                JOptionPane.showMessageDialog(null, "Car not found!");
            
            
        } catch (IOException ex) {
            Logger.getLogger(FindVehicleMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jBtn_SearchActionPerformed

    private void jBtn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_DeleteActionPerformed

        
        try {
            carfile.deleteCar(Integer.parseInt(jTxf_SerialNumber.getText()));
        } catch (IOException ex) {
            Logger.getLogger("2"+ex);
        }
    }//GEN-LAST:event_jBtn_DeleteActionPerformed

    private void jBtn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_BackActionPerformed
        this.setVisible(false);
        this.dispose();
        try {
            Interface interfaz = new Interface();
            interfaz.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger("1"+ex);
        }
    }//GEN-LAST:event_jBtn_BackActionPerformed

    private void jRb_YesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRb_YesActionPerformed
        // TODO add your handling code here:
        american = true;
    }//GEN-LAST:event_jRb_YesActionPerformed

    private void jRb_NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRb_NoActionPerformed
        // TODO add your handling code here:
        american = false;
    }//GEN-LAST:event_jRb_NoActionPerformed

    private void jTf_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTf_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTf_NameActionPerformed

    private void jTf_YearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTf_YearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTf_YearActionPerformed

    private void jBtn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_UpdateActionPerformed
   
        try {
            carfile.updateCar(jTf_Name.getText(), Integer.parseInt(jTf_Year.getText()),
                    american, Integer.parseInt(jTxf_SerialNumber.getText()));
            JOptionPane.showMessageDialog(null, "Car was modified successfully");
        } catch (IOException ex) {
            Logger.getLogger(FindVehicleMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBtn_UpdateActionPerformed

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
            java.util.logging.Logger.getLogger(FindVehicleMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FindVehicleMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FindVehicleMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FindVehicleMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FindVehicleMenu().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(FindVehicleMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_Back;
    private javax.swing.JButton jBtn_Delete;
    private javax.swing.JButton jBtn_Search;
    private javax.swing.JButton jBtn_Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLb_FindVehicle;
    private javax.swing.JLabel jLb_SerialNumber;
    private javax.swing.JLabel jLb_Year;
    private javax.swing.JLabel jLb_Year1;
    private javax.swing.JRadioButton jRb_No;
    private javax.swing.JRadioButton jRb_Yes;
    private javax.swing.JTextField jTf_Name;
    private javax.swing.JTextField jTf_Year;
    private javax.swing.JTextField jTxf_SerialNumber;
    // End of variables declaration//GEN-END:variables
}