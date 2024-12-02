/**
 * Ruben Bernal Ramos, CSI
 */

package servicios;

/**
 * Implementacion de la interfaz del menu
 * @author rbr - 021224
 *
 */
public class MenuImplementacion implements MenuInterfaz{

	/**
	 * Metodo que mostrara el menu por consola
	 * rbr - 021224
	 */
	public void mostrarMenu() {
		
		System.out.println("**********************************************");
		System.out.println("                     MENU                     ");
		System.out.println("**********************************************");
		System.out.println("1. Añadir Venta");
		System.out.println("2. Añadir Gasto");
		System.out.println("3. Mostrar Total");
		System.out.println("4. Cerrar aplicacion");
		System.out.println("**********************************************");
		System.out.println("Seleccione una opción: ");
		
	}

	
}
