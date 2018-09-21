
public class Constructor {
	String ID;
	String Nombre;
	Constructor sig;
	
	/*Lista nueva*/
	public Constructor(String Codigo, String nombre) {
		ID = Codigo;
		Nombre = nombre;
		sig = null;
	}
	/*Lista ya usada*/
	public Constructor(String Codigo, String nombre, Constructor liga){
		ID = Codigo;
		Nombre = nombre;
		this.sig = liga;
	}

	/*Esto es para agregar las variables que vamos a meter en nuestra lista*/
}
