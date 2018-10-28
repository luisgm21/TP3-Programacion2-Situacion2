
import java.time.LocalDateTime;


public class MedicoTemporal extends Medico {

    private float costoh;
    private float costoextrah;
    private float sueldo;
    private Turno[] turno;
    

    public MedicoTemporal(String nombre, String apellido, long numtelefono, String sexo, String fechanaci, String correo, String direccion, String especialidad) {
        super(nombre, apellido, numtelefono, sexo, fechanaci, correo, direccion, especialidad);
        costoh=100;
        costoextrah=250;
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
    
    
    public void Agregarturno(Turno turnos){
        for (int i=0; i<3 ; i++){
            if (turno[i]==null){
                turno[i]= turnos;
                break;
            }
        }
    }

   

    public void calcularSueldo() {
        long horastrab;
        long horasextratrab;
        for(Turno object : turno){
            
                horastrab=object.Horastrabjadas(object.getHoraentrada(),object.getHorasalida());
                horasextratrab= object.Horastrabjadas(object.getHoraextraentrada(),object.getHoraextrasalida());
                sueldo= sueldo +(horastrab*costoh) + (horasextratrab*costoextrah);
            
        }
        
        
        System.out.println("El sueldo del medico es: "+ sueldo);
    }
    
}
