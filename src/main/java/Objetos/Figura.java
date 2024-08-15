package Objetos;
import java.awt.Color;
import java.awt.Graphics;
public abstract class Figura {
    protected int posx, posy;
    protected Color color;
    public Figura(int posx, int posy, Color color) {
        this.posx = posx;
        this.posy = posy;
        this.color = color;
    }
    public abstract void dibujar(Graphics g);
}
