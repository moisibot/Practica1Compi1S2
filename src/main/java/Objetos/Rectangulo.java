package Objetos;
import java.awt.Color;
import java.awt.Graphics;
public class Rectangulo extends Figura {
    private String nombre;
    private int ancho, alto;
    public Rectangulo(String nombre, int posx, int posy, int ancho, int alto, Color color) {
        super(posx, posy, color);
        this.ancho = ancho;
        this.alto = alto;
    }
    @Override
    public void dibujar(Graphics g) {
        g.setColor(color);
        g.fillRect(posx, posy, ancho, alto);
    }
}
