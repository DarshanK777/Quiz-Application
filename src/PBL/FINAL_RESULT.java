/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBL;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.*;

/**
 *
 * @author MANIAC
 */
public class FINAL_RESULT extends javax.swing.JFrame {
Connection c =null;
Statement stmt = null;
ResultSet rs=null ,rs1=null;
PreparedStatement pst=null;
String i,t,j,r;
int n,m,e,y=0,id;


    /**
     * Creates new form FINAL_RESULT
     */
    public FINAL_RESULT() {
        initComponents();
        Roll();
   
    
   loopdb();
   test();
   data();
   
   
    System.out.println(n);
    
    }
    public void data(){
        t =String.valueOf(n);
        c=Pconnect.ConnectDB();
        
        try
        {
            
            stmt = c.createStatement();
            rs = stmt.executeQuery("Select * from s_info");
            while (rs.next()){
            String q = rs.getString("name1");
            String q1 = rs.getString("div");
            String q2 = rs.getString("roll");
           
            
            sname.setText(q);
            sdiv.setText(q1);
            sroll.setText(q2);
                
            tscore.setText(t);
            }
            rs.close();
            stmt.close();
            c.close();
            
            
            
            
        }
        catch (Exception e)
        {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);               
        }
        
    }
    public String Roll(){
        
        c=Pconnect.ConnectDB();
        try
        {
            stmt= c.createStatement();
            rs = stmt.executeQuery("Select roll from s_info");
            while (rs.next()){
           r = rs.getString("roll");
           
           System.out.println(r);
          
           
           
        }
        } catch (Exception e)
                {
                    
                }
        
        return r;
    }
    
    
    
   

    public int store(int x)
    {
        System.out.println("x ="+x);
        n=x;
        return n;
    }
    
public  void result()
{
    c=Pconnect.ConnectDB();
    
    try
            {
             
            stmt = c.createStatement();
            rs = stmt.executeQuery("Select cans from q_table");
            stmt = c.createStatement();
            rs1 = stmt.executeQuery("Select cans from "+"a"+r);
            
            while (rs.next()){
            
            j = rs.getString("cans");
            System.out.println("result = " +j);
           
           
           rs1.next();
            
            i = rs1.getString("cans");
            System.out.println("result1 = "+i);
            
          if(rs.getString("cans")!=rs1.getString("cans"))
          {
             n=n+0;
          }else
          { n=n+1;
              store(n);
              
          }
           
            
            
         
            }
           
            
       rs.close();
       c.close();
            }
    catch (Exception e)
            {
                  JOptionPane.showMessageDialog(null,e);;
           
            }
    
}
 public int loopdb()
    {
    c=Pconnect.ConnectDB();
   
        try
        {
            
            stmt = c.createStatement();
            rs = stmt.executeQuery("Select id from q_table");
            while (rs.next()){
            id = rs.getInt("id");
            
            }
            System.out.println(id);
            rs.close();
            stmt.close();
            c.close();
            
            
            
            
        }
        catch (Exception e)
        {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);               
        }
               return id;
    }
 public void test(){
    c=Pconnect.ConnectDB();
        try
        {
            String sql="Select cans from "+"a"+r+" Intersect "+" Select cans from q_table";
            stmt = c.createStatement();
              rs = stmt.executeQuery(sql);
            while (rs.next()){
                if (rs!=null)
                {
           m++;
                
           System.out.println("m is "+m);
                }
           
           
        }
            System.out.println("id is"+id);
            if(id==m){
               n=0;
               store(n);
            }
            else{
            y=id-m;
            System.out.println("re"+y);
            
            store(m);
            }
            rs.close();
        } catch (Exception e)
                {
                     JOptionPane.showMessageDialog(null,e);;
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

        jLabel1 = new javax.swing.JLabel();
        sname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sroll = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sdiv = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tscore = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Student Name:");

        sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snameActionPerformed(evt);
            }
        });

        jLabel2.setText("Roll No:");

        jLabel3.setText("Div:");

        jLabel4.setText("Total Score:");

        jButton1.setText("Main");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sdiv)
                    .addComponent(tscore, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(sname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(197, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(sroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(sdiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(tscore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void snameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      MAIN Info = new MAIN();
      Info.setVisible(true);           // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FINAL_RESULT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FINAL_RESULT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FINAL_RESULT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FINAL_RESULT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FINAL_RESULT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField sdiv;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField sroll;
    private javax.swing.JTextField tscore;
    // End of variables declaration//GEN-END:variables
}
