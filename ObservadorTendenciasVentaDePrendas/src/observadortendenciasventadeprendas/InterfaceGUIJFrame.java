package observadortendenciasventadeprendas;

import CLIPSJNI.*;
import Util.Constantes;
import Util.Reglas;
import Util.Variables;

/**
 *
 * @author José Balta
 */
public final class InterfaceGUIJFrame extends javax.swing.JFrame {

    //DECLARANDO VARIABLES
    private String temporada = "";
    private String mes = "";
    private String diasfestivos = "";
    private String prenda;
    private String material = "";
    private String color = "";
    private String costo = "";
    private String demanda = "";
    private String evaluacion = "";
    private Integer resultado = 0;

    Environment clips;

    /**
     * Creates new form InterfaceGUIJFrame
     */
    public InterfaceGUIJFrame() {

        clips = new Environment();
        clips.load(Constantes.ARCHIVOCLIPS);
        initComponents();

//      CARGANDO COMBOS DEL SISTEMA
        Constantes c = new Constantes();
        c.cargarComboTemporada(temporadaCb);
        c.cargarComboMeses(mesCb);
        c.cargarComboDiaFestivo(diaFestivoCb);
        c.cargarComboPrenda(prendaCb);
        c.cargarComboMaterial(materialCb);
        c.cargarComboColor(colorCb);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpTitulo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jpCabecera = new javax.swing.JPanel();
        seleccionJl = new javax.swing.JLabel();
        mesJl = new javax.swing.JLabel();
        mesCb = new javax.swing.JComboBox();
        prendaJl = new javax.swing.JLabel();
        prendaCb = new javax.swing.JComboBox<>();
        temporadaJl = new javax.swing.JLabel();
        temporadaCb = new javax.swing.JComboBox<>();
        festivosJl = new javax.swing.JLabel();
        diaFestivoCb = new javax.swing.JComboBox<>();
        materialJl = new javax.swing.JLabel();
        materialCb = new javax.swing.JComboBox<>();
        colorJL = new javax.swing.JLabel();
        colorCb = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultadoTa = new javax.swing.JTextArea();
        evaluarBtn = new javax.swing.JButton();
        limpiarBtn = new javax.swing.JButton();
        firmaJl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SE Observador de tendencias en ventas de prendas de vestir");
        jLabel2.setMaximumSize(new java.awt.Dimension(400, 400));

        seleccionJl.setText("Seleccione los filtros que necesite evaluar:");

        mesJl.setText("Mes:");

        mesCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesCbActionPerformed(evt);
            }
        });

        prendaJl.setText("Prenda:");

        temporadaJl.setText("Temporada:");

        festivosJl.setText("Día festivo:");

        materialJl.setText("Material:");

        colorJL.setText("Color:");

        jLabel9.setText("Resultado de evaluación de la producción:");

        resultadoTa.setEditable(false);
        resultadoTa.setColumns(20);
        resultadoTa.setRows(5);
        jScrollPane1.setViewportView(resultadoTa);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        evaluarBtn.setText("Evaluar producción");
        evaluarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaluarBtnActionPerformed(evt);
            }
        });

        limpiarBtn.setText("Limpiar");
        limpiarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpCabeceraLayout = new javax.swing.GroupLayout(jpCabecera);
        jpCabecera.setLayout(jpCabeceraLayout);
        jpCabeceraLayout.setHorizontalGroup(
            jpCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCabeceraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seleccionJl)
                    .addGroup(jpCabeceraLayout.createSequentialGroup()
                        .addGroup(jpCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpCabeceraLayout.createSequentialGroup()
                                .addComponent(temporadaJl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(temporadaCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpCabeceraLayout.createSequentialGroup()
                                .addComponent(prendaJl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(prendaCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(jpCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpCabeceraLayout.createSequentialGroup()
                                .addComponent(materialJl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(materialCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpCabeceraLayout.createSequentialGroup()
                                .addComponent(mesJl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mesCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(jpCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpCabeceraLayout.createSequentialGroup()
                                .addComponent(festivosJl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(diaFestivoCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpCabeceraLayout.createSequentialGroup()
                                .addComponent(colorJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(colorCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpCabeceraLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCabeceraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(limpiarBtn)
                .addGap(18, 18, 18)
                .addComponent(evaluarBtn)
                .addContainerGap())
        );
        jpCabeceraLayout.setVerticalGroup(
            jpCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCabeceraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(seleccionJl)
                .addGap(18, 18, 18)
                .addGroup(jpCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesJl)
                    .addComponent(mesCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(temporadaJl)
                    .addComponent(temporadaCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(festivosJl)
                    .addComponent(diaFestivoCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jpCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prendaCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prendaJl)
                    .addComponent(materialJl)
                    .addComponent(materialCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorJL)
                    .addComponent(colorCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jpCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(evaluarBtn)
                    .addComponent(limpiarBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpTituloLayout = new javax.swing.GroupLayout(jpTitulo);
        jpTitulo.setLayout(jpTituloLayout);
        jpTituloLayout.setHorizontalGroup(
            jpTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(jpTituloLayout.createSequentialGroup()
                .addComponent(jpCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpTituloLayout.setVerticalGroup(
            jpTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(542, 542, 542))
        );

        firmaJl.setText("Por José Balta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(firmaJl)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firmaJl)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mesCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesCbActionPerformed

    private void evaluarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evaluarBtnActionPerformed

        clips.reset();
        //DECLARO VARIABLES
        Reglas r;
        Variables hechos;

        //SE CARGAN VARIABLES CON EL CONTENIDO DE LOS COMBOS
        temporada = (String) temporadaCb.getSelectedItem();
        mes = (String) mesCb.getSelectedItem();
        diasfestivos = (String) diaFestivoCb.getSelectedItem();
        prenda = (String) prendaCb.getSelectedItem();
        material = (String) materialCb.getSelectedItem();
        color = (String) colorCb.getSelectedItem();

        hechos = new Variables();
        hechos.setTemporada(temporada);
        hechos.setMes(mes);
        hechos.setDiaFestivo(diasfestivos);
        hechos.setPrenda(prenda);
        hechos.setMaterial(material);
        hechos.setColor(color);

        r = new Reglas(); //INSTANCIO MI CLASE REGLAS   
        r.regla(hechos);

        try {
            clips.reset();
            clips.run();
            resultadoTa.setText("");
            resultado = r.regla(hechos);
            if (resultado != Constantes.NORECOMENDAR) {
                String evaluar = "(find-all-facts ((?i EvaluacionProduccion)) TRUE)";
                PrimitiveValue value = clips.eval(evaluar);

                costo = value.get(r.regla(hechos)).getFactSlot("Costo").toString();
                demanda = value.get(r.regla(hechos)).getFactSlot("Demanda").toString();
                evaluacion = value.get(r.regla(hechos)).getFactSlot("Evaluacion").toString();
                diasfestivos = (diasfestivos.equals(Constantes.VACIO)) ? "No." : diasfestivos; //IMPRIMIR DIA FESTIVO

                resultadoTa.setText("\n Detalle del Resultado:"
                        + "\n "
                        + "\n --------------------------------------------------"
                        + "\n Temporada --- " + temporada + ""
                        + "\n Mes --- " + mes + ""
                        + "\n Día festivo --- " + diasfestivos + ""
                        + "\n Prenda --- " + prenda + ""
                        + "\n Material --- " + material + ""
                        + "\n Color --- " + color + ""
                        + "\n --------------------------------------------------"
                        + "\n Se recomienda producir: "
                        + "\n Evaluación --- " + evaluacion + ""
                        + "\n --------------------------------------------------"
                        + "\n Datos adicionales: "
                        + "\n --------------------------------------------------"
                        + "\n El precio del rollo de tela esta con descuento del --- " + costo + "%"
                        + "\n La demanda en el mercado para esta prenda es del --- " + demanda + "% de ganancias.");

                clips.reset();

            } else {
                resultadoTa.setText("\n Detalle del Resultado:"
                        + "\n "
                        + "\n No se recomienda producir " + prenda + " con las siguientes características: "
                        + "\n --------------------------------------------------"
                        + "\n Temporada --- " + temporada + ""
                        + "\n Mes --- " + mes + ""
                        + "\n Día festivo --- " + diasfestivos + ""
                        + "\n Material --- " + material + ""
                        + "\n Color --- " + color + "");
            }

        } catch (Exception ex) {

            resultadoTa.setText("\n No se encontraron resultados.");
            resultadoTa.setText("\n Detalle del error: " + ex);
            clips.reset();

        }
    }//GEN-LAST:event_evaluarBtnActionPerformed

    private void limpiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBtnActionPerformed
        resultadoTa.setText(""); //LIMPIAR AREA DE TEXTO                                     
        temporadaCb.setSelectedIndex(0); //LIMPIAR COMBO TEMPORADA                        
        mesCb.setSelectedIndex(0); //LIMPIAR COMBO MES                              
        diaFestivoCb.setSelectedIndex(0); //LIMPIAR COMBO DIA FESTIVO                              
        prendaCb.setSelectedIndex(0); //LIMPIAR COMBO PRENDA                               
        materialCb.setSelectedIndex(0); //LIMPIAR COMBO MATERIAL                        
        colorCb.setSelectedIndex(0); //LIMPIAR COMBO COLOR
    }//GEN-LAST:event_limpiarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceGUIJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new InterfaceGUIJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> colorCb;
    private javax.swing.JLabel colorJL;
    private javax.swing.JComboBox<String> diaFestivoCb;
    private javax.swing.JButton evaluarBtn;
    private javax.swing.JLabel festivosJl;
    private javax.swing.JLabel firmaJl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpCabecera;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JButton limpiarBtn;
    private javax.swing.JComboBox<String> materialCb;
    private javax.swing.JLabel materialJl;
    private javax.swing.JComboBox mesCb;
    private javax.swing.JLabel mesJl;
    private javax.swing.JComboBox<String> prendaCb;
    private javax.swing.JLabel prendaJl;
    private javax.swing.JTextArea resultadoTa;
    private javax.swing.JLabel seleccionJl;
    private javax.swing.JComboBox<String> temporadaCb;
    private javax.swing.JLabel temporadaJl;
    // End of variables declaration//GEN-END:variables
}
