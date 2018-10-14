
import java.time.LocalDateTime;


public class MedicoTemporal extends Medico {

    private float preciohr;
    private float hrstrabajadas;
    private float hrsextras;

    public MedicoTemporal(String nombre, String apellido, long numtelefono, String sexo, String fechanaci, String correo, String direccion, String especialidad, LocalDateTime fechaingreso, LocalDateTime fechaegreso) {
        super(nombre, apellido, numtelefono, sexo, fechanaci, correo, direccion, especialidad, fechaingreso, fechaegreso);
    }
    public MedicoTemporal(){
        super();
    }
    public void setPreciohr(float preciohr) {
        this.preciohr = preciohr;
    }

    
    public float getPreciohr() {
        return preciohr;
    }

    public float getHrstrabajadas() {
        return hrstrabajadas;
    }

    public float getHrsextras() {
        return hrsextras;
    }
    
    
    
    @Override
    public float calcularSueldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
