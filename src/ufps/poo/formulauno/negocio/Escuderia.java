package ufps.poo.formulauno.negocio;

public class Escuderia {
    
    private String nombre, jefeEquipo, jefeTecnico, chasis;
    private int anioIngreso;
    private Piloto[] pilotos;
    private int ordenPiloto;

    public Escuderia() {}

    public Escuderia(String nombre, String jefeEquipo, String jefeTecnico,
            String chasis, int anioIngreso) {
        this.nombre = nombre;
        this.jefeEquipo = jefeEquipo;
        this.jefeTecnico = jefeTecnico;
        this.chasis = chasis;
        this.anioIngreso = anioIngreso;
        this.crearCantidadPilotos(3);
    }  
    
    /**
     * @param cantidadPilotos Se pasa como parámetro pero no 
     * hace parte de los atributos de la clase. Es solo para
     * inicializar el arreglo
     */
    public boolean crearCantidadPilotos(int cantidadPilotos){
        boolean exito = false;
        if(cantidadPilotos>=2 || cantidadPilotos<=3){
            pilotos = new Piloto[cantidadPilotos];
            exito = true;
        }
        return exito;
    }
    
    public String agregarPiloto(String nombre, String pais, int anioNacimiento,
            String periodoContrato, String[] aniosCampeon, int anioIngreso){
        
        String pilotoAgregado = "No hay espacio para registrar más pilotos";
        // Se valida que cumpla la condición de que no se agregue un piloto
        // fuera de los permitidos
        if(ordenPiloto<3){
            if(this.buscarPiloto(nombre) != null)
                return "Ya existe un piloto con ese nombre";
            
            Piloto p = new Piloto(nombre, pais, periodoContrato, aniosCampeon, 
                    anioNacimiento, anioIngreso);
            pilotos[ordenPiloto] = p;
            ordenPiloto++;
            pilotoAgregado = "Registro realizado con exito. Piloto "+ordenPiloto;
        }
        
        return pilotoAgregado;
    }
    
    public String consultarPiloto(String nombre){
        String piloto = "";
        
        for(Piloto p: pilotos)
            if(p != null)
                piloto = p.toString()
                        +"\nEscudería a la que pertenece: "+this.getNombre();
        
        return piloto;
    }
        
    public String eliminarPiloto(String nombre){
        for (int i = 0; i < pilotos.length; i++)
            if(pilotos[i]!=null&&
                    pilotos[i].getNombre().equalsIgnoreCase(nombre))
                pilotos[i] = null;
        
        return "Piloto eliminado";
    }
    
    //--------------------------REQUERIMIENTOS OPERACIONALES-------------------//
    public Piloto buscarPiloto(String nombre){
        Piloto objeto = null;
        
        if(pilotos != null)
            for(Piloto x: pilotos)
                if(x != null && x.getNombre().equalsIgnoreCase(nombre))
                    objeto = x;

        return objeto;
    }
    
    private int cantidadRegistradaPilotos(){
        int piloto = 0;
        
        for(Piloto p: pilotos)
            if(p!=null)
                piloto++;
        
        
        return piloto;
    }
    
    public String concatenarNombresPiloto(){
        String nombres = "";
        
        for(Piloto p:pilotos)
            if(p!=null)
                nombres += p.getNombre()+"-";
        
        return nombres;
    }
    
    public String concatenarInfoPiloto(){
        String nombres = "";
        
        for(Piloto p:pilotos)
            if(p!=null)
                nombres += p.getNombre()+" "+p.getPais()+" "+p.getPeriodoContrato()
                        +" "+p.getAnioNacimiento()+" "+p.getAnioIngreso()
                        +" "+this.añosCampeonPiloto(p.getNombre())+"~";
        
        return nombres;
    }
    
    public String añosCampeonPiloto(String nombre){
        String año[] = null;
        String años = "";    
        for(Piloto p:pilotos)
            if(p!=null&&p.getNombre().equalsIgnoreCase(nombre))
                año = p.getAniosCampeon();
        
        for(int i=0;i<año.length;i++)
            años += año[i]+" ";       
        
        return años;
    }
    
    @Override
    public String toString(){
        return "Nombre de la escudería: "+this.getNombre()
            +"\nJefe del equipo: "+this.getJefeEquipo()
            +"\nJefe técnico: "+this.getJefeTecnico()
            +"\nChasis: "+this.getChasis()
            +"\nAño de ingreso: "+this.getAnioIngreso()
            +"\nCantidad de pilotos registrados: "+this.cantidadRegistradaPilotos();
    }
    
    //-----------------------------Getter's y Setter's-------------------------//
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getJefeEquipo() {
        return jefeEquipo;
    }

    public void setJefeEquipo(String jefeEquipo) {
        this.jefeEquipo = jefeEquipo;
    }

    public String getJefeTecnico() {
        return jefeTecnico;
    }

    public void setJefeTecnico(String jefeTecnico) {
        this.jefeTecnico = jefeTecnico;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }    
}
