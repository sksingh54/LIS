
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class clerk extends javax.swing.JFrame {

   
    public clerk() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ISBN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 90, 40));

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BOOK NAME");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NUMBER OF COPIES");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        jLabel4.setBackground(new java.awt.Color(204, 204, 255));
        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("RACK NUMBER");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 310, -1));

        jLabel5.setBackground(new java.awt.Color(204, 204, 255));
        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PENALTY ( rate per day )");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, -1, 40));

        jTextField1.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 338, 39));

        jTextField2.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 338, 40));

        jSpinner1.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 130, -1));

        jSpinner2.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        jPanel1.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 130, -1));

        jSpinner3.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(Double.valueOf(0.0d), Double.valueOf(0.0d), null, Double.valueOf(1.0d)));
        jPanel1.add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 123, -1));

        jButton1.setFont(new java.awt.Font("Chiller", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 51));
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 450, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logout-icon (1).png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 30, 110, 100));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Books-and-Apples.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 690));

        jTabbedPane1.addTab("BOOK ENTRY", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "BOOK NAME", "ISBN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAlignmentY(1.0F);
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 950, 550));

        jButton2.setFont(new java.awt.Font("Chiller", 1, 28)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 153));
        jButton2.setText("DELETE THE TICKED ONES");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, -1, -1));

        jButton3.setFont(new java.awt.Font("Chiller", 1, 28)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 153));
        jButton3.setText("CHECK THE DELETE LIST");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logout-icon (1).png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 30, 120, 80));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Shelves-Center-for-Childrens-Books.jpg"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -4, 1350, 710));

        jTabbedPane1.addTab("BOOK DELETION", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setFont(new java.awt.Font("Chiller", 1, 28)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 102));
        jButton4.setText("VIEW BOOK LIST");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 223, 40));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOK NAME", "ISBN", "COPIES", "RACK"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setAlignmentY(1.0F);
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 960, 550));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logout-icon (1).png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1213, 29, 96, 100));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booklist-copy (1).jpg"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 710));

        jTabbedPane1.addTab("BOOK LIST", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int i = 0,j=0;     
        String namefd,isbnfd;
        int i1,i2;
        double d1;
        i1 = (int)jSpinner1.getValue();
        i2 = (int)jSpinner2.getValue();
        d1 = (double)jSpinner3.getValue();
	namefd= jTextField1.getText();
        isbnfd = jTextField2.getText();
	System.out.println(isbnfd);
	Connection conn = null;
         Statement stmt = null;
         ResultSet rs;
         int c=0;
	        try {
	           String userName = "root";
	           String password = "";
	           String url = "jdbc:mysql://localhost/lis";
	           Class.forName("com.mysql.jdbc.Driver").newInstance();
	           conn = DriverManager.getConnection(url,userName, password);
                   String selectSQL1 = "select * from bookrecord";
                    stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	           rs=stmt.executeQuery(selectSQL1);
                   while(rs.next()){
                        if(rs.getString(2).equals(jTextField2.getText())){
                        JOptionPane.showMessageDialog(null, "repeated isbnnot allowed");
                        c =1;
                       }                 
                       j++;
                       i = rs.getInt(7);                       
                   }
                       System.out.println("TOTAL NUMBER OF BOOKS IN THE ENTRY :"+j);
                       i++;
                       if(c==0 && j <= 10000){
                           
                       
                   if(jTextField1.getText().matches("[a-zA-Z ]+")  && jTextField1.getText().length() > 1 && jTextField2.getText().length() > 0){  
                       rs.moveToInsertRow();
                       rs.updateString(1,namefd);
                       rs.updateString(2,isbnfd);
                       rs.updateInt(3,i1);
                       rs.updateInt(4,i1);
                       rs.updateInt(5,i2);
                       rs.updateDouble(6,d1);
                       rs.updateInt(7,i);
                       rs.updateInt(11,0);
                       rs.insertRow();
                       
                       JOptionPane.showMessageDialog(null, "updated.");
                   
                   rs.close();
                   conn.close();
                   }
                   else
                       JOptionPane.showMessageDialog(null, "ENTER ONLY ALPAHTES IN BOOK NAME");

                }
                 else      
                     JOptionPane.showMessageDialog(null, "NUMBER OF BOOKS WILL EXCEED :10000 SON NOT ALLOWED");
                }
                catch (Exception event) {
	               	System.out.println(event);
	                System.out.print("Error inserting record.");
	                        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel tm = (DefaultTableModel)jTable1.getModel();
        for(int i=0;i<jTable1.getRowCount();i++) {
            Object b = tm.getValueAt(i,0);
          if((boolean)b==true){
           
            Object b1 = tm.getValueAt(i,2);
            Connection conn = null;
            Statement stmt = null;
            ResultSet rs;
	        try {
	           String userName = "root";
	           String password = "";
	           String url = "jdbc:mysql://localhost/lis";
	           Class.forName("com.mysql.jdbc.Driver").newInstance();
	           conn = DriverManager.getConnection(url,userName, password);
                   String selectSQL1 = "select * from bookrecord";
                    stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	           rs=stmt.executeQuery(selectSQL1);
                   while(rs.next()){
                      String strid = rs.getString(2);
                      
                      if(strid.equals((String)b1))
                      {
                          rs.deleteRow();
                          jButton3ActionPerformed(null);
                      }
                   }
                   
                   rs.close();
                   conn.close();

                }
                catch (Exception event) {
	               	System.out.println(event);
	                System.out.print("Error inserting record.");
	                        }
          }
          
        }
                                              

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                while (jTable1.getRowCount() > 0) {
	((DefaultTableModel)jTable1.getModel()).removeRow(0);
}
        int i = 0;  
        String namefd=null,idfd,emailfd;	
	Connection conn = null;
         Statement stmt = null;
         ResultSet rs;
	        try {
	           String userName = "root";
	           String password = "";
	           String url = "jdbc:mysql://localhost/lis";
	           Class.forName("com.mysql.jdbc.Driver").newInstance();
	           conn = DriverManager.getConnection(url,userName, password);
                   String selectSQL1 = "select * from bookrecord";
                    stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	           rs=stmt.executeQuery(selectSQL1);
                   while(rs.next()){
                       if(rs.getInt(11) == 1){
                       namefd = rs.getString(1);
                       idfd = rs.getString(2);
                 
                       DefaultTableModel tm = (DefaultTableModel)jTable1.getModel();
                       tm.addRow(new Object[] {false,namefd,idfd});                    
                       }
                   }
                   
                   rs.close();
                   conn.close();

                }
                catch (Exception event) {
	               	System.out.println(event);
	                System.out.print("Error inserting record.");
	                        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        while (jTable2.getRowCount() > 0) {
            ((DefaultTableModel)jTable2.getModel()).removeRow(0);
        }
        int i = 0;  
        String namefd,isbnfd;
        int i1,i2;
	Connection conn = null;
        Statement stmt = null;
        ResultSet rs;
	        try {
	           String userName = "root";
	           String password = "";
	           String url = "jdbc:mysql://localhost/lis";
	           Class.forName("com.mysql.jdbc.Driver").newInstance();
	           conn = DriverManager.getConnection(url,userName, password);
                   String selectSQL1 = "select * from bookrecord";
                   stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	           rs=stmt.executeQuery(selectSQL1);
                   while(rs.next()){
                       namefd = rs.getString(1);
                       isbnfd = rs.getString(2);
                       i1 = rs.getInt(4);
                       i2 = rs.getInt(5);
                       DefaultTableModel tm = (DefaultTableModel)jTable2.getModel();
                       tm.addRow(new Object[] {namefd,isbnfd,i1,i2});               
                       
                   }
                   rs.close();
                   conn.close();
                }
                catch (Exception event) {
	               	System.out.println(event);
	                System.out.print("Error inserting record.");
	        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new Login().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       new Login().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new Login().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
 
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
            java.util.logging.Logger.getLogger(clerk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clerk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clerk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clerk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clerk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
