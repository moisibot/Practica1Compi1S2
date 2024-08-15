
package Animaciones;

import Objetos.Figura;

public class Animacion {
    Figura figura;
    String tipo;
    int destX, destY;
    int orden;

    public Animacion(Figura figura, String tipo, int destX, int destY, int orden) {
        this.figura = figura;
        this.tipo = tipo;
        this.destX = destX;
        this.destY = destY;
        this.orden = orden;
    }
}