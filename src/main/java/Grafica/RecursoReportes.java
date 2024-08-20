
package Grafica;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RecursoReportes {

    // Métodos de utilidad para agregar datos a los mapas
    private void contarElementos(Matcher matcher, HashMap<String, Integer> map) {
        while (matcher.find()) {
            String elemento = matcher.group();
            map.put(elemento, map.getOrDefault(elemento, 0) + 1);
        }
    }

    private void contarOperadores(Matcher matcher, HashMap<String, List<String[]>> operadoresMap, HashMap<String, String> operadorNombre, int linea) {
        while (matcher.find()) {
            String operacionCompleta = matcher.group();
            String operador = operacionCompleta.replaceAll("\\d+\\s*([+\\-/])\\s\\d+", "$1");
            String nombre = operadorNombre.getOrDefault(operador, "desconocido");
            int columna = matcher.start() + 1;
            String[] ubicacion = {String.valueOf(linea), String.valueOf(columna), operacionCompleta};
            operadoresMap.putIfAbsent(nombre, new LinkedList<>());
            operadoresMap.get(nombre).add(ubicacion);
        }
    }

    // Método principal para procesar el texto
    public void procesarTexto(String input, JTable coloresUso, JTable animacionUso, JTable objetosUso, JTable tablaOperadores) {
        HashMap<String, Integer> coloresMap = new HashMap<>();
        HashMap<String, Integer> figurasMap = new HashMap<>();
        HashMap<String, List<String[]>> operadoresMap = new HashMap<>();
        HashMap<String, Integer> animacionesMap = new HashMap<>();

        Pattern colorPattern = Pattern.compile("(amarillo|verde|azul|rojo|morado|cafe|naranja|rosado|celeste)");
        Pattern figuraPattern = Pattern.compile("(polígono|cuadrado|circulo)");
        Pattern operadorPattern = Pattern.compile("(\\d+\\s*[+\\-/]\\s\\d+)");
        Pattern animacionPattern = Pattern.compile("(línea|curva)");

        HashMap<String, String> operadorNombre = new HashMap<>();
        operadorNombre.put("+", "suma");
        operadorNombre.put("-", "resta");
        operadorNombre.put("*", "multiplicación");
        operadorNombre.put("/", "división");

        String[] lines = input.split("\\n");
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            contarElementos(colorPattern.matcher(line), coloresMap);
            contarElementos(figuraPattern.matcher(line), figurasMap);
            contarOperadores(operadorPattern.matcher(line), operadoresMap, operadorNombre, i + 1);
            contarElementos(animacionPattern.matcher(line), animacionesMap);
        }

        actualizarTablas(coloresUso, animacionUso, objetosUso, tablaOperadores, coloresMap, figurasMap, operadoresMap, animacionesMap);
    }

    // Método para actualizar las tablas con los datos procesados
    private void actualizarTablas(JTable coloresUso, JTable animacionUso, JTable objetosUso, JTable tablaOperadores,
        HashMap<String, Integer> coloresMap, HashMap<String, Integer> figurasMap,
        HashMap<String, List<String[]>> operadoresMap, HashMap<String, Integer> animacionesMap) {
        DefaultTableModel colorModel = (DefaultTableModel) coloresUso.getModel();
        DefaultTableModel animacionModel = (DefaultTableModel) animacionUso.getModel();
        DefaultTableModel objetoModel = (DefaultTableModel) objetosUso.getModel();
        DefaultTableModel operadorModel = (DefaultTableModel) tablaOperadores.getModel();

        limpiarTablas(colorModel, animacionModel, objetoModel, operadorModel);

        coloresMap.forEach((color, count) -> colorModel.addRow(new Object[]{color, count}));
        figurasMap.forEach((figura, count) -> objetoModel.addRow(new Object[]{figura, count}));
        operadoresMap.forEach((operador, ubicaciones) -> 
            ubicaciones.forEach(ubicacion -> operadorModel.addRow(new Object[]{operador, ubicacion[0], ubicacion[1], ubicacion[2]}))
        );
        animacionesMap.forEach((animacion, count) -> animacionModel.addRow(new Object[]{animacion, count}));
    }

    // Método para limpiar las tablas antes de llenarlas con nuevos datos
    private void limpiarTablas(DefaultTableModel... modelos) {
        for (DefaultTableModel modelo : modelos) {
            modelo.setRowCount(0);
        }
    }
}
