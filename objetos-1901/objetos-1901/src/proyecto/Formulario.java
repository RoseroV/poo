package proyecto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author T-101
 */
public class Formulario extends javax.swing.JFrame {
ArrayList<Pregunta> preguntas;
ArrayList<Opcion> opciones;
ArrayList<JRadioButton> radios;

    public Formulario() {
        
        initComponents();
        preguntas =obtenerCuestionario();
        
        etiquetaPreguntaTitulo.setText(preguntas.get(0).getTitulo());
        //inicializamos el arraylist de radios
        radios=new ArrayList<>();
        radios.add(radioOp1);
        radios.add(radioOp2);
        radios.add(radioOp3);
        radios.add(radioOp4);
        //Llenar con las opciones
        for(int i=0;i<radios.size();i++){
            radios.get(i).setText(preguntas.get(0).getOpciones().get(i).getTitulo());
        }//fin for
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        etiquetaPreguntaTitulo = new javax.swing.JLabel();
        radioOp1 = new javax.swing.JRadioButton();
        radioOp2 = new javax.swing.JRadioButton();
        radioOp3 = new javax.swing.JRadioButton();
        radioOp4 = new javax.swing.JRadioButton();
        Contestar = new javax.swing.JButton();
        Siguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaPreguntaTitulo.setText("jLabel1");

        buttonGroup1.add(radioOp1);
        radioOp1.setText("jRadioButton1");

        buttonGroup1.add(radioOp2);
        radioOp2.setText("jRadioButton2");

        buttonGroup1.add(radioOp3);
        radioOp3.setText("jRadioButton3");

        buttonGroup1.add(radioOp4);
        radioOp4.setText("jRadioButton4");

        Contestar.setText("Contestar");
        Contestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContestarActionPerformed(evt);
            }
        });

        Siguiente.setText("Siguiente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Contestar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(radioOp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radioOp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radioOp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radioOp4)))
                .addContainerGap(164, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiquetaPreguntaTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaPreguntaTitulo)
                .addGap(18, 18, 18)
                .addComponent(radioOp1)
                .addGap(18, 18, 18)
                .addComponent(radioOp2)
                .addGap(18, 18, 18)
                .addComponent(radioOp3)
                .addGap(18, 18, 18)
                .addComponent(radioOp4)
                .addGap(18, 18, 18)
                .addComponent(Contestar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(Siguiente)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContestarActionPerformed
        // TODO add your handling code here:
        List<JRadioButton> radios = new ArrayList<>();
        radios = Arrays.asList(radioOp1, radioOp2, radioOp3, radioOp4);
        boolean acierto = false;

        for (JRadioButton radio : radios) {
            if (radio.isSelected() && radio.getText().equals("yo")) {
                acierto = true;
                break;
            }
        }

        JOptionPane.showConfirmDialog(this, "Acertaste " + acierto);
    }//GEN-LAST:event_ContestarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Contestar;
    private javax.swing.JButton Siguiente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel etiquetaPreguntaTitulo;
    private javax.swing.JRadioButton radioOp1;
    private javax.swing.JRadioButton radioOp2;
    private javax.swing.JRadioButton radioOp3;
    private javax.swing.JRadioButton radioOp4;
    // End of variables declaration//GEN-END:variables

    //Encapsulamiento
    public ArrayList<Pregunta> obtenerCuestionario() {

        Opcion op11 = new Opcion("Ecatepec", false);
        Opcion op12 = new Opcion("Ecaterror", false);
        Opcion op13 = new Opcion("Kiev", true);
        Opcion op14 = new Opcion("Chalco", false);
        ArrayList<Opcion> opciones1 = new ArrayList<>();
        opciones1.add(op11);
        opciones1.add(op12);
        opciones1.add(op13);
        opciones1.add(op14);
        Pregunta p1 = new Pregunta("¿Cuál es la capital de Ucrania?", opciones1);

        Opcion op21 = new Opcion("Mixcalco", false);
        Opcion op22 = new Opcion("Nezahualcoyotl", false);
        Opcion op23 = new Opcion("Minezota", false);
        Opcion op24 = new Opcion("México", true);
        ArrayList<Opcion> opciones2 = new ArrayList<>();
        opciones2.add(op21);
        opciones2.add(op22);
        opciones2.add(op23);
        opciones2.add(op24);
        Pregunta p2 = new Pregunta("¿Cuál es la capital de México?", opciones2);

        Opcion op31 = new Opcion("Dublín", true);
        Opcion op32 = new Opcion("kentucky", false);
        Opcion op33 = new Opcion("Amazonas", false);
        Opcion op34 = new Opcion("México", false);
        ArrayList<Opcion> opciones3 = new ArrayList<>();
        opciones3.add(op31);
        opciones3.add(op32);
        opciones3.add(op33);
        opciones3.add(op34);
        Pregunta p3 = new Pregunta("¿Cuál es la capital de Irlanda?", opciones3);

        Opcion op41 = new Opcion("Alaska", false);
        Opcion op42 = new Opcion("Alemania", false);
        Opcion op43 = new Opcion("Berlín", true);
        Opcion op44 = new Opcion("Ucrania", false);
        ArrayList<Opcion> opciones4 = new ArrayList<>();
        opciones4.add(op41);
        opciones4.add(op42);
        opciones4.add(op43);
        opciones4.add(op44);
        Pregunta p4 = new Pregunta("¿Cuál es la capital de Alemania?", opciones4);

        Opcion op51 = new Opcion("Madrid", false);
        Opcion op52 = new Opcion("Esparta", false);
        Opcion op53 = new Opcion("Minezota", false);
        Opcion op54 = new Opcion("Lisboa", true);
        ArrayList<Opcion> opciones5 = new ArrayList<>();
        opciones5.add(op51);
        opciones5.add(op52);
        opciones5.add(op53);
        opciones5.add(op54);
        Pregunta p5 = new Pregunta("¿Cuál es la capital de Portugal?", opciones5);

        Opcion op61 = new Opcion("Ecatepec", false);
        Opcion op62 = new Opcion("Ecaterror", false);
        Opcion op63 = new Opcion("Kiev", true);
        Opcion op64 = new Opcion("Chalco", false);
        ArrayList<Opcion> opciones6 = new ArrayList<>();
        opciones6.add(op61);
        opciones6.add(op62);
        opciones6.add(op63);
        opciones6.add(op64);
        Pregunta p6 = new Pregunta("¿Cuál es la capital de Ucrania?", opciones6);

        Opcion op71 = new Opcion("Atenas", true);
        Opcion op72 = new Opcion("Roma", false);
        Opcion op73 = new Opcion("Creta", false);
        Opcion op74 = new Opcion("México", false);
        ArrayList<Opcion> opciones7 = new ArrayList<>();
        opciones7.add(op71);
        opciones7.add(op72);
        opciones7.add(op73);
        opciones7.add(op74);
        Pregunta p7 = new Pregunta("¿Cuál es la capital de Grecia?", opciones7);

        Opcion op81 = new Opcion("Mixcalco", false);
        Opcion op82 = new Opcion("Varsovia", true);
        Opcion op83 = new Opcion("Brezlavia", false);
        Opcion op84 = new Opcion("Poznan", false);
        ArrayList<Opcion> opciones8 = new ArrayList<>();
        opciones8.add(op81);
        opciones8.add(op82);
        opciones8.add(op83);
        opciones8.add(op84);
        Pregunta p8 = new Pregunta("¿Cuál es la capital de Polonia?", opciones8);

        Opcion op91 = new Opcion("Malecon", false);
        Opcion op92 = new Opcion("Rusia", false);
        Opcion op93 = new Opcion("Klev", false);
        Opcion op94 = new Opcion("Mozcú", true);
        ArrayList<Opcion> opciones9 = new ArrayList<>();
        opciones9.add(op91);
        opciones9.add(op92);
        opciones9.add(op93);
        opciones9.add(op94);
        Pregunta p9 = new Pregunta("¿Cuál es la capital de Rusia?", opciones9);

        Opcion op101 = new Opcion("Kioto", false);
        Opcion op102 = new Opcion("Ozaka", false);
        Opcion op103 = new Opcion("Tokio", true);
        Opcion op104 = new Opcion("Minato", false);
        ArrayList<Opcion> opciones10 = new ArrayList<>();
        opciones10.add(op101);
        opciones10.add(op102);
        opciones10.add(op103);
        opciones10.add(op104);
        Pregunta p10 = new Pregunta("¿Cuál es la capital de Japon?", opciones10);

        ArrayList<Pregunta> preguntas = new ArrayList<>();
        preguntas.add(p1);
        preguntas.add(p2);
        preguntas.add(p3);
        preguntas.add(p4);
        preguntas.add(p5);
        preguntas.add(p6);
        preguntas.add(p7);
        preguntas.add(p8);
        preguntas.add(p9);
        preguntas.add(p10);

        return preguntas;
    }

}
