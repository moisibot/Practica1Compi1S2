package Objetos;
import java.awt.Color;
import java.awt.Graphics;
public class Poligono extends Figura {
    private String nombre;
    private int lados;
    private int ancho, alto;
    public Poligono(String nombre, int posx, int posy, int lados, int ancho, int alto, Color color) {
        super(posx, posy, color);
        this.lados = lados;
        this.ancho = ancho;
        this.alto = alto;
    }
    @Override
    public void dibujar(Graphics g) {
        g.setColor(color);
        int[] xPoints = new int[lados];
        int[] yPoints = new int[lados];
               for (int i = 0; i < lados; i++) {
            double angle = 2 * Math.PI * i / lados;
            xPoints[i] = (int) (posx + ancho / 2 * Math.cos(angle));
            yPoints[i] = (int) (posy + alto / 2 * Math.sin(angle));
        }
               g.fillPolygon(xPoints, yPoints, lados);
    }
}
