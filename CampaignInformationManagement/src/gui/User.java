/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.UsersDAO;
import dto.Users;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class User extends javax.swing.JInternalFrame {

    UsersDAO dao = null;
    int rowSelected = -1;

    /**
     * Creates new form User
     */
    public User() {
        initComponents();
        dao = new UsersDAO();
        loadTableUser(dao.readAll());
        Combobox();
        javax.swing.plaf.InternalFrameUI ui = this.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) ui).setNorthPane(null);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnBg = new javax.swing.JPanel();
        spUser = new javax.swing.JScrollPane();
        tbUser = new javax.swing.JTable();
        tfUserid = new javax.swing.JTextField();
        tfUsername = new javax.swing.JTextField();
        tfPassword = new javax.swing.JTextField();
        btCreate = new javax.swing.JButton();
        btReset = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbRoleid = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(730, 450));

        pnBg.setBackground(new java.awt.Color(255, 255, 255));
        pnBg.setPreferredSize(new java.awt.Dimension(730, 450));
        pnBg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        spUser.setBackground(new java.awt.Color(255, 255, 255));
        spUser.setBorder(null);

        tbUser.setAutoCreateRowSorter(true);
        tbUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tbUser.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tbUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbUser.setGridColor(new java.awt.Color(255, 255, 255));
        tbUser.setRowHeight(25);
        tbUser.setSelectionBackground(new java.awt.Color(122, 72, 221));
        tbUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbUserMouseClicked(evt);
            }
        });
        spUser.setViewportView(tbUser);

        pnBg.add(spUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 130, 580, 290));

        tfUserid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(85, 65, 118)));
        pnBg.add(tfUserid, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 88, 130, -1));

        tfUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(85, 65, 118)));
        pnBg.add(tfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 88, 130, -1));

        tfPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(85, 65, 118)));
        pnBg.add(tfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 88, 130, -1));

        btCreate.setText("Create");
        btCreate.setPreferredSize(new java.awt.Dimension(80, 30));
        btCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCreateActionPerformed(evt);
            }
        });
        pnBg.add(btCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 20, -1, -1));

        btReset.setText("Reset");
        btReset.setPreferredSize(new java.awt.Dimension(80, 30));
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });
        pnBg.add(btReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 20, -1, -1));

        btUpdate.setText("Update");
        btUpdate.setPreferredSize(new java.awt.Dimension(80, 30));
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });
        pnBg.add(btUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 20, -1, -1));

        btDelete.setText("Delete");
        btDelete.setPreferredSize(new java.awt.Dimension(80, 30));
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });
        pnBg.add(btDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 20, 79, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(85, 65, 118));
        jLabel2.setText("User ID");
        pnBg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 68, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(85, 65, 118));
        jLabel3.setText("Username");
        pnBg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 68, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(85, 65, 118));
        jLabel4.setText("Password");
        pnBg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 68, -1, -1));

        cbRoleid.setForeground(new java.awt.Color(85, 65, 118));
        pnBg.add(cbRoleid, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 90, 120, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(85, 65, 118));
        jLabel1.setText("Role ID");
        pnBg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnBg, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnBg, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUserMouseClicked
        // TODO add your handling code here:
        rowSelected = tbUser.getSelectedRow();
        String userid = (String) tbUser.getValueAt(rowSelected, 0);
        String username = (String) tbUser.getValueAt(rowSelected, 1);
        String password = (String) tbUser.getValueAt(rowSelected, 2);

        tfUserid.setText(userid);
        tfUserid.setEditable(false);
        tfUsername.setText(username);
        tfPassword.setText(password);
    }//GEN-LAST:event_tbUserMouseClicked

    private void btCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCreateActionPerformed
        // TODO add your handling code here:
        if (tfUserid.getText().trim().equals("") || tfUsername.getText().trim().equals("") || tfPassword.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please complete all information");
        } else {
            String userid = tfUserid.getText().trim();
            String username = tfUsername.getText().trim();
            String password = tfPassword.getText().trim();
            int roleid;
            if (cbRoleid.getSelectedItem().equals("Manager")) {
                roleid = 2;
            } else {
                roleid = 3;
            }
            Users u = new Users(userid, username, password, roleid);
            if (dao.readByUserid(userid) != null) {
                JOptionPane.showMessageDialog(null, "ID already exists");
            } else if (dao.create(u) != null) {
                JOptionPane.showMessageDialog(null, "Success");
                loadTableUser(dao.readAll());
                tfUserid.setEditable(true);
                tfUserid.setText("");
                tfUsername.setText("");
                tfPassword.setText("");
            }
        }
    }//GEN-LAST:event_btCreateActionPerformed

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        // TODO add your handling code here:
        tfUserid.setEditable(true);
        tfUserid.setText("");
        tfUsername.setText("");
        tfPassword.setText("");
        rowSelected = -1;
    }//GEN-LAST:event_btResetActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        // TODO add your handling code here:
        if (rowSelected == -1) {
            JOptionPane.showMessageDialog(null, "Please select the row");
        } else if (tfUsername.getText().trim().equals("") || tfPassword.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please complete all information");
        } else {
            String userid = tfUserid.getText().trim();
            String username = tfUsername.getText().trim();
            String password = tfPassword.getText().trim();
            int roleid;
            if (cbRoleid.getSelectedItem().equals("Manager")) {
                roleid = 2;
            } else {
                roleid = 3;
            }
            Users u = new Users(userid, username, password, roleid);
            if (dao.update(u) != null) {
                JOptionPane.showMessageDialog(null, "Success");
                loadTableUser(dao.readAll());
                tfUserid.setEditable(true);
                tfUserid.setText("");
                tfUsername.setText("");
                tfPassword.setText("");
                rowSelected = -1;
            }
        }
    }//GEN-LAST:event_btUpdateActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        // TODO add your handling code here:
        if (rowSelected == -1) {
            JOptionPane.showMessageDialog(null, "Please select the row");
        } else {
            String userid = (String) tbUser.getValueAt(rowSelected, 0);
            if (dao.delete(userid)) {
                JOptionPane.showMessageDialog(null, "Success");
                loadTableUser(dao.readAll());
                tfUserid.setEditable(true);
                tfUserid.setText("");
                tfUsername.setText("");
                tfPassword.setText("");
                rowSelected = -1;
            }
        }
    }//GEN-LAST:event_btDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCreate;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btReset;
    private javax.swing.JButton btUpdate;
    private javax.swing.JComboBox<String> cbRoleid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel pnBg;
    private javax.swing.JScrollPane spUser;
    private javax.swing.JTable tbUser;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfUserid;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables

    private void Combobox() {
        cbRoleid.addItem("Manager");
        cbRoleid.addItem("Reporter");
    }

    private void loadTableUser(List<Users> readAll) {
        Vector column = new Vector();
        column.add("USER ID");
        column.add("USERNAME");
        column.add("PASSWORD");
        column.add("ROLE ID");
        Vector rows = new Vector();
        for (Users u : readAll) {
            if (u.getRoleid() != 1) {
                Vector row = new Vector();
                row.add(u.getUserid());
                row.add(u.getUsername());
                row.add(u.getPassword());
                row.add(u.getRoleid());
                rows.add(row);
            }
        }
        tbUser.setModel(new DefaultTableModel(rows, column));
        tbUser.updateUI();
        spUser.setViewportView(this.tbUser);
    }
}