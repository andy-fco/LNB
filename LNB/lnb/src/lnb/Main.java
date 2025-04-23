package lnb;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {

		// Usuario
		// id -> usuario1 | contraseña -> contra1
		// Admin
		// id -> admin1 | contraseña -> pass1

		String[] inicio = { "Iniciar Sesión", "Ingresar como Administrador", "Crear cuenta" };
		String[] opAf = { "Noticias", "Eventos", "Equipos", "Juegos", "Perfil", "Salir" };
		String[] opAd = { "Noticias", "Eventos", "Equipos", "Usuarios", "Salir" };
		String[] dico = { "Sí", "No" };
		String[] equipos = { "Argentino", "Atenas", "Boca Juniors", "Ciclista Olímpico", "Ferro Carril Oeste",
				"Gimnasia y Esgrima", "Independiente", "Instituto", "La Unión", "Oberá Tenis Club", "Obras Basket",
				"Peñarol", "Platense", "Quimsa", "Regatas", "Riachuelo", "San Lorenzo de Almagro", "San Martín",
				"Unión", "Zárate Básket" };

		int op = JOptionPane.showOptionDialog(null,
				"Bienvenid@ a la plataforma oficial de la\nLiga Nacional de Básquetbol", "Inicio", 0, 0,
				new ImageIcon(Main.class.getResource("/img/lnb_logo.png")), inicio, null);
		// JOptionPane.showInputDialog(null, "Ingresa", "Login",
		// JOptionPane.DEFAULT_OPTION, new
		// ImageIcon(Main.class.getResource("/img/user-icon.png")), null, null);

		switch (op) {
		case 0:
			String id = JOptionPane.showInputDialog("Ingresá tu nombre de usuario");
			String pass = JOptionPane.showInputDialog("Ingresá tu contraseña");
			boolean login = false;

			if (id.equals("usuario1") && pass.equals("contra1")) {
				login = true;
			}

			while (!login) {
				JOptionPane.showMessageDialog(null,
						"El usuario y la contraseña no coinciden.\nPor favor, intentá de nuevo.", "Error al ingresar",
						2, null);
				id = JOptionPane.showInputDialog("Ingresá tu nombre de usuario");
				pass = JOptionPane.showInputDialog("Ingresá tu contraseña");

				if (id.equals("usuario1") && pass.equals("contra1")) {
					login = true;
				}
			}

			int menu;
			do {

				menu = JOptionPane.showOptionDialog(null, "Bienvenido al menú principal", "Menú", 0, 3, null, opAf,
						null);

				switch (menu) {
				case 0:
					JOptionPane.showMessageDialog(null, "Foro de Novedades");
					break;
				case 1:
					JOptionPane.showMessageDialog(null, "Foro de Eventos");
					break;
				case 2:
					JOptionPane.showInputDialog(null, "¿Qué equipo deseás ver?", "Equipos", 3, null, equipos, null);
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Menú de Juegos");
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Perfil de usuario");
					break;
				case 5:
					int cerrar = JOptionPane.showOptionDialog(null, "¿Estás seguro de que querés cerrar la aplicación?",
							"Salir", JOptionPane.DEFAULT_OPTION, 2, null, dico, null);
					if (cerrar == 1) {
						menu = -1;
					}
					break;
				default:
					break;
				}

			} while (menu != 5);

			break;
		case 1:
			id = JOptionPane.showInputDialog("Ingresá tu nombre de usuario");
			pass = JOptionPane.showInputDialog("Ingresá tu contraseña");
			login = false;

			if (id.equals("admin1") && pass.equals("pass1")) {
				login = true;
			}

			while (!login) {
				JOptionPane.showMessageDialog(null,
						"El usuario y la contraseña no coinciden.\nPor favor, intentá de nuevo.", "Error al ingresar",
						2, null);
				id = JOptionPane.showInputDialog("Ingresá tu nombre de usuario");
				pass = JOptionPane.showInputDialog("Ingresá tu contraseña");

				if (id.equals("admin1") && pass.equals("pass1")) {
					login = true;
				}
			}

			
			do {

				menu = JOptionPane.showOptionDialog(null, "Bienvenido al menú principal de Administrador", "Menú", 0, 3, null, opAd,
						null);

				switch (menu) {
				case 0:
					JOptionPane.showMessageDialog(null, "Foro de Novedades");
					break;
				case 1:
					JOptionPane.showMessageDialog(null, "Foro de Eventos");
					break;
				case 2:
					JOptionPane.showInputDialog(null, "¿Qué equipo deseás ver?", "Equipos", 3, null, equipos, null);
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Panel de Gestión de Usuarios");
					break;
				case 4:
					int cerrar = JOptionPane.showOptionDialog(null, "¿Estás seguro de que querés cerrar la aplicación?",
							"Salir", JOptionPane.DEFAULT_OPTION, 2, null, dico, null);
					if (cerrar == 1) {
						menu = -1;
					}
					break;
					
				default:
					break;
				}

			} while (menu != 4);
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "En este momento no se permite el registro de nuevos usuarios.\nPor favor, volvé a intetarlo en otro momento.");
			break;
		default:
			break;
		}

	}

}
