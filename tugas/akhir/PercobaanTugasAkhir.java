/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.akhir;         


import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PercobaanTugasAkhir extends javax.swing.JFrame {
DefaultTableModel model;
    public PercobaanTugasAkhir() {
        initComponents();
         model = (DefaultTableModel) TabelKamera.getModel();
    }
void filterhuruf(KeyEvent a){
        if(Character.isAlphabetic(a.getKeyChar())){
            a.consume();
            JOptionPane.showMessageDialog(null,"Pada Kolom Jumlah Hanya Bisa Memasukan Karakter Angka");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbNama = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        lbAlamat = new javax.swing.JLabel();
        lbNomerTelepon = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        NomerTelepon = new javax.swing.JTextField();
        Alamat = new javax.swing.JTextField();
        lbPembayaran = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelKamera = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Harga = new javax.swing.JTextField();
        lbHarga = new javax.swing.JLabel();
        lbPilihKamera = new javax.swing.JLabel();
        lbJumlahBarang = new javax.swing.JLabel();
        JumlahBarang = new javax.swing.JSpinner();
        cbPilihKamera = new javax.swing.JComboBox<>();
        lbTipeKamera = new javax.swing.JLabel();
        TipeKamera = new javax.swing.JTextField();
        canon = new javax.swing.JLabel();
        fujifilm = new javax.swing.JLabel();
        nikon = new javax.swing.JLabel();
        sony = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        cbPembayaran = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("TOKO KAMERA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 11, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/Canon.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/sony.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/nikon.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/fujifilm.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, -1));

        lbNama.setBackground(new java.awt.Color(255, 255, 255));
        lbNama.setText("Nama");
        getContentPane().add(lbNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 63, -1, -1));
        getContentPane().add(Nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 60, 230, -1));

        lbAlamat.setText("Alamat");
        getContentPane().add(lbAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 86, -1, -1));

        lbNomerTelepon.setText("Nomer Telepon");
        getContentPane().add(lbNomerTelepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 120, -1, -1));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 562, -1, -1));

        NomerTelepon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NomerTeleponKeyTyped(evt);
            }
        });
        getContentPane().add(NomerTelepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 117, 230, -1));
        getContentPane().add(Alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 86, 230, -1));

        lbPembayaran.setText("Pembayaran:");
        getContentPane().add(lbPembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 267, -1, -1));

        jLabel11.setText("Jumlah Total Harga Kamera");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 17, -1, -1));

        TabelKamera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipe Kamera", "Jumlah Barang", "Harga"
            }
        ));
        jScrollPane1.setViewportView(TabelKamera);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 390, 198));

        jButton1.setText("Input");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, -1, -1));

        Harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HargaActionPerformed(evt);
            }
        });
        getContentPane().add(Harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 236, 230, -1));

        lbHarga.setText("Harga");
        getContentPane().add(lbHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 239, -1, -1));

        lbPilihKamera.setText("Pilih Kamera");
        getContentPane().add(lbPilihKamera, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 189, -1, -1));

        lbJumlahBarang.setText("Jumlah Barang");
        getContentPane().add(lbJumlahBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 214, -1, 15));
        getContentPane().add(JumlahBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 210, -1, -1));

        cbPilihKamera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Canon Eos 1DX", "Sony Alpha 7", "Nikon D5", "Fujifilm X-T2" }));
        cbPilihKamera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPilihKameraActionPerformed(evt);
            }
        });
        getContentPane().add(cbPilihKamera, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 184, 232, -1));

        lbTipeKamera.setText("Tipe Kamera");
        getContentPane().add(lbTipeKamera, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 146, -1, -1));

        TipeKamera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipeKameraActionPerformed(evt);
            }
        });
        getContentPane().add(TipeKamera, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 146, 232, -1));

        canon.setText("Rp70.000.000");
        getContentPane().add(canon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        fujifilm.setText("Rp30.000.000");
        getContentPane().add(fujifilm, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, -1, -1));

        nikon.setText("Rp60.000.000");
        getContentPane().add(nikon, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, -1));

        sony.setText("Rp50.000.000");
        getContentPane().add(sony, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, -1, -1));

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, -1, -1));

        cbPembayaran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tunai", "Kredit", "Debit" }));
        getContentPane().add(cbPembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 220, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/background.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -40, 1650, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  model.insertRow(model.getRowCount(),new Object[]{TipeKamera.getText(),JumlahBarang.getValue(),Harga.getText()});
    int hasil=Integer.parseInt(NomerTelepon.getText());

        String tampil=String.valueOf(hasil);

        NomerTelepon.setText(tampil);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
 Nama.setText("");
 Alamat.setText("");
 NomerTelepon.setText("");
 TipeKamera.setText("");
 cbPilihKamera.setSelectedIndex(0);
 cbPembayaran.setSelectedIndex(0);
 JumlahBarang.setValue(0);
 Harga.setText("");
 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void cbPilihKameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPilihKameraActionPerformed
   if(cbPilihKamera.getSelectedItem().toString().equalsIgnoreCase("Canon Eos 1DX")){
            Harga.setText("70000000");
        }else if(cbPilihKamera.getSelectedItem().toString().equalsIgnoreCase("Sony Alpha 7")){
            Harga.setText("50000000");
        }else if(cbPilihKamera.getSelectedItem().toString().equalsIgnoreCase("Nikon D5")){
            Harga.setText("60000000");
        }else if(cbPilihKamera.getSelectedItem().toString().equalsIgnoreCase("Fujifilm X-T2")){
            Harga.setText("30000000");
        }
        Harga.setEditable(false);
    }//GEN-LAST:event_cbPilihKameraActionPerformed

    private void TipeKameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipeKameraActionPerformed

    }//GEN-LAST:event_TipeKameraActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 int row = TabelKamera.getSelectedRow();
        if(row>=0){
        int ok=JOptionPane.showConfirmDialog(null, "Hapus Belanja?","Okay",JOptionPane.YES_NO_OPTION);
        if(ok==0){
        model.removeRow(row);
        }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void NomerTeleponKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomerTeleponKeyTyped
filterhuruf(evt);
    }//GEN-LAST:event_NomerTeleponKeyTyped

    private void HargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HargaActionPerformed

    }//GEN-LAST:event_HargaActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PercobaanTugasAkhir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    //</editor-fold>
    
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PercobaanTugasAkhir().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat;
    private javax.swing.JTextField Harga;
    private javax.swing.JSpinner JumlahBarang;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField NomerTelepon;
    private javax.swing.JTable TabelKamera;
    private javax.swing.JTextField TipeKamera;
    private javax.swing.JLabel canon;
    private javax.swing.JComboBox<String> cbPembayaran;
    private javax.swing.JComboBox<String> cbPilihKamera;
    private javax.swing.JLabel fujifilm;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAlamat;
    private javax.swing.JLabel lbHarga;
    private javax.swing.JLabel lbJumlahBarang;
    private javax.swing.JLabel lbNama;
    private javax.swing.JLabel lbNomerTelepon;
    private javax.swing.JLabel lbPembayaran;
    private javax.swing.JLabel lbPilihKamera;
    private javax.swing.JLabel lbTipeKamera;
    private javax.swing.JLabel nikon;
    private javax.swing.JLabel sony;
    // End of variables declaration//GEN-END:variables

    private void HargaKamera() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
