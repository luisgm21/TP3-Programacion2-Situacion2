


import java.util.ArrayList;


public abstract class Medico extends Persona{
    private String especialidad; 
  
    public Medico(String nombre, String apellido, long numtelefono, String sexo, String fechanaci, String correo, String direccion,String especialidad) {
        super(nombre, apellido, numtelefono, sexo, fechanaci, correo, direccion);
        this.especialidad=especialidad;
        
    }   
    public Medico(){
        
    }
     
}
