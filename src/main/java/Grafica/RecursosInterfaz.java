package Grafica;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;
import javax.swing.*;
public class RecursosInterfaz {
    private static Timer temporizador;
    
    public static void guardarPDF(JFrame frame) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar PDF");
        fileChooser.setFileFilter(new FileNameExtensionFilter("PDF files", "pdf"));

        if (fileChooser.showSaveDialog(frame) == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            if (!fileToSave.getName().toLowerCase().endsWith(".pdf")) {
                fileToSave = new File(fileToSave.getParentFile(), fileToSave.getName() + ".pdf");
            }

            try {
                // Crear un BufferedImage del panel
                BufferedImage image = new BufferedImage(frame.getWidth(), frame.getHeight(), BufferedImage.TYPE_INT_RGB);
                Graphics2D g2d = image.createGraphics();
                frame.paint(g2d);
                g2d.dispose();

                // Crear documento PDF
                Document document = new Document();
                PdfWriter.getInstance(document, new FileOutputStream(fileToSave));
                document.open();

                // Añadir la imagen al PDF
                Image pdfImage = Image.getInstance(image, null);
                pdfImage.scaleToFit(document.getPageSize().getWidth() - 40, document.getPageSize().getHeight() - 40);
                document.add(pdfImage);

                document.close();
                JOptionPane.showMessageDialog(frame, "PDF guardado exitosamente.", "bien", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(frame, "error al guardar el PDF: " + e.getMessage(), "error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void guardarPNG(JFrame frame) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar PNG");
        fileChooser.setFileFilter(new FileNameExtensionFilter("PNG files", "png"));

        if (fileChooser.showSaveDialog(frame) == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            if (!fileToSave.getName().toLowerCase().endsWith(".png")) {
                fileToSave = new File(fileToSave.getParentFile(), fileToSave.getName() + ".png");
            }

            try {
                // Crear un BufferedImage del panel
                BufferedImage image = new BufferedImage(frame.getWidth(), frame.getHeight(), BufferedImage.TYPE_INT_ARGB);
                Graphics2D g2d = image.createGraphics();
                frame.paint(g2d);
                g2d.dispose();

                // Guardar la imagen como PNG
                ImageIO.write(image, "png", fileToSave);
                JOptionPane.showMessageDialog(frame, "PNG guardado exitosamente.", "bien", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(frame, "error al guardar el PNG: " + e.getMessage(), "error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    

}