
import java.time.LocalDateTime;


public abstract class Medico extends Persona{
    private String especialidad;
    private LocalDateTime fechadeingreso;
    private LocalDateTime fechadesalida;
   
    public abstract float calcularSueldo();
    
}
