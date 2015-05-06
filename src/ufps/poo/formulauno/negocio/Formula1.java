package ufps.poo.formulauno.negocio;

public class Formula1 {
    
    private Escuderia[] escuderias;
    private int ordenEscuderia;
    
    public Formula1(){
        escuderias = new Escuderia[5];
    }
    
    public String agregarEscuderia(String nombre, String jefeEquipo, 
            String jefeTecnico, String chasis, int anioIngresoF1){
        
        String escuderiaAgregada = "No hay campos para registrar más escuderías.";
        // Se valida que cumpla la condición de que no se agregue un piloto
        // fuera de los permitidos
        if(ordenEscuderia<5){
            
            // El nombre de la escuderia debe ser unico.
            // Se debe incluir esa validacion
            if(this.buscarEscuderia(nombre) != null)
                return "La escudería ya existe";
            
            Escuderia e = new Escuderia(nombre, jefeEquipo, jefeTecnico, chasis,
                    anioIngresoF1);
            escuderias[ordenEscuderia] = e;
            ordenEscuderia++;
            escuderiaAgregada = "Registro exitoso. Escudería "+ordenEscuderia;
        }
        return escuderiaAgregada;
    }
    
    public String agregarPiloto(String nombre, String pais, int anioNacimiento,
            String periodoContrato, String[] aniosCampeon, int anioIngreso, 
            String escuderia){
        
        String pilotoAgregado = "";
        
        // Se debe recorrer el arreglo hasta encontrar el 
        // objeto Escuderia que coincida con el nombre que se
        // recibe como parametro. Cuando se encuentre, se invoca
        // el metodo de agregar piloto y se le pasan el resto
        // de los parametros recibidos.
        for(Escuderia x: escuderias)
            if(x!=null && x.getNombre().equalsIgnoreCase(escuderia))
                pilotoAgregado = x.agregarPiloto(nombre, pais, anioNacimiento, periodoContrato, aniosCampeon, anioIngreso);
        
        return pilotoAgregado;
    }
    
    public String consultarEscuderia(String nombre){
        String escuderia = "";
        if(this.buscarEscuderia(nombre) != null)
            escuderia = this.buscarEscuderia(nombre).toString();
        else
            escuderia = "No hay escuderias con ese nombre";
        
        return escuderia;
    }
    
    public String consultarPiloto(String nombre){
        String piloto = "";
        
        for(Escuderia e: escuderias)
            if(e!=null)
                piloto = e.consultarPiloto(nombre);
        
        return piloto;
    }
    
    public String eliminarPiloto(String nombreEscuderia, String nombrePiloto){
        String mensaje = "";
        
        for(Escuderia e:escuderias)
            if(e!=null&&e.getNombre().equalsIgnoreCase(nombreEscuderia))
                mensaje = e.eliminarPiloto(nombrePiloto);
    
        return mensaje;
    }
    
    public String eliminarEscuderia(String nombreEscuderia){
        for(int i=0; i<escuderias.length; i++)
            if(escuderias[i]!=null &&
                    escuderias[i].getNombre().equalsIgnoreCase(nombreEscuderia))
                escuderias[i] = null;
        
        
        return "Escudería eliminada con exito";
    }
    
    public String actualizarEscuderia(String nombre, String jefeEquipo, 
            String jefeTecnico, String chasis, int añoIngreso){
        Escuderia escu = new Escuderia(nombre, jefeEquipo, jefeTecnico, chasis, añoIngreso);
        
        for(int i=0; i<escuderias.length; i++)
            if(escuderias[i]!=null && 
                    escuderias[i].getNombre().equalsIgnoreCase(nombre))
                escuderias[i] = escu;
    
        return "Cambios guardados con exito";
    }
    
    //--------------------------REQUERIMIENTOS OPERACIONALES-------------------//
    public Escuderia buscarEscuderia(String nombre){
        Escuderia escuderia = null;

        for(Escuderia e: escuderias)
            if(e!=null && e.getNombre().equalsIgnoreCase(nombre))
                escuderia = e;

        return escuderia;
    }
    
    public String concatenarNombreEscuderia(){
        String nombres = "";
        
        for (Escuderia escuderia : escuderias)
            if(escuderia != null)
                nombres += escuderia.getNombre()+"-";
        
        return nombres;
    }
    
    public String concatenarNombresPiloto(){
        String nombres = "";
        
        for(Escuderia e:escuderias)
            if(e!=null)
                nombres += e.concatenarNombresPiloto();
        
        return nombres;
    }
    
    public String concatenarNombresEscuderiaAEliminar(String nombre){
        String nombres = "";
        
        for(Escuderia e: escuderias)
            if(e!=null && e.getNombre().equalsIgnoreCase(nombre))
                nombres = e.concatenarNombresPiloto();
        
        return nombres;
    }
    
    public String concatenarInfoEscuderias(String nombre){
        String info = "";
        for(Escuderia e: escuderias)
            if(e!=null && e.getNombre().equalsIgnoreCase(nombre))
                info = e.getNombre()+"-"+e.getJefeEquipo()
                        +"-"+e.getJefeTecnico()+"-"+e.getChasis()
                        +"-"+e.getAnioIngreso();
            
        return info;
    }
}
