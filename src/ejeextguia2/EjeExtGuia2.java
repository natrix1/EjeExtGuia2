/*
Desarrolla una aplicación de lista de tareas pendientes utilizando interfaces gráficas y colecciones
en Java. La interfaz gráfica debe permitir al usuario agregar nuevas tareas, marcar tareas como
completadas y eliminar tareas de la lista. Además, la aplicación debe mostrar la lista de tareas
pendientes y la lista de tareas completadas. Utiliza una colección adecuada para almacenar las
tareas y asegúrate de que la interfaz gráfica se actualice correctamente cuando se realicen cambios
en la lista.
Es importante que repartan las tareas entre los miembros del equipo, de tal forma que: uno crea
repositorio en GitHub; los demás clonan, luego cada uno hace una de las clases que forman parte
del proyecto y suben al repositorio los cambios.
 */
package ejeextguia2;

/**
 *
 * @author Altamirano
 */
public class EjeExtGuia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaDeTareas list = new ListaDeTareas();
        
        list.setVisible(true);
        list.setLocationRelativeTo(null);
        
        
    }
    
}
