package lnb;

import javax.swing.JOptionPane;

public class Admin extends Usuario implements Menu{
	
	//Atributos

	
	//Constructor
	public Admin(String nobmre, String apellido, String id, String pass) {
		super(nobmre, apellido, id, pass);
		
	}

	//Setters & Getters


	//Otros Métodos
	public static boolean ingresar() {

		boolean login = false;
		String id = JOptionPane.showInputDialog("Ingresá tu ID");
		String pass = JOptionPane.showInputDialog("Ingresá tu contraseña");

		if (id.equals("admin1") && pass.equals("contra1")) {
			login = true;
		}

		while (login == false) {
			JOptionPane.showMessageDialog(null,
					"El usuario y la contraseña ingresados no coinciden.\nPor favor, intentá de nuevo");
			id = JOptionPane.showInputDialog("Ingresá tu ID");
			pass = JOptionPane.showInputDialog("Ingresá tu contraseña");
			
			if (id.equals("admin1") && pass.equals("contra1")) {
				login = true;
			}
		}
		return login;
	}
	
	public void mostrarMenu() {
		
		JOptionPane.showMessageDialog(null, "Bienvenido al menú de admin");
	}
	
	//To String
//	@Override
//	public String toString() {
//		return "Admin [id=" + id + ", pass=" + pass + "]";
//	}
	
}
