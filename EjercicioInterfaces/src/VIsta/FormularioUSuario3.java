
package VIsta;
import Controlador.Controlador;
import java.awt.Color;


public class FormularioUSuario3 extends javax.swing.JFrame {
    Controlador objControlador;

  
    public FormularioUSuario3() {
        initComponents();
        this.objControlador = new Controlador();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        AdvertenciaCedula = new javax.swing.JLabel();
        CampoCedulalabel = new javax.swing.JLabel();
        CampoCedula = new javax.swing.JTextField();
        CampoNombreLabel = new javax.swing.JLabel();
        CampoNombre = new javax.swing.JTextField();
        Imprimir = new javax.swing.JButton();
        Registrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        Titulo.setBackground(new java.awt.Color(153, 153, 153));
        Titulo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Registro Usuario");
        Titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        CampoCedulalabel.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        CampoCedulalabel.setText("Escriba tu cedula");

        CampoNombreLabel.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        CampoNombreLabel.setText("Escriba tu nombre");

        Imprimir.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Imprimir.setText("Imprimir");
        Imprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImprimirMouseClicked(evt);
            }
        });

        Registrar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Registrar.setText("Registrar");
        Registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                    .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(CampoCedulalabel)
                                .addComponent(CampoNombreLabel)
                                .addComponent(CampoCedula)
                                .addComponent(CampoNombre))
                            .addComponent(AdvertenciaCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdvertenciaCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CampoCedulalabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoNombreLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImprimirMouseClicked
        String info = objControlador.obtenerInformacionPersonas();
        new Resultado(info);
    }//GEN-LAST:event_ImprimirMouseClicked

    private void RegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarMouseClicked
        boolean dato1 = true;
        boolean dato2 = true;
        String auxCedula = CampoCedula.getText();
        String auxNombre = CampoNombre.getText();
        int auxSerial = Integer.parseInt(auxCedula);
        for (int i = 0; i < this.objControlador.impromirInformacion2().size(); i++) {

            if (auxSerial != this.objControlador.impromirInformacion2().get(i).getcedula()) {
                AdvertenciaCedula.setForeground(Color.green);
                dato1 = this.objControlador.Confirmador(true);
                AdvertenciaCedula.setText("La Id agregada Es valida");
            } else {
                AdvertenciaCedula.setForeground(Color.red);
                dato1 = this.objControlador.Confirmador(false);
                AdvertenciaCedula.setText("La Id agregada es invalida");
            }
        }
        this.objControlador.enviarInformacion2(auxNombre, auxSerial, dato1);

    }//GEN-LAST:event_RegistrarMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdvertenciaCedula;
    private javax.swing.JTextField CampoCedula;
    private javax.swing.JLabel CampoCedulalabel;
    private javax.swing.JTextField CampoNombre;
    private javax.swing.JLabel CampoNombreLabel;
    private javax.swing.JButton Imprimir;
    private javax.swing.JButton Registrar;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
