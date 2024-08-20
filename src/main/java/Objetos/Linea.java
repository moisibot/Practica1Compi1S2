package Objetos;
import java.awt.Color;
import java.awt.Graphics;
public class Linea extends Figura {
    private String nombre;
    private int posx2, posy2;
    public Linea(String nombre, int posx1, int posy1, int posx2, int posy2, Color color) {
        super(posx1, posy1, color);
        this.posx2 = posx2;
        this.posy2 = posy2;
    }
    @Override
    public void dibujar(Graphics g) {
        g.setColor(color);
        g.drawLine(posx, posy, posx2, posy2);
    }
}