/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.akhir;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class TugasAkhir {

private final DefaultTableModel tabel = new DefaultTableModel();
     public TugasAkhir(){
         
         tabel.addColumn("TipeKamera");
         tabel.addColumn("JumlahBarang");
         tabel.addColumn("Harga");
                  
     }
     
     public DefaultTableModel getTabel(){
        return tabel;
     }
}