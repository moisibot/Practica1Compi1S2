package Grafica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Inicio extends javax.swing.JFrame {

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

        Compilar.setText("Compilar");

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Cargar)
                        .addGap(18, 18, 18)
                        .addComponent(Guardar)
                        .addGap(18, 18, 18)
                        .addComponent(Nuevo)
                        .addGap(123, 123, 123)
                        .addComponent(Limpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 274, Short.MAX_VALUE)
                        .addComponent(Reportes)
                        .addGap(95, 95, 95))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(Compilar)
                .addGap(104, 104, 104)
                .addComponent(jLabel1)
                .addGap(143, 143, 143)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            String contenido = abrirArchivoCSV(archivotxt.getAbsolutePath());
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
            guardarComoCSV(contenido, rutaArchivo);
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

    
        ///////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////
    
     private void guardarComoCSV(String contenido, String rutaArchivo) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
        writer.write(contenido);
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al guardar el archivo: " + e.getMessage(), "error", JOptionPane.ERROR_MESSAGE);
    }
}
    private String abrirArchivoCSV(String rutaArchivo) throws IOException {
    StringBuilder contenido = new StringBuilder();
    try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            contenido.append(linea).append("\n");
        }
    }
    return contenido.toString();
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
