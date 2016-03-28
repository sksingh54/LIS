
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class member extends javax.swing.JFrame {

   
    public member(String id1) {
        id=id1;

        initComponents();
        jLabel6.setText("YOUR ID :" +id);
        reservation();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "BOOK NAME", "ISBN", "RACK NUMBER", "COPIES AVILABLE"
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
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 1001, 505));

        jButton1.setFont(new java.awt.Font("Chiller", 1, 28)); // NOI18N
        jButton1.setText("ISSUE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, -1, -1));

        jButton3.setFont(new java.awt.Font("Chiller", 1, 28)); // NOI18N
        jButton3.setText("VIEW BOOK AVAILABLE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logout-icon (1).png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 10, 110, 100));

        jLabel6.setText("YOUR ID :" +id);
        jLabel6.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 51));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 230, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book issue.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 730));

        jTabbedPane1.addTab("ISSUE BOOKS", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 630, 540));

        jButton2.setFont(new java.awt.Font("Chiller", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("RETURN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        jButton5.setFont(new java.awt.Font("Chiller", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 102, 102));
        jButton5.setText("SHOW LIST");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        jPanel5.setVisible(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOK NAME", "ISSUE DATE", "RETURN DATE", "PENALTY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable5);

        jPanel5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 652, 540));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booklist-copy (1).jpg"))); // NOI18N
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 720, 670));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 0, 680, -1));

        jButton9.setBackground(new java.awt.Color(0, 255, 204));
        jButton9.setFont(new java.awt.Font("Chiller", 1, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 102, 102));
        jButton9.setText("LOG OUT");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booklist-copy (1).jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 680));

        jTabbedPane1.addTab("RETURN BOOKS", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 849, 520));

        jButton6.setFont(new java.awt.Font("Chiller", 1, 26)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 102, 102));
        jButton6.setText("VIEW RESERVED BOOK LIST");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        jButton7.setFont(new java.awt.Font("Chiller", 1, 26)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 102, 102));
        jButton7.setText("RESERVE THE BOOK");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, -1, -1));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logout-icon (1).png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 20, 120, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Books-and-Apples.jpg"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 680));

        jTabbedPane1.addTab("RESERVE BOOK", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOK NAME", "ISBN", "RACK NUMBER", "COPIES AVAILABLE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setResizable(false);
            jTable4.getColumnModel().getColumn(1).setResizable(false);
            jTable4.getColumnModel().getColumn(2).setResizable(false);
            jTable4.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 781, 528));

        jButton4.setFont(new java.awt.Font("Chiller", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 51));
        jButton4.setText("VIEW BOOK LIST");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, -1));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logout-icon (1).png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 30, 93, 102));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booklist-copy (1).jpg"))); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 710));

        jTabbedPane1.addTab("BOOK LIST", jPanel4);

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        reservation();
        while (jTable1.getRowCount() > 0) {
            ((DefaultTableModel)jTable1.getModel()).removeRow(0);
        }
        int i = 0;  
        String namefd,isbnfd;
        int i1;
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
                       System.out.println("cccccc");
                       if(rs.getInt(4) > 0 && rs.getString(14) == null){System.out.println("dddddddd");
                       namefd = rs.getString(1);
                       isbnfd = rs.getString(2);                       
                       DefaultTableModel tm = (DefaultTableModel)jTable1.getModel();
                       tm.addRow(new Object[] {false,namefd,isbnfd,rs.getInt(5),rs.getInt(4)});
                       }
                       else if(rs.getString(14) != null && rs.getInt(4) >= 1 && rs.getString(14).equals(id)){System.out.println("eeeeeee");
                       namefd = rs.getString(1);
                       isbnfd = rs.getString(2);                       
                       DefaultTableModel tm = (DefaultTableModel)jTable1.getModel();
                       tm.addRow(new Object[] {false,namefd,isbnfd,rs.getInt(5),rs.getInt(4)});
                       }
                       else if(rs.getString(14) != null && !rs.getString(14).equals(id) && rs.getInt(4) > 1){System.out.println("fffffff");
                            namefd = rs.getString(1);
                            isbnfd = rs.getString(2);                       
                       DefaultTableModel tm = (DefaultTableModel)jTable1.getModel();
                       tm.addRow(new Object[] {false,namefd,isbnfd,rs.getInt(5),rs.getInt(4)});
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel tm = (DefaultTableModel)jTable1.getModel();
        int j= 0; Object b2;
        // first check if extra book are not taken
        for(int i=0;i<jTable1.getRowCount();i++){
             b2 = tm.getValueAt(i,0);
            if((boolean)b2==true)
                j++;  // j has the number of books opted for
        }
        int i = 0;  
        String namefd,idfd,emailfd;	
	Connection conn = null;
         Statement stmt = null;
         ResultSet rs,rs1 = null;
	        try {
	           String userName = "root";
	           String password = "";
	           String url = "jdbc:mysql://localhost/lis";
	           Class.forName("com.mysql.jdbc.Driver").newInstance();
	           conn = DriverManager.getConnection(url,userName, password);
                   String selectSQL1 = "select * from memberrecord";
                    stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	           rs=stmt.executeQuery(selectSQL1);
                   while(rs.next()){// for every member
                       if(rs.getString(3).equals(id))// if the correct member is found
                           break;
                   }
                       int i9 = rs.getInt(15)-rs.getInt(18);
                       if(j > i9)// check if he can issue those many books
                               JOptionPane.showMessageDialog(null,"you can issue only "+i9 +" books");
                        else{// if not
                          
                               Connection conn1=null;
                               for( i=0;i<jTable1.getRowCount();i++) {// cosider an option
                                      b2 = tm.getValueAt(i,0);
                                     System.out.print("start of for loop."+((boolean)b2)+i+tm.getValueAt(i,0));
                                     if((boolean)b2==true){// if its ticked
                                        Object b1 = tm.getValueAt(i,2);//take its isbn
                                          Statement stmt1 = null;
                                          System.out.println("if it is tickesd");
                                        try {
	                                        String userName1 = "root";
	                                        String password1 = "";
	                                        String url1 = "jdbc:mysql://localhost/lis";
	                                        Class.forName("com.mysql.jdbc.Driver").newInstance();
                                                conn1 = DriverManager.getConnection(url1,userName1, password1);
                                                String selectSQL2 = "select * from bookrecord";
                                                stmt1 = conn1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
                                                rs1=stmt1.executeQuery(selectSQL2);
                                                
                                                 while(rs1.next()){//for all books
                                                      String strid = rs1.getString(2);System.out.println("connection");
                                                      if(strid.equals((String)b1))// if I get my ticked book
                                                    {System.out.println("connection22222222");
                                                    JOptionPane.showMessageDialog(null, "BOOKS ISSUED");
                                                         rs1.updateInt(4,rs1.getInt(4)-1); 
                                                         rs1.updateString(13,date(1));
                                                         System.out.println("connection3333333333");
                                                         if(rs1.getString(14) != null && rs1.getString(14).equals(id)){
                                                             
                                                             rs1.updateString(14, null);
                                                             rs1.updateString(12, null);
                                                         }
                                                         System.out.println("connection3333333333");
                                                         rs1.updateString(13, date(1));
                                                         rs1.updateRow();
                                                         for(int p=5;p<=14;p++){
                                                             System.out.println(rs.getString(p));
                                                             if(rs.getString(p)==null){
                                                                 System.out.println("connection4444444444");
                                                                 rs.updateString(p, strid+date(0));
                                                                 rs.updateRow();
                                                                 break;
                                                             }
                                                         }
                                                         rs.updateInt(18,rs.getInt(18)+1);
                                                         rs.updateRow();
                                                         
                                                    }
                                                }
                                                    rs1.close();
                                                    conn1.close();
                                                    System.out.println("for loop");
                                           }
                                        
                                        
                                            catch (Exception event) {
                                                 System.out.println(event);
                                                  System.out.print("Error inserting record.");
                                             } 
                                        
                                    }// a specific ticked books have been updated
                               }//all ticked books are updated                               
                           }
                   rs.close();
                   conn.close();     
                       }

                catch (Exception event) {
	               	System.out.println(event);
	                System.out.print("Error inserting record.");
	                        }
         jButton3ActionPerformed(null);
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        while (jTable4.getRowCount() > 0) {
            ((DefaultTableModel)jTable4.getModel()).removeRow(0);
        }
        int i = 0;  
        String namefd,isbnfd;
        int i1;
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
                       if(rs.getInt(4) > 0){
                       namefd = rs.getString(1);
                       isbnfd = rs.getString(2);
                       
                       DefaultTableModel tm = (DefaultTableModel)jTable4.getModel();
                       tm.addRow(new Object[] {namefd,isbnfd,rs.getInt(5),rs.getInt(4)});  
                       
                       }                 
                       
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
        while (jTable2.getRowCount() > 0) {
            ((DefaultTableModel)jTable2.getModel()).removeRow(0);
        }
	Connection conn = null;
        Statement stmt = null;
        ResultSet rs;
	        try {
	           String userName = "root";
	           String password = "";
	           String url = "jdbc:mysql://localhost/lis";
	           Class.forName("com.mysql.jdbc.Driver").newInstance();
	           conn = DriverManager.getConnection(url,userName, password);
                   String selectSQL1 = "select * from memberrecord";
                   stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	           rs=stmt.executeQuery(selectSQL1);
                   while(rs.next()){// first find the matching member
                       if(rs.getString(3).equals(id))//if found then break
                           break;
                   }
                   DefaultTableModel tm = (DefaultTableModel)jTable2.getModel();
                   for(int p=5;p<=14;p++){// for all possible books of that member
                       if(rs.getString(p)!=null){//if its an issued book
                           // then get the isbn from that location
                           String bookisbn = rs.getString(p).substring(0,rs.getString(p).indexOf("@"));
                           Connection conn1 = null;
                           Statement stmt1 = null;
                           ResultSet rs1;
                           
                           try {
                            String userName1 = "root";
                            String password1 = "";
                            String url1 = "jdbc:mysql://localhost/lis";
                            Class.forName("com.mysql.jdbc.Driver").newInstance();
                            conn1 = DriverManager.getConnection(url1,userName1, password1);
                            String selectSQL = "select * from bookrecord";
                            stmt1 = conn1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
                            rs1=stmt1.executeQuery(selectSQL);
                            while(rs1.next()){//once the isbn is obtained , then for all books   
                                if(rs1.getString(2).equals(bookisbn)){// if isbn matches
                                    
                                    tm.addRow(new Object[] {false,rs1.getString(1),bookisbn});
                                    break;
                                }
                            }                
                            rs1.close();
                            conn1.close();
                           }
                           catch (Exception event) {
                           	System.out.println(event);
                                System.out.print("Error inserting record."+"this");
                           } 
                        }
                      
                   }
                   
                  rs.close();
                  conn.close();
                  
                }
                catch (Exception event) {
	               	System.out.println(event);
	                System.out.print("Error inserting record.  that");
	        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel tm1 = (DefaultTableModel)jTable5.getModel();
        DefaultTableModel tm = (DefaultTableModel)jTable2.getModel();
        int j= 0; Object b2;

        int i = 0;  	
	Connection conn = null;
        Statement stmt = null;
        ResultSet rs,rs1 = null;
	        try {
	           String userName = "root";
	           String password = "";
	           String url = "jdbc:mysql://localhost/lis";
	           Class.forName("com.mysql.jdbc.Driver").newInstance();
	           conn = DriverManager.getConnection(url,userName, password);
                   String selectSQL1 = "select * from memberrecord";
                   stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	           rs=stmt.executeQuery(selectSQL1);
                   while(rs.next()){// for every member
                       if(rs.getString(3).equals(id))// if the correct member is found
                           break;
                   }
                     
                          
                               Connection conn1=null;
                               for( i=0;i<jTable2.getRowCount();i++) {// cosider an option
                                     b2 = tm.getValueAt(i,0);
                                     //System.out.print("start of for loop."+((boolean)b2)+i+tm.getValueAt(i,0));
                                     if((boolean)b2==true){// if its ticked
                                        Object b1 = tm.getValueAt(i,2);//take its isbn
                                          Statement stmt1 = null;
                                        //  System.out.print("if it is tickesd");
                                        try {
	                                        String userName1 = "root";
	                                        String password1 = "";
	                                        String url1 = "jdbc:mysql://localhost/lis";
	                                        Class.forName("com.mysql.jdbc.Driver").newInstance();
                                                conn1 = DriverManager.getConnection(url1,userName1, password1);
                                                String selectSQL2 = "select * from bookrecord";
                                                stmt1 = conn1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
                                                rs1=stmt1.executeQuery(selectSQL2);
                                                System.out.println("while se pehle");
                                                 while(rs1.next()){//for all books
                                                      String strid = rs1.getString(2);
                                                      if(strid.equals((String)b1))// if I get my ticked book
                                                    {
                                                         
                                                         rs1.updateInt(4,rs1.getInt(4)+1);
                                                         rs1.updateRow();
                                                          
                                                         for(int p=5;p<=14;p++){
                                                              System.out.println("for ke baad"+(String)b1+rs.getString(p));
                                                             if(rs.getString(p) != null && rs.getString(p).startsWith((String)b1)){
                                                                 
                                                                 String date1 = rs.getString(p).substring(rs.getString(p).indexOf("@"),rs.getString(p).length());
                                                                 System.out.println(date1+"    "+date1.substring(1,3)+"   "+date1.substring(4,6)+"  ");
                                                                 date1 = date1.substring(1,3)+date1.substring(4,6)+date1.substring(7,11);
                                                                 System.out.println(date1);
                                                                 String d2 = date(0);
                                                                 d2 = d2.substring(1,3)+d2.substring(4,6)+d2.substring(7,11);
                                                                 tm1.addRow(new Object[] {namebook(((String)b1)),date1,d2,penalty(date1,d2,rs1.getDouble(6),rs.getInt(17))});
                                                                 System.out.println("if ke under"+(String)b1+strid);
                                                                 jPanel5.setVisible(true);
                                                                 
                                                                 rs.updateString(p, null);
                                                                 
                                                                 rs.updateRow();
                                                                 break;
                                                             }
                                                         }
                                                         rs.updateInt(18,rs.getInt(18)-1);
                                                         rs.updateRow();
                                                         
                                                    }
                                                }
                                                    rs1.close();
                                                    conn1.close();
                                                    System.out.println("for loop");
                                           }
                   
                                            catch (Exception event) {
                                                 System.out.println(event);
                                                  System.out.print("Error inserting record. this");
                                             } 
                                        
                                    }// a specific ticked books have been updated
                               }//all ticked books are updated                               
                           
                          rs.close();
                          conn.close();     
                       }

                catch (Exception event) {
	               	System.out.println(event);
	                System.out.print("Error inserting record. that");
	                        }
         jButton5ActionPerformed(null);
                        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        reservation();
        DefaultTableModel tm = (DefaultTableModel)jTable3.getModel();
        while (jTable3.getRowCount() > 0) {
            ((DefaultTableModel)jTable3.getModel()).removeRow(0);
        }
        Connection conn1 = null;
         Statement stmt1 = null;
         ResultSet rs1 = null;
	        try {
	           String userName = "root";
	           String password = "";
	           String url = "jdbc:mysql://localhost/lis";
	           Class.forName("com.mysql.jdbc.Driver").newInstance();
	           conn1 = DriverManager.getConnection(url,userName, password);
                   String selectSQL = "select * from memberrecord";
                    stmt1 = conn1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	           rs1=stmt1.executeQuery(selectSQL);
                   while(rs1.next()){// for every member
                       if(rs1.getString(3).equals(id))// if the correct member is found
                           break;
                   }
                   if(rs1.getString(19) == null){
                       int i = 0;  
        String namefd,isbnfd;
        int i1;
	Connection conn = null;
        Statement stmt = null;
        ResultSet rs;
	        try {
                   
	           String userName1 = "root";
	           String password1 = "";
	           String url1 = "jdbc:mysql://localhost/lis";
	           Class.forName("com.mysql.jdbc.Driver").newInstance();
	           conn = DriverManager.getConnection(url1,userName1, password1);
                   String selectSQL1 = "select * from bookrecord";
                   stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	           rs=stmt.executeQuery(selectSQL1);
                   
                   while(rs.next()){  
                       if(rs.getInt(4) == 0 && rs.getString(14) == null){
                        namefd = rs.getString(1);
                        isbnfd = rs.getString(2);

                       tm.addRow(new Object[] {false,namefd,isbnfd});  
                       
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
                   
                   rs1.updateRow();
                   rs1.close();
                   conn1.close();     
                       }
 
                catch (Exception event) {
	               	System.out.println(event);
	                System.out.print("Error inserting record.");
	                        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String bkisbn =null;
        DefaultTableModel tm = (DefaultTableModel)jTable3.getModel();
        int j= 0; Object b2;
        // first check if extra book are not taken
        
        for(int i=0;i<jTable3.getRowCount();i++){
             b2 = tm.getValueAt(i,0);
             bkisbn = (String)tm.getValueAt(i,2);
            if((boolean)b2==true)
                j++;  // j has the number of books opted for
        }
        if(j > 1)
            JOptionPane.showMessageDialog(null,"YOU CAN RESERVE ONLY ONE BOOK");
        else{
            String namefd,idfd,emailfd;	
	Connection conn = null;
         Statement stmt = null;
         ResultSet rs=null,rs1 = null;
	        try {
	           String userName = "root";
	           String password = "";
	           String url = "jdbc:mysql://localhost/lis";
	           Class.forName("com.mysql.jdbc.Driver").newInstance();
	           conn = DriverManager.getConnection(url,userName, password);
                   String selectSQL1 = "select * from memberrecord";
                    stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	           rs=stmt.executeQuery(selectSQL1);
                   while(rs.next()){// for every member
                       if(rs.getString(3).equals(id))// if the correct member is found
                           break;
                   }
                   rs.updateString(19,bkisbn);
                   rs.updateRow();
                   rs.close();
                   conn.close();     
                       }
 
                catch (Exception event) {
	               	System.out.println(event);
	                System.out.print("Error inserting record.");
	                        }
                
                Connection conn1=null;
                Statement stmt1 = null;              
                                        try {
	                                        String userName1 = "root";
	                                        String password1 = "";
	                                        String url1 = "jdbc:mysql://localhost/lis";
	                                        Class.forName("com.mysql.jdbc.Driver").newInstance();
                                                conn1 = DriverManager.getConnection(url1,userName1, password1);
                                                String selectSQL2 = "select * from bookrecord";
                                                stmt1 = conn1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
                                                rs1=stmt1.executeQuery(selectSQL2);
                                                 while(rs1.next()){//for all books
                                                      String strid = rs1.getString(2);
                                                      if(strid.equals(bkisbn))// if I get my ticked book
                                                    {
                                                         rs1.updateString(14,id);
                                                         rs1.updateString(12, date(1));                                 
                                                         rs1.updateRow();
                                                         break;
                                                         
                                                    }
                                                }
                                                    rs1.close();
                                                    conn1.close();
                                                    System.out.println("for loop");
                                           }
                                        
                                        
                                            catch (Exception event) {
                                                 System.out.println(event);
                                                  System.out.print("Error inserting record.");
                                             } 
                                        jButton6ActionPerformed(null);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        new Login().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        new Login().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        new Login().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        new Login().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    String date(int i){
        Date now = new Date();		
		SimpleDateFormat date1 = new SimpleDateFormat("dd");
                SimpleDateFormat month1 = new SimpleDateFormat("MM");
                SimpleDateFormat year1 = new SimpleDateFormat("yyyy");
		String date = date1.format(now);
                String mnt = month1.format(now);
                String yr = year1.format(now);
                if(i==0)
                return("@"+date+"#"+mnt+"$"+yr);
                else
                    return(date+mnt+yr);
    }
    
    String namebook(String isbn){
        String str= null;
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
                   while(rs.next()){// for every member
                       if(rs.getString(2).equals(isbn))// if the correct member is found
                           break;
                   }
                   str = (rs.getString(1));
                   rs.close();
                   conn.close();     
                       }

                catch (Exception event) {
	               	System.out.println(event);
	                System.out.print("Error inserting record.");
	                        }
                
                  return(str); 
    }
    
    double penalty(String d1,String d2,double rate,int max){
       int bd = Integer.parseInt(d1.substring(0,2));
        int rd = Integer.parseInt(d2.substring(0,2));
        int bm = Integer.parseInt(d1.substring(2,4));
        int rm = Integer.parseInt(d2.substring(2,4));
        int by = Integer.parseInt(d1.substring(4,8));
        int ry = Integer.parseInt(d2.substring(4,8));
        
        int td = rd - bd; td = Math.abs(td);
        int tm = rm - bm; tm = Math.abs(tm);
        int ty = ry - by; ty = Math.abs(ty);
        int days = (td+(tm*30)+(ty*365));
        if(days <= max*30)
            return 0;
        else{
        double penrate = ((td+(tm*30)+(ty*365))*rate);
        return penrate;
        }
    }
    
    void reservation(){
        String str= null,d1,d2;


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
                   while(rs.next()){// for every member
                      System.out.println("aaaaaaaaaaa");
                       if(rs.getString(14) != null){//if the correct member is found
                           System.out.println("bbbbbbbbbbb");
                           d1 = rs.getString(12);
                           d2 = date(1);
                           int bd = Integer.parseInt(d1.substring(0,2));
                           int rd = Integer.parseInt(d2.substring(0,2));
                           int bm = Integer.parseInt(d1.substring(2,4));
                           int rm = Integer.parseInt(d2.substring(2,4));
                           int by = Integer.parseInt(d1.substring(4,8));
                           int ry = Integer.parseInt(d2.substring(4,8));
        
                           int td = rd - bd; td = Math.abs(td);
                           int tm = rm - bm; tm = Math.abs(tm);
                           int ty = ry - by; ty = Math.abs(ty);
                           int days = (td+(tm*30)+(ty*365));
                           System.out.println("bbbbbbbbbbb" + "ccccccccccc" +days);
                           if(days > 7){
                           Connection conn1 = null;
                           Statement stmt1 = null;
                           ResultSet rs1 = null;
	        try {
	           String userName1 = "root";
	           String password1 = "";
	           String url1 = "jdbc:mysql://localhost/lis";
	           Class.forName("com.mysql.jdbc.Driver").newInstance();
	           conn1 = DriverManager.getConnection(url1,userName1, password1);
                   String selectSQL = "select * from memberrecord";
                    stmt1 = conn1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	           rs1=stmt1.executeQuery(selectSQL);                   
                    while(rs1.next()){// for every member
                        rs1.updateString(19, null);
                        rs1.updateRow();
                    }
                    rs1.close();
                    conn1.close();
                }

                catch (Exception event) {
	               	System.out.println(event);
	                System.out.print("Error inserting record.");
                }
                               rs.updateString(12, null);
                               rs.updateString(14, null);                               
                               rs.updateRow();
                           }
                       }
                   }
                   //str = (rs.getString(1));
                   rs.close();
                   conn.close();     
                       }

                catch (Exception event) {
	               	System.out.println(event);
	                System.out.print("Error inserting record.");
	                        }
    }
   
    
private String id;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    // End of variables declaration//GEN-END:variables
}
