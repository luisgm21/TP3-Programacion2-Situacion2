
import java.time.LocalDateTime;


public class MedicoPermanente extends Medico {
    private float sueldobase;
    private float dineroadicional;

    public MedicoPermanente(String nombre, String apellido, long numtelefono, String sexo, String fechanaci, String correo, String direccion, String especialidad) {
        super(nombre, apellido, numtelefono, sexo, fechanaci, correo, direccion, especialidad);
    }
    public MedicoPermanente(){
        super();
    }
    public float getSueldobase() {
        return sueldobase;
    }
    public float getDineroadicional() {
        return dineroadicional;
    }      
    @Override
    public float calcularSueldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
