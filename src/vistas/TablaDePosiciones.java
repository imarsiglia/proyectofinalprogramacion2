/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import com.sun.imageio.plugins.jpeg.JPEG;
import controladores.CampeonatoController;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.CampeonatoEquipo;

/**
 *
 * @author mmarsiglia
 */
public class TablaDePosiciones extends javax.swing.JFrame {

    private DefaultTableModel model;
    
    /**
     * Creates new form TablaDePosiciones
     */
    public TablaDePosiciones() {
        initComponents();
        postInit();
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TABLA DE POSICIONES");

        jButton1.setText("Atrás");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Posicion", "Equipo", "Puntos", "PG", "PP", "PE", "GF", "GC"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new GestionCampeonato().setVisible(true);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(TablaDePosiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaDePosiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaDePosiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaDePosiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablaDePosiciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void postInit() {
        
        this.setLocationRelativeTo(null);
        this.model = (DefaultTableModel) jTable1.getModel();
        ArrayList<CampeonatoEquipo> equipos = 
                CampeonatoController.getInstance().getSelected().getEquipos();
        Object[][] vector = new Object[equipos.size()][8];
        
        // Ordenar
        
        Integer index = 1;
        for (CampeonatoEquipo ce : equipos) {
            ce.reset();
            
            Object[] row = new Object[8];
            row[0] = index;
            row[1] = ce.getEquipo().getNombre();
            int pg = 0;
            int pp = 0;
            int pe = 0;
            
            for(modelos.Encuentro en : 
                    CampeonatoController.getInstance().getSelected().getEncuentrosJugados()){
                
                if(en.getLocal().getId() == ce.getEquipo().getId()){
                    // Es local
                    
                    if(en.getGolesLocal().size() > en.getGolesVisitante().size()){
                        ce.setPuntos(ce.getPuntos() + 3);
                        pg++;
                    }else if(en.getGolesLocal().size() == en.getGolesVisitante().size()){
                        ce.setPuntos(ce.getPuntos() + 1);
                        pe++;
                    }else{
                        pp++;
                    }
                    
                    ce.setGolesAFavor(ce.getGolesAFavor() + en.getGolesLocal().size());
                    ce.setGolesEnContra(ce.getGolesEnContra() + en.getGolesVisitante().size());
                    
                }else if(en.getVisitante().getId() == ce.getEquipo().getId()){
                    // Es visitante
                    
                    if(en.getGolesVisitante().size() > en.getGolesLocal().size()){
                        ce.setPuntos(ce.getPuntos() + 3);
                        pg++;
                    }else if(en.getGolesVisitante().size() == en.getGolesLocal().size()){
                        ce.setPuntos(ce.getPuntos() + 1);
                        pe++;
                    }else{
                        pp++;
                    }
                    
                    ce.setGolesAFavor(ce.getGolesAFavor() + en.getGolesVisitante().size());
                    ce.setGolesEnContra(ce.getGolesEnContra() + en.getGolesLocal().size());
                    
                }
            }
            
            row[3] = pg; // no definido PJ
            row[4] = pp; // no definido PP
            row[5] = pe; // no definido PE
            row[2] = ce.getPuntos();
            row[6] = ce.getGolesAFavor();
            row[7] = ce.getGolesEnContra();
            
            vector[index-1] = row;
            index++;
            
        }
        
        this.ordenar(vector);
        // faltan las posiciones
        
        index = 1;
        int i = 0;

        for(Object[] row : vector){
            
            if(i > 0){
                if(!igual(vector[i], vector[i-1])){
                    index = i + 1;
                }
            }
            
            row[0] = index;
            this.model.addRow(row);
            
            i++;
            
        }
        
    }
    
    private void ordenar(Object[][] vector){
        
        Object[] aux;
        
        for(int i = 0; i<vector.length; i++){
            for(int j = 0; j<vector.length - i - 1; j++){
                if(mayor(vector[j+1], vector[j])){
                    aux = vector[j+1];
                    vector[j+1] = vector[j];
                    vector[j] = aux;
                }
            }
        }
        
    }
    
    private boolean mayor(Object[] e1, Object[] e2){
        
        int puntos1 = (Integer) e1[2];
        int puntos2 = (Integer) e2[2];
        int golesAFavor1 = (Integer) e1[6];
        int golesAEnContra1 = (Integer) e1[7];
        int golesAFavor2 = (Integer) e2[6];
        int golesAEnContra2 = (Integer) e2[7];
        
        boolean puntos = puntos1 > puntos2;
        boolean puntosIguales = puntos1 == puntos2;
        boolean goles = (golesAFavor1 - golesAEnContra1) > (golesAFavor2 - golesAEnContra2);
        boolean golesIguales = (golesAFavor1 - golesAEnContra1) == (golesAFavor2 - golesAEnContra2);
        boolean masGoles = golesAFavor1 > golesAFavor2;
        
        if(puntos){
            return true;
        }else if(puntosIguales && goles){
            return true;
        }else if(puntosIguales && golesIguales && masGoles){
            return true;
        }
        
        return false;
        
    }
    
    private boolean igual(Object[] e1, Object[] e2){
        
        int puntos1 = (Integer) e1[2];
        int puntos2 = (Integer) e2[2];
        int golesAFavor1 = (Integer) e1[6];
        int golesAEnContra1 = (Integer) e1[7];
        int golesAFavor2 = (Integer) e2[6];
        int golesAEnContra2 = (Integer) e2[7];
        
        return puntos1 == puntos2 && golesAFavor1 == golesAFavor2 && golesAEnContra1 == golesAEnContra2;
        
    }
    
}
