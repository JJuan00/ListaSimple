import javax.swing.JOptionPane;

public class Lista {
	
	static Nodo Primero, Nuevo, Aux, Ultimo, Anterior; /*Los punteros (flechas)*/
	static  int cont1=0, cont2=0, cont3=0, acum=0;
	public Lista(){ /*El constructor de la list*/
		Primero = Nuevo = Aux = Ultimo = Anterior = null;
	}
	
	public static void InseertarCola(String Codigo, String nombre, double NotaNum1, double NotaNum2, double NotaNum3){
		if(Primero ==  null){ /*Si la loista esta vacia*/
			Primero = new Nodo(Codigo, nombre, NotaNum1, NotaNum2, NotaNum3);
			Ultimo = Primero;
		}else{ /*Si esta ya con un dato*/
			Aux = Primero;
			for(int i = 0; Aux != null; i ++){
				if(Codigo.equalsIgnoreCase(Aux.ID)){
					break;
				}else{
					Aux = Aux.sig; /*Aca me va recorriendo la Lista -> .Sig -> .Sig ->*/
				}
			}
			if(Aux == null){
				Nuevo = new Nodo(Codigo, nombre, NotaNum1, NotaNum2, NotaNum3);
				Ultimo.sig = Nuevo;
				Ultimo = Nuevo;
			}else{
				JOptionPane.showMessageDialog(null, "Ya esta la identificacion.");
			}
		}
		cont1++;
	}
	
	public static void InsertarCabeza(String Codigo, String nombre, double NotaNum1, double NotaNum2, double NotaNum3){
		if(Primero == null){
			Primero = new Nodo(Codigo, nombre, NotaNum1, NotaNum2, NotaNum3);
			Ultimo = Primero;
		}else{
			Aux = Primero;
			for(int i = 0; Aux != null; i ++){
				if(Codigo.equalsIgnoreCase(Aux.ID)){
					break;
				}else{
					Aux = Aux.sig; /*Aca me va recorriendo la Lista -> .Sig -> .Sig ->*/
				}
			}
			
			if(Aux == null){
				Nuevo = new Nodo(Codigo, nombre, NotaNum1, NotaNum2, NotaNum3);
				Nuevo.sig = Primero;
				Primero = Nuevo;
			}else{
				JOptionPane.showMessageDialog(null, "Codigo repetido.");
			}
		}
		cont2++;
	}
	
	
	public  void eliminar(String codigo){
			Aux = Primero;
			Anterior = null;
			while(Aux != null){
				if(codigo.equals(Aux.ID)){
					if(Aux == Primero){
						Primero= Primero.sig;
					}else{
						Anterior.sig = Aux.sig;
					}
				}
				Anterior=Aux;
				Aux= Aux.sig;
			}
			cont3++;
		}
	
	public static void Modificar(String codigo){
		Aux = Primero;
		while(Aux != null){
			if(codigo.equals(Aux.ID)){
				break;
			}else{
				Aux = Aux.sig;
			}
		}
		
		if(Aux == null){
			JOptionPane.showMessageDialog(null, "No existe ese codigo (" + codigo + ")");
		}else{
			String op = null;
			while(true){
				op = JOptionPane.showInputDialog("1. Nombre: " + Aux.Nombre + "\n2. Codigo: " + Aux.ID + "\n3. Nota 1: " + Aux.Nota1 + "\n4. Nota 2: " + Aux.Nota2 + "\n5. Nota 3: " + Aux.Nota3 + "\n0. Salir");
				switch(op){
				case"1":
					String nombre = JOptionPane.showInputDialog("Ingrese nombre a modificar.");
					Aux.Nombre = nombre;
					break;
				case"2":
					String codi = JOptionPane.showInputDialog("Ingrese codigo a modificar.");
					Aux.ID = codi;
					break;
				case"3":
					double N1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota primer corte a modificar."));
					Aux.Nota1 = N1;
					break;
				case"4":
					double N2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota segundo corte a modificar."));
					Aux.Nota2 = N2;
					break;
				case"5":
					double N3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota tercer corte a modificar."));
					Aux.Nota3 = N3;
					break;
				}
				
				if(op.equals("0")){
					break;
				}
			}
		}
	}
	
	public static void Listar(){
		Aux = Primero; /*Defino la posicion con un Auxiliar*/
		
		/*Variables a utilizar en la impresion*/
		double TempNota1 = 0;
		double TempNota2 = 0;
		double TempNota3 = 0;
		double Def = 0;
		/*End variabes*/
		while(Aux != null){/*Ciclo que recorre la lista*/
			try{
				/*Saco los porcentajes y los almaceno en variables*/
				acum = (cont1+cont2)-cont3;
				TempNota1 = (Aux.Nota1)*0.3;
				TempNota2 = (Aux.Nota2)*0.3;
				TempNota3  = (Aux.Nota3)*0.4;
				Def = TempNota1 + TempNota2 + TempNota3;
				/*End*/
				
				/*Imprimo la lista y las variables*/
				JOptionPane.showMessageDialog(null, "Codigo: " + Aux.ID + "\nNombre: " + Aux.Nombre + "\n Nota 1: " + Aux.Nota1 + " 30% -> " + TempNota1 + 
						"\nNota 2: " + Aux.Nota2 + " 30% -> " + TempNota2 + "\nNota 3: " + Aux.Nota3 + " 40% -> " + TempNota3 + "\nDefinitiva: " + Def+ "\nCantindad de nodos:"+acum);
				Aux = Aux.sig; /*Recorro la lista con el .sig -> */
				/*Reinicio variables para que no haya un error¨*/
				TempNota1 = 0;
				TempNota2 = 0;
				TempNota3  = 0;
				Def = 0; 
			}catch(NullPointerException e){ /*Por si hay un posible error de un campo nulo entonces no me cierre el programa*/
				
			}
		}
	}

}
