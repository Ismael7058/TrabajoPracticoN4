package trabajopracticon4;

import java.util.HashSet;
import java.util.Objects;

public class Alumno {
    private int numLegajo;
    private String nombre, apellido;
    private HashSet <Materia> matInscrip;

    public Alumno(int numLegajo, String nombre, String apellido) {
        this.numLegajo = numLegajo;
        this.nombre = nombre;
        this.apellido = apellido;
        matInscrip = new HashSet<Materia>();
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
        return "Alumno: "+"\nNumero de Legajo: "+ numLegajo+"\nNombre: "+ nombre + "\nApellido: "+ apellido;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.numLegajo;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        hash = 37 * hash + Objects.hashCode(this.apellido);
        hash = 37 * hash + Objects.hashCode(this.matInscrip);
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
        if (this.numLegajo != other.numLegajo) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return Objects.equals(this.matInscrip, other.matInscrip);
    }
    
    
    
    
}
