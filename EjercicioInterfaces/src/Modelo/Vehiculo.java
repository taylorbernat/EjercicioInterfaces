
package Modelo;

public class Vehiculo {
    private  int serial_vehiculo;
    private String modelo_vehivulo;
    
    public Vehiculo(int serial,String modelo){
        this.modelo_vehivulo=modelo;
        this.serial_vehiculo=serial;
    
    }
    public void conexionBaseDeDatos(){
        

        System.out.println("holaaalaaa");

    }
    
    
    public int getSerial_vehiculo() {
        return serial_vehiculo;
    }

    public void setSerial_vehiculo(int serial_vehiculo) {
        this.serial_vehiculo = serial_vehiculo;
    }

    public String getModelo_vehivulo() {
        return modelo_vehivulo;
    }

    public void setModelo_vehivulo(String modelo_vehivulo) {
        this.modelo_vehivulo = modelo_vehivulo;
    }
    
}
