
package tugasakhirdkp;

import javax.swing.JFrame;

public class Tampilan3 extends javax.swing.JFrame {
    public static String PriceMotor;
    public static String PriceMobil;
    public Tampilan3() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
        NamaPenitip.setText(Tampilan1.name);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NamaPenitip = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        WaktuKeluar = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        WaktuMasukT3 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        JumlahBayar = new javax.swing.JLabel();
        pesan = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Close = new javax.swing.JButton();
        Tipekendaraan = new javax.swing.JLabel();
        Platkendaraan = new javax.swing.JLabel();
        pesan1 = new javax.swing.JLabel();
        pesan2 = new javax.swing.JLabel();
        Hari = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PENITIPAN MOTOR");
        setPreferredSize(new java.awt.Dimension(370, 470));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TERIMA KASIH !");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 10, 300, 20);

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("KEAMANAN ADALAH PRIORITAS KAMI");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 70, 350, 20);

        NamaPenitip.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NamaPenitip.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NamaPenitip.setText("NAMA");
        NamaPenitip.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                NamaPenitipAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(NamaPenitip);
        NamaPenitip.setBounds(50, 40, 240, 25);

        WaktuKeluar.setBackground(new java.awt.Color(0, 102, 102));
        WaktuKeluar.setColumns(20);
        WaktuKeluar.setForeground(new java.awt.Color(255, 255, 255));
        WaktuKeluar.setRows(5);
        WaktuKeluar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 153, 0)));
        jScrollPane1.setViewportView(WaktuKeluar);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 210, 310, 60);

        WaktuMasukT3.setBackground(new java.awt.Color(0, 102, 102));
        WaktuMasukT3.setColumns(20);
        WaktuMasukT3.setForeground(new java.awt.Color(255, 255, 255));
        WaktuMasukT3.setRows(5);
        WaktuMasukT3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 153, 0)));
        jScrollPane2.setViewportView(WaktuMasukT3);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 140, 310, 60);

        jPanel1.setBackground(new java.awt.Color(131, 191, 221));
        jPanel1.setLayout(null);

        JumlahBayar.setBackground(new java.awt.Color(204, 255, 255));
        JumlahBayar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        JumlahBayar.setForeground(new java.awt.Color(255, 0, 0));
        JumlahBayar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JumlahBayar.setText("JUMLAH BAYAR");
        JumlahBayar.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                JumlahBayarAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(JumlahBayar);
        JumlahBayar.setBounds(0, 0, 120, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(110, 310, 120, 30);

        pesan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pesan.setForeground(new java.awt.Color(255, 255, 0));
        pesan.setText("Jangan lupa untuk mengambil kendaraan Anda");
        getContentPane().add(pesan);
        pesan.setBounds(10, 350, 330, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Plat nomor        :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 110, 120, 20);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Tipe kendaraan :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 90, 120, 20);

        Close.setBackground(new java.awt.Color(255, 204, 51));
        Close.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        getContentPane().add(Close);
        Close.setBounds(130, 400, 80, 24);

        Tipekendaraan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Tipekendaraan.setForeground(new java.awt.Color(255, 255, 255));
        Tipekendaraan.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TipekendaraanAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(Tipekendaraan);
        Tipekendaraan.setBounds(140, 90, 120, 20);

        Platkendaraan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Platkendaraan.setForeground(new java.awt.Color(255, 255, 255));
        Platkendaraan.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                PlatkendaraanAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(Platkendaraan);
        Platkendaraan.setBounds(140, 110, 120, 20);

        pesan1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pesan1.setForeground(new java.awt.Color(255, 255, 0));
        pesan1.setText("pada waktu yang telah ditentukan");
        getContentPane().add(pesan1);
        pesan1.setBounds(10, 370, 280, 20);

        pesan2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pesan2.setText("Anda menitipkan kendaraan selama");
        getContentPane().add(pesan2);
        pesan2.setBounds(20, 280, 235, 20);

        Hari.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Hari.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(Hari);
        Hari.setBounds(270, 280, 70, 20);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugasakhirdkp/Global Travel Clipart Transparent PNG Hd, City Travel Globalization, City Clipart, City, Travel PNG Image For Free Download.jpeg"))); // NOI18N
        Background.setText("jLabel1");
        getContentPane().add(Background);
        Background.setBounds(-290, -430, 650, 870);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TipekendaraanAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TipekendaraanAncestorAdded
    Tipekendaraan.setText(Tampilan2.tipekendaraan);
    }//GEN-LAST:event_TipekendaraanAncestorAdded

    private void JumlahBayarAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_JumlahBayarAncestorAdded
    
    }//GEN-LAST:event_JumlahBayarAncestorAdded

    private void PlatkendaraanAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_PlatkendaraanAncestorAdded
    Platkendaraan.setText(Tampilan2.Platnomor);
    }//GEN-LAST:event_PlatkendaraanAncestorAdded

    private void NamaPenitipAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_NamaPenitipAncestorAdded
    
    }//GEN-LAST:event_NamaPenitipAncestorAdded

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
    this.dispose();
    }//GEN-LAST:event_CloseActionPerformed

    public static void main(String args[]) {
        System.out.println(PriceMotor);
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        new Tampilan3().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Close;
    public javax.swing.JLabel Hari;
    public javax.swing.JLabel JumlahBayar;
    private javax.swing.JLabel NamaPenitip;
    private javax.swing.JLabel Platkendaraan;
    public javax.swing.JLabel Tipekendaraan;
    public javax.swing.JTextArea WaktuKeluar;
    public javax.swing.JTextArea WaktuMasukT3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel pesan;
    private javax.swing.JLabel pesan1;
    private javax.swing.JLabel pesan2;
    // End of variables declaration//GEN-END:variables
}
