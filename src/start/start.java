/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package start;

import java.awt.Color;
import java.awt.Dimension;
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
import java.util.jar.Attributes.Name;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jayrold
 */
public class start extends javax.swing.JFrame {
private static final String username = "root";
    private static final String password = "joshuakc1";
    private static final String dataConn = "jdbc:mysql://localhost:3306/thesis";

    Connection sqlConn = null;
    PreparedStatement pst = null;
    ResultSet rs= null;
    

int q, i,ID, del ;
    /**
     * Creates new form start
     */
    public start() {
        initComponents();
        this.setResizable(false);
      
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int xsize = (int)toolkit.getScreenSize().getWidth();
        int ysize = (int)toolkit.getScreenSize().getHeight();
        Insets scnMax = Toolkit.getDefaultToolkit().getScreenInsets(getGraphicsConfiguration());
        int taskBarSize = scnMax.bottom;
        this.setSize(xsize,ysize - taskBarSize);
       
    }
public void close()
{
    WindowEvent closeWindow;
        closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
}


//===========================================//
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
                              columnData.add(rs.getString("Password"));
                            
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

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1280, 700));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setToolTipText("");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jayrold\\Downloads\\COEA (2).png")); // NOI18N
        jLabel1.setText("jLabel1");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 70, 265, -1));

        jLabel4.setFont(new java.awt.Font("Tekton Pro", 1, 48)); // NOI18N
        jLabel4.setText("THESIS MANAGEMENT SYSTEM");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 740, 60));

        jPasswordField1.setText("Password");
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 280, 50));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setAlignmentX(5.0F);
        jSeparator2.setAlignmentY(5.0F);
        jSeparator2.setPreferredSize(new java.awt.Dimension(100, 100));
        kGradientPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 280, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setPreferredSize(new java.awt.Dimension(100, 100));
        kGradientPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 280, 10));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/start/New Project (6).png"))); // NOI18N
        jLabel5.setText("jLabel1");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -10, 265, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jayrold\\Downloads\\pngtree-outline-user-icon-png-image_1727916 (2).png")); // NOI18N
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 60, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jayrold\\Downloads\\Layer 1 (2).png")); // NOI18N
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, -1, -1));

        jToggleButton2.setText("REGISTER");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 120, 30));

        jToggleButton3.setText("LOGIN");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 120, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Forgot Password?");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 160, 20));

        jTextField2.setText("Username");
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        kGradientPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 280, 40));

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, -1, -1));

        jPanel1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1350, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
         close();
        Changepass pi = new Changepass();
        pi.setVisible(true);  
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
  close();
        Register pi = new Register();
        pi.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
      
        
           
           String Username = jTextField2.getText();
           String Password = String.valueOf(jPasswordField1.getPassword());
          
         
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn,username,password);
             String sql = "select * from login where Username =? and Password =? ";
           pst = sqlConn.prepareStatement(sql);  
           pst.setString(1, Username);
           pst.setString(2, Password);
           
           rs =  pst.executeQuery();
           if(rs.next())
           {
                close();
            searchbox pi = new searchbox();
        pi.setVisible(true);
               JOptionPane.showMessageDialog(null, "LOGIN SUCCESFULLY!");
                    this.dispose();
           }
           else{
                JOptionPane.showMessageDialog(null, "INVALID USERNAME OR PASSWORD");
           }
            
        }
        catch(ClassNotFoundException | SQLException ex){
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE,
                    null,ex);
        }
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
  
    
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost

    
    }//GEN-LAST:event_jTextField2FocusLost

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
         
    
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected()){
            jPasswordField1.setEchoChar((char)0);
        } else {
              jPasswordField1.setEchoChar('*');
    }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new start().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
