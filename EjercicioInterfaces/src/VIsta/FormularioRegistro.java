package VIsta;

import Controlador.Controlador;
import java.awt.Color;
import javax.swing.JPanel;
public class FormularioRegistro extends javax.swing.JFrame {
    Controlador objControlador;
    public FormularioRegistro() {
        this.objControlador = new Controlador();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        LabelTituolo = new javax.swing.JLabel();
        LabelSerial = new javax.swing.JLabel();
        CampoSerial = new javax.swing.JTextField();
        BotonRegistro = new javax.swing.JButton();
        LabelModelo = new javax.swing.JLabel();
        CampoModelo = new javax.swing.JTextField();
        BotonImprimir = new javax.swing.JButton();
        AdvertenciaSerial = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setFocusable(false);

        LabelTituolo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        LabelTituolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTituolo.setText("Registro vehiculo");

        LabelSerial.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        LabelSerial.setText("Digite el serial del Vehiculo");

        CampoSerial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CampoSerialFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CampoSerialFocusLost(evt);
            }
        });
        CampoSerial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoSerialActionPerformed(evt);
            }
        });

        BotonRegistro.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        BotonRegistro.setText("Registrar");
        BotonRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegistroMouseClicked(evt);
            }
        });
        BotonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistroActionPerformed(evt);
            }
        });

        LabelModelo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        LabelModelo.setText("Digite el modelo del Vehiculo");

        BotonImprimir.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        BotonImprimir.setText("Imprimir");
        BotonImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonImprimirMouseClicked(evt);
            }
        });

        AdvertenciaSerial.setForeground(new java.awt.Color(204, 0, 0));
        AdvertenciaSerial.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdvertenciaSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSerial)
                    .addComponent(CampoSerial, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(BotonRegistro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CampoModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(LabelModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelTituolo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(LabelTituolo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AdvertenciaSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelSerial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelModelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(BotonRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonImprimirMouseClicked
        String info = objControlador.obtenerInformacionVehiculos();
        Resultado objResultado= new Resultado();
        objResultado.setVisible(true);
        objResultado.imprimir(info);
    }//GEN-LAST:event_BotonImprimirMouseClicked

    private void BotonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistroActionPerformed

    }//GEN-LAST:event_BotonRegistroActionPerformed

    private void BotonRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegistroMouseClicked
        boolean dato1 = true;
        boolean dato2= true;
        String auxSereal = CampoSerial.getText();
        String auxModelo =CampoModelo.getText();
        int auxSerial = Integer.parseInt(auxSereal);
        for(int i =0 ; i<this.objControlador.impromirInformacion().size() ; i++){

            if(auxSerial != this.objControlador.impromirInformacion().get(i).getSerial_vehiculo() ){
                AdvertenciaSerial.setForeground(Color.green);
                dato1 = this.objControlador.Confirmador(true);
                AdvertenciaSerial.setText("La Id agregada Es valida");
            }else{
                AdvertenciaSerial.setForeground(Color.red);
                dato1 = this.objControlador.Confirmador(false);
                AdvertenciaSerial.setText("La Id agregada es invalida");
            }
        }
        this.objControlador.enviarInformacion(auxSerial, auxModelo, dato1);

    }//GEN-LAST:event_BotonRegistroMouseClicked

    //---------------------------------------------------------------------------------
    private void CampoSerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoSerialActionPerformed

    }//GEN-LAST:event_CampoSerialActionPerformed

    
    
    
    private void CampoSerialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoSerialFocusLost
        

    }//GEN-LAST:event_CampoSerialFocusLost

    private void CampoSerialFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoSerialFocusGained

    }//GEN-LAST:event_CampoSerialFocusGained

    
        //---------------------------------------------------------------------------------
    
    
    
    
    
    
    
    
    
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdvertenciaSerial;
    private javax.swing.JButton BotonImprimir;
    private javax.swing.JButton BotonRegistro;
    private javax.swing.JTextField CampoModelo;
    private javax.swing.JTextField CampoSerial;
    private javax.swing.JLabel LabelModelo;
    private javax.swing.JLabel LabelSerial;
    private javax.swing.JLabel LabelTituolo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
