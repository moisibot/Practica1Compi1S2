package Grafica;

import Gramaticas.AnalizadorLexico;
import Gramaticas.Sintactico;
import Objetos.*;
import Animaciones.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java_cup.runtime.Symbol;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Inicio extends javax.swing.JFrame {
    private List<Figura> figuras;
    private List<Animacion> animaciones;


    public Inicio() {
        initComponents();
           this.setLocationRelativeTo(null);    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Editable = new javax.swing.JTextArea();
        Cargar = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        Compilar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        Nuevo = new javax.swing.JButton();
        Reportes = new javax.swing.JButton();
        panelDibujo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Editable.setColumns(20);
        Editable.setRows(5);
        jScrollPane1.setViewportView(Editable);

        Cargar.setText("Cargar");
        Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarActionPerformed(evt);
            }
        });

        Limpiar.setText("Limpiar");

        Compilar.setText("Compilar");
        Compilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompilarActionPerformed(evt);
            }
        });

        jLabel1.setText("Linea:");

        jLabel2.setText("Columna:");

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Nuevo.setText("Nuevo");

        Reportes.setText("Reportes");
        Reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportesActionPerformed(evt);
            }
        });

        panelDibujo.setBackground(new java.awt.Color(204, 204, 204));
        panelDibujo.setForeground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout panelDibujoLayout = new javax.swing.GroupLayout(panelDibujo);
        panelDibujo.setLayout(panelDibujoLayout);
        panelDibujoLayout.setHorizontalGroup(
            panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        panelDibujoLayout.setVerticalGroup(
            panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(Compilar)
                .addGap(104, 104, 104)
                .addComponent(jLabel1)
                .addGap(143, 143, 143)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Cargar)
                        .addGap(18, 18, 18)
                        .addComponent(Guardar)
                        .addGap(18, 18, 18)
                        .addComponent(Nuevo)
                        .addGap(123, 123, 123)
                        .addComponent(Limpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Reportes)
                        .addGap(95, 95, 95))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(panelDibujo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cargar)
                    .addComponent(Limpiar)
                    .addComponent(Guardar)
                    .addComponent(Nuevo)
                    .addComponent(Reportes))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelDibujo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Compilar)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarActionPerformed
        // TODO add your handling code here:
           JFileChooser fileChooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos txt (*.txt)", "txt");
    fileChooser.setFileFilter(filter);
    int result = fileChooser.showOpenDialog(this);
    if (result == JFileChooser.APPROVE_OPTION) {
        File archivotxt = fileChooser.getSelectedFile();
        try {
            String contenido = abrir(archivotxt.getAbsolutePath());
            Editable.setText(contenido);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "error al abrir el archivo: " + e.getMessage(), "error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_CargarActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
    String contenido = Editable.getText();
    JFileChooser fileChooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos txt (*.txt)", "txt");
    fileChooser.setFileFilter(filter);
    int result = fileChooser.showSaveDialog(this);
    if (result == JFileChooser.APPROVE_OPTION) {
        File archivoCsv = fileChooser.getSelectedFile();
        String rutaArchivo = archivoCsv.getAbsolutePath();
        try {
            // guarda el contenido como archivo 
            guardar(contenido, rutaArchivo);
        } catch (Exception ex) {
            // para ver errores del archivo 
            JOptionPane.showMessageDialog(this, "eror al guardar el archivo: " + ex.getMessage(), "error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_GuardarActionPerformed

    private void ReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportesActionPerformed
        // TODO add your handling code here:
               Reportes reportes = new Reportes();
        this.setVisible(false);
        reportes.setVisible(true);
    }//GEN-LAST:event_ReportesActionPerformed

    private void CompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompilarActionPerformed
    String input = Editable.getText();
    StringReader reader = new StringReader(input);
    AnalizadorLexico lexer = new AnalizadorLexico(reader); //lama el lexer
    Sintactico parser = new Sintactico(lexer); //llama el parser
    
    //comprueba que los comandos puedan entrar bien por el momento 
    try {
        Symbol result = parser.parse(); 
        // Obtener la lista de figuras (asumiendo que tu parser la devuelve)
        ArrayList<Figura> figuras = (ArrayList<Figura>) result.value;
        // Crear un nuevo JFrame para mostrar las figuras
        JFrame frame = new JFrame("Figura");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
        // Crear un JPanel personalizado para dibujar las figuras
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (Figura figura : figuras) {
                    figura.dibujar(g);
                }
            }
        };
        frame.add(panel);
        frame.setVisible(true);
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "error al ingresar los datos: " + e.getMessage(), "error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_CompilarActionPerformed

                            ///////////////////////////////////////////////////////
                            ///////////////////////////////////////////////////////
                            ///////////////////////////////////////////////////////
                            ///////////////////////////////////////////////////////
                            ///////////////////////////////////////////////////////
                            ///////////////////////////////////////////////////////
    
private void guardar(String contenido, String rutaArchivo) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
        writer.write(contenido);
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "error al guardar el archivo: " + e.getMessage(), "error", JOptionPane.ERROR_MESSAGE);
    }
}
private String abrir(String rutaArchivo) throws IOException {
    StringBuilder contenido = new StringBuilder();
    try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            contenido.append(linea).append("\n");
        }
    }
    return contenido.toString();
}

                            ///////////////////////////////////////////////////////
                            ///////////////////////////////////////////////////////
                            ///////////////////////////////////////////////////////
                            ///////////////////////////////////////////////////////
                            ///////////////////////////////////////////////////////
                            ///////////////////////////////////////////////////////

  private void procesarLinea(String linea) {
        if (linea.startsWith("graficar")) {
            procesarGraficar(linea);
        }
    }

    private void procesarGraficar(String linea) {
        Pattern pattern = Pattern.compile("graficar (\\w+) \\((.*?)\\);");
        Matcher matcher = pattern.matcher(linea);
        if (matcher.find()) {
            String tipo = matcher.group(1);
            String[] params = matcher.group(2).split(",");
            
            String nombre = params[0].trim();
            double posx = evaluarExpresion(params[1]);
            double posy = evaluarExpresion(params[2]);
            Color color = obtenerColor(params[params.length - 1].trim());

            switch (tipo) {
                case "circulo":
                    double radio = evaluarExpresion(params[3]);
                    figuras.add(new Circulo(nombre, (int)posx, (int)posy, (int)radio, color));
                    break;
                case "cuadrado":
                    double lado = evaluarExpresion(params[3]);
                    figuras.add(new Cuadrado(nombre, (int)posx, (int)posy, (int)lado, color));
                    break;
                case "rectangulo":
                    double ancho = evaluarExpresion(params[3]);
                    double alto = evaluarExpresion(params[4]);
                    figuras.add(new Rectangulo(nombre, (int)posx, (int)posy, (int)ancho, (int)alto, color));
                    break;
                case "linea":
                    double posx2 = evaluarExpresion(params[3]);
                    double posy2 = evaluarExpresion(params[4]);
                    figuras.add(new Linea(nombre, (int)posx, (int)posy, (int)posx2, (int)posy2, color));
                    break;
                case "poligono":
                    int lados = (int)evaluarExpresion(params[3]);
                    double anchoP = evaluarExpresion(params[4]);
                    double altoP = evaluarExpresion(params[5]);
                    figuras.add(new Poligono(nombre, (int)posx, (int)posy, lados, (int)anchoP, (int)altoP, color));
                    break;
            }
        }
    }

  private double evaluarExpresion(String expresionOriginal) {
        // Usamos un array de un solo elemento para almacenar la expresión
        final String[] expresion = {expresionOriginal.replaceAll("\\s+", "")}; // Eliminar espacios
        try {
            return new Object() {
                int pos = -1, ch;

                void nextChar() {
                    ch = (++pos < expresion[0].length()) ? expresion[0].charAt(pos) : -1;
                }

                boolean eat(int charToEat) {
                    while (ch == ' ') nextChar();
                    if (ch == charToEat) {
                        nextChar();
                        return true;
                    }
                    return false;
                }

                double parse() {
                    nextChar();
                    double x = parseExpression();
                    if (pos < expresion[0].length()) throw new RuntimeException("Carácter inesperado: " + (char)ch);
                    return x;
                }

                double parseExpression() {
                    double x = parseTerm();
                    for (;;) {
                        if      (eat('+')) x += parseTerm();
                        else if (eat('-')) x -= parseTerm();
                        else return x;
                    }
                }

                double parseTerm() {
                    double x = parseFactor();
                    for (;;) {
                        if      (eat('*')) x *= parseFactor();
                        else if (eat('/')) x /= parseFactor();
                        else return x;
                    }
                }

                double parseFactor() {
                    if (eat('+')) return parseFactor();
                    if (eat('-')) return -parseFactor();

                    double x;
                    int startPos = this.pos;
                    if (eat('(')) {
                        x = parseExpression();
                        eat(')');
                    } else if ((ch >= '0' && ch <= '9') || ch == '.') {
                        while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                        x = Double.parseDouble(expresion[0].substring(startPos, this.pos));
                    } else {
                        throw new RuntimeException("Carácter inesperado: " + (char)ch);
                    }

                    return x;
                }
            }.parse();
        } catch (Exception e) {
            System.out.println("Error al evaluar la expresión: " + expresionOriginal);
            return 0;
        }
    }
    private Color obtenerColor(String colorNombre) {
        switch (colorNombre.toLowerCase()) {
            case "azul": return Color.BLUE;
            case "rojo": return Color.RED;
            case "amarillo": return Color.YELLOW;
            case "verde": return Color.GREEN;
            case "morado": return new Color(128, 0, 128);
            case "cafe": return new Color(139, 69, 19);
            case "naranja": return Color.ORANGE;
            case "rosado": return Color.PINK;
            case "celeste": return new Color(135, 206, 235);
            default: return Color.BLACK;
        }
    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cargar;
    private javax.swing.JButton Compilar;
    public static javax.swing.JTextArea Editable;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton Nuevo;
    private javax.swing.JButton Reportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JPanel panelDibujo;
    // End of variables declaration//GEN-END:variables
}

