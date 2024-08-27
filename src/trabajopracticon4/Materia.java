package trabajopracticon4;

public class Materia {
    private int idMateria, anio;
    private String nombre;

    public Materia(int idMateria,String nombre, int anio ) {
        this.idMateria = idMateria;
        this.anio = anio;
        this.nombre = nombre;
    }

    public int getIdMateria() {
        return idMateria;
    }
    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    
}
