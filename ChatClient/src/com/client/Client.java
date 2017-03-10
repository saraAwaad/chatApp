package com.client;

import java.awt.Color;
import java.awt.Insets;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

/**
 *
 * @author Sara
 */
public class Client extends javax.swing.JFrame implements Runnable{
   
	private static final long serialVersionUID = 1L;
	Socket socket;
    FileInputStream fis;
    FileOutputStream fos;
    String replay;
   // private static int counter =0;
    byte[] b=new byte[1024];
    static String txt;
    final String ServerIP="127.0.0.1";
    String clientName="";
    Color color=null;
    private static final AtomicInteger counter = new AtomicInteger();
    Color[] colors={Color.RED,Color.black,Color.blue,Color.cyan};
    String[] names={"sara","mohamed","heba","Ali","Hala"};
    JPanel panelHome=null;
    /** 
     * Creates new form Client
     */
     public Client() {
    	 counter.getAndIncrement();
        
        try {
            Thread th=new Thread(this);
            int randomindex=randInt(0, colors.length-1);
            color=colors[randomindex];
            clientName=names[randInt(0, names.length)];
            System.out.println("my name: "+clientName);
            socket=new Socket(ServerIP,2222);
            fis=(FileInputStream) socket.getInputStream();
            fos=(FileOutputStream) socket.getOutputStream();
            th.start();
            initComponents();
            //tPane.setText(txt);
            jTextArea1.setText(txt);
           
        } catch (IOException ex) {
            System.out.println(ex.toString());
            JOptionPane.showMessageDialog(this, ex.getMessage(),"server is closed ", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            
        }finally{
            
        
        }
    }
     
     public Client(String USERName,JPanel panelHome) {
    	 counter.getAndIncrement();
        
        try {
            Thread th=new Thread(this);
            clientName=USERName;
            System.out.println("my name: "+clientName);
            socket=new Socket(ServerIP,2222);
            fis=(FileInputStream) socket.getInputStream();
            fos=(FileOutputStream) socket.getOutputStream();
            th.start();
            this.panelHome=panelHome;
            initComponents();
            jTextArea1.setText(txt);
           
        } catch (IOException ex) {
            System.out.println(ex.toString());
            JOptionPane.showMessageDialog(this, ex.getMessage(),"server is closed ", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            
        }finally{
            
        
        }
    }

     public static int getNumOfInstances() {
         return counter.get();
     }
    /**
     * This method is called from within the constructor to initialize the form..
     */
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        tPane = new JTextPane();  
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addGap(47, 47, 47)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jTextField1))
                    .addComponent(jButton1))
                .addGap(59, 59, 59))
        );

        EmptyBorder eb = new EmptyBorder(new Insets(10, 10, 10, 10));
        tPane.setBorder(eb);
        //tPane.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        tPane.setMargin(new Insets(5, 5, 5, 5));
        
        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);
        //jScrollPane1.setViewportView(tPane);


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        if( panelHome!=null)
       	 panelHome.add(jPanel2);
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
        	//appendToPane(tPane, "\n"+replay, colors[randInt(0, colors.length-1)]);//("\n"+replay);
            fos.write((clientName+" : "+jTextField1.getText().trim()).getBytes());
        } catch (IOException ex) {
            System.out.println("empty textfield");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
 void windowClosed(){

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
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	Client c=new Client();
            	c.setVisible(true);
            	c.setTitle("Client "+c.clientName);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane tPane;

    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while(true){
            try {
                // send
                fis.read(b);
                replay=new String(b);
                /*if(id==1){
                    jTextArea1.setText("\n"+id+" : "+replay);
                }
                else*/
              //  appendToPane(tPane, "\n"+replay, Color.BLUE);//("\n"+replay);
                jTextArea1.append("\n"+replay);
                //txt=tPane.getText();
                 txt=jTextArea1.getText();
                jTextField1.setText("");
                //System.out.println(replay);
            } catch ( ConnectException e1) {
                System.out.println(e1.toString());
                JOptionPane.showMessageDialog(this, e1.getMessage(),"server is closed ", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
              
            } catch ( IOException ex) {
                System.out.println(ex.toString());
                JOptionPane.showMessageDialog(this, ex.getMessage(),"server is closed ", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }    
        }
    }
    
    @SuppressWarnings("unused")
	private void appendToPane(JTextPane tp, String msg, Color c)
    {
        StyleContext sc = StyleContext.getDefaultStyleContext();
        AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, c);

        aset = sc.addAttribute(aset, StyleConstants.FontFamily, "Lucida Console");
        aset = sc.addAttribute(aset, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);

        int len = tp.getDocument().getLength();
        tp.setCaretPosition(len);
        tp.setCharacterAttributes(aset, false);
        tp.replaceSelection(msg);
    }
    
    @Override
    protected void finalize() {
        try {
			super.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        counter.getAndDecrement();
    }
    
    public static int randInt(int min, int max) {

       int rand=min + (int)(Math.random() * ((max - min) + 1));
       System.out.println("rand= "+rand);
        return rand;
    }

}
