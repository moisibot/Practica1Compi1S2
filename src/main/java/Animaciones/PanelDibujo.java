
package Animaciones;

import Objetos.Figura;
import java.awt.Graphics;
import java.util.List;
import javax.swing.JPanel;

class PanelDibujo extends JPanel {
    private List<Figura> figuras;

    public void setFiguras(List<Figura> figuras) {
        this.figuras = figuras;
    }

    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        if (figuras != null) {
            for (Figura figura : figuras) {
                figura.dibujar(g);
            }
        }
    }
}
