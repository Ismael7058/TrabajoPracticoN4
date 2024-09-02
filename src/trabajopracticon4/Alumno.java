package trabajopracticon4;

import java.util.HashSet;

public class Alumno {
    private int numLegajo;
    private String nombre, apellido;
    private HashSet <Materia> matInscrip;

    public Alumno(int numLegajo, String nombre, String apellido) {
        this.numLegajo = numLegajo;
        this.nombre = nombre;
        this.apellido = apellido;
        matInscrip = new HashSet<>();
    }

    public int getNumLegajo() {
        return numLegajo;
    }
    public void setNumLegajo(int numLegajo) {
        this.numLegajo = numLegajo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public HashSet getMatInscrip() {
        return matInscrip;
    }
    public void setMatInscrip(HashSet matInscrip) {
        this.matInscrip = matInscrip;
    }
    
    public void agregarMaterias(Materia obj){
        matInscrip.add(obj);
    }
    
    public int cantidadMaterias(){
        return matInscrip.size();
    }

    @Override
    public String toString() {
        return numLegajo+" - "+ nombre + " - "+ apellido;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.numLegajo;
        return hash;
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        return this.numLegajo == other.numLegajo;
    }

    
    
    
    
    
}
