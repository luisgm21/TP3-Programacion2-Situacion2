
import java.time.LocalDateTime;


public class Turno {
    private int numturn;
    private String nombremedico;
    private LocalDateTime fechayhora;
    public Turno(int numturn,String nombremedico,LocalDateTime fechayhora){
        this.numturn=numturn;
        this.nombremedico=nombremedico;
        this.fechayhora=fechayhora;
    }
    public Turno(){
        this.fechayhora=null;
    }
    public int getNumturn() {
        return numturn;
    }
    public void setNumturn(int numturn) {
        this.numturn = numturn;
    }
    public String getNombremedico() {
        return nombremedico;
    }
    public void setNombremedico(String nombremedico) {
        this.nombremedico = nombremedico;
    }
    public LocalDateTime getFechayhora() {
        return fechayhora;
    }
    public void setFechayhora(LocalDateTime fechayhora) {
        this.fechayhora = fechayhora;
    }
}
