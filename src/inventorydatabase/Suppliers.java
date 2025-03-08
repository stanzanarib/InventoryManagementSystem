/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorydatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class Suppliers extends javax.swing.JFrame {

    /**
     * Creates new form Suppliers
     */
    public Suppliers() {
        initComponents();
        setLocationRelativeTo(null);
        getAllSuppliers();
    }
    static ArrayList<Supplier> supplierList = new ArrayList();
    int supplieId = 0;

    public ArrayList<Supplier> getAllSuppliers() {
        supplierList.removeAll(supplierList);
        String query = "SELECT supplier_id, supplier_name, contact_name, contact_email, contact_phone, address, created_at, updated_at FROM suppliers";

        try (
                Connection connection = DatabaseConnection.getConnection();
                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(query)) {

            while (rs.next()) {
                int supplier_id = rs.getInt("supplier_id");
                String supplier_name = rs.getString("supplier_name");
                String contact_name = rs.getString("contact_name");
                String contact_phone = rs.getString("contact_phone");
                String contact_email = rs.getString("contact_email");
                String address = rs.getString("address");
                String created_at = rs.getString("created_at");
                String updated_at = rs.getString("updated_at");

                Supplier supplier = new Supplier(supplier_id, supplier_name, contact_name, contact_phone, contact_email, address, created_at, updated_at);
                supplierList.add(supplier);

            }

            updateTable();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return supplierList;
    }

    private void updateTable() {
        DefaultTableModel model = (DefaultTableModel) SupplierTable.getModel();
        model.setRowCount(0);

        for (Supplier supplier : supplierList) {
            Object[] row = {supplier.getSupplierId(), supplier.getSupplierName(), supplier.getContactName(), supplier.getContactPhone(), supplier.getContactEmail(), supplier.getAddress()};
            model.addRow(row);
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

        jPanel1 = new javax.swing.JPanel();
        SupplierNameTextField = new javax.swing.JTextField();
        ContactNumberTextField = new javax.swing.JLabel();
        contactName = new javax.swing.JLabel();
        ContactNameTextField = new javax.swing.JTextField();
        SupplierEmailTextField = new javax.swing.JTextField();
        supplierNameLabel = new javax.swing.JLabel();
        EmailAddressLabel = new javax.swing.JLabel();
        ContactNumberField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AddressArea = new javax.swing.JTextArea();
        resetBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        SupplierTable = new javax.swing.JTable();
        SupplierId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 640));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        ContactNumberTextField.setText("Contact Number");

        contactName.setText("Contact Name");

        SupplierEmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierEmailTextFieldActionPerformed(evt);
            }
        });

        supplierNameLabel.setText("Supplier Name");

        EmailAddressLabel.setText("Email Address");

        ContactNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactNumberFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Address");

        AddressArea.setColumns(20);
        AddressArea.setRows(5);
        jScrollPane1.setViewportView(AddressArea);

        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(SupplierEmailTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                .addComponent(SupplierNameTextField, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(EmailAddressLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ContactNameTextField)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ContactNumberTextField)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(ContactNumberField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(supplierNameLabel)
                                .addGap(165, 165, 165)
                                .addComponent(contactName))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(resetBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SaveBtn)))
                        .addGap(0, 157, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supplierNameLabel)
                    .addComponent(contactName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ContactNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(SupplierNameTextField)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailAddressLabel)
                    .addComponent(ContactNumberTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ContactNumberField, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(SupplierEmailTextField))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetBtn)
                    .addComponent(jButton2)
                    .addComponent(SaveBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        SupplierTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier Id", "Supplier Name", "Contact Name", "Email Address", "Contact Number", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SupplierTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupplierTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(SupplierTable);

        SupplierId.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("#");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SupplierId, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(SupplierId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContactNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContactNumberFieldActionPerformed

    private void SupplierTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierTableMouseClicked
        // TODO add your handling code here:

        int row = SupplierTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) SupplierTable.getModel();

        String categoryIdStr = model.getValueAt(row, 0).toString();
        SupplierId.setText(categoryIdStr); // Set the text in the CategoryId field
        supplieId = Integer.parseUnsignedInt(categoryIdStr); // Parse the integer
        SupplierNameTextField.setText(model.getValueAt(row, 1).toString());
        ContactNameTextField.setText(model.getValueAt(row, 2).toString());
        SupplierEmailTextField.setText(model.getValueAt(row, 3).toString());
        ContactNumberField.setText(model.getValueAt(row, 4).toString());
        AddressArea.setText(model.getValueAt(row, 5).toString());
    }//GEN-LAST:event_SupplierTableMouseClicked

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (!SupplierId.getText().isEmpty()) {
            EditSupplier();
            return;
        }
        CreateSupplier();
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void SupplierEmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierEmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SupplierEmailTextFieldActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
        resetFields();
    }//GEN-LAST:event_resetBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DeleteSupplier();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Suppliers().setVisible(true);
            }
        });
    }

    public void resetFields() {
        SupplierNameTextField.setText("");
        ContactNameTextField.setText("");
        ContactNumberField.setText("");
        SupplierEmailTextField.setText("");
        AddressArea.setText("");
        SupplierId.setText("");

    }

    public void CreateSupplier() {

        String supplierName = SupplierNameTextField.getText();
        String contactName = ContactNameTextField.getText();
        String contactNumber = ContactNameTextField.getText();
        String emailAddress = EmailAddressLabel.getText();
        String address = AddressArea.getText();

        try (Connection connection = DatabaseConnection.getConnection()) {

            String query = "INSERT INTO suppliers (supplier_name, contact_name,contact_email,contact_phone,address) VALUES(?,?,?,?,?)";

            try (PreparedStatement statement = connection.prepareStatement(query)) {

                statement.setString(1, supplierName);
                statement.setString(2, contactName);
                statement.setString(3, contactNumber);
                statement.setString(4, emailAddress);
                statement.setString(5, address);
                int rowsAffected = statement.executeUpdate();
                if (rowsAffected > 0) {
                    //success message
                    JOptionPane.showMessageDialog(null, "Category Created Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                    resetFields();
                    getAllSuppliers();
                } else {
                    // fail message
                    JOptionPane.showMessageDialog(null, "Creation failed ", "Warning", JOptionPane.ERROR_MESSAGE);
                    resetFields();
                }

            } catch (Exception ex) {

            }

        } catch (Exception ex) {

        }

    }

    public void EditSupplier() {
        String supplierName = SupplierNameTextField.getText();
        String contactName = ContactNameTextField.getText();
        String contactNumber = ContactNumberField.getText();
        String emailAddress = EmailAddressLabel.getText();
        String address = AddressArea.getText();

        if (supplierName.isEmpty()) {
            // Show an error message if category name is empty
            JOptionPane.showMessageDialog(null, "Supplier name is required.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (Connection connection = DatabaseConnection.getConnection()) {
            // Assuming you have a CategoryId text field or some way to get the ID
            int supplierId = Integer.parseInt(SupplierId.getText());

            String query = "UPDATE suppliers SET supplier_name = ?, contact_name = ?, contact_email = ?, contact_phone =?, address = ? WHERE supplier_id = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, supplierName);
                statement.setString(2, contactName);
                statement.setString(3, contactNumber);
                statement.setString(4, emailAddress);
                statement.setString(5, address);
                statement.setInt(6, supplierId);

                int rowsUpdated = statement.executeUpdate();
                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(null, "Supplier updated successfully.");
                    getAllSuppliers();
                    resetFields();
                } else {
                    JOptionPane.showMessageDialog(null, "No Supplier found with the given ID.", "Warning", JOptionPane.WARNING_MESSAGE);
                    resetFields();
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid supplier ID.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            ex.printStackTrace(); // For debugging
            JOptionPane.showMessageDialog(null, "Error updating supplier: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void DeleteSupplier() {
        try (Connection connection = DatabaseConnection.getConnection()) {
            // Get the category ID from the text field
            int supplierId = Integer.parseInt(SupplierId.getText());

            // Confirm before deleting
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this supplier?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
            if (confirm != JOptionPane.YES_OPTION) {
                return; // Exit if user cancels
            }

            // SQL query to delete the category by ID
            String query = "DELETE FROM suppliers WHERE supplier_id = ?";
            try (PreparedStatement stmt = connection.prepareStatement(query)) {
                stmt.setInt(1, supplierId);

                int rowsDeleted = stmt.executeUpdate();
                if (rowsDeleted > 0) {
                    JOptionPane.showMessageDialog(null, "Supplier deleted successfully.");
                    getAllSuppliers();
                    resetFields();
                } else {
                    JOptionPane.showMessageDialog(null, "No Supplier found with the given ID.", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Supplier ID.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            ex.printStackTrace(); // For debugging
            JOptionPane.showMessageDialog(null, "Error deleting Supplier: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AddressArea;
    private javax.swing.JTextField ContactNameTextField;
    private javax.swing.JTextField ContactNumberField;
    private javax.swing.JLabel ContactNumberTextField;
    private javax.swing.JLabel EmailAddressLabel;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JTextField SupplierEmailTextField;
    private javax.swing.JTextField SupplierId;
    private javax.swing.JTextField SupplierNameTextField;
    private javax.swing.JTable SupplierTable;
    private javax.swing.JLabel contactName;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton resetBtn;
    private javax.swing.JLabel supplierNameLabel;
    // End of variables declaration//GEN-END:variables

}
