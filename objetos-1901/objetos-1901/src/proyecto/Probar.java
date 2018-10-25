
package proyecto;

import java.util.*;

/**
 *
 * @author campitos
 */
public class Probar {

    public static void main(String[] args) {
        
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
//
        //Probamos el modelo        
        for (Pregunta p : preguntas) {

            System.out.println(p.getTitulo());

            for (Opcion o : p.getOpciones()) {

                System.out.println(o.getTitulo());
            }
        }

    }
}
