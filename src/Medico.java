
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public abstract class Medico extends Persona{
    private String especialidad;
    private Turno[] turno; 
    
    
    
    public Medico(String nombre, String apellido, long numtelefono, String sexo, String fechanaci, String correo, String direccion,String especialidad) {
        super(nombre, apellido, numtelefono, sexo, fechanaci, correo, direccion);
        this.especialidad=especialidad;
        turno = new Turno[2]; 
    }   
    public Medico(){
        
    }
    
    public void Agregarturno(Turno turnos){
        for (int i=0; i<2 ; i++){
            if (turno[i]==null){
                turno[i]= turnos;
                break;
            }
        }
    }
    
    
    
    
    public abstract float calcularSueldo();
    
}
