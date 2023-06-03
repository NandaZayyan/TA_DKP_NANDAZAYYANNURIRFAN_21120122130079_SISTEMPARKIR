
package tugasakhirdkp;

import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;


public class Tampilan2 extends javax.swing.JFrame {
    public static String Platnomor;
    public static String tipekendaraan;
    public static int titip;

    public Tampilan2() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
        
    }
    
    public static String Waktukeluar(int Waktukeluar) {
        // Mendapatkan tanggal sekarang
        Date date = new Date();

        // Menambahkan hari ke tanggal sekarang
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, Waktukeluar);
        Date futureDate = calendar.getTime();

        // Format tanggal menggunakan SimpleDateFormat
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String tanggalBerikutnya = dateFormat.format(futureDate);

        // Format hari menggunakan SimpleDateFormat
        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
        String hariBerikutnya = dayFormat.format(futureDate);
        
        // Format waktu menggunakan SimpleDateFormat
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        String waktu = timeFormat.format(date);
        
        // Menampilkan hasil
        String pesan = "Hari Keluar : " + hariBerikutnya + "\nJam              : " + waktu + "\nTanggal       : " + tanggalBerikutnya;
        System.out.println(pesan);
        return pesan;
    }
     
        public static String HargaMotor(int angka){
            int HargaMotor = angka * 2 ;
            System.out.println();
            String nilai = String.valueOf(HargaMotor);
            return nilai;
        }
        public static String HargaMobil(int angka){
            int HargaMobil = angka * 5 ;
            System.out.println("Rp" + HargaMobil + "." + "000,00");
            String nilai = String.valueOf(HargaMobil);
            return nilai;
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        WaktuMasukT2 = new javax.swing.JTextArea();
        PlatNomor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Waktutitip = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PENITIPAN MOTOR");
        setMinimumSize(new java.awt.Dimension(480, 280));
        setPreferredSize(new java.awt.Dimension(480, 280));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TIKAR");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 10, 300, 20);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tempat Titip Kendaraan");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 30, 180, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Plat nomor :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(260, 60, 90, 20);

        WaktuMasukT2.setBackground(new java.awt.Color(0, 102, 102));
        WaktuMasukT2.setColumns(20);
        WaktuMasukT2.setForeground(new java.awt.Color(255, 255, 255));
        WaktuMasukT2.setRows(5);
        WaktuMasukT2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 153, 0)));
        WaktuMasukT2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                WaktuMasukT2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(WaktuMasukT2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 130, 440, 70);

        PlatNomor.setBackground(new java.awt.Color(255, 204, 102));
        PlatNomor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PlatNomor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlatNomorActionPerformed(evt);
            }
        });
        getContentPane().add(PlatNomor);
        PlatNomor.setBounds(350, 60, 100, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Tipe kendaraaan  :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 60, 130, 20);

        Submit.setBackground(new java.awt.Color(255, 204, 51));
        Submit.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        Submit.setText("Submit");
        Submit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        getContentPane().add(Submit);
        Submit.setBounds(340, 210, 80, 21);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel4AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 60, 90, 20);

        Back.setBackground(new java.awt.Color(255, 204, 51));
        Back.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        Back.setText("Back");
        Back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(40, 210, 70, 21);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Waktu titip (hari)  :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 90, 130, 20);

        Waktutitip.setBackground(new java.awt.Color(255, 204, 51));
        Waktutitip.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Waktutitip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WaktutitipActionPerformed(evt);
            }
        });
        Waktutitip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                WaktutitipKeyPressed(evt);
            }
        });
        getContentPane().add(Waktutitip);
        Waktutitip.setBounds(140, 90, 30, 25);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(180, 90, 260, 30);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(380, 30, 60, 20);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugasakhirdkp/Fresh Cartoon Cute City Silhouette Background.jpeg"))); // NOI18N
        Background.setText("jLabel1");
        getContentPane().add(Background);
        Background.setBounds(0, 0, 480, 250);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        Tampilan1 t1 = new Tampilan1 ();
        t1.setVisible(true);
        t1.pack();
        t1.setLocationRelativeTo(null);
        t1.setDefaultCloseOperation(Tampilan1.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        Tampilan3 t3 = new Tampilan3 ();
        t3.setVisible(true);
        t3.pack();
        t3.setLocationRelativeTo(null);
        t3.setDefaultCloseOperation(Tampilan3.EXIT_ON_CLOSE);
        Platnomor = PlatNomor.getText();  
        t3.WaktuMasukT3.setText(Tampilan1.Time());
        tipekendaraan = jLabel4.getText();
        
        int angka;
        String hari = Waktutitip.getText();
        titip = Integer.parseInt(hari);
        angka = titip;
        Waktukeluar(angka);
        t3.WaktuKeluar.setText(Waktukeluar(angka));
        t3.Hari.setText(hari+" hari");
        
        if (Tampilan1.MotorButton == true){      
            HargaMotor(angka);
            t3.JumlahBayar.setText("Rp"+HargaMotor(angka)+".000,00");
        
    }
        if (Tampilan1.MobilButton == true) {
            HargaMobil(angka);
            t3.JumlahBayar.setText("Rp"+HargaMobil(angka)+".000,00");
         
    }
        this.dispose();
    }//GEN-LAST:event_SubmitActionPerformed
      
    private void jLabel4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel4AncestorAdded

    }//GEN-LAST:event_jLabel4AncestorAdded

    private void WaktutitipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WaktutitipActionPerformed

    }//GEN-LAST:event_WaktutitipActionPerformed

    private void PlatNomorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlatNomorActionPerformed

    }//GEN-LAST:event_PlatNomorActionPerformed

    private void WaktutitipKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_WaktutitipKeyPressed
    char karakter = evt.getKeyChar();
    if(!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))){
    getToolkit().beep();
    evt.consume();
    jLabel7.setText("Isian harus berupa angka !");
    }
    }//GEN-LAST:event_WaktutitipKeyPressed

    private void WaktuMasukT2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_WaktuMasukT2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_WaktuMasukT2AncestorAdded

    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tampilan2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel Background;
    private javax.swing.JTextField PlatNomor;
    private javax.swing.JButton Submit;
    public javax.swing.JTextArea WaktuMasukT2;
    private javax.swing.JTextField Waktutitip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
