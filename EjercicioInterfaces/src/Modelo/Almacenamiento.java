
package Modelo;

import java.util.ArrayList;

public class Almacenamiento {
    ArrayList<Vehiculo> objVehiculos;
    ArrayList<Persona> objPersonas;
    public Almacenamiento(){    
        this.objVehiculos= new ArrayList<>();
        this.objPersonas= new ArrayList<>();

    }
    
    
    
    //--------------Vehiculo------------------
    public void guardarVehiculo(Vehiculo objvehicu){   
        this.objVehiculos.add(objvehicu);
    }

    public ArrayList<Vehiculo> getObjVehiculos() {
        return this.objVehiculos;
    }

    public void setObjVehiculos(ArrayList<Vehiculo> objVehiculos) {
        this.objVehiculos = objVehiculos;
    }
    
    
    
    //--------------Persona------------------
    public void guardarPersona(Persona objPerson) {
        this.objPersonas.add(objPerson);
    }

    public ArrayList<Persona> getObjpersonas() {
        return this.objPersonas;
    }

    public void setObjPersonas(ArrayList<Persona> objPerson) {
        this.objPersonas = objPerson;
    }
}
