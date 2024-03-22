package e2p2_gabrielosorto_lab;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FramePrincipal extends javax.swing.JFrame {
    
    public FramePrincipal() {
        initComponents();
        jp_CrearCarros.setVisible(false);
        Carrera.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jp_CrearCarros = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jt_ModeloCarro = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jt_MarcaCarro = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jsp_velocidad = new javax.swing.JSpinner();
        jb_crearCarro1 = new javax.swing.JButton();
        Carrera = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        Carro1 = new javax.swing.JLabel();
        BarraCarro2 = new javax.swing.JProgressBar();
        Carro2 = new javax.swing.JLabel();
        BarraCarro1 = new javax.swing.JProgressBar();
        IniciarCarrera = new javax.swing.JButton();

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
        jb_Iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_IniciarMouseClicked(evt);
            }
        });
        jp_fondo.add(jb_Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        jp_CrearCarros.setBackground(new java.awt.Color(51, 153, 255));

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Crear Carro");

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Velocidad");

        jt_ModeloCarro.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Marca");

        jt_MarcaCarro.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Modelo");

        jb_crearCarro1.setBackground(new java.awt.Color(255, 255, 255));
        jb_crearCarro1.setForeground(new java.awt.Color(0, 0, 0));
        jb_crearCarro1.setText("Crear");
        jb_crearCarro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearCarro1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_CrearCarrosLayout = new javax.swing.GroupLayout(jp_CrearCarros);
        jp_CrearCarros.setLayout(jp_CrearCarrosLayout);
        jp_CrearCarrosLayout.setHorizontalGroup(
            jp_CrearCarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_CrearCarrosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp_CrearCarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_CrearCarrosLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_CrearCarrosLayout.createSequentialGroup()
                        .addGroup(jp_CrearCarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jsp_velocidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_crearCarro1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(153, 153, 153))))
            .addGroup(jp_CrearCarrosLayout.createSequentialGroup()
                .addGroup(jp_CrearCarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_CrearCarrosLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel17))
                    .addGroup(jp_CrearCarrosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jp_CrearCarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jt_MarcaCarro, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                            .addComponent(jt_ModeloCarro)))
                    .addGroup(jp_CrearCarrosLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel18)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jp_CrearCarrosLayout.setVerticalGroup(
            jp_CrearCarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_CrearCarrosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(55, 55, 55)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jt_MarcaCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jt_ModeloCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsp_velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jb_crearCarro1)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        Carrera.setBackground(new java.awt.Color(153, 153, 255));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Tiempo");

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("00:00");

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Progreso");

        Carro1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Carro1.setForeground(new java.awt.Color(0, 0, 0));
        Carro1.setText("Carro1");

        Carro2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Carro2.setForeground(new java.awt.Color(0, 0, 0));
        Carro2.setText("Carro2");

        IniciarCarrera.setForeground(new java.awt.Color(255, 255, 255));
        IniciarCarrera.setText("Iniciar");

        javax.swing.GroupLayout CarreraLayout = new javax.swing.GroupLayout(Carrera);
        Carrera.setLayout(CarreraLayout);
        CarreraLayout.setHorizontalGroup(
            CarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(CarreraLayout.createSequentialGroup()
                .addGroup(CarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CarreraLayout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel9))
                    .addGroup(CarreraLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel11)))
                .addContainerGap(212, Short.MAX_VALUE))
            .addGroup(CarreraLayout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addGroup(CarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CarreraLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(212, 212, 212))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CarreraLayout.createSequentialGroup()
                        .addComponent(Carro1)
                        .addGap(226, 226, 226))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CarreraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(CarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CarreraLayout.createSequentialGroup()
                        .addComponent(Carro2)
                        .addGap(228, 228, 228))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CarreraLayout.createSequentialGroup()
                        .addGroup(CarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BarraCarro1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BarraCarro2, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
            .addGroup(CarreraLayout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(IniciarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        CarreraLayout.setVerticalGroup(
            CarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CarreraLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(31, 31, 31)
                .addComponent(Carro1)
                .addGap(18, 18, 18)
                .addComponent(BarraCarro2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Carro2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BarraCarro1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(IniciarCarrera)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp_fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp_CrearCarros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp_CrearCarros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_CrearCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_CrearCarroMouseClicked
        jp_fondo.setVisible(false);
        jp_CrearCarros.setVisible(true);
    }//GEN-LAST:event_jb_CrearCarroMouseClicked

    private void jb_crearCarro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearCarro1MouseClicked
        String marcaCarro = jt_MarcaCarro.getText();
        String modeloCarro = jt_ModeloCarro.getText();
        int velocidadCarro = (Integer) jsp_velocidad.getValue();
        Carro carronuevo = new Carro(marcaCarro, modeloCarro, velocidadCarro);
        carros.add(carronuevo);
        JOptionPane.showMessageDialog(this, "Carro Creado con Exito!!");
        jp_CrearCarros.setVisible(false);
        jp_fondo.setVisible(true);
    }//GEN-LAST:event_jb_crearCarro1MouseClicked

    private void jb_IniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_IniciarMouseClicked
        jp_fondo.setVisible(false);
        jp_CrearCarros.setVisible(false);
        Carrera.setVisible(true);
    }//GEN-LAST:event_jb_IniciarMouseClicked
    
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar BarraCarro1;
    private javax.swing.JProgressBar BarraCarro2;
    private javax.swing.JPanel Carrera;
    private javax.swing.JLabel Carro1;
    private javax.swing.JLabel Carro2;
    private javax.swing.JButton IniciarCarrera;
    private javax.swing.JLabel JL_MarcaCarro2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jb_CrearCarro;
    private javax.swing.JButton jb_Iniciar;
    private javax.swing.JButton jb_crearCarro1;
    private javax.swing.JComboBox<String> jc_Carro1;
    private javax.swing.JComboBox<String> jc_Carro2;
    private javax.swing.JLabel jl_MarcaCarro1;
    private javax.swing.JLabel jl_ModeloCarro1;
    private javax.swing.JLabel jl_ModeloCarro2;
    private javax.swing.JLabel jl_VelocidadCarro1;
    private javax.swing.JLabel jl_VelocidadCarro2;
    private javax.swing.JPanel jp_CrearCarros;
    private javax.swing.JPanel jp_fondo;
    private javax.swing.JSpinner jsp_velocidad;
    private javax.swing.JTextField jt_MarcaCarro;
    private javax.swing.JTextField jt_ModeloCarro;
    // End of variables declaration//GEN-END:variables
    ArrayList<Carro> carros = new ArrayList();
}
