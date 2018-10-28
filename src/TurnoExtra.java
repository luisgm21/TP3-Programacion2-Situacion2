
import java.time.Duration;
import java.time.LocalDateTime;


public class TurnoExtra {
    private LocalDateTime horaextraentrada;
    private LocalDateTime horaextrasalida;
    
    public TurnoExtra(){
       horaextraentrada=null;
       horaextrasalida=null;
       
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
    
    public long Horasextratrabjadas(LocalDateTime horaentrada, LocalDateTime horasalida){
        long horas= Duration.between(horaentrada, horasalida).toHours();
        return horas;
    }
    
    
}
