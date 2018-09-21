import javax.swing.JOptionPane;

public class Lista extends Principal{
	
	static Constructor Primero, Nuevo, Aux, Ultimo;
	
	public Lista(String Codigo, String Nombre) {
		Primero = Nuevo = Aux = Ultimo = null;
	}
	
	public static void insertar(String Codigo, String nombre) {
		if(Primero == null) {
			Primero = new Constructor(Codigo, nombre);
			Ultimo = Primero;
			JOptionPane.showMessageDialog(null, "Deposito exitoso","Exito", JOptionPane.INFORMATION_MESSAGE);
		}else {
			Nuevo = new Constructor(Codigo, nombre);
			Ultimo.sig = Nuevo;
			Ultimo = Nuevo;
			JOptionPane.showMessageDialog(null, "Deposito exitoso","Exito", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public static void despliegaLista() {
		String cadena = "";
		Aux = Primero;
		if(Aux == null) {
			JOptionPane.showMessageDialog(null, "No hay datos en la lista");
		}
		while(Aux != null) {
			cadena = cadena + "Codigo: " + Aux.ID 
					+ "\nNombre: " + Aux.Nombre;
			Aux = Aux.sig;
		}
		cod = cadena;
	}
}
