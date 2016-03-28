
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class librarian extends javax.swing.JFrame {  
    public librarian() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NAME OF THE MEMBER");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, 33));

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MEMBER ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 272, 41));

        jTextField1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 22)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 102, 102));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 322, 41));

        jTextField2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 22)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 102, 102));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 322, 41));

        jButton5.setFont(new java.awt.Font("Chiller", 1, 26)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 153, 0));
        jButton5.setText("CREATE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 390, 130, 60));

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("EMAIL ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 272, 41));

        jTextField3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 22)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 102, 102));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, 322, 41));

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MEMBER TYPE");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 226, 41));

        jComboBox1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 22)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 102, 102));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UG", "PG", "RSCHOLAR", "FACULTY" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, 322, 41));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logout-icon (1).png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 20, 110, 100));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/superman-picture-120270.jpg"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1490, 760));

        jTabbedPane1.addTab("CREATE MEMBER RECORD", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SELECT", "MEMBER ID", "NAME", "EMAIL ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 1165, 540));

        jButton1.setFont(new java.awt.Font("Chiller", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("VIEW MEMBER LIST");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 210, 50));

        jButton2.setFont(new java.awt.Font("Chiller", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 153));
        jButton2.setText("DELETE THE MEMBER RECORD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, 50));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logout-icon (1).png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 10, 120, 100));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MembersGraphic2.jpg"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 750));

        jButton9.setFont(new java.awt.Font("Algerian", 0, 16)); // NOI18N
        jButton9.setText("SEND REMINDER");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 140, 160, 40));

        jTabbedPane1.addTab("MEMBER LIST", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "BOOK NAME", "ISBN", "NO. OF COPIES ISSUED", "LAST DATE OF ISSUANCE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 970, 570));

        jButton3.setFont(new java.awt.Font("Chiller", 1, 24)); // NOI18N
        jButton3.setText("SHOW THE BOOK LIST");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 260, 50));

        jButton4.setFont(new java.awt.Font("Chiller", 1, 24)); // NOI18N
        jButton4.setText("ORDER THE CLERK TO DISPOSE ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 320, 50));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logout-icon (1).png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 20, 90, 100));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booklist-copy (1).jpg"))); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 750));

        jTabbedPane1.addTab("VIEW NON ISSUED BOOK LIST", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int i = 0;     
        String namefd,idfd,emailfd;
	namefd= jTextField1.getText();
        idfd = jTextField2.getText();
        emailfd = jTextField3.getText();
	System.out.println(idfd);
	Connection conn = null;
         Statement stmt = null;
         ResultSet rs;
	        try {
	           String userName = "root";
                  String password = "root";
                  String url = "jdbc:derby://localhost:1527/lis";
                  Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
	           conn = DriverManager.getConnection(url,userName, password);
                   String selectSQL1 = "select * from memberrecord";
                    stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	           rs=stmt.executeQuery(selectSQL1);
                   while(rs.next()){
                       i = rs.getInt(1);                       
                   }
                       i++;  
                       if(jTextField1.getText().matches("[a-zA-Z ]+")  && jTextField1.getText().length() > 1 && jTextField2.getText().length() > 0 && jTextField3.getText().length() > 0){
                           
                       rs.moveToInsertRow();
                       rs.updateInt(1,i);
                       rs.updateString(2,namefd);
                       rs.updateString(3,idfd);
                       rs.updateString(4,emailfd);
                       rs.updateInt(16,jComboBox1.getSelectedIndex());
                       switch(jComboBox1.getSelectedIndex()){
                           case 0:rs.updateInt(15,2);
                           rs.updateInt(17,1);
                               break;
                               case 1:rs.updateInt(15,4);
                               rs.updateInt(17,1);
                               break;
                                   case 2:rs.updateInt(15,6);
                                   rs.updateInt(17,3);
                               break;
                                       case 3:rs.updateInt(15,10);
                                       rs.updateInt(17,6);
                               break;
                       }
                        rs.updateInt(18,0);   
                       rs.insertRow();
                       
                       
                       JOptionPane.showMessageDialog(null, "updated.");
                   
                   rs.close();
                   conn.close();
                       }
                       else
                           JOptionPane.showMessageDialog(null, "Dont keep fields empty and ENTER ONLY ALPHBETS IN MEMBER NAME ");

                }
                catch (Exception event) {
	               	System.out.println(event);
	                System.out.print("Error inserting record.");
	                        }
    
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        while (jTable1.getRowCount() > 0) {
	((DefaultTableModel)jTable1.getModel()).removeRow(0);
}
        int i = 0;  
        String namefd,idfd,emailfd;	
	Connection conn = null;
         Statement stmt = null;
         ResultSet rs;
	        try {
	           String userName = "root";
                  String password = "root";
                  String url = "jdbc:derby://localhost:1527/lis";
                  Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
	           conn = DriverManager.getConnection(url,userName, password);
                   String selectSQL1 = "select * from memberrecord";
                    stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	           rs=stmt.executeQuery(selectSQL1);
                   while(rs.next()){
                       namefd = rs.getString(2);
                       idfd = rs.getString(3);
                       emailfd = rs.getString(4);
                       DefaultTableModel tm = (DefaultTableModel)jTable1.getModel();
                       tm.addRow(new Object[] {false,idfd,namefd,emailfd});                    
                       
                   }
                   jTable1.setVisible(true);
                   
                   rs.close();
                   conn.close();

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
            System.out.println("huray");
            Object b1 = tm.getValueAt(i,1);
            Connection conn = null;
            Statement stmt = null;
            ResultSet rs;
	        try {
	           String userName = "root";
                  String password = "root";
                  String url = "jdbc:derby://localhost:1527/lis";
                  Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
	           conn = DriverManager.getConnection(url,userName, password);
                   String selectSQL1 = "select * from memberrecord";
                    stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	           rs=stmt.executeQuery(selectSQL1);
                   while(rs.next()){
                      String strid = rs.getString(3);
                      if(strid.equals((String)b1))
                      {
                          rs.deleteRow();
                          jButton1ActionPerformed(null);
                      }
                   }
                   jTable1.setVisible(true);
                   
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
        while (jTable2.getRowCount() > 0) {
            ((DefaultTableModel)jTable2.getModel()).removeRow(0);
        }
        int i = 0;  
        String namefd,isbnfd;
        int i1;
	Connection conn = null;
        Statement stmt = null;
        ResultSet rs;
	        try {
	           String userName = "root";
                  String password = "root";
                  String url = "jdbc:derby://localhost:1527/lis";
                  Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
	           conn = DriverManager.getConnection(url,userName, password);
                   String selectSQL1 = "select * from bookrecord";
                   stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	           rs=stmt.executeQuery(selectSQL1);
                   while(rs.next()){  
                       if(rs.getInt(4) == rs.getInt(3)){
                       namefd = rs.getString(1);
                       isbnfd = rs.getString(2);
                       
                       DefaultTableModel tm = (DefaultTableModel)jTable2.getModel();
                       tm.addRow(new Object[] {false,namefd,isbnfd,rs.getInt(3)-rs.getInt(4),rs.getString(13)});  
                       
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
        DefaultTableModel tm = (DefaultTableModel)jTable2.getModel();
        for(int i=0;i<jTable2.getRowCount();i++) {
            Object b = tm.getValueAt(i,0);
	//if(jTable1.isRowSelected(i++)){
          if((boolean)b==true){
            //System.out.println("huray");
            Object b1 = tm.getValueAt(i,2);  // take the isbn of the book to be disposed
            Connection conn = null;
            Statement stmt = null;
            ResultSet rs;
	        try {
	           String userName = "root";
                  String password = "root";
                  String url = "jdbc:derby://localhost:1527/lis";
                  Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
	           conn = DriverManager.getConnection(url,userName, password);
                   String selectSQL1 = "select * from bookrecord";
                   stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	           rs=stmt.executeQuery(selectSQL1);
                   while(rs.next()){
                      String strid = rs.getString(2); /* consider the isbn colmn in the
                                                        bookrecord database */ 
                      if(strid.equals((String)b1)) // if the isbn matches
                      { // make sure that its dispose colmn is marked
                          
                          rs.updateInt(11,1);
                          rs.updateRow();
                          jButton1ActionPerformed(null);
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
        jButton3ActionPerformed(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new Login().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new Login().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        new Login().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
             JOptionPane.showMessageDialog(null,"MESSAGE SENT");

    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(librarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(librarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(librarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(librarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new librarian().setVisible(true);
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
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
