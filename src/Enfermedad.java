
import java.time.LocalDateTime;
class Enfermedad {
    private String nombre;
    private LocalDateTime fechadeinicio;
    private String tipo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFechadeinicio() {
        return fechadeinicio;
    }

    public void setFechadeinicio(LocalDateTime fechadeinicio) {
        this.fechadeinicio = fechadeinicio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
