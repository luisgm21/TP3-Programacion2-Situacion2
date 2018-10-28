
import java.time.LocalDateTime;


public class MedicoTemporal extends Medico {

    private float costoh;
    private float costoextrah;
    private float sueldo;
    private Turno[] turno;
    private TurnoExtra[] turnoextra;
    

    public MedicoTemporal(String nombre, String apellido, long numtelefono, String sexo, String fechanaci, String correo, String direccion, String especialidad) {
        super(nombre, apellido, numtelefono, sexo, fechanaci, correo, direccion, especialidad);
        costoh=100;
        costoextrah=250;
        turno = new Turno[2]; 
        turnoextra = new TurnoExtra[1];
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
        for (int i=0; i<2 ; i++){
            if (turno[i]==null){
                turno[i]= turnos;
                break;
            }
        }
    }
    
    
    public void Agregarturnoextra(TurnoExtra turnos){
        for (int i=0; i<1 ; i++){
            if (turnoextra[i]==null){
                turnoextra[i]= turnos;
                break;
            }
        }
    }

   

    public void calcularSueldo() {
        long horastrab=0;
        long horasextratrab=0;
        for(Turno object : turno){
            
                horastrab= horastrab + object.Horastrabjadas(object.getHoraentrada(),object.getHorasalida());
            }
        for(TurnoExtra object : turnoextra){
            horasextratrab= horasextratrab + object.Horasextratrabjadas(object.getHoraextraentrada(),object.getHoraextrasalida());
        }
        
        sueldo=(horastrab*costoh) + (horasextratrab*costoextrah);
        
        
        System.out.println("El sueldo del medico es: "+ sueldo);
    }
    
}
