
import java.time.LocalDateTime;


public class MedicoPermanente extends Medico {
    private float sueldobase;
    private float dineroadicional;
    private float sueldototal;
    private Turno[] turno;

    public MedicoPermanente(String nombre, String apellido, long numtelefono, String sexo, String fechanaci, String correo, String direccion, String especialidad, float sueldobase) {
        super(nombre, apellido, numtelefono, sexo, fechanaci, correo, direccion, especialidad);
        turno = new Turno[2]; 
        this.sueldobase=sueldobase;

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
    
    public void Agregarturno(Turno turnos){
        for (int i=0; i<2 ; i++){
            if (turno[i]==null){
                turno[i]= turnos;
                
                break;
            }
        }
    }

   
  
    
    public void calcularSueldo() {
        dineroadicional=(float) (sueldobase*1.25);
        sueldototal=sueldobase+dineroadicional;
        System.out.println("El sueldo del medico es: "+ sueldototal);
    }
    
    
}
