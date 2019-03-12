/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.ExchangesDAO;
import dao.ManagecamsDAO;
import dao.PricesDAO;
import dao.Products_PricesDAO;
import dao.RealitysDAO;
import dto.Exchanges;
import dto.Managecams;
import dto.Prices;
import dto.Products_Prices;
import dto.Realitys;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class Exchange extends javax.swing.JInternalFrame {

    ExchangesDAO exchangedao = null;
    RealitysDAO realitydao = null;
    Products_PricesDAO ppdao = null;
    PricesDAO pricedao = null;
    ManagecamsDAO managedao = null;

    String userid = new Manager().userid;
    String campaignid = new Manager().campaignid;
    String productid = new Manager().productid;

    /**
     * Creates new form Exchange
     */
    public Exchange() {
        initComponents();
        exchangedao = new ExchangesDAO();
        realitydao = new RealitysDAO();
        ppdao = new Products_PricesDAO();
        pricedao = new PricesDAO();
//        for (Managecams mm : managedao.readAll()) {
//            if (mm.getUserid().equals(userid)) {
//                campaignid = mm.getCampaignid();
//                productid = mm.getProductid();
//            }
//        }

        loadTableExchange(exchangedao.readAll());
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
        spExchange = new javax.swing.JScrollPane();
        tbExchange = new javax.swing.JTable();
        tfQuantity = new javax.swing.JTextField();
        btCreate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfSaleday = new com.toedter.calendar.JDateChooser();

        setPreferredSize(new java.awt.Dimension(730, 450));

        pnBg.setBackground(new java.awt.Color(255, 255, 255));
        pnBg.setPreferredSize(new java.awt.Dimension(730, 450));
        pnBg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        spExchange.setBackground(new java.awt.Color(255, 255, 255));
        spExchange.setBorder(null);

        tbExchange.setAutoCreateRowSorter(true);
        tbExchange.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tbExchange.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tbExchange.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbExchange.setGridColor(new java.awt.Color(255, 255, 255));
        tbExchange.setRowHeight(25);
        tbExchange.setSelectionBackground(new java.awt.Color(122, 72, 221));
        tbExchange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbExchangeMouseClicked(evt);
            }
        });
        spExchange.setViewportView(tbExchange);

        pnBg.add(spExchange, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 564, 270));

        tfQuantity.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(85, 65, 118)));
        tfQuantity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfQuantityMouseClicked(evt);
            }
        });
        pnBg.add(tfQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 130, -1));

        btCreate.setText("Create");
        btCreate.setPreferredSize(new java.awt.Dimension(80, 30));
        btCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCreateActionPerformed(evt);
            }
        });
        pnBg.add(btCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(85, 65, 118));
        jLabel2.setText("Sale Day (yyyy-MM-dd)");
        pnBg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(85, 65, 118));
        jLabel3.setText("Quantity");
        pnBg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        lbTotal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbTotal.setForeground(new java.awt.Color(204, 0, 0));
        lbTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnBg.add(lbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 120, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("TOTAL($):");
        pnBg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 70, 30));

        tfSaleday.setDateFormatString("yyyy-MM-dd");
        pnBg.add(tfSaleday, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 140, -1));

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

    private void tbExchangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbExchangeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbExchangeMouseClicked

    private void btCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCreateActionPerformed
        try {
            if (((JTextField)tfSaleday.getDateEditor().getUiComponent()).getText().equals("") || tfQuantity.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please complete all information");
            }
            else if(!isLegalDate(((JTextField)tfSaleday.getDateEditor().getUiComponent()).getText())){
                JOptionPane.showMessageDialog(null, "Enter the date incorrectly");
            }
            else {
                Date saleday = new SimpleDateFormat("yyyy-MM-dd").parse(((JTextField)tfSaleday.getDateEditor().getUiComponent()).getText());
                int quantity = Integer.parseInt(tfQuantity.getText().trim());
                Exchanges e = new Exchanges(campaignid, saleday, quantity);
                if (exchangedao.create(e) != null) {
                    JOptionPane.showMessageDialog(null, "Success");
                    int sumquantity = 0;
                    for (Exchanges ee : exchangedao.readAll()) {
                        if (ee.getCampaignid().equals(campaignid)) {
                            sumquantity = sumquantity + ee.getQuantity();
                        }
                    }
                    for (Realitys rr : realitydao.readAll()) {
                        if (rr.getCampaignid().equals(campaignid)) {
                            Realitys r = new Realitys(rr.getCampaignid(), sumquantity, rr.getSumbudget());
                            realitydao.update(r);
                        }
                    }
                    loadTableExchange(exchangedao.readAll());
                    ((JTextField)tfSaleday.getDateEditor().getUiComponent()).setText("");
                    tfQuantity.setText("");
                }
            }
        } catch (ParseException ex) {
            Logger.getLogger(Exchange.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btCreateActionPerformed

    private void tfQuantityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfQuantityMouseClicked
        // TODO add your handling code here:
        tfQuantity.setText("");
    }//GEN-LAST:event_tfQuantityMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JPanel pnBg;
    private javax.swing.JScrollPane spExchange;
    private javax.swing.JTable tbExchange;
    private javax.swing.JTextField tfQuantity;
    private com.toedter.calendar.JDateChooser tfSaleday;
    // End of variables declaration//GEN-END:variables

    private void loadTableExchange(List<Exchanges> readAll) {
        Vector column = new Vector();
        column.add("NO");
        column.add("SALEDAY");
        column.add("QUANTITY");
        column.add("PRICE ($)");
        column.add("TOTAL ($)");
        Vector rows = new Vector();
        int no = 1;
        int total = 0;
        for (Exchanges e : readAll) {
            if (e.getCampaignid().equals(campaignid)) {
                Vector row = new Vector();
                row.add(no);
                row.add(e.getSaleday());
                row.add(e.getQuantity());
                for (Products_Prices pp : ppdao.readAll()) {
                    if (pp.getProductid().equals(productid)) {
                        for (Prices p : pricedao.readAll()) {
                            if ((p.getPriceid() == pp.getPriceid()) && ((e.getSaleday().after(p.getStartday())||e.getSaleday().equals(p.getStartday()))&& e.getSaleday().before(p.getEndday()))) {
                                row.add(p.getPrice());
                                row.add(p.getPrice() * e.getQuantity());
                                total = total + p.getPrice() * e.getQuantity();
                            }
                        }
                    }
                }
                lbTotal.setText(String.valueOf(total));
                rows.add(row);
                no++;
            }
        }
        tbExchange.setModel(new DefaultTableModel(rows, column));
        tbExchange.updateUI();
        spExchange.setViewportView(this.tbExchange);
    }
    boolean isLegalDate(String s) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false);
        return sdf.parse(s, new ParsePosition(0)) != null;
    }
}
