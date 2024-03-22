package e2p2_gabrielosorto_lab;

import java.util.ArrayList;

public class FramePrincipal extends javax.swing.JFrame {

    public FramePrincipal() {
        initComponents();
        this.setResizable(false);
        jp_CrearCarro.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_CrearCarro = new javax.swing.JDialog();
        jp_CrearCarro = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jt_marcaCarro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jb_crearCarro = new javax.swing.JButton();
        jp_fondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jb_CrearCarro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jc_Carro1 = new javax.swing.JComboBox<>();
        jc_Carro2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jl_MarcaCarro1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jl_ModeloCarro1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jl_VelocidadCarro1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        JL_MarcaCarro2 = new javax.swing.JLabel();
        jl_ModeloCarro2 = new javax.swing.JLabel();
        jl_VelocidadCarro2 = new javax.swing.JLabel();
        jb_Iniciar = new javax.swing.JButton();

        jp_CrearCarro.setBackground(new java.awt.Color(51, 153, 255));
        jp_CrearCarro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Crear Carro");
        jp_CrearCarro.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Velocidad");
        jp_CrearCarro.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        jt_marcaCarro.setBackground(new java.awt.Color(255, 255, 255));
        jp_CrearCarro.add(jt_marcaCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 110, 300, -1));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Marca");
        jp_CrearCarro.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jp_CrearCarro.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 300, -1));

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Modelo");
        jp_CrearCarro.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));
        jp_CrearCarro.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        jb_crearCarro.setBackground(new java.awt.Color(255, 255, 255));
        jb_crearCarro.setForeground(new java.awt.Color(0, 0, 0));
        jb_crearCarro.setText("Crear");
        jb_crearCarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearCarroMouseClicked(evt);
            }
        });
        jp_CrearCarro.add(jb_crearCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        javax.swing.GroupLayout jd_CrearCarroLayout = new javax.swing.GroupLayout(jd_CrearCarro.getContentPane());
        jd_CrearCarro.getContentPane().setLayout(jd_CrearCarroLayout);
        jd_CrearCarroLayout.setHorizontalGroup(
            jd_CrearCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_CrearCarro, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
        );
        jd_CrearCarroLayout.setVerticalGroup(
            jd_CrearCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_CrearCarro, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jp_fondo.setBackground(new java.awt.Color(255, 255, 255));
        jp_fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Partida");
        jp_fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        jb_CrearCarro.setText("Crear Carro");
        jb_CrearCarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_CrearCarroMouseClicked(evt);
            }
        });
        jp_fondo.add(jb_CrearCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Jugador 1");
        jp_fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Jugador 2");
        jp_fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        jc_Carro1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jp_fondo.add(jc_Carro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 170, -1));

        jc_Carro2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jp_fondo.add(jc_Carro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 170, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("VS");
        jp_fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("MARCA");
        jp_fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, -1));

        jl_MarcaCarro1.setText("jLabel6");
        jp_fondo.add(jl_MarcaCarro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("MARCA");
        jp_fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("MODELO");
        jp_fondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, -1, -1));

        jl_ModeloCarro1.setText("jLabel9");
        jp_fondo.add(jl_ModeloCarro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("VELOCIDAD");
        jp_fondo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, -1, -1));

        jl_VelocidadCarro1.setText("jLabel11");
        jp_fondo.add(jl_VelocidadCarro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("MODELO");
        jp_fondo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("VELOCIDAD");
        jp_fondo.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        JL_MarcaCarro2.setText("jLabel14");
        jp_fondo.add(JL_MarcaCarro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));

        jl_ModeloCarro2.setText("jLabel15");
        jp_fondo.add(jl_ModeloCarro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, -1, -1));

        jl_VelocidadCarro2.setText("jLabel16");
        jp_fondo.add(jl_VelocidadCarro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, -1, -1));

        jb_Iniciar.setText("Iniciar");
        jp_fondo.add(jb_Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp_fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_CrearCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_CrearCarroMouseClicked
        jp_fondo.setVisible(false);
        jp_CrearCarro.setVisible(true);
    }//GEN-LAST:event_jb_CrearCarroMouseClicked

    private void jb_crearCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearCarroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_crearCarroMouseClicked

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }
    public static void CrearNuevoCarro(){
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_MarcaCarro2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jb_CrearCarro;
    private javax.swing.JButton jb_Iniciar;
    private javax.swing.JButton jb_crearCarro;
    private javax.swing.JComboBox<String> jc_Carro1;
    private javax.swing.JComboBox<String> jc_Carro2;
    private javax.swing.JDialog jd_CrearCarro;
    private javax.swing.JLabel jl_MarcaCarro1;
    private javax.swing.JLabel jl_ModeloCarro1;
    private javax.swing.JLabel jl_ModeloCarro2;
    private javax.swing.JLabel jl_VelocidadCarro1;
    private javax.swing.JLabel jl_VelocidadCarro2;
    private javax.swing.JPanel jp_CrearCarro;
    private javax.swing.JPanel jp_fondo;
    private javax.swing.JTextField jt_marcaCarro;
    // End of variables declaration//GEN-END:variables
    ArrayList<Carro> carros = new ArrayList();
}
