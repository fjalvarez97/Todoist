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
    
      public void mostrarTareasImpares()
    {
        int contadorTarea = 0;
        for (String tarea : tareas) {
           
            if (contadorTarea %2 == 0)
            {
                System.out.println(tarea);
            }
             contadorTarea ++;
        }
    }
    
    /**
     * Muestra por pantalla todas las tareas que contienen el texto indicado
     * como parámetro, una en cada linea, y ademas muestra un mensaje al final indicando
     * el numero de coincidencias encontradas. Si no hay ninguna que contenga el texto
     * buscado informa de la situacion. Este metodo es insensible a mayusculas o minusculas
     */
    
    public void mostrarCoincidentes (String textoABuscar)
    {
        int numeroCoincidencias = 0;
        // Contador de coincidencias
        for (String tarea: tareas)
        {
            if (tarea.toLowerCase().contains(textoABuscar.toLowerCase()))
            {
                System.out.println(tarea);
                numeroCoincidencias ++;
                //+1 Contador coincidencias
            }
        }
   
        if (numeroCoincidencias == 0)
        {
            System.out.println("No hay ninguna tarea que contenga ese texto");
            // Devuelve un mensaje si no hay ninguna coincidencia (contador == 0)
        }
        else 
        {
            System.out.println("Se han encontrado " + numeroCoincidencias + " coincidencias");
            // Devuelve el contador de coincidencias
        }
    } 
    
    /**
     * Muestra por pantalla la primera tarea que contenga el texto indicado como 
     * parametro. En caso de que no haya ninguna coincidencia no muestra nada
     */
    
    public void mostrarPrimeraCoindicente(String textoABuscar)
    {
        boolean hayPrimeraTarea = false;
        //Indica si la primera tarea ya se ha imprimido
        for (String tarea: tareas)
        {
            // Se imprime la primera tarea y ninguna mas .
            if (hayPrimeraTarea == false && tarea.toLowerCase().contains(textoABuscar.toLowerCase()))
            {
                hayPrimeraTarea = true; 
                System.out.println("La primera tarea coincidente es " + tarea);
            }
        }
    }
    
    /**
     * Muestra por pantalla todas las tareas existentes, una por línea,
     * usando un bucle while
     */
    public void mostrarTareas2()
    {
        int posicionTareaActual = 0;
        while (posicionTareaActual < tareas.size()) {
            System.out.println(tareas.get(posicionTareaActual));
            posicionTareaActual++;
        }
    }
    
    /**
     * Muestra las tareas numeradas usando un bucle while empezando en 1
     */
    public void mostrarTareasNumeradas2()
    {
        int posicionTareaActual = 0;
        while(posicionTareaActual < tareas.size()){
            System.out.println((posicionTareaActual + 1) + ".-" + tareas.get(posicionTareaActual));
            posicionTareaActual++;
        }
    } 
    
    /**
     * Muestra por pantalla las primeras n tareas (siendo n un parametro). En
     * caso de que no haya suficientes tareas muestra solo las que haya.
     */
    public void mostrarNPrimeras (int n)
    {
       int posicionTareaActual = 0;
       while(posicionTareaActual < tareas.size() && posicionTareaActual < n){
            System.out.println(tareas.get(posicionTareaActual));
            posicionTareaActual++;
       }
    }    
}
