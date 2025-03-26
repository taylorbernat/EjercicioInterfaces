
package Controlador;

import Modelo.Almacenamiento;
import Modelo.Vehiculo;
import Modelo.Persona;
import java.util.ArrayList;


 
public class Controlador {
    private Almacenamiento objAlmacenamiento;
    private Persona objPersona;
    private Vehiculo ojbVehiculo;
    
    public Controlador(){
        this.objAlmacenamiento = new Almacenamiento();
    }
    //-----------------------Vehiculo---------------------------------
    public void enviarInformacion(int serial,String modelo,boolean confirm1){   
        boolean confirms1 =confirm1;
        
        if(confirms1){    
            System.out.println(serial + modelo);
            Vehiculo carrtio = crearCarro(serial, modelo);
            this.objAlmacenamiento.guardarVehiculo(carrtio);
        }else{
        
        
        }
           
    }
    
    public ArrayList<Vehiculo>  impromirInformacion(){
        return this.objAlmacenamiento.getObjVehiculos();
    }
    
    public Vehiculo crearCarro(int serial,String modelo){
        return new Vehiculo(serial, modelo);
    
    }
    
    
    public String obtenerInformacionVehiculos() {
        StringBuilder texto = new StringBuilder("<html>");

        for (Vehiculo v : this.objAlmacenamiento.getObjVehiculos()) {
            texto.append("Modelo: ").append(v.getModelo_vehivulo())
                 .append("<br>Serial: ").append(v.getSerial_vehiculo())
                 .append("<br><br>");
        }

        texto.append("</html>");
        return texto.toString();
    }
    public String obtenerInformacionVehiculos2() {
        String texto="";

        for (Vehiculo v : this.objAlmacenamiento.getObjVehiculos()) {
            texto+="\tModelo: "+v.getModelo_vehivulo();
            texto+="\t Serial: "+v.getSerial_vehiculo();
                 
        }

        return texto;
    }
    
    public boolean Confirmador(boolean hola){
        return hola;
    
    }
    
    //-------------------------Persona---------------------------------
    public void enviarInformacion2(String nombre,int cedula,boolean confirm2){   
        boolean confirms2 =confirm2;
        
        if(confirms2){    
            System.out.println(nombre + cedula);
            Persona Personita = crearPersonitas(nombre,cedula);
            this.objAlmacenamiento.guardarPersona(Personita);
        }else{
        
        
        }
           
    }
    
    public ArrayList<Persona>  impromirInformacion2(){
        return this.objAlmacenamiento.getObjpersonas();
    }
    
    public Persona crearPersonitas(String nombre,int cedula){
        return new Persona(nombre, cedula);
    
    }
    
    
    public String obtenerInformacionPersonas() {
        StringBuilder texto = new StringBuilder("<html>");

        for (Persona v : this.objAlmacenamiento.getObjpersonas()) {
            texto.append("Cedula: ").append(v.getcedula())
                 .append("<br>nombre: ").append(v.getnombre())
                 .append("<br><br>");
        }

        texto.append("</html>");
        return texto.toString();
    }
    public String obtenerInformacionPersonas2() {
        String texto="";

        for (Persona v : this.objAlmacenamiento.getObjpersonas()) {
            texto+="\tCedula: "+v.getcedula();
            texto+="\t Nombre: "+v.getnombre();
                 
        }

        return texto;
    }
    
    public boolean Confirmador2(boolean hola){
        return hola;
    
    }
    }
