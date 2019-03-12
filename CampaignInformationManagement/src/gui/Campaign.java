/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.CampaignsDAO;
import dao.EstimatesDAO;
import dao.ManagecamsDAO;
import dao.PricesDAO;
import dao.ProductsDAO;
import dao.Products_PricesDAO;
import dao.RealitysDAO;
import dao.UsersDAO;
import dto.Campaigns;
import dto.Estimates;
import dto.Managecams;
import dto.Prices;
import dto.Products;
import dto.Products_Prices;
import dto.Realitys;
import dto.Users;
import java.awt.Color;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class Campaign extends javax.swing.JInternalFrame {

    CampaignsDAO campaigndao = null;
    ManagecamsDAO managedao = null;
    ProductsDAO productdao = null;
    Products_PricesDAO ppdao = null;
    UsersDAO userdao = null;
    EstimatesDAO estimatedao = null;
    RealitysDAO realitydao = null;
    PricesDAO pricedao = null;
    int rowSelected = -1;
   
    /**
     * Creates new form Campaign
     */
    public Campaign() {
        initComponents();
        campaigndao = new CampaignsDAO();
        managedao = new ManagecamsDAO();
        productdao = new ProductsDAO();
        userdao = new UsersDAO();
        estimatedao = new EstimatesDAO();
        realitydao = new RealitysDAO();
        ppdao = new Products_PricesDAO();
        pricedao = new PricesDAO();
        loadTableCampaign(campaigndao.readAll());
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
        spCampaign = new javax.swing.JScrollPane();
        tbCampaign = new javax.swing.JTable();
        tfCampaignid = new javax.swing.JTextField();
        tfTypeofcampaign = new javax.swing.JTextField();
        tfStartday = new javax.swing.JTextField();
        tfEndday = new javax.swing.JTextField();
        btCreate = new javax.swing.JButton();
        btReset = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbProduct = new javax.swing.JComboBox<>();
        cbManager = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(730, 450));

        pnBg.setBackground(new java.awt.Color(255, 255, 255));
        pnBg.setPreferredSize(new java.awt.Dimension(730, 450));
        pnBg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        spCampaign.setBackground(new java.awt.Color(255, 255, 255));
        spCampaign.setBorder(null);
        spCampaign.setForeground(new java.awt.Color(255, 255, 255));

        tbCampaign.setAutoCreateRowSorter(true);
        tbCampaign.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tbCampaign.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbCampaign.setGridColor(new java.awt.Color(255, 255, 255));
        tbCampaign.setRowHeight(25);
        tbCampaign.setSelectionBackground(new java.awt.Color(122, 72, 221));
        tbCampaign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCampaignMouseClicked(evt);
            }
        });
        spCampaign.setViewportView(tbCampaign);

        pnBg.add(spCampaign, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 672, 290));

        tfCampaignid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(85, 65, 118)));
        pnBg.add(tfCampaignid, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 37, 120, -1));

        tfTypeofcampaign.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(85, 65, 118)));
        pnBg.add(tfTypeofcampaign, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 37, 120, -1));

        tfStartday.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(85, 65, 118)));
        pnBg.add(tfStartday, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 120, -1));

        tfEndday.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(85, 65, 118)));
        pnBg.add(tfEndday, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 120, -1));

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(85, 65, 118));
        jLabel1.setText("Campaign ID");
        pnBg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 17, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(85, 65, 118));
        jLabel2.setText("Type Of Campaign");
        pnBg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 17, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(85, 65, 118));
        jLabel3.setText("Start Day (yyyy-MM-dd)");
        pnBg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(85, 65, 118));
        jLabel4.setText("End Day (yyyy-MM-dd)");
        pnBg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        cbProduct.setForeground(new java.awt.Color(85, 65, 118));
        cbProduct.setMaximumRowCount(100);
        pnBg.add(cbProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 120, -1));

        cbManager.setForeground(new java.awt.Color(85, 65, 118));
        cbManager.setMaximumRowCount(100);
        pnBg.add(cbManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 120, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(85, 65, 118));
        jLabel5.setText("Product");
        pnBg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(85, 65, 118));
        jLabel6.setText("Manager");
        pnBg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));

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

    private void btCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCreateActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            if (tfCampaignid.getText().trim().equals("") || tfTypeofcampaign.getText().trim().equals("") || tfStartday.getText().trim().equals("") || tfEndday.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Please complete all information");
            } else if (!isLegalDate(tfStartday.getText().trim()) || !isLegalDate(tfEndday.getText().trim())) {
                JOptionPane.showMessageDialog(null, "Enter the date incorrectly");
            } else {
                String campaignid = tfCampaignid.getText().trim();
                String typeofcampaign = tfTypeofcampaign.getText().trim();
                Date startday = new SimpleDateFormat("yyyy-MM-dd").parse(tfStartday.getText().trim());
                Date endday = new SimpleDateFormat("yyyy-MM-dd").parse(tfEndday.getText().trim());
                Campaigns campaign = new Campaigns(campaignid, typeofcampaign, startday, endday);
                int manageid = 1;
                boolean checkmanageid;
                while (true) {
                    checkmanageid = true;
                    for (Managecams m : managedao.readAll()) {
                        if (manageid == m.getManageid()) {
                            checkmanageid = false;
                            break;
                        }
                    }
                    if (checkmanageid) {
                        break;
                    }
                    manageid++;
                }
                Users u = (Users) cbManager.getSelectedItem();
                String userid = u.getUserid();
                Products p = (Products) cbProduct.getSelectedItem();
                String productid = p.getProductid();
                Managecams manage = new Managecams(manageid, userid, campaignid, productid);
                if (campaigndao.readByCampaignid(campaignid) != null) {
                    JOptionPane.showMessageDialog(null, "ID already exists");
                } else if ((campaigndao.create(campaign) != null) && (managedao.create(manage) != null)) {
                    JOptionPane.showMessageDialog(null, "Success");
                    Estimates e = new Estimates(campaign.getCampaignid(), 0, 0, 0);
                    estimatedao.create(e);
                    Realitys r = new Realitys(campaign.getCampaignid(), 0, 0);
                    realitydao.create(r);
                    loadTableCampaign(campaigndao.readAll());
                    tfCampaignid.setText("");
                    tfTypeofcampaign.setText("");
                    tfStartday.setText("");
                    tfEndday.setText("");
                    rowSelected = -1;
                    Combobox();
                }
            }
        } catch (ParseException ex) {
            Logger.getLogger(Campaign.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btCreateActionPerformed

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        // TODO add your handling code here:
        Combobox();
        tfCampaignid.setEditable(true);
        tfCampaignid.setText("");
        tfTypeofcampaign.setText("");
        tfStartday.setText("");
        tfEndday.setText("");
        rowSelected = -1;
    }//GEN-LAST:event_btResetActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        // TODO add your handling code here:
        if (rowSelected == -1) {
            JOptionPane.showMessageDialog(null, "Please select the row");
        } else if (tfTypeofcampaign.getText().trim().equals("") || tfStartday.getText().trim().equals("") || tfEndday.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please complete all information");
        } else if (!isLegalDate(tfStartday.getText().trim()) || !isLegalDate(tfEndday.getText().trim())) {
            JOptionPane.showMessageDialog(null, "Enter the date incorrectly");
        } else {
            try {
                String campaignid = tfCampaignid.getText().trim();
                String typeofcampaign = tfTypeofcampaign.getText().trim();
                Date startday = new SimpleDateFormat("yyyy-MM-dd").parse(tfStartday.getText().trim());
                Date endday = new SimpleDateFormat("yyyy-MM-dd").parse(tfEndday.getText().trim());
                Campaigns campaign = new Campaigns(campaignid, typeofcampaign, startday, endday);
                int manageid = 1;
                boolean checkmanageid;
                while (true) {
                    checkmanageid = true;
                    for (Managecams m : managedao.readAll()) {
                        if (manageid == m.getManageid()) {
                            checkmanageid = false;
                            break;
                        }
                    }
                    if (checkmanageid) {
                        break;
                    }
                    manageid++;
                }
//                for (Managecams m : managedao.readAll()) {
//                    if (campaignid.equals(m.getCampaignid())) {
//                        manageid = m.getManageid();
//                    }
//                }
                Users u = (Users) cbManager.getSelectedItem();
                String userid = u.getUserid();
                Products p = (Products) cbProduct.getSelectedItem();
                String productid = p.getProductid();
                Managecams manage = new Managecams(manageid, userid, campaignid, productid);
                if ((campaigndao.update(campaign) != null) && (managedao.update(manage) != null)) {
                    JOptionPane.showMessageDialog(null, "Success");
                    loadTableCampaign(campaigndao.readAll());
                    tfCampaignid.setText("");
                    tfCampaignid.setEditable(true);
                    tfTypeofcampaign.setText("");
                    tfStartday.setText("");
                    tfEndday.setText("");
                    rowSelected = -1;
                    Combobox();
                }
            } catch (ParseException ex) {
                Logger.getLogger(Campaign.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btUpdateActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        // TODO add your handling code here:
        if (rowSelected == -1) {
            JOptionPane.showMessageDialog(null, "Please select the row");
        } else {
            String a = (String) tbCampaign.getValueAt(rowSelected, 0);
            if (campaigndao.delete(a)) {
                JOptionPane.showMessageDialog(null, "Success");
                loadTableCampaign(campaigndao.readAll());
                tfCampaignid.setText("");
                tfCampaignid.setEditable(true);
                tfTypeofcampaign.setText("");
                tfStartday.setText("");
                tfEndday.setText("");
                rowSelected = -1;
                Combobox();
                for (Products p : productdao.readAll()) {
                    boolean check = true;
                    for (Managecams m : managedao.readAll()) {
                        if (p.getProductid().equals(m.getProductid())) {
                            check = false;
                        }
                    }
                    if (check) {
                        for (Products_Prices pp : ppdao.readAll()) {
                            if (p.getProductid().equals(pp.getProductid())) {
                                for (Prices pr : pricedao.readAll()) {
                                    if (pp.getPriceid() == pr.getPriceid()) {
                                        pricedao.delete(pr.getPriceid());
                                    }
                                }
                                ppdao.delete(pp.getId());
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btDeleteActionPerformed

    private void tbCampaignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCampaignMouseClicked
        // TODO add your handling code here:
        rowSelected = tbCampaign.getSelectedRow();
        String campaignid = (String) tbCampaign.getValueAt(rowSelected, 0);
        String typeofcampaign = (String) tbCampaign.getValueAt(rowSelected, 1);
        Date startday = (Date) tbCampaign.getValueAt(rowSelected, 4);
        Date endday = (Date) tbCampaign.getValueAt(rowSelected, 5);

        tfCampaignid.setText(campaignid);
        tfCampaignid.setEditable(false);
        tfTypeofcampaign.setText(typeofcampaign);
        tfStartday.setText(String.valueOf(startday));
        tfEndday.setText(String.valueOf(endday));
    }//GEN-LAST:event_tbCampaignMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCreate;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btReset;
    private javax.swing.JButton btUpdate;
    private javax.swing.JComboBox<Users> cbManager;
    private javax.swing.JComboBox<Products> cbProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel pnBg;
    private javax.swing.JScrollPane spCampaign;
    private javax.swing.JTable tbCampaign;
    private javax.swing.JTextField tfCampaignid;
    private javax.swing.JTextField tfEndday;
    private javax.swing.JTextField tfStartday;
    private javax.swing.JTextField tfTypeofcampaign;
    // End of variables declaration//GEN-END:variables

    private void Combobox() {
        cbProduct.removeAllItems();
        cbManager.removeAllItems();
        for (Products pp : productdao.readAll()) {
            boolean check = true;
            for (Managecams mm : managedao.readAll()) {
                if (pp.getProductid().equals(mm.getProductid())) {
                    check = false;
                }
            }
            if (check) {
                cbProduct.addItem(pp);
            }
        }
        for (Users uu : userdao.readAll()) {
            if (uu.getRoleid() == 2) {
                boolean check = true;
                for (Managecams mm : managedao.readAll()) {
                    if (uu.getUserid().equals(mm.getUserid())) {
                        check = false;
                    }
                }
                if (check) {
                    cbManager.addItem(uu);
                }
            }
        }
    }

    private void loadTableCampaign(List<Campaigns> readAll) {
        Vector column = new Vector();
        column.add("CAMPAIGN ID");
        column.add("TYPE OF CAMPAIGN");
        column.add("PRODUCT");
        column.add("MANAGE");
        column.add("START DAY");
        column.add("END DAY");
        Vector rows = new Vector();
        for (Campaigns cc : readAll) {
            Vector row = new Vector();
            row.add(cc.getCampaignid());
            row.add(cc.getTypeofcampaign());
            for (Managecams mm : managedao.readAll()) {
                if (mm.getCampaignid().equals(cc.getCampaignid())) {
                    for (Products pp : productdao.readAll()) {
                        if (mm.getProductid().equals(pp.getProductid())) {
                            row.add(pp.getProductname());
                        }
                    }
                    for (Users uu : userdao.readAll()) {
                        if (mm.getUserid().equals(uu.getUserid())) {
                            row.add(uu.getUsername());
                        }
                    }
                }
            }
            row.add(cc.getStartday());
            row.add(cc.getEndday());
            rows.add(row);
        }
        tbCampaign.setModel(new DefaultTableModel(rows, column));
        tbCampaign.updateUI();
        spCampaign.setViewportView(this.tbCampaign);
    }

    boolean isLegalDate(String s) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false);
        return sdf.parse(s, new ParsePosition(0)) != null;
    }
}
