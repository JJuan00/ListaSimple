public class Nodo {
	String ID;
	String Nombre;
	double Nota1;
	double Nota2;
	double Nota3;
	Nodo sig;
	Nodo ant;
	
	/*Lista nueva*/
	public Nodo(String codigo, String nombre, double nota1, double nota2, double nota3){
		ID = codigo;
		Nombre = nombre;
		Nota1 = nota1;
		Nota2 = nota2;
		Nota3 = nota3;
		sig = null;
	
		
	}
	/*Lista con datos*/
	public Nodo(String codigo, String nombre, double nota1, double nota2, double nota3, Nodo liga){
		ID = codigo;
		Nombre = nombre;
		Nota1 = nota1;
		Nota2 = nota2;
		Nota3 = nota3;
		this.sig = liga;
	}

}

