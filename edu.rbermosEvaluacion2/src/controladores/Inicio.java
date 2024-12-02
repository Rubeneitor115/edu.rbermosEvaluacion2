/**
 * Ruben Bernal Ramos, CSI
 */

package controladores;

import java.util.Scanner;

import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.OperativaImplementacion;
import servicios.OperativaInterfaz;

/**
 * Clase controladora de la aplicacion
 * rbr - 021224
 */
public class Inicio {

	//Defino la variable Scanner a nivel global para poder usarla en todo el proyecto
	public static Scanner sc = new Scanner(System.in);
	/**
	 * Metodo de entrada de la aplicacion
	 * rbr - 021224
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		int totalDiario = 0;
		byte opcion;
		
		//Instancio las interfaces con sus implementaciones
		MenuInterfaz mi = new MenuImplementacion();
		OperativaInterfaz oi = new OperativaImplementacion();
		
		do {
			//Muestro el menu
			mi.mostrarMenu();
			//Recojo la opcion deseada por el usuario
			opcion = sc.nextByte();
			//Accedo a la opcion seleccionada por el usuario
			switch(opcion) {
			case 1:
				oi.venta(totalDiario);
				break;
			case 2:
				oi.gasto(totalDiario);
				break;
			case 3:
				oi.mostrarTotal(totalDiario);
				break;
			case 4:
				oi.cerrarAplicacion(totalDiario);
				System.out.println("Aplicacion cerrada correctamente!!!!");
				break;
			default:
				System.err.println("La opcion seleccionada no es valida...");
				System.err.println("Intentelo de nuevo...");
				break;
			}
		}while(opcion!=4);
		

	}

}
