/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugasakhirdkp;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;

public class Tampilan1 extends javax.swing.JFrame {

public static String  name;
public static boolean MobilButton;
public static boolean MotorButton;

    public Tampilan1() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
    }

    public static String Time() {
        // Mengambil tanggal, hari, dan waktu saat ini
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String tanggal = dateFormat.format(date);

        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
        String hari = dayFormat.format(date);

        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        String jam = timeFormat.format(date);

        String pesan = "Hari masuk : " + hari + "\nJam              : " + jam + "\nTanggal       : " + tanggal;
        System.out.println(pesan);
        
        return pesan;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NamaPenitip = new javax.swing.JTextField();
        Motor = new javax.swing.JButton();
        Mobil = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Pricelist = new javax.swing.JLabel();
        Pricelist1 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PENITIPAN MOTOR");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(480, 280));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("WELCOME TO TIKAR");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 10, 300, 20);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tempat Titip Kendaraan");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 40, 180, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nama penitip :");
        jLabel3.setPreferredSize(new java.awt.Dimension(40, 20));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 80, 100, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Harga tersebut adalah harga perhari");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 200, 250, 20);

        NamaPenitip.setBackground(new java.awt.Color(255, 204, 51));
        NamaPenitip.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NamaPenitip.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        NamaPenitip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaPenitipActionPerformed(evt);
            }
        });
        getContentPane().add(NamaPenitip);
        NamaPenitip.setBounds(130, 80, 250, 25);

        Motor.setBackground(new java.awt.Color(255, 204, 51));
        Motor.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        Motor.setText("Motor");
        Motor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        Motor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MotorActionPerformed(evt);
            }
        });
        getContentPane().add(Motor);
        Motor.setBounds(30, 150, 90, 30);

        Mobil.setBackground(new java.awt.Color(255, 204, 51));
        Mobil.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        Mobil.setText("Mobil");
        Mobil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        Mobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MobilActionPerformed(evt);
            }
        });
        getContentPane().add(Mobil);
        Mobil.setBounds(240, 150, 90, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Pilih jenis kendaraan anda");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 110, 172, 20);

        Pricelist.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Pricelist.setText("Rp 2.000");
        getContentPane().add(Pricelist);
        Pricelist.setBounds(130, 150, 100, 30);

        Pricelist1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Pricelist1.setText("Rp 5.000");
        getContentPane().add(Pricelist1);
        Pricelist1.setBounds(340, 150, 90, 30);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugasakhirdkp/Fresh Cartoon Cute City Silhouette Background.jpeg"))); // NOI18N
        Background.setLabelFor(Background);
        Background.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Background);
        Background.setBounds(0, 0, 480, 250);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NamaPenitipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaPenitipActionPerformed

    }//GEN-LAST:event_NamaPenitipActionPerformed

    private void MobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MobilActionPerformed
        Tampilan2 t2 = new Tampilan2 ();
        t2.setVisible(true);
        t2.pack();
        t2.setLocationRelativeTo(null);
        t2.setDefaultCloseOperation(Tampilan2.EXIT_ON_CLOSE);
        MobilButton = true;
        t2.jLabel4.setText("Mobil");
        name = NamaPenitip.getText();
        t2.WaktuMasukT2.setText(Time());
        this.dispose();
    }//GEN-LAST:event_MobilActionPerformed

    private void MotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MotorActionPerformed
        Tampilan2 t2 = new Tampilan2 ();
        t2.setVisible(true);
        t2.pack();
        t2.setLocationRelativeTo(null);
        t2.setDefaultCloseOperation(Tampilan2.EXIT_ON_CLOSE);
        MotorButton = true;
        t2.jLabel4.setText("Motor");
        name = NamaPenitip.getText();
        t2.WaktuMasukT2.setText(Time());
        this.dispose();
    }//GEN-LAST:event_MotorActionPerformed

    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tampilan1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Mobil;
    private javax.swing.JButton Motor;
    private javax.swing.JTextField NamaPenitip;
    private javax.swing.JLabel Pricelist;
    private javax.swing.JLabel Pricelist1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
