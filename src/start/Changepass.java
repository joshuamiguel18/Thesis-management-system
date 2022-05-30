/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package start;

import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Jayrold
 */
public class Changepass extends javax.swing.JFrame {
    private static final String username = "root";
    private static final String password = "joshuakc1";
    private static final String dataConn = "jdbc:mysql://localhost:3306/thesis";

    Connection sqlConn = null;
    PreparedStatement pst = null;
    ResultSet rs= null;
    int q, i,ID, del ;
    /**
     * Creates new form Changepass
     */
    public Changepass() {
        initComponents();
        this.setResizable(false);
      
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int xsize = (int)toolkit.getScreenSize().getWidth();
        int ysize = (int)toolkit.getScreenSize().getHeight();
        Insets scnMax = Toolkit.getDefaultToolkit().getScreenInsets(getGraphicsConfiguration());
        int taskBarSize = scnMax.bottom;
        this.setSize(xsize,ysize - taskBarSize);
    }
//===================================================//
    public void upDateDB(){
          try
          {
              Class.forName("com.mysql.cj.jdbc.Driver");
              sqlConn = DriverManager.getConnection(dataConn,username,password);
              pst = sqlConn.prepareStatement("select * from login");
              rs = pst.executeQuery();
              ResultSetMetaData stData = rs.getMetaData();
              q = stData.getColumnCount();
             
                      
                      while(rs.next()){
                          Vector columnData = new Vector();
                          for(i = 0; i <= q ; i++)
                          {
                            columnData.add(rs.getInt("ID"));
                              columnData.add(rs.getString("Name"));
                              columnData.add(rs.getString("Username"));
                              columnData.add(rs.getString("Password"));
                              columnData.add(rs.getString("Repassword"));
                      
                                  
                          }
                         
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

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButton1.setText("BACK");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1151, 605, 134, 48));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("CONFIRM PASSWORD");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 198, 55));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("USERNAME");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 198, 55));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 316, 44));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("FORGOT PASSWORD");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 980, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("NEW PASSWORD");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 198, 55));

        jPasswordField1.setText("Password");
        kGradientPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 320, 50));

        jPasswordField2.setText("Password");
        kGradientPanel1.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 320, 50));

        jToggleButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButton2.setText("UPDATE");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 110, 40));

        jToggleButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButton3.setText("VERIFY USERNAME");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 200, 40));

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
       close();
        start o = new start();
        o.setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
       String Username = jTextField1.getText();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn,username,password);
        
           String sql = "Select * From login where Username =?";
           pst = sqlConn.prepareStatement(sql);  
           pst.setString(1, Username);
           rs =  pst.executeQuery();
           
           if(rs.next()){
               JOptionPane.showMessageDialog(null, "Valid UserName");
               jTextField1.setText(rs.getString(Username));
               
           }
           else{
              
               JOptionPane.showMessageDialog(null, "Invalid UserName");
               jTextField1.setText("");
               
           }
           
       }catch(Exception e){
       }    
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
      String Username = jTextField1.getText();
      String newpassword = String.valueOf(jPasswordField2.getPassword());
       String repassword = String.valueOf(jPasswordField1.getPassword());
       try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn,username,password);
               
               
           String sql = "UPDATE login SET Password=?, Repassword=? where Username=?";
            pst = sqlConn.prepareStatement(sql);
            
            pst.setString(1, String.valueOf(jPasswordField2.getPassword()));
            pst.setString(2, String.valueOf(jPasswordField1.getPassword()));
            pst.setString(3, jTextField1.getText());
            //rs =  pst.executeQuery();
           //if(rs.next()){
                  
            //sql =  "Select * from login where Username=?" ;
            //pst = sqlConn.prepareStatement(sql);  
            
          
            if(!newpassword.equals(repassword)){
                JOptionPane.showMessageDialog(null, "Re-enter Password");
            }
            else if(newpassword.equals("") || repassword.equals("")){
                JOptionPane.showMessageDialog(null, "Enter Password");
            }
            else{
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Your Password is updated successfully!");
            }
           
           //else{
               //JOptionPane.showMessageDialog(null, "error!");
           //}
            
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "error in connection!");
       }
    upDateDB();
                                                  
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
    if(jCheckBox1.isSelected()){
            jPasswordField2.setEchoChar((char)0);
        } else {
              jPasswordField2.setEchoChar('*');
    }
    }//GEN-LAST:event_jCheckBox1ActionPerformed
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
            java.util.logging.Logger.getLogger(Changepass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Changepass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Changepass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Changepass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Changepass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}