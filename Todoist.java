
/**
 * Write a description of class Todoist here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Todoist
{
    // Primera Tarea
    private String tarea0;
    // Segunda Tarea
    private String tarea1;
    // Tercera Tarea
    private String tarea2;
    /**
     * Constructor de objetos de la clase Todoist
     * Crea 3 Tareas vacías
     */
    public Todoist()
    {
        // 3 Tareas vacías.
        tarea0 = null;
        tarea1 = null;
        tarea2 = null;
    }

    /**
     * Método que asigna un nombre de tarea dependiendo del parámetro posicion
     * para saber a que tarea ponerlo
     */
    public void addTarea(String nombreTarea, int posicion)
    {
        // Añade el nombre a una tarea dependiendo del parámetro posición
        if (posicion == 0) 
        {
            tarea0 = nombreTarea;
        }
        else if (posicion == 1)
        {
            tarea1 = nombreTarea;
        }
        else if (posicion == 2)
        {
            tarea2 = nombreTarea;
        }
    }
    
    /**
     * Muestra por pantalla todas las tareas existentes
     */
    public void mostrarTareas()
    {
        System.out.println("Tareas existentes:");
        if (tarea0 != null)
        {
            System.out.println(tarea0);
        }
        if (tarea1 != null)
        {
            System.out.println(tarea1);
        }
        if (tarea2 != null)
        {
            System.out.println(tarea2);
        }
    }
    
}
