/*
 * Clase que recibe hecho y entrega regla para consultar al archivo CLP que
 * colección de hechos corresponde a esta regla.
 */
package Util;

/**
 * @author José Balta
 */
public class Reglas {

    public Reglas() {
    }

    /**
     *
     * @param hechos
     * @return regla RETORNA EVALUACIÓN SEGÚN CONJUNTO DE HECHOS
     */
    public int regla(Variables hechos) {

        int regla = 0;

        if (hechos.getTemporada().equalsIgnoreCase("verano")
                && hechos.getMes().equalsIgnoreCase("enero")
                && hechos.getDiaFestivo().equalsIgnoreCase("")
                && hechos.getPrenda().equalsIgnoreCase("Top")
                && hechos.getMaterial().equalsIgnoreCase("algodon")
                && hechos.getColor().equalsIgnoreCase("blanco")) {

            regla = 0;

        } else if (hechos.getTemporada().equalsIgnoreCase("otoño")
                && hechos.getMes().equalsIgnoreCase("abril")
                && hechos.getDiaFestivo().equalsIgnoreCase("")
                && hechos.getPrenda().equalsIgnoreCase("Camison")
                && hechos.getMaterial().equalsIgnoreCase("Jersey")
                && hechos.getColor().equalsIgnoreCase("azul")) {

            regla = 10;

        } else if (hechos.getTemporada().equalsIgnoreCase("primavera")
                && hechos.getMes().equalsIgnoreCase("diciembre")
                && hechos.getDiaFestivo().equalsIgnoreCase("navidad")
                && hechos.getPrenda().equalsIgnoreCase("Polo")
                && hechos.getMaterial().equalsIgnoreCase("algodon")
                && hechos.getColor().equalsIgnoreCase("gris")) {

            regla = 40;

        } else {

            regla = Constantes.NORECOMENDAR; //ES UN HECHO QUE NO EXISTE
        }
        hechos = null;
        return regla;
    }
}
