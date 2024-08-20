
package Gramaticas;

public class ErrorInfo {
    private String tipo;
    private int linea;
    private int columna;
    private String descripcion;

    public ErrorInfo(String tipo, int linea, int columna, String descripcion) {
        this.tipo = tipo;
        this.linea = linea;
        this.columna = columna;
        this.descripcion = descripcion;
    }

    // Getters
    public String getTipo() { return tipo; }
    public int getLinea() { return linea; }
    public int getColumna() { return columna; }
    public String getDescripcion() { return descripcion; }
}