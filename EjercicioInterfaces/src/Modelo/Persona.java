
package Modelo;


public class Persona {
    private String nombre;
    private int cedula;
    
    public Persona(String nombres,int cedulas){
        this.nombre=nombres;
        this.cedula=cedulas;
    
    }
    public void conexionBaseDeDatos(){
        

        System.out.println("holaaalaaa");

    }
    
    
    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public int getcedula() {
        return cedula;
    }

    public void setcedula(int cedula) {
        this.cedula = cedula;
    }
    
}
