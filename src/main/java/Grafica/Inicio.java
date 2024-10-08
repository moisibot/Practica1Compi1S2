package Grafica;

import static Grafica.Reportes.*;
import Gramaticas.AnalizadorLexico;
import Gramaticas.Sintactico;
import Objetos.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Inicio extends javax.swing.JFrame {
    private List<Figura> figuras;
 //   private List<Animacion> animaciones;

private JFrame frame;
private JPanel panelDibujo;
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
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(Compilar)
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1)
                        .addGap(143, 143, 143)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        reportes.setVisible(true);

    }//GEN-LAST:event_ReportesActionPerformed

    private void CompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompilarActionPerformed
     String input = Editable.getText();
     
    StringReader reader = new StringReader(input);
    AnalizadorLexico lexer = new AnalizadorLexico(reader);
    Sintactico parser = new Sintactico(lexer);
    
    try {
        parser.parse();
        ArrayList<Figura> figuras = parser.figuras;
       // actualizarTablaOperadores(parser.getOperadoresInfo());
        if (figuras.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se encontraron figuras para dibujar.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        // Verificar si la ventana ya existe
        if (frame == null) {
                  /*
        estas funciones se tomaron de otros proyectos pero sirve para hacer una division entre el jframe 
        y la barra de herramientas para poder agregar los botones que serviran para guardar e animar
        */  
        //crea el panel general
        //se usa SwingUtilities.invokeLater() para asegurar la creación de la interfaz grafica
            // Crear la ventana y el panel de dibujo
            frame = new JFrame("Figuras");
            frame.setSize(1280, 920);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            JToolBar toolBar = new JToolBar();
            toolBar.setFloatable(false);
            
            JButton limpiar = new JButton("Limpiar");
            limpiar.addActionListener(e -> limpiar(panelDibujo));
            toolBar.add(limpiar);
            
            JButton guardarpdf = new JButton("Guardar PDF");
            guardarpdf.addActionListener(e -> RecursosInterfaz.guardarPDF(frame));
            toolBar.add(guardarpdf);
            
            JButton guardarpng = new JButton("Guardar PNG");
            guardarpng.addActionListener(e -> RecursosInterfaz.guardarPNG(frame));
            toolBar.add(guardarpng);
            
            JButton animarButton = new JButton("Animar");
            toolBar.add(animarButton);
            
            JButton detenerAnimacionButton = new JButton("Detener Animación");
            toolBar.add(detenerAnimacionButton);

            panelDibujo = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    Graphics2D g2d = (Graphics2D) g;
                    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    for (Figura figura : figuras) {
                        figura.actualizarAnimacion();
                        figura.dibujar(g2d);
                    }
                }
            };
            panelDibujo.setBackground(Color.GRAY);
            frame.setLayout(new BorderLayout());
            frame.add(toolBar, BorderLayout.NORTH);
            frame.add(new JScrollPane(panelDibujo), BorderLayout.CENTER);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        } else {
            // Actualizar el panel de dibujo con las nuevas figuras
            panelDibujo.repaint();
        }
    } catch (Exception e) {
        StringBuilder errorMsg = new StringBuilder("error al procesar la entrada:\n");
        errorMsg.append(e.getMessage()).append("\n");
        if (parser.getErrores() != null && !parser.getErrores().isEmpty()) {
            errorMsg.append("errores encontrados:\n");
            for (String error : parser.getErrores()) {
                errorMsg.append(error).append("\n");
            }
        }
        JOptionPane.showMessageDialog(this, errorMsg.toString(), "error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_CompilarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        // TODO add your handling code here:
        Editable.setText("");
                Editable.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed

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
private void limpiar(JPanel panelDibujo) {
  figuras.clear();
  panelDibujo.repaint();
  panelDibujo.setToolTipText("");
  
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
    // End of variables declaration//GEN-END:variables
}

