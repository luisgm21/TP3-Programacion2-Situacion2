
import java.time.LocalDateTime;


public abstract class Medico extends Persona{
    private String especialidad;
    private LocalDateTime fechadeingreso;
    private LocalDateTime fechadesalida;
    public Medico(String nombre, String apellido, long numtelefono, String sexo, String fechanaci, String correo, String direccion,String especialidad,LocalDateTime fechaingreso,LocalDateTime fechaegreso) {
        super(nombre, apellido, numtelefono, sexo, fechanaci, correo, direccion);
        this.especialidad=especialidad;
        this.fechadeingreso=fechadeingreso;
        this.fechadesalida=fechadesalida;
    }   
    public Medico(){
        this.fechadeingreso=null;
        this.fechadesalida=null;
    }
    
    public abstract float calcularSueldo();
    
}
