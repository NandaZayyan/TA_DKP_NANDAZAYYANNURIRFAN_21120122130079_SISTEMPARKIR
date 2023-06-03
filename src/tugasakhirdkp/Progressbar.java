
package tugasakhirdkp;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

public class Progressbar extends javax.swing.JFrame {
    
    pbThead t1;
    
    public Progressbar() {
        initComponents();
        setResizable(false);
        
    pbThead t1 = new pbThead(Loading);
    t1.start();
    
    }
    
   

    class pbThead extends Thread
    {
        JProgressBar pbar;
        
        pbThead(JProgressBar pbar)
        {
            pbar = Loading; 
        }
        public void run()
        {
            int min = 0;
            int max = 50;
            Loading.setMaximum(min);       
            Loading.setMaximum(max);       
            Loading.setValue(0);
            
            for(int i = min ; i < max ; i++)
            {
                Loading.setValue(i);
                
                try {
                    sleep(50);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Progressbar.class.getName()).log(Level.SEVERE, null, ex);
                }
                    
            } 
            Tampilan1 t1 = new Tampilan1 ();
            t1.setVisible(true);
            dispose();
        }
                
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Loading = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loading");
        setMinimumSize(new java.awt.Dimension(420, 140));
        setPreferredSize(new java.awt.Dimension(420, 140));
        setResizable(false);
        getContentPane().setLayout(null);

        Loading.setToolTipText("");
        Loading.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        getContentPane().add(Loading);
        Loading.setBounds(61, 30, 267, 29);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Please Wait");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 60, 120, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugasakhirdkp/Civilized Transportation Safe Travel Traffic Safety Safety Education.jpeg"))); // NOI18N
        jLabel2.setLabelFor(Loading);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-80, -430, 1160, 900);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  
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
            java.util.logging.Logger.getLogger(Progressbar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Progressbar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Progressbar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Progressbar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Progressbar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Loading;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
