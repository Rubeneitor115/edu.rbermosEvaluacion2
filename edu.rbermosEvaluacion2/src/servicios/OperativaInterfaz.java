/**
 * Ruben Bernal Ramos, CSI1
 */

package servicios;

/**
 * Interfaz para la operativa de la aplicacion
 * @author rbr - 021224
 *
 */
public interface OperativaInterfaz {

	/**
	 * Enunciado de los metodos que tendra la implementacion
	 * rbr - 021224
	 */
	public int venta(int totalDiario);
	public void gasto(int totalDiario);
	public void mostrarTotal(int totalDiario);
	public void cerrarAplicacion(int totalDiario);
}
