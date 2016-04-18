package Util;

import javax.swing.JComboBox;

/**
 * Clase Constantes Cargo los compos de mi aplicación
 *
 * @author José Balta
 */
public class Constantes {

    public Constantes() {
    }

    public static String ARCHIVOCLIPS = "EvaluacionProduccionPrendas.clp";
    public static String VACIO = "";
    public static int NORECOMENDAR = 666;

    public void cargarComboTemporada(JComboBox temporadaCb) {
        temporadaCb.addItem("Verano");
        temporadaCb.addItem("Primavera");
        temporadaCb.addItem("Otoño");
        temporadaCb.addItem("Invierno");
    }

    public void cargarComboMeses(JComboBox mesCb) {
        mesCb.addItem("Enero");
        mesCb.addItem("Febrero");
        mesCb.addItem("Marzo");
        mesCb.addItem("Abril");
        mesCb.addItem("Mayo");
        mesCb.addItem("Junio");
        mesCb.addItem("Julio");
        mesCb.addItem("Agosto");
        mesCb.addItem("Septiembre");
        mesCb.addItem("Octubre");
        mesCb.addItem("Noviembre");
        mesCb.addItem("Diciembre");
    }

    public void cargarComboDiaFestivo(JComboBox diaFestivoCb) {
        diaFestivoCb.addItem("");
        diaFestivoCb.addItem("Fiestas patrias");
        diaFestivoCb.addItem("Navidad");
    }

    public void cargarComboPrenda(JComboBox prendaCb) {
        prendaCb.addItem("Top");
        prendaCb.addItem("Polo");
        prendaCb.addItem("Short");
        prendaCb.addItem("Joggin");
        prendaCb.addItem("Camison");
        prendaCb.addItem("Maxi falda");
        prendaCb.addItem("Blusa");
        prendaCb.addItem("Vestido");
    }

    public void cargarComboMaterial(JComboBox materialCb) {
        materialCb.addItem("Algodon");
        materialCb.addItem("Chalis");
        materialCb.addItem("Jersey");
        materialCb.addItem("Viscosa");
        materialCb.addItem("Lycra");
    }

    public void cargarComboColor(JComboBox colorCb) {
        colorCb.addItem("Blanco");
        colorCb.addItem("Amarillo");
        colorCb.addItem("Beige");
        colorCb.addItem("Rosado");
        colorCb.addItem("Rojo");
        colorCb.addItem("Turquesa");
        colorCb.addItem("Gris");
        colorCb.addItem("Azul");
        colorCb.addItem("Negro");
    }

}
