/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import com.sun.xml.internal.messaging.saaj.packaging.mime.Header;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import javax.swing.text.Document;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author C4
 */
public class Printingview extends Travel {

    /**
     * Creates new form Printingview
     */
    String cid;

    public Printingview() {
        initComponents();
        Update_table3();
    }

    public void showdata() throws SQLException {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        //cos_id, Cash, Change_amt, Tax, Total, Cos_Name, Sub_total, Date
        //* FROM fastfood.details
        String sql = "SELECT cos_id,Cos_Name,Date,Cash,Sub_total,Tax,Change_amt,Total FROM fastfood.details";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

        } catch (Exception e) {
        }

    }

    private void Update_table3() {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {

            conn = DBConnection.getDBConnection();
            String sql = "select * from fastfood.details";

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tbl_3.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {

            try {
                rs.close();
                pst.close();

            } catch (Exception e) {

            }
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

        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        PrintingView = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtcous = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcash = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtsub = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txttax = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtchan = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        btnpri = new javax.swing.JButton();
        btnshow = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_3 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();

        jLabel5.setText("jLabel1");

        txtarea.setColumns(20);
        txtarea.setRows(5);
        jScrollPane1.setViewportView(txtarea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51), 3));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 154, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PrintingView.setBackground(new java.awt.Color(255, 204, 204));
        PrintingView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 3));
        PrintingView.setForeground(new java.awt.Color(51, 153, 0));
        PrintingView.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                PrintingViewAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel9.setText("Id");

        jLabel1.setText("Coustomer name");

        txtcous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcousActionPerformed(evt);
            }
        });

        jLabel2.setText("Date");

        jLabel4.setText("Cash");

        jLabel3.setText("SubTotal");

        jLabel7.setText("Tax");

        jLabel6.setText("Change");

        jLabel8.setText("Total");

        btnpri.setText("Print");
        btnpri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpriActionPerformed(evt);
            }
        });

        btnshow.setText("Show");
        btnshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Script MT Bold", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("Coustomer Reset");

        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PrintingViewLayout = new javax.swing.GroupLayout(PrintingView);
        PrintingView.setLayout(PrintingViewLayout);
        PrintingViewLayout.setHorizontalGroup(
            PrintingViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrintingViewLayout.createSequentialGroup()
                .addGroup(PrintingViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrintingViewLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnshow)
                        .addGap(29, 29, 29)
                        .addComponent(btnpri))
                    .addGroup(PrintingViewLayout.createSequentialGroup()
                        .addGroup(PrintingViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PrintingViewLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(PrintingViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)))
                            .addGroup(PrintingViewLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1)))
                        .addGap(29, 29, 29)
                        .addGroup(PrintingViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(PrintingViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtid, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                .addComponent(txtcous)
                                .addComponent(txtdate)
                                .addComponent(txtsub)
                                .addComponent(txtcash)
                                .addComponent(txttax)
                                .addComponent(txtchan)
                                .addComponent(txttotal)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PrintingViewLayout.setVerticalGroup(
            PrintingViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrintingViewLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PrintingViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(PrintingViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(PrintingViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtcous, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(PrintingViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(PrintingViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtcash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(PrintingViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtsub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(PrintingViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txttax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(PrintingViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtchan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(PrintingViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(PrintingViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnpri)
                    .addComponent(btnshow))
                .addContainerGap())
        );

        tbl_3.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_3MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_3);

        textarea.setColumns(20);
        textarea.setRows(5);
        jScrollPane3.setViewportView(textarea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PrintingView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PrintingView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnpriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpriActionPerformed
        try {
           textarea.append("\t\n\t==Fast Food management System==\n"
                + "\n Coustomer Id:\t\t" +txtid.getText()
                + "\n Name:\t\t" + txtcous.getText()
                + "\n Date:\t\t" + txtdate.getText()
                + "\n Cash:\t\t" + txtcash.getText()
                + "\n Sub-Total:\t\t" + txtsub.getText()
                + "\n Tax:\t\t" + txttax.getText()
                + "\nChange:\t\t" + txtchan.getText()
                + "\n Total:\t\t" + txttotal.getText()
                   
               
        );
            textarea.print();
        } catch (Exception e) {
        }
        //try {
           // txtcous.print();

       // } catch (PrinterException ex) {
           // Logger.getLogger(Printingview.class.getName()).log(Level.SEVERE, null, ex);
       // }
    }//GEN-LAST:event_btnpriActionPerformed

    private void btnshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowActionPerformed
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        cid = txtid.getText();
        try {
            con = DBConnection.getDBConnection();
            st = con.createStatement();
            rs = st.executeQuery("select * from details where cos_id='" + cid + "'");
            while (rs.next()) {
               // txtcous.setText(rs.getString("cos_id"));
                txtcous.setText(rs.getString("Cos_name"));
                txtdate.setText(rs.getString("Date"));
                txtcash.setText(rs.getString("Cash"));
                txtsub.setText(rs.getString("Sub_total"));
                txttax.setText(rs.getString("Tax"));
                txtchan.setText(rs.getString("Change_amt"));
                txttotal.setText(rs.getString("Total"));
            }
            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnshowActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Travel t = new Travel();
        t.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbl_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_3MouseClicked
        //cos_id, Cash, Change_amt, Tax, Total, Cos_Name, Sub_total, Date

        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        int i = tbl_3.getSelectedRow();

        TableModel model = tbl_3.getModel();
        String id = ((model.getValueAt(i, 0)).toString());
        try {
            String sql = "SELECT * FROM details WHERE cos_id='" + id + "'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            txtid.setText(model.getValueAt(i, 0).toString());
            txtcash.setText(model.getValueAt(i, 1).toString());
            txtchan.setText(model.getValueAt(i, 2).toString());

            txttax.setText(model.getValueAt(i, 3).toString());
            txttotal.setText(model.getValueAt(i, 4).toString());
            txtcous.setText(model.getValueAt(i, 5).toString());
            txtsub.setText(model.getValueAt(i, 6).toString());
            txtdate.setText(model.getValueAt(i, 7).toString());

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_tbl_3MouseClicked

    private void txtcousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcousActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcousActionPerformed

    private void PrintingViewAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_PrintingViewAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintingViewAncestorAdded

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
            java.util.logging.Logger.getLogger(Printingview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Printingview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Printingview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Printingview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Printingview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel PrintingView;
    private javax.swing.JButton btnpri;
    private javax.swing.JButton btnshow;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable tbl_3;
    private javax.swing.JTextArea textarea;
    private javax.swing.JTextArea txtarea;
    private javax.swing.JTextField txtcash;
    private javax.swing.JTextField txtchan;
    private javax.swing.JTextField txtcous;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtsub;
    private javax.swing.JTextField txttax;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
