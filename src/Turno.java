
import java.time.Duration;
import java.time.LocalDateTime;


public class Turno {
    
    private LocalDateTime horaentrada;
    private LocalDateTime horasalida;
    private LocalDateTime horaextraentrada;
    private LocalDateTime horaextrasalida;
    private Medico nombremedico;
    
    public Turno(){
       horaentrada=null;
       horasalida=null;
       horaextraentrada=null;
       horaextrasalida=null;
   }
    

   
    public LocalDateTime getHoraentrada() {
        return horaentrada;
    }

    
    public void setHoraentrada(LocalDateTime horaentrada) {
        this.horaentrada = horaentrada;
    }

    
    public LocalDateTime getHorasalida() {
        return horasalida;
    }

    public void setHorasalida(LocalDateTime horasalida) {
        this.horasalida = horasalida;
    }

    
    public Medico getNombremedico() {
        return nombremedico;
    }

   
    public void setNombremedico(Medico nombremedico) {
        this.nombremedico = nombremedico;
    }
    
    public long Horastrabjadas(LocalDateTime horaentrada, LocalDateTime horasalida){
        long horas= Duration.between(horaentrada, horasalida).toHours();
        return horas;
    }

    
    public LocalDateTime getHoraextraentrada() {
        return horaextraentrada;
    }

   
    public void setHoraextraentrada(LocalDateTime horaextraentrada) {
        this.horaextraentrada = horaextraentrada;
    }

  
    public LocalDateTime getHoraextrasalida() {
        return horaextrasalida;
    }

    public void setHoraextrasalida(LocalDateTime horaextrasalida) {
        this.horaextrasalida = horaextrasalida;
    }
    
}
    

  