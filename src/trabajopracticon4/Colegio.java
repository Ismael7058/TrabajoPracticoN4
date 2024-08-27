package trabajopracticon4;

import JFrame.Menu;

public class Colegio {
    public static void main(String[] args) {
        //Punto 1
        Materia mat1 = new Materia(123, "Ingles 1", 1);
        Materia mat2 = new Materia(124, "Matematicas", 1);
        Materia mat3 = new Materia(125, "Laboratorio 1", 1);
        
        //Punto 2
        Alumno alum1 = new Alumno(5000, "Martin", "Lopez");
        Alumno alum2 = new Alumno(5000, "Brenda", "Martinez");
        
        //Punto 3
        alum1.agregarMaterias(mat1);
        alum1.agregarMaterias(mat2);
        alum1.agregarMaterias(mat3);
        
        //Punto 4
        alum2.agregarMaterias(mat1);
        alum2.agregarMaterias(mat2);
        alum2.agregarMaterias(mat3);
        alum2.agregarMaterias(mat3);
        
        //Punto 5
        System.out.println("<===============================================>");
        alum1.toString();
        System.out.println("Cantidad de Materias: " + alum1.cantidadMaterias());
        System.out.println("<===============================================>");
        alum2.toString();
        System.out.println("Cantidad de Materias: " + alum2.cantidadMaterias());
        System.out.println("<===============================================>");
        Menu menu = new Menu();//con esto se crea el objeto
        menu.setVisible(true);//para mostrar el menu
        
        
    }
}
