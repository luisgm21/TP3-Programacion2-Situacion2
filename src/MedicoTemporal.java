
import java.time.LocalDateTime;


public class MedicoTemporal extends Medico {

    private float costoh;
    private float hrsextras;
    private float sueldo;
    private Turno[] turno;
    

    public MedicoTemporal(String nombre, String apellido, long numtelefono, String sexo, String fechanaci, String correo, String direccion, String especialidad) {
        super(nombre, apellido, numtelefono, sexo, fechanaci, correo, direccion, especialidad);
        costoh=100;
        turno = new Turno[3]; 
    }
    public MedicoTemporal(){
        super();
    }
    public void setCostohh(float preciohr) {
        this.costoh = preciohr;
    }

    
    public float getCostoh() {
        return costoh;
    }

   

    public void calcularSueldo() {
        long horastrab;
        for(Turno turno : turno){
            if(turno!=null){
                horastrab=turno.Horastrabjadas(turno.getHoraentrada(),turno.getHorasalida());
                sueldo= sueldo +(horastrab*costoh);
            }
        }
        
        System.out.println("El sueldo del medico es: "+ sueldo);
    }
    
}
