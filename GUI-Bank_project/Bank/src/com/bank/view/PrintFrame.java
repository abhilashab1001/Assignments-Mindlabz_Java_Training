/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank.view;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class PrintFrame extends javax.swing.JFrame {

    /**
     * Creates new form PrintFrame
     */
    public PrintFrame() {
        initComponents();
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtaccno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSubmit = new javax.swing.JButton();
        Lblout = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("jLabel1");

        jLabel2.setText("Account no.");

        txtSubmit.setText("Print");
        txtSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubmitActionPerformed(evt);
            }
        });

        Lblout.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(89, 89, 89)
                                .addComponent(txtaccno, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(txtSubmit))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(Lblout, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtaccno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtSubmit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(Lblout, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubmitActionPerformed
        // TODO add your handling code here:
        int acctNo=Integer.parseInt(txtaccno.getText().trim());
		try {
			// load and establish conncetion to JDBC driver
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_banking","root","root");  
			
			//select rows from both  tbl_account and tbl_transaction tables
			Statement stmt=con.createStatement();
			String getAllTransactions = "select transactionDate, ammount, transaction_Type, balance FROM db_banking.tbl_transaction where  account_number="+acctNo;
			String getAcctDetails = "select * from db_banking.tbl_account where account_number="+acctNo;
			
			ResultSet rs = stmt.executeQuery( getAcctDetails);
			
			String name="demo", address="";
			Integer age=0;
			BigDecimal openingBalance=null, totalBalance=null;
			while(rs.next()) {
				
				//load table data into variables
				name = rs.getString(2);
				address = rs.getString(4);
				age = rs.getInt(3);
				openingBalance = rs.getBigDecimal(5);
				totalBalance = rs.getBigDecimal(6);
			}
			
			//create file with User's name
			String fileName = name+".txt";
			//File fileObj = new File(fileName);
		     // if (fileObj.createNewFile()) {
		      //  System.out.println("File created: " + fileObj.getName());
		    //  }
		      
		      //create FileWriter object to write data in file
		     PrintWriter outputfile = null;
                      outputfile = new PrintWriter(fileName);
		      //String Buffer to load info to file
		      StringBuilder str = new StringBuilder();
		      
		      //Add acount info 
		      str.append("Account Number: ").append(acctNo).append("\n Name: ").append(name).append("\n Age").append(age).append("\n Address: ").append(address).
		      append("\n\n\n DATE\t").append("\tTransaction").append("\tAmmount").append("\tBalance");
		     outputfile.append(str.toString());
		      
		      
		      rs = stmt.executeQuery( getAllTransactions);
		      
		      while(rs.next()) {
		    	  StringBuilder str1 = new StringBuilder();
		    	 
		    	  //add transaction info
		    	  str1.append(rs.getDate("transactionDate")).append("\t").append(rs.getBigDecimal("ammount")).append("\t")
		    	  .append(rs.getString("transaction_Type")).append("\t").append(rs.getBigDecimal("balance"));
		    	  
		    	  outputfile.append("\n"+str1.toString());
		      }
		      //Shows msg in Screen that PassBook is printed infile
		      Lblout.setText("PassBook Printed Successfully...!!");
			outputfile.close();
			
		} catch(FileNotFoundException | ClassNotFoundException | SQLException e) { //raise the exception if  any
			
		}
		
    }//GEN-LAST:event_txtSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(PrintFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrintFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrintFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrintFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrintFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lblout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton txtSubmit;
    private javax.swing.JTextField txtaccno;
    // End of variables declaration//GEN-END:variables
}
