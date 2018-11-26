/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.CountryController;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Country;
import models.Region;
import tools.Connections;

/**
 *
 * @author Andi SR
 */
public class Countries extends javax.swing.JFrame {

    Connections con = new Connections();
    CountryController Cr = new CountryController(con.getConnection());

    public Countries() {
        initComponents();
        String regionId;

        try {
            for (Country country : Cr.selectCountry()) {
                regionId = String.valueOf(country.getRegionId());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "selectCountry is " + e.getMessage());
        }

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
        txtCountryId = new javax.swing.JTextField();
        txtCountryName = new javax.swing.JTextField();
        btnSelect = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCountry = new javax.swing.JTable();
        btnGetId = new javax.swing.JButton();
        txtRegionId = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Country ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Country Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Region Id");

        btnSelect.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSelect.setText("Select");
        btnSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSelectMouseClicked(evt);
            }
        });
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });

        btnInsert.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInsert.setText("Insert");
        btnInsert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInsertMouseClicked(evt);
            }
        });
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });

        tableCountry.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Country ID", "Country Name", "Region ID"
            }
        ));
        tableCountry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCountryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCountry);

        btnGetId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGetId.setText("Get ID");
        btnGetId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGetIdMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Table Country");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(54, 54, 54)
                                .addComponent(txtRegionId))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCountryId, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(22, 22, 22)
                                        .addComponent(txtCountryName, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(86, 86, 86)
                                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnGetId, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(jLabel4)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCountryId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCountryName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGetId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegionId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectMouseClicked
        Object[] header = {"Country ID", "Country Name", "Region ID"};
        DefaultTableModel data = new DefaultTableModel(null, header);
        tableCountry.setModel(data);
        try {
            for (Country country : Cr.selectCountry()) {
                String isi1 = country.getCountryId();
                String isi2 = country.getCountryName();
                String isi3 = String.valueOf(country.getRegionId());

                String kolom[] = {isi1, isi2, isi3};
                data.addRow(kolom);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Oops! : " + e.getMessage());

        }
    }//GEN-LAST:event_btnSelectMouseClicked

    private void btnInsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertMouseClicked
        String idCountry = txtCountryId.getText();
        String nameCountry = txtCountryName.getText();
         String idRegion = txtRegionId.getText();

        if (!idCountry.equals("") && !nameCountry.equals("") && !idRegion.equals("")) {
            if (Cr.insert(idCountry, nameCountry, idRegion) == true) {
                JOptionPane.showMessageDialog(null, "Insert Country Berhasil");
            } else {
                JOptionPane.showMessageDialog(null, "Insert Country Gagal");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Insert Tidak Boleh Kosong");
        }
    }//GEN-LAST:event_btnInsertMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        String idCountry = txtCountryId.getText();
        String nameCountry = txtCountryName.getText();
        String idRegion = txtRegionId.getText();

        if (!idCountry.equals("") && !nameCountry.equals("") && !idRegion.equals("")) {
            if (Cr.update(idCountry, nameCountry, idRegion) == true) {
                JOptionPane.showMessageDialog(null, "Update Country Berhasil");
            } else {
                JOptionPane.showMessageDialog(null, "Update Country Gagal");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Form Tidak Boleh Kosong");
        }
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
//        String countryId = txtCountryId.getText();
//        if (Cr.delete(countryId) == true) {
//            JOptionPane.showMessageDialog(null, "Hapus Data berhasil");
//        } else {
//            JOptionPane.showMessageDialog(null, "Hapus Data gagal");
//        }  
//        String idCountry = txtCountryId.getText();
//       String nameCountry = txtCountryName.getText();
//       String idRegion = txtRegionId.getText();
//
//      if (!idCountry.equals("")) {
//            if (Cr.delete(idCountry) == true) {
//                JOptionPane.showMessageDialog(null, "Delete Country Berhasil");
//            } else {
//                JOptionPane.showMessageDialog(null, "Delete Country Gagal");
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "Form Tidak Boleh Kosong");
//        }
        if(txtCountryId!=null){
           if(Cr.delete(txtCountryId.getText())== true){
               JOptionPane.showMessageDialog(null, "Data dengan ID : " + txtCountryId.getText()+ "Berhasil Dihapus");
           }
           else {
               JOptionPane.showMessageDialog(null, "Gagal Menghapus Data");
           }
        
        }
        else {
               JOptionPane.showMessageDialog(null, "Form input tidak boleh kosong");
          }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void tableCountryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCountryMouseClicked
        // TODO add your handling code here:
        
        int row = tableCountry.getSelectedRow();
        int column = tableCountry.getSelectedColumn();
        String data = tableCountry.getValueAt(row, column).toString();
        String countryId = tableCountry.getValueAt(row, 0).toString();
        String countryName = tableCountry.getValueAt(row, 1).toString();
        String idRegion = tableCountry.getValueAt(row, 2).toString();
        
        txtCountryId.setText(countryId);
//        txtCountryId.setEditable(false);
        txtCountryName.setText(countryName);
        txtRegionId.setText(idRegion);
        
    }//GEN-LAST:event_tableCountryMouseClicked

    private void btnGetIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGetIdMouseClicked
        // TODO add your handling code here:

        String countryId = txtSearch.getText();
        String countryName = txtSearch.getText();
        String regionId = (String) txtSearch.getText();
        

        Object[] header = {"Country ID", "Country Name", "Region ID"};
        DefaultTableModel data = new DefaultTableModel(null, header);
        tableCountry.setModel(data);

        try {
            String object = txtSearch.getText();
            for (Country country : Cr.search(object)) {
                String isi1 = country.getCountryId();
                String isi2 = country.getCountryName();
                String isi3 = String.valueOf(country.getRegionId());

                String kolom[] = {isi1, isi2, isi3};
                data.addRow(kolom);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Oops! : " + e.getMessage());
        }
    }//GEN-LAST:event_btnGetIdMouseClicked

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
         // TODO add your handling code here:
         
//        String Object = txtSearch.getText();
//        Object[] header = {"Country ID", "Country Name", "Region ID"};
//        DefaultTableModel data = new DefaultTableModel(null, header);
//        tableCountry.setModel(data);
//        
//        try {
//            for (Country country : Cr.search(btnSearch.getText())) {
//                String isi1 = country.getCountryId();
//                String isi2 = country.getCountryName();
//                String isi3 = String.valueOf(country.getRegionId());
//               
//
//                String kolom[] = {isi1, isi2, isi3};
//                data.addRow(kolom);
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Oops! : " + e.getMessage());
//        }
        String countryId = txtSearch.getText();
        String countryName = txtSearch.getText();
        String regionId = (String) txtSearch.getText();
     

        Object[] header = {"Country ID","Country Name","Region ID"};
        DefaultTableModel data = new DefaultTableModel(null, header);
        tableCountry.setModel(data);

        String object = txtSearch.getText();
        if (countryId.equals("") && countryName.equals("") && regionId.equals("")) {
            JOptionPane.showMessageDialog(null, "Form tidak boleh kosong");
        } else {
            for (Country country: Cr.search(object)) {
                String isi1 = country.getCountryId();
                String isi2 = country.getCountryName();
                String isi3 = String.valueOf(country.getRegionId());

                String kolom[] = {isi1, isi2, isi3};
                data.addRow(kolom);
            }
        }
        
    }//GEN-LAST:event_btnSearchMouseClicked

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
            java.util.logging.Logger.getLogger(Countries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Countries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Countries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Countries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Countries().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGetId;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCountry;
    private javax.swing.JTextField txtCountryId;
    private javax.swing.JTextField txtCountryName;
    private javax.swing.JTextField txtRegionId;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
