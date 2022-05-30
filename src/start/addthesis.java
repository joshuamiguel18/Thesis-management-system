/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package start;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jayrold
 */
public class addthesis extends javax.swing.JFrame {
private static final String username = "root";
    private static final String password = "joshuakc1";
    private static final String dataConn = "jdbc:mysql://localhost:3306/thesis";

    Connection sqlConn = null;
    PreparedStatement pst = null;
    ResultSet rs= null;
    

int q, i,ID, del ;
    /**
     * Creates new form addthesis
     */
    public addthesis() {
          initComponents();
        this.setResizable(false);
  
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int xsize = (int)toolkit.getScreenSize().getWidth();
        int ysize = (int)toolkit.getScreenSize().getHeight();
        Insets scnMax = Toolkit.getDefaultToolkit().getScreenInsets(getGraphicsConfiguration());
        int taskBarSize = scnMax.bottom;
        this.setSize(xsize,ysize - taskBarSize);
    }
 public void upDateDB(){
          try
          {
              Class.forName("com.mysql.cj.jdbc.Driver");
              sqlConn = DriverManager.getConnection(dataConn,username,password);
              pst = sqlConn.prepareStatement("select * from thesis");
              rs = pst.executeQuery();
              ResultSetMetaData stData = rs.getMetaData();
              q = stData.getColumnCount();
              DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
                      RecordTable.setRowCount(0);
                      while(rs.next()){
                          Vector columnData = new Vector();
                          for(i = 0; i <= q ; i++)
                          {
                            columnData.add(rs.getInt("ID"));
                              columnData.add(rs.getString("title"));
                              columnData.add(rs.getString("author"));
                              columnData.add(rs.getString("abs"));
                              columnData.add(rs.getString("AcademicYear"));
                              columnData.add(rs.getString("Adviser"));
                                  
                          }
                          RecordTable.addRow(columnData);
                          
                      }
          }
          catch(Exception ex){
              JOptionPane.showMessageDialog(null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jTextField6 = new javax.swing.JTextField();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jToggleButton3 = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(29, 203, 206));
        jPanel1.setForeground(new java.awt.Color(0, 233, 82));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setLayout(new javax.swing.OverlayLayout(kGradientPanel1));
        jPanel1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 6, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 117, 262, 55));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 190, 262, 55));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 263, 262, 55));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 336, 262, 55));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 400, 262, 55));

        jToggleButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButton2.setText("ADD");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 540, 124, 43));

        jToggleButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButton4.setText("DELETE");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 540, 138, 43));

        jTextField6.setText("THESIS MANAGEMENT SYSTEM");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 24, 560, 40));

        kGradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButton3.setText("REFRESH");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        kGradientPanel3.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 530, 127, 41));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("ACADEMIC YEAR");
        kGradientPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, 42));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("THESIS ADVISER");
        kGradientPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 145, 42));

        jToggleButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButton5.setText("RESET");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });
        kGradientPanel3.add(jToggleButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, 133, 43));

        jToggleButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButton6.setText("UPDATE");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });
        kGradientPanel3.add(jToggleButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 539, 141, 43));

        jToggleButton1.setText("BACK");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        kGradientPanel3.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1237, 649, 90, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("ABSTRACT");
        kGradientPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 135, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("AUTHOR");
        kGradientPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 135, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("THESIS TITLE");
        kGradientPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 135, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "title", "author", "abs", "AcademicYear", "Adviser"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        kGradientPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 718, -1));

        jPanel1.add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            pst = sqlConn.prepareStatement("Insert into thesis(title, author, abs, AcademicYear,Adviser)value(?,?,?,?,?)");
            
            pst.setString(1, jTextField1.getText());
            pst.setString(2, jTextField2.getText());
            pst.setString(3, jTextField3.getText());
            pst.setString(4, jTextField4.getText());
            pst.setString(5, jTextField5.getText());
           
            
            String title = jTextField1.getText();
            String author = jTextField2.getText();
             String abs = jTextField3.getText();
            String AcademicYear = jTextField4.getText();
             String Adviser = jTextField5.getText();
             
            if(title.equals("")){
                JOptionPane.showMessageDialog(null, "Enter Thesis Title");
            }
            else if(author.equals("")){
                JOptionPane.showMessageDialog(null, "Enter Author");
            }
             else if(abs.equals("")){
                JOptionPane.showMessageDialog(null, "Enter Abstract");
            }
              else if(AcademicYear.equals("")){
                JOptionPane.showMessageDialog(null, "Enter Academic Year");
            }
               else if(Adviser.equals("")){
                JOptionPane.showMessageDialog(null, "Enter Adviser");
            }
            else{
                   pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Thesis Added");
            upDateDB();
                    }
        }
        catch(ClassNotFoundException | SQLException ex){
            java.util.logging.Logger.getLogger(item1.class.getName()).log(java.util.logging.Level.SEVERE,
                    null,ex);
        }
           upDateDB();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        close();
        searchbox o = new searchbox();
        o.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
      upDateDB();        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
                                      jTextField1.setText("");
                                      jTextField2.setText("");
                                      jTextField3.setText("");
                                      jTextField4.setText("");
                                      jTextField5.setText("");
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
                 int SelectedRows = jTable1.getSelectedRow();
                  int SelectedColumns = jTable1.getSelectedColumn();
                      try{
                      
        
                          del = JOptionPane.showConfirmDialog(null, "Confirm if you want to delete item",
                          "warning",JOptionPane.YES_NO_OPTION);
                          if(del==JOptionPane.YES_OPTION)
                                  {
                                      Class.forName("com.mysql.cj.jdbc.Driver");
                                      sqlConn = DriverManager.getConnection(dataConn,username,password);
                                      String value= (jTable1.getModel().getValueAt(SelectedRows, 0).toString());
                                      String value1= (jTable1.getModel().getValueAt(SelectedColumns, 5).toString());
                                   
                                     pst = sqlConn.prepareStatement("delete from thesis data where ID = "+value1);
                                     pst = sqlConn.prepareStatement("delete from thesis data where ID = "+value);
                                      pst.executeUpdate();
                                      JOptionPane.showMessageDialog(this, "Thesis Deleted ");
                                      upDateDB();
                                      jTextField1.setText("");
                                      jTextField2.setText("");
                                      jTextField3.setText("");
                                      jTextField4.setText("");
                                      jTextField5.setText("");
                                  }
                      }
                      catch(ClassNotFoundException ex){
                          java.util.logging.Logger.getLogger(item1.class.getName()).log(java.util.logging.Level.SEVERE,null, ex);
                      }catch(SQLException ex){
                          System.err.println(ex);
                      }
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
 int SelectedRows = jTable1.getSelectedRow();
try{
Class.forName("com.mysql.cj.jdbc.Driver");
sqlConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tms","root","admin");
String value= (jTable1.getModel().getValueAt(SelectedRows, 0).toString());
 String sql = "UPDATE thesis SET title=?,author=?,abs=?,AcademicYear=?, Adviser=? where ID = "+value;
if(jTable1.getSelectedRowCount() == 1){
    
 pst = sqlConn.prepareStatement(sql);
  
            pst.setString(1, jTextField1.getText());
            pst.setString(2, jTextField2.getText());
            pst.setString(3, jTextField3.getText());
            pst.setString(4, jTextField4.getText());
            pst.setString(5, jTextField5.getText());
          
 pst.executeUpdate();
 JOptionPane.showMessageDialog(null, "updated successfully");
}else{
    if(jTable1.getRowCount()==0){
        JOptionPane.showMessageDialog(this, "Table is Empty");
    }
    else{
        JOptionPane.showMessageDialog(this, "Please select a Row you want");
    }
}
}catch(SQLException | HeadlessException ex){
JOptionPane.showMessageDialog(null, ex);
 }  catch (ClassNotFoundException ex) {
        Logger.getLogger(item1.class.getName()).log(Level.SEVERE, null, ex);
    }
 upDateDB();
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        
        int SelectedRows = jTable1.getSelectedRow();
       
       String title = RecordTable.getValueAt(jTable1.getSelectedRow(), 1).toString(); 
       String author = RecordTable.getValueAt(jTable1.getSelectedRow(), 2).toString(); 
       String abs = RecordTable.getValueAt(jTable1.getSelectedRow(), 3).toString(); 
       String AcademicYear = RecordTable.getValueAt(jTable1.getSelectedRow(), 4).toString(); 
       String Adviser = RecordTable.getValueAt(jTable1.getSelectedRow(), 5).toString(); 
          
       jTextField1.setText(title) ;
       jTextField2.setText(author) ;
       jTextField3.setText(abs) ;
       jTextField4.setText(AcademicYear) ;
       jTextField5.setText(Adviser) ;  
    }//GEN-LAST:event_jTable1MouseClicked
public void close()
{
    WindowEvent closeWindow;
        closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
}
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
            java.util.logging.Logger.getLogger(addthesis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addthesis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addthesis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addthesis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addthesis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel3;
    // End of variables declaration//GEN-END:variables

   
}
