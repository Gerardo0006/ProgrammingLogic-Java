import javax.swing.*;

public class AreaDeUnPoligono {

    //Definición de la función que calcula el área de los Polígonos
    public static int areas(int a, int b){
        int areaPoligono = a*b;
        return areaPoligono;
    }

    public static void main(String[] args) {
       String stringOp;
       int intOp;
       JOptionPane.showMessageDialog(null, "\tMENU DE OPCIONES\n");
       do {
            stringOp = JOptionPane.showInputDialog("Calcular área Triángulo.........1\n" +
                    "Calcular área Cuadrado........2\n" +
                    "Calcular área Rectángulo......3\n" +
                    "Salir.........................................4");
            intOp = Integer.parseInt(stringOp);

            switch (intOp){
                case 1:
                    String stringBase = JOptionPane.showInputDialog("Ingrese la medida de la base:");
                    int base = Integer.parseInt(stringBase);
                    String stringHeight = JOptionPane.showInputDialog("Ingrese la medida de la altura:");
                    int height = Integer.parseInt(stringHeight);
                    int areaTriangulo = areas(base, height);

                    JOptionPane.showMessageDialog(null, "El área del Triángulo es: " + areaTriangulo);
                    break;
                case 2:
                    String stringSide = JOptionPane.showInputDialog("Ingrese la medida de el lado:");
                    int side = Integer.parseInt(stringSide);
                    int areaCuadrado = areas(side, side);

                    JOptionPane.showMessageDialog(null, "El área del Cuadrado es: " + areaCuadrado);
                    break;
                case 3:
                    String stringBaseRectangulo = JOptionPane.showInputDialog("Ingrese la medida de la base:");
                    int baseRectangulo = Integer.parseInt(stringBaseRectangulo);
                    String stringHeightRectangulo = JOptionPane.showInputDialog("Ingrese la medida de la altura:");
                    int heightRectangulo = Integer.parseInt(stringHeightRectangulo);
                    int areaRectangulo = areas(baseRectangulo, heightRectangulo);

                    JOptionPane.showMessageDialog(null, "El área del Rectángulo es: " + areaRectangulo);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Salir");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, intente de nuevo");
            }
       } while (intOp != 4);

       JOptionPane.showMessageDialog(null, "Ha salido con éxito");
    }
}
