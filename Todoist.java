import java.util.ArrayList;
/**
 * Write a description of class Todoist here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Todoist
{
    private ArrayList<String> tareas;
    /**
     * Constructor de objetos de la clase Todoist
     * Crea 10 Tareas vacías
     */
    public Todoist()
    {
        // 10 Tareas vacías (Ampliable)
        tareas = new ArrayList<String>();
    }
    
    public void addTarea(String nombreTarea)
    {
        // Agrega una tarea a la lista
        tareas.add(nombreTarea);
    }
    
    /**
     * Muestra por pantalla todas las tareas existentes
     */
    public void mostrarTareas()
    {
        // Muestra por pantalla las tareas existentes 
        System.out.println("Tareas existentes:");
        System.out.println(tareas);
    }
    
    /**
     * Muestra el numero de tareas almacenadas
     */
    public int getNumeroDeTareasPendientes()
    {
        // Devuelve el numero de tareas de la lista
        return tareas.size();
    }
    
    public void mostrarNumeroDeTareasPendientes()
    {
        // Imprime el numero de tareas pendientes
        System.out.println("Tienes " + tareas.size() + " tarea(s) pendientes.");
    }
    
    /**
     * Elimina la tarea que ocupa la posicion indicada como
     * parametro (empezando en 0)
     */
    
    public boolean eliminarTarea(int posicionTarea)
    {
        if (esValidoElIndice(posicionTarea))
        {
            tareas.remove(posicionTarea);
        }
        return esValidoElIndice(posicionTarea);
    }
    
    /**
     * Metodo que comprueba si una posicion es valida y devuelve true
     * en caso afirmativo o false en otro caso.
     */
    
    public boolean esValidoElIndice(int indice)
    {
        return (indice >= 0 && indice < tareas.size());
    }
    
    public boolean hayTareasPendientes()
    {
        return !tareas.isEmpty();
    }
    
    /** 
     * Metodo que imprime todas las tareas existentes, una por linea.
     * El metodo imprime el numero de posicion de la tarea antes del
     * nombre de la tarea.
     */   
      public void mostrarTareasNumeradas()
    {
        int numeroPosicion = 0;
        // Bucle for each (":" --> Indica que es for each)
        for (String tarea : tareas){
            System.out.println(numeroPosicion + ". " + tarea);
            numeroPosicion++;
        }
    }
    
      public void mostrarTareasNumeradasImpares()
    {
        int numeroPosicion = 1;
        // Bucle for each (":" --> Indica que es for each)
        for (String tarea : tareas){
            System.out.println(numeroPosicion + ". " + tarea);
            numeroPosicion +=2;
        }
    }
     
     
    
}
