/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.poo.formulauno.negocio;

/**
 *
 * @author borisperezg
 */
public class Piloto {
    
    private String nombre, pais, periodoContrato;
    private String[] aniosCampeon;
    private int anioNacimiento, anioIngreso;

    public Piloto(String nombre, String pais, String periodoContrato, 
            String[] aniosCampeon, int anioNacimiento, int anioIngreso) {
        this.nombre = nombre;
        this.pais = pais;
        this.periodoContrato = periodoContrato;
        this.aniosCampeon = aniosCampeon;
        this.anioNacimiento = anioNacimiento;
        this.anioIngreso = anioIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPeriodoContrato() {
        return periodoContrato;
    }

    public void setPeriodoContrato(String periodoContrato) {
        this.periodoContrato = periodoContrato;
    }

    public String[] getAniosCampeon() {
        return aniosCampeon;
    }

    public void setAniosCampeon(String[] aniosCampeon) {
        this.aniosCampeon = aniosCampeon;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }
    
    public String toString(){
        String año = "";
        
        for(int i=0;i<this.aniosCampeon.length;i++)
            año += this.aniosCampeon[i]+" ";
        
        return "Nombre: "+this.getNombre()
            +"\nPais: "+this.getPais()
            +"\nPeriodo contrato: "+this.getPeriodoContrato()
            +"\nAño de nacimiento: "+this.getAnioNacimiento()
            +"\nAño de ingreso: "+this.getAnioIngreso()
            +"\nAño campeón: "+año;
    }    
}
