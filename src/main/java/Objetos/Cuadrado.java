package Objetos;
import java.awt.Color;
import java.awt.Graphics;
public class Cuadrado extends Figura {
    private String nombre;
    private int lado;
    public Cuadrado(String nombre,int posx, int posy, int lado, Color color) {
        super(posx, posy, color);
        this.lado = lado;
    }
    @Override
    public void dibujar(Graphics g) {
        g.setColor(color);
        g.fillRect(posx, posy, lado, lado);
    }
}
