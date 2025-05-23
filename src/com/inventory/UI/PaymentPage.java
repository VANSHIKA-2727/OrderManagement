/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.UI;
import com.inventory.DTO.PaymentDTO;
import com.inventory.DAO.PaymentDAO;
import com.inventory.DAO.VendorDAO;
import com.inventory.DTO.ProductDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.Date;  // Add this import statement
import java.text.ParseException;
import java.text.SimpleDateFormat;


/**
 *
 * @author asjad
 */
public class PaymentPage extends javax.swing.JPanel {

    PaymentDTO PaymenttDTO;
    String username = null;
    String supplier = null;
    Dashboard dashboard;
    Dashboard1 dashboard1;
    Dashboard2 dashboard2;
    int quantity;
    String prodCode = null;
    
    /**
     * Creates new form PurchasePage
     */
    
    public PaymentPage(Dashboard dashboard) {
        initComponents();
        this.dashboard = dashboard;
        loadComboBox();
        loadDataSet();
    }
    
     public PaymentPage(Dashboard1 dashboard1) {
        initComponents();
        this.dashboard1 = dashboard1;
        loadComboBox();
        loadDataSet();
    }
      public PaymentPage(Dashboard2 dashboard2) {
        initComponents();
        this.dashboard2 = dashboard2;
        loadComboBox();
        loadDataSet();
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
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        codeText = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        quantityText = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        addButton3 = new javax.swing.JButton();
        editButton3 = new javax.swing.JButton();
        deleteButton3 = new javax.swing.JButton();
        date = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        purchaseTable = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setText("PURCHASE");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Purchase Product"));

        jLabel3.setText("OrderID");

        jLabel4.setText("PaymentID");

        jLabel5.setText("TransactionDate ");

        jLabel6.setText("PaymentMethod");

        codeText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codeTextKeyReleased(evt);
            }
        });

        quantityText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityTextActionPerformed(evt);
            }
        });

        clearButton.setText("CLEAR");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        addButton3.setText("Add");
        addButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton3ActionPerformed(evt);
            }
        });

        editButton3.setText("Edit");
        editButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButton3ActionPerformed(evt);
            }
        });

        deleteButton3.setText("Delete");
        deleteButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButton3ActionPerformed(evt);
            }
        });

        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(codeText))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addButton3)
                                .addGap(28, 28, 28)
                                .addComponent(editButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(deleteButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quantityText))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameText)
                                    .addComponent(date))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton3)
                    .addComponent(editButton3)
                    .addComponent(deleteButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clearButton))
        );

        purchaseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        purchaseTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purchaseTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(purchaseTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        codeText.setText("");
        nameText.setText("");
        date.setText("");
        quantityText.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void purchaseTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseTableMouseClicked
         int row = purchaseTable.getSelectedRow();
        if (row >= 0) {
            codeText.setText(purchaseTable.getValueAt(row, 0).toString()); // PaymentID
            nameText.setText(purchaseTable.getValueAt(row, 1).toString()); // ProductID
            date.setText(purchaseTable.getValueAt(row, 3).toString()); // TransactionDate
            quantityText.setText(purchaseTable.getValueAt(row, 2).toString()); // PaymentMode
        }
    }//GEN-LAST:event_purchaseTableMouseClicked

    private void codeTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeTextKeyReleased
        try {
    // Get payment details by PaymentID
    ResultSet resultSet = new PaymentDAO().getPaymentById(Integer.parseInt(codeText.getText()));
    
    if (resultSet.next()) {
        // Set payment information in the form fields
        nameText.setText(String.valueOf(resultSet.getInt("OrderID"))); // Show OrderID
        quantityText.setText(resultSet.getString("PaymentMode")); // Show Payment Method
        date.setText(resultSet.getDate("TransactionDate").toString()); // Show Transaction Date
    } else {
        // Clear fields if no payment found
        nameText.setText("");
        quantityText.setText("");
        date.setText("");
    }
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Please enter a valid numeric Payment ID");
    nameText.setText("");
} catch (SQLException e) {
    JOptionPane.showMessageDialog(this, "Database error while fetching payment: " + e.getMessage());
    e.printStackTrace();
}

    }//GEN-LAST:event_codeTextKeyReleased

    private void addButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton3ActionPerformed
   PaymentDTO paymentDTO = new PaymentDTO();

// Validate fields
if (nameText.getText().isEmpty() || codeText.getText().isEmpty()) {
    JOptionPane.showMessageDialog(this, 
        "Please enter Payment ID and Order ID ",
        "Missing Information", 
        JOptionPane.WARNING_MESSAGE);
    return;
}

// Parse values safely
try {
    paymentDTO.setPaymentID(Integer.parseInt(nameText.getText()));
    paymentDTO.setOrderID(Integer.parseInt(codeText.getText()));
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, 
        "Payment ID and Order ID must be numeric",
        "Invalid Input", 
        JOptionPane.ERROR_MESSAGE);
    return;
}


// Set other details
if (quantityText.getText().isEmpty()){
 paymentDTO.setPaymentMode();}
else {
paymentDTO.setPaymentMode(quantityText.getText());}
paymentDTO.setTransactionDate(new java.util.Date());

// Call DAO
boolean insertionSuccess = new PaymentDAO().insertPayment(paymentDTO);

if (insertionSuccess) {
    loadDataSet();
    clearButtonActionPerformed(evt);
    JOptionPane.showMessageDialog(this,
        "Payment recorded successfully!",
        "Success",
        JOptionPane.INFORMATION_MESSAGE);
} else {
    JOptionPane.showMessageDialog(this,
        "Failed to save payment. Please check Payment ID + Order ID uniqueness or DB connection.",
        "Insert Failed",
        JOptionPane.ERROR_MESSAGE);
}


    }//GEN-LAST:event_addButton3ActionPerformed

    private void editButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButton3ActionPerformed
    if (purchaseTable.getSelectedRow() < 0) {
        JOptionPane.showMessageDialog(this, "Please select a payment from the table.");
        return;
    }
    
    PaymentDTO paymentDTO = new PaymentDTO();
    
    if (nameText.getText().isEmpty() || quantityText.getText().isEmpty() || date.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter all the required details.");
        return;
    }
    
    try {
        // Set values from form fields
        paymentDTO.setPaymentID(Integer.parseInt(codeText.getText()));
        paymentDTO.setOrderID(Integer.parseInt(nameText.getText()));
        paymentDTO.setPaymentMode(quantityText.getText());
        
        // Parse date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        paymentDTO.setTransactionDate(sdf.parse(date.getText()));
        
        // Update in database
        boolean updated = new PaymentDAO().updatePayment(paymentDTO);
        if (updated) {
            JOptionPane.showMessageDialog(this, "Payment updated successfully!");
            loadDataSet();
        } else {
            JOptionPane.showMessageDialog(this, 
                "Failed to update payment",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, 
            "Invalid number format in ID fields",
            "Input Error",
            JOptionPane.ERROR_MESSAGE);
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(this, 
            "Invalid date format. Please use YYYY-MM-DD",
            "Format Error",
            JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_editButton3ActionPerformed

    private void deleteButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButton3ActionPerformed
        if (purchaseTable.getSelectedRow() < 0) {
        JOptionPane.showMessageDialog(null, "Please select a payment from the table.");
        return;
    }
    
    try {
        int paymentId = Integer.parseInt(codeText.getText());
        int opt = JOptionPane.showConfirmDialog(
            null,
            "Are you sure you want to delete this payment?",
            "Confirmation",
            JOptionPane.YES_NO_OPTION);
        
        if (opt == JOptionPane.YES_OPTION) {
            boolean deleted = new PaymentDAO().deletePayment(paymentId);
            if (deleted) {
                JOptionPane.showMessageDialog(null, "Payment deleted successfully!");
                loadDataSet();
                clearButtonActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(null, 
                    "Payment not found or could not be deleted",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, 
            "Invalid Payment ID format",
            "Input Error",
            JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_deleteButton3ActionPerformed

    private void quantityTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTextActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    // Method to load and update combo box containing supplier names
    public void loadComboBox() {
//        try {
//        // If you need to load payment modes (like Cash, Credit Card, etc.)
//        PaymentDAO paymentDAO = new PaymentDAO();
//        PaymentModeCombo.setModel(paymentDAO.getPaymentModesModel());
//        
//        // Or if you still need vendors for some reason
//        VendorDAO vendorDAO = new VendorDAO();
//        vendorCombo.setModel(vendorDAO.setComboItems(vendorDAO.getQueryResult()));
//    } catch (SQLException e) {
//        JOptionPane.showMessageDialog(this, "Error loading combo boxes: " + e.getMessage(),
//                                    "Database Error", JOptionPane.ERROR_MESSAGE);
//        e.printStackTrace();
//    }
    }

    // Method to load data into table
    public void loadDataSet() {
        try {
        PaymentDAO paymentDAO = new PaymentDAO();
        purchaseTable.setModel(paymentDAO.buildTableModel(paymentDAO.getAllPayments()));
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error loading payment data: " + e.getMessage(),
                                    "Database Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    }

    // Method to display search result in table
    public void loadSearchData(String text) {
        try {
        PaymentDAO paymentDAO = new PaymentDAO();
        purchaseTable.setModel(paymentDAO.buildTableModel(paymentDAO.searchPayments(text)));
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error searching payments: " + e.getMessage(),
                                    "Database Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton3;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField codeText;
    private javax.swing.JTextField date;
    private javax.swing.JButton deleteButton3;
    private javax.swing.JButton editButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameText;
    private javax.swing.JTable purchaseTable;
    private javax.swing.JTextField quantityText;
    // End of variables declaration//GEN-END:variables
}
