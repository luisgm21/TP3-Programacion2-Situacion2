
import java.time.LocalDateTime;


public class Paciente extends Persona {
       private String historiaclinica;//Modelo, averiguar si hay una variable de 
                                   //caracteres mas grande que String
    private LocalDateTime fechadeingreso;
    private Turno turnos;
    private Medicamento medicamentos;
    private Enfermedad enfermedades;

    public Paciente(String nombre, String apellido, long numtelefono, String sexo, String fechanaci, String correo, String direccion) {
        super(nombre, apellido, numtelefono, sexo, fechanaci, correo, direccion);
    }
    public Paciente(){
        
    }
    public String getHistoriaclinica() {
        return historiaclinica;
    }
    public void setHistoriaclinica(String historiaclinica) {
        this.historiaclinica = historiaclinica;
    }
    public LocalDateTime getFechadeingreso() {
        return fechadeingreso;
    }
    public void setFechadeingreso(LocalDateTime fechadeingreso) {
        this.fechadeingreso = fechadeingreso;
    }
    
}
