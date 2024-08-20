package Objetos;
public class Animacion {
    private Figura figura;
    private String tipo;
    private int targetX, targetY;
    private int duracion;
    private long tiempoInicio;
    private boolean enEjecucion;
    public Animacion(Figura figura, String tipo, int targetX, int targetY, int duracion) {
        this.figura = figura;
        this.tipo = tipo;
        this.targetX = targetX;
        this.targetY = targetY;
        this.duracion = duracion;
        this.enEjecucion = false;
    }
    public void iniciar() {
        tiempoInicio = System.currentTimeMillis();
        enEjecucion = true;
    }
    public void actualizar() {
        if (!enEjecucion) return;
        long tiempoActual = System.currentTimeMillis();
        float progreso = (tiempoActual - tiempoInicio) / (float) duracion;
        if (progreso >= 1) {
            figura.setPosicion(targetX, targetY);
            enEjecucion = false;
            return;
        }
        int inicioX = figura.getPosx();
        int inicioY = figura.getPosy();
        if (tipo.equals("lineal")) {
            int nuevoX = (int) (inicioX + (targetX - inicioX) * progreso);
            int nuevoY = (int) (inicioY + (targetY - inicioY) * progreso);
            figura.setPosicion(nuevoX, nuevoY);
        } else if (tipo.equals("curva")) {
            double angulo = progreso * Math.PI * 2;
            int radio = (int) Math.sqrt(Math.pow(targetX - inicioX, 2) + Math.pow(targetY - inicioY, 2)) / 2;
            int centroX = (inicioX + targetX) / 2;
            int centroY = (inicioY + targetY) / 2;
            int nuevoX = (int) (centroX + radio * Math.cos(angulo));
            int nuevoY = (int) (centroY + radio * Math.sin(angulo));
            figura.setPosicion(nuevoX, nuevoY);
        }
    }
    public boolean estaEnEjecucion() {
        return enEjecucion;
    }
}