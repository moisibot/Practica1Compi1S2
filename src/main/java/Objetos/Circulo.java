package Objetos;
import java.awt.Color;
import java.awt.Graphics;
public class Circulo extends Figura {
    private String nombre;
    private int radio;
    public Circulo(String nombre, int posx, int posy, int radio, Color color) {
        super(posx, posy, color);
        this.radio = radio;
    }
    @Override
    public void dibujar(Graphics g) {
        g.setColor(color);
        g.fillOval(posx - radio, posy - radio, radio * 2, radio * 2);
    }
}
