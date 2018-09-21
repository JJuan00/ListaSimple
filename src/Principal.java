import java.awt.List;

import javax.swing.JOptionPane;

/*
 * Este es el metodo principal.
 * Donde recibe datos y llama metodos
 */
public class Principal {
	static String cod;

	public static void main(String[] args) {
		
		String op;
		while(true){
			op = JOptionPane.showInputDialog("1. Ingrese lista\n2. Listar");
			switch(op) {
			case "1":
				String Codigo = JOptionPane.showInputDialog("Ingrese codigo");
				String nombre = JOptionPane.showInputDialog("Ingrese nombre");
				Lista.insertar(Codigo, nombre); break;
			case "2":
				Lista.despliegaLista();
				JOptionPane.showMessageDialog(null, cod);
				break;
			}
			
			if(op.equals("0")) {
				break;
			}
		}
		
	}
}
