/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GovernmentCoordinatorRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.People.Donor;
import Business.People.DonorDirectory;
import Magic.Design.*;
import Business.People.DonorRequest;
import Business.People.DonorRequestDirectory;
import Business.UserAccount.UserAccount;
import Magic.Design.MyJButton;
import Magic.Design.MyTableFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author parth
 */
public class DonorStatusJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonorStatusJPanel
     */
    
   //private DonorDirectory donorDirectory;
    private EcoSystem system;
     private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public DonorStatusJPanel(EcoSystem system) {
        initComponents();
        //this.donorDirectory =  donorDirectory;
        this.system = system;
        tblDonorRequest.getTableHeader().setDefaultRenderer(new MyTableFormat());
        tblDonor.getTableHeader().setDefaultRenderer(new MyTableFormat());
        populateTable();
        populateTableS();
    }
    
         
    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblDonorRequest.getModel();
        
        dtm.setRowCount(0);
        
         for(Donor donor: system.getDonorDirectory().getDonorList()){            
            Object row[] = new Object[4];
            row[0]= donor;
            row[1]=donor.getName();
            row[2]=donor.getContact();
            row[3]=donor.getStatus();
              
            dtm.addRow(row);
        }
        
    }
    private void populateTableS() {
        DefaultTableModel dtm = (DefaultTableModel) tblDonor.getModel();
        
        dtm.setRowCount(0);
        
         for(DonorRequest donor: system.getDonorRequestDirectory().getDonorRequestList()){            
            Object row[] = new Object[4];
            row[0]= donor;
            row[1]=donor.getName();
            row[2]=donor.getContact();
            row[3]=donor.getStatus();
              
            dtm.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDonorRequest = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lblManageDonors = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDonor = new javax.swing.JTable();
        lblListOfDonorRequests = new javax.swing.JLabel();
        lblListOfDonors = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDonorRequest.setBackground(new java.awt.Color(0, 0, 0));
        tblDonorRequest.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblDonorRequest.setForeground(new java.awt.Color(255, 255, 255));
        tblDonorRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Donor ID", "Name", "Contact", "Status"
            }
        ));
        tblDonorRequest.setGridColor(new java.awt.Color(0, 0, 0));
        tblDonorRequest.setRowHeight(30);
        jScrollPane1.setViewportView(tblDonorRequest);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 1030, 160));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        lblManageDonors.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblManageDonors.setForeground(new java.awt.Color(255, 255, 255));
        lblManageDonors.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageDonors.setText("Manage Donors");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblManageDonors, javax.swing.GroupLayout.PREFERRED_SIZE, 1339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(375, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblManageDonors, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 1720, -1));

        btnDelete.setBackground(new java.awt.Color(255, 164, 0));
        btnDelete.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 80, 30));

        tblDonor.setBackground(new java.awt.Color(0, 0, 0));
        tblDonor.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblDonor.setForeground(new java.awt.Color(255, 255, 255));
        tblDonor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Donor ID", "Name", "Contact", "Status"
            }
        ));
        tblDonor.setGridColor(new java.awt.Color(0, 0, 0));
        tblDonor.setRowHeight(30);
        jScrollPane2.setViewportView(tblDonor);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 1030, 160));

        lblListOfDonorRequests.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        lblListOfDonorRequests.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListOfDonorRequests.setText("List of Donor Requests");
        add(lblListOfDonorRequests, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 510, -1));

        lblListOfDonors.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        lblListOfDonors.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListOfDonors.setText("List of Donors");
        add(lblListOfDonors, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 510, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
         //TODO add your handling code here:
        
        // DonorRequestDirectory ddr = new DonorRequestDirectory();
         int selectedRow = tblDonor.getSelectedRow(); 
          DonorRequest dr =((DonorRequest) tblDonor.getValueAt(selectedRow, 0));
 
          system.getDonorRequestDirectory().removeDonorRequest(dr);
          
          //ddr.removeDonorRequest(dr);
             
          
          dB4OUtil.storeSystem(system);
          populateTableS();       
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblListOfDonorRequests;
    private javax.swing.JLabel lblListOfDonors;
    private javax.swing.JLabel lblManageDonors;
    private javax.swing.JTable tblDonor;
    private javax.swing.JTable tblDonorRequest;
    // End of variables declaration//GEN-END:variables
}