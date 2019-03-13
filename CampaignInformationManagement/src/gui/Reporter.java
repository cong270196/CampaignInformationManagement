/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.CampaignsDAO;
import dao.EstimatesDAO;
import dao.ExchangesDAO;
import dao.ManagecamsDAO;
import dao.PricesDAO;
import dao.ProductsDAO;
import dao.Products_PricesDAO;
import dao.RealitysDAO;
import dto.Campaigns;
import dto.Estimates;
import dto.Exchanges;
import dto.Managecams;
import dto.Prices;
import dto.Products;
import dto.Products_Prices;
import dto.Realitys;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class Reporter extends javax.swing.JFrame {
    CampaignsDAO campaigndao = null;
    EstimatesDAO estimatedao = null;
    RealitysDAO realitydao = null;
    ExchangesDAO exchangedao = null;
    Products_PricesDAO ppdao = null;
    ManagecamsDAO managedao = null;
    PricesDAO pricedao = null;
    ProductsDAO productdao = null;
    
    String campaignid;
    String productid;

    /**
     * Creates new form Reporter
     */
    public Reporter() {
        initComponents();
        setLocationRelativeTo(null);
        campaigndao = new CampaignsDAO();
        estimatedao = new EstimatesDAO();
        realitydao = new RealitysDAO();
        exchangedao = new ExchangesDAO();
        ppdao = new Products_PricesDAO();
        managedao = new ManagecamsDAO();
        pricedao = new PricesDAO();
        productdao = new ProductsDAO();
        
        Combobox();
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
        pnLeft = new javax.swing.JPanel();
        pnLogOut = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnCampaign = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cbCampaign = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        pnChangePassword = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lbReBudget = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbReQuantity = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        spCampaign = new javax.swing.JScrollPane();
        tbCampaign = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbEsBudget = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lbEsQuantity = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbTotal = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbVaBudget = new javax.swing.JLabel();
        lbVaQuantity = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lbCampaignid = new javax.swing.JLabel();
        lbTofc = new javax.swing.JLabel();
        lbProduct = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lbStartday = new javax.swing.JLabel();
        lbEndday1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pnBg.setBackground(new java.awt.Color(255, 255, 255));
        pnBg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnLeft.setBackground(new java.awt.Color(54, 33, 89));
        pnLeft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnLogOut.setBackground(new java.awt.Color(54, 33, 89));
        pnLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnLogOutMouseClicked(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_logout_rounded_left_filled_20px.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Log Out");

        javax.swing.GroupLayout pnLogOutLayout = new javax.swing.GroupLayout(pnLogOut);
        pnLogOut.setLayout(pnLogOutLayout);
        pnLogOutLayout.setHorizontalGroup(
            pnLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLogOutLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnLogOutLayout.setVerticalGroup(
            pnLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLogOutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnLeft.add(pnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 270, 60));

        pnCampaign.setBackground(new java.awt.Color(85, 65, 118));
        pnCampaign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnCampaignMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Choose Campaign");

        cbCampaign.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(54, 33, 89));
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnCampaignLayout = new javax.swing.GroupLayout(pnCampaign);
        pnCampaign.setLayout(pnCampaignLayout);
        pnCampaignLayout.setHorizontalGroup(
            pnCampaignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCampaignLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnCampaignLayout.createSequentialGroup()
                .addGroup(pnCampaignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCampaignLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnCampaignLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(cbCampaign, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        pnCampaignLayout.setVerticalGroup(
            pnCampaignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCampaignLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(cbCampaign, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pnLeft.add(pnCampaign, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 270, 170));

        pnChangePassword.setBackground(new java.awt.Color(54, 33, 89));
        pnChangePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnChangePasswordMouseClicked(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_key_20px.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Change Password");

        javax.swing.GroupLayout pnChangePasswordLayout = new javax.swing.GroupLayout(pnChangePassword);
        pnChangePassword.setLayout(pnChangePasswordLayout);
        pnChangePasswordLayout.setHorizontalGroup(
            pnChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChangePasswordLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnChangePasswordLayout.setVerticalGroup(
            pnChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnChangePasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnLeft.add(pnChangePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 270, 60));
        pnLeft.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 230, 20));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_user_male_circle_filled_100px.png"))); // NOI18N
        pnLeft.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 120, 100));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Reporter");
        pnLeft.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 120, 40));

        pnBg.add(pnLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setForeground(new java.awt.Color(54, 33, 89));
        jLabel5.setText("Reality Budget ($)");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lbReBudget.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lbReBudget.setForeground(new java.awt.Color(204, 51, 0));
        lbReBudget.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lbReBudget, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 32, 170, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 170, 100));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbReQuantity.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lbReQuantity.setForeground(new java.awt.Color(204, 51, 0));
        lbReQuantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(lbReQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 30, 170, 70));

        jLabel7.setForeground(new java.awt.Color(54, 33, 89));
        jLabel7.setText("Reality Quantity");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 170, 100));

        tbCampaign.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        spCampaign.setViewportView(tbCampaign);

        jPanel1.add(spCampaign, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 730, 370));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(54, 33, 89));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Budget ($)");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 100, -1));

        lbEsBudget.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbEsBudget.setForeground(new java.awt.Color(204, 51, 0));
        lbEsBudget.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(lbEsBudget, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 100, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 100, 70));

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setForeground(new java.awt.Color(54, 33, 89));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Quantity");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 11, 90, -1));

        lbEsQuantity.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbEsQuantity.setForeground(new java.awt.Color(204, 51, 0));
        lbEsQuantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(lbEsQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 100, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 100, 70));

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

        lbTotal.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbTotal.setForeground(new java.awt.Color(204, 51, 0));
        lbTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TOTAL($)");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 190, 170));
        jPanel1.add(lbVaBudget, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 80, 10));
        jPanel1.add(lbVaQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 80, 10));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(85, 65, 118));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("X");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 30, 30));

        jPanel7.setBackground(new java.awt.Color(54, 33, 89));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 30));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(54, 33, 89));
        jLabel17.setText("CAMPAIGN ID");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(54, 33, 89));
        jLabel18.setText("TYPE OF CAMPAIGN");
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(54, 33, 89));
        jLabel19.setText("END DAY");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        lbCampaignid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbCampaignid.setForeground(new java.awt.Color(204, 51, 0));
        lbCampaignid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lbCampaignid, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, 20));

        lbTofc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTofc.setForeground(new java.awt.Color(204, 51, 0));
        lbTofc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lbTofc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 150, 20));

        lbProduct.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbProduct.setForeground(new java.awt.Color(204, 51, 0));
        lbProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lbProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 110, 20));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(54, 33, 89));
        jLabel20.setText("PRODUCT");
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(54, 33, 89));
        jLabel21.setText("START DAY");
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        lbStartday.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbStartday.setForeground(new java.awt.Color(204, 51, 0));
        lbStartday.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lbStartday, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 120, 20));

        lbEndday1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbEndday1.setForeground(new java.awt.Color(204, 51, 0));
        lbEndday1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lbEndday1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 110, 20));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 700, 80));

        pnBg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 730, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnLogOutMouseClicked
        // TODO add your handling code here:
        new LoginFrm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnLogOutMouseClicked

    private void pnChangePasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnChangePasswordMouseClicked
        // TODO add your handling code here:
        new ChangepasswordloginFrm().setVisible(true);
    }//GEN-LAST:event_pnChangePasswordMouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void pnCampaignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnCampaignMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnCampaignMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Campaigns campaign = (Campaigns) cbCampaign.getSelectedItem();
        campaignid = campaign.getCampaignid();
        lbTotal.setText("0");
        
        
        for(Managecams mm : managedao.readAll()){
            if(mm.getCampaignid().equals(campaignid)){
                productid = mm.getProductid();
                Products p = productdao.readByProductid(productid);
                lbCampaignid.setText(campaignid);
                lbTofc.setText(campaign.getTypeofcampaign());
                lbProduct.setText(p.getProductname());
                lbStartday.setText(String.valueOf(campaign.getStartday()));
                lbEndday1.setText(String.valueOf(campaign.getEndday()));
            }
        }
        Estimates estimate = null;
        Realitys reality = realitydao.readById(campaign.getCampaignid());
        List<Exchanges> listex = new ArrayList<Exchanges>();
        for(Estimates es : estimatedao.readAll()){
            if(es.getCampaignid().equals(campaign.getCampaignid())){
                estimate = new Estimates(es.getCampaignid(),  es.getBudget(), es.getTarget(), es.getVarianceallowed());
            }
        }
        for(Exchanges ex : exchangedao.readAll()){
            if(ex.getCampaignid().equals(campaign.getCampaignid())){
                listex.add(ex);
            }
        }
        
        
       
        
        lbEsBudget.setText(String.valueOf(estimate.getBudget()));
        lbEsQuantity.setText(String.valueOf(estimate.getTarget()));
        lbReBudget.setText(String.valueOf(reality.getSumbudget()));
        lbReQuantity.setText(String.valueOf(reality.getSumquantity()));
        
        loadTableExchange(campaign.getCampaignid());
        
        String estimatebudget = "0";
        String estimatequantity = "0";
        for (Estimates es : estimatedao.readAll()) {
            if (es.getCampaignid().equals(campaignid)) {
                estimatebudget = String.valueOf(es.getBudget());
                lbEsBudget.setText(estimatebudget);
                estimatequantity = String.valueOf(es.getTarget());
                lbEsQuantity.setText(estimatequantity);
                //String varianceallowed = String.valueOf(es.getVarianceallowed());
                //lbVarianceallowed.setText(varianceallowed);
            }
        }
        String realitybudget = "0";
        String realityquantity = "0";
        for (Realitys re : realitydao.readAll()) {
            if (re.getCampaignid().equals(campaignid)) {
                realitybudget = String.valueOf(re.getSumbudget());
                lbReBudget.setText(realitybudget);
                realityquantity = String.valueOf(re.getSumquantity());
                lbReQuantity.setText(realityquantity);
            }
        }
        
        float budget = (Float.parseFloat(estimatebudget)-Float.parseFloat(realitybudget))/Float.parseFloat(estimatebudget);
        if(budget>0){
            lbVaBudget.setVisible(true);
            budget = budget * 100;
            lbVaBudget.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_sort_down_filled_20px.png")));
            lbVaBudget.setText(String.valueOf(budget) + "%");
            lbVaBudget.setForeground(new java.awt.Color(0,255,0));
        }
        else if(budget<0){
            lbVaBudget.setVisible(true);
            budget = -budget * 100;
            lbVaBudget.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_sort_up_filled_20px_1.png")));
            lbVaBudget.setText(String.valueOf(budget) + "%");
            lbVaBudget.setForeground(new java.awt.Color(255,0,0));
        }
        else if(budget==0 && Float.parseFloat(estimatebudget)!=0){
            lbVaBudget.setVisible(true);
            lbVaBudget.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_equal_sign_20px.png")));
            lbVaBudget.setText(String.valueOf(budget) + "%");
            lbVaBudget.setForeground(new java.awt.Color(255,255,0));
        }
        else{
            lbVaBudget.setVisible(false);
        }
        float quantity = (Float.parseFloat(estimatequantity)-Float.parseFloat(realityquantity))/Float.parseFloat(estimatequantity);
        if(quantity>0){
            lbVaQuantity.setVisible(true);
            quantity = quantity * 100;
            lbVaQuantity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_sort_down_filled_20px_1.png")));
            lbVaQuantity.setText(String.valueOf(quantity) + "%");
            lbVaQuantity.setForeground(new java.awt.Color(255,0,0));
        }
        else if(quantity<0){
            lbVaQuantity.setVisible(true);
            quantity = -quantity * 100;
            lbVaQuantity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_sort_up_filled_20px.png")));
            lbVaQuantity.setText(String.valueOf(quantity) + "%");
            lbVaQuantity.setForeground(new java.awt.Color(0,255,0));
        }
        else if(quantity==0 && Float.parseFloat(estimatequantity)!=0){
            lbVaQuantity.setVisible(true);
            lbVaQuantity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_equal_sign_20px.png")));
            lbVaQuantity.setText(String.valueOf(quantity) + "%");
            lbVaQuantity.setForeground(new java.awt.Color(255,255,0));
        }
        else{
            lbVaQuantity.setVisible(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Reporter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reporter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Campaigns> cbCampaign;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbCampaignid;
    private javax.swing.JLabel lbEndday1;
    private javax.swing.JLabel lbEsBudget;
    private javax.swing.JLabel lbEsQuantity;
    private javax.swing.JLabel lbProduct;
    private javax.swing.JLabel lbReBudget;
    private javax.swing.JLabel lbReQuantity;
    private javax.swing.JLabel lbStartday;
    private javax.swing.JLabel lbTofc;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JLabel lbVaBudget;
    private javax.swing.JLabel lbVaQuantity;
    private javax.swing.JPanel pnBg;
    private javax.swing.JPanel pnCampaign;
    private javax.swing.JPanel pnChangePassword;
    private javax.swing.JPanel pnLeft;
    private javax.swing.JPanel pnLogOut;
    private javax.swing.JScrollPane spCampaign;
    private javax.swing.JTable tbCampaign;
    // End of variables declaration//GEN-END:variables

    private void Combobox() {
        cbCampaign.removeAllItems();
        for(Campaigns cc : campaigndao.readAll()){
            cbCampaign.addItem(cc);
        }
    }

    private void loadTableExchange(String campaignid) {
        Vector column = new Vector();
        column.add("NO");
        column.add("SALEDAY");
        column.add("QUANTITY");
        column.add("PRICE ($)");
        column.add("TOTAL ($)");
        Vector rows = new Vector();
        int no = 1;
        int total = 0;
        for (Exchanges e : exchangedao.readAll()) {
            if (e.getCampaignid().equals(campaignid)) {
                Vector row = new Vector();
                row.add(no);
                row.add(e.getSaleday());
                row.add(e.getQuantity());
                for (Products_Prices pp : ppdao.readAll()) {
                    if (pp.getProductid().equals(productid)) {
                        for (Prices p : pricedao.readAll()) {
                            if(p.getPriceid() == pp.getPriceid()){
                                if(e.getSaleday().equals(campaigndao.readByCampaignid(campaignid).getEndday())){
                                    if((e.getSaleday().after(p.getStartday()) || e.getSaleday().equals(p.getStartday())) && (e.getSaleday().before(p.getEndday()) || e.getSaleday().equals(p.getEndday()))){
                                        row.add(p.getPrice());
                                        row.add(p.getPrice() * e.getQuantity());
                                        total = total + p.getPrice() * e.getQuantity();
                                    }
                                }
                                else{
                                    if(((e.getSaleday().after(p.getStartday()) || e.getSaleday().equals(p.getStartday())) && e.getSaleday().before(p.getEndday()))) {
                                        row.add(p.getPrice());
                                        row.add(p.getPrice() * e.getQuantity());
                                        total = total + p.getPrice() * e.getQuantity();
                                    }
                                }
                            }
                        }
                    }
                }
                lbTotal.setText(String.valueOf(total));
                rows.add(row);
                no++;
            }
        }
        tbCampaign.setModel(new DefaultTableModel(rows, column));
        tbCampaign.updateUI();
        spCampaign.setViewportView(this.tbCampaign);
    }
}
