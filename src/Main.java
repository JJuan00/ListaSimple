 import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Lista all = new Lista();
		while(true){
			String menu = JOptionPane.showInputDialog("1. Ingresar cabeza\n2. Ingresar cola\n3. Listar\n4. Modificar\n5. Eliminar\n0. Salir");
			switch(menu){
			case"1":
				String Cod2 = JOptionPane.showInputDialog("Ingrese ID.");
				String Name2 = JOptionPane.showInputDialog("Ingrese Nombre.");
				double NotaNum12 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota del primer corte."));
				double NotaNum22 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota del segundo corte."));
				double NotaNum32 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota del tercer corte."));
				all.InsertarCabeza(Cod2, Name2, NotaNum12, NotaNum22, NotaNum32);
				
				break;
			case"2":
				String Cod = JOptionPane.showInputDialog("Ingrese ID.");
				String Name = JOptionPane.showInputDialog("Ingrese Nombre.");
				double NotaNum1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota del primer corte."));
				double NotaNum2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota del segundo corte."));
				double NotaNum3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota del tercer corte."));
				all.InseertarCola(Cod, Name, NotaNum1, NotaNum2, NotaNum3);
				break;
			case"3":
				all.Listar();
				break;
			case"4":
				String CodBuscar = JOptionPane.showInputDialog("Ingrese codigo a modificar.");
				all.Modificar(CodBuscar);
				break;
			case"5":
				String CodDelete = JOptionPane.showInputDialog("Ingrese codigo a eliminar.");
				all.eliminar(CodDelete);
				break;
			}
			
			if(menu.equals("0")){
				break;
			}
		}
	}
}
