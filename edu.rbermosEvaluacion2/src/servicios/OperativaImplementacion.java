/**
 * Ruben Bernal Ramos, CSI1
 */

package servicios;

/**
 * Implementacion de la interfaz operativa de la aplicacion
 * @author rbr - 021224
 */
public class OperativaImplementacion implements OperativaInterfaz{

	/**
	 * Metodo que añadira una nueva venta diaria
	 * rbr - 021224
	 * @param totalDiario
	 * @return totalDiario
	 */
	public int venta(int totalDiario) {
		
		int venta;
		
		System.out.println("Introduzca el importe de la venta: ");
		venta = controladores.Inicio.sc.nextInt();
		
		totalDiario = totalDiario + venta;
		
		return totalDiario;
	}

	/**
	 * Metodo que añadira un nuevo gasto diario
	 * rbr - 021224
	 * @param totalDiario
	 */
	public void gasto(int totalDiario) {
		
		int gasto;
		
		System.out.println("Introduzca el importe del gasto: ");
		gasto = controladores.Inicio.sc.nextInt();
		
		totalDiario = totalDiario - gasto;
		
		if(totalDiario==0) {
			System.out.println("El total del dia ha llegado a cero.");
		}else if(totalDiario<0) {
			System.out.println("El total del dia esta en negativo.");
		}
	}

	/**
	 * Metodo que mostrara por pantalla el total diario
	 * rbr - 021224
	 * @param totalDiario
	 */
	public void mostrarTotal(int totalDiario) {
		
		System.out.println("Total: " + totalDiario + " euros.");
		
	}

	/**
	 * Metodo para cerrar la aplicacion
	 * rbr - 021224
	 * @param totalDiario
	 */
	public void cerrarAplicacion(int totalDiario) {
		
		int aux, aux2;
		
		aux = (int) (totalDiario * 0.10);
		aux = (int) (aux * 0.10);
		aux2 = (int) (aux * 0.10);
		
		if(aux2>200) {
			System.out.println("Mañana podra aplicar un descuento del 10% en su proxima compra.");
		}
		
	}

}
