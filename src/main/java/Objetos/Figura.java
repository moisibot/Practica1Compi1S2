package Objetos;
import java.awt.Color;
import java.awt.Graphics;
public abstract class Figura {
    protected int posx, posy;
    protected Color color;
    protected Animacion animacion;
    public Figura(int posx, int posy, Color color) {
        this.posx = posx;
        this.posy = posy;
        this.color = color;
    }
    public abstract void dibujar(Graphics g);
    public void setAnimacion(String tipo, int targetX, int targetY, int duracion) {
        this.animacion = new Animacion(this, tipo, targetX, targetY, duracion);
    }
    public void actualizarAnimacion() {
        if (animacion != null) {
            animacion.actualizar();
        }
    }
    public void setPosicion(int x, int y) {
        this.posx = x;
        this.posy = y;
    }
    public int getPosx() { return posx; }
    public int getPosy() { return posy; }

    public Object getAnimacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
