
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
public class Paciente extends Persona {
       private String historiaclinica;//Modelo, averiguar si hay una variable de 
                                   //caracteres mas grande que String
    private LocalDateTime fechadeingreso;
    private ArrayList <TurnoPaciente> turnos;
    private ArrayList<Medicamento> medicamentos;
    private ArrayList<Enfermedad> enfermedades;

    public Paciente(String nombre, String apellido, long numtelefono, String sexo, String fechanaci, String correo, String direccion) {
        super(nombre, apellido, numtelefono, sexo, fechanaci, correo, direccion);
        this.turnos = new ArrayList();
        this.medicamentos = new ArrayList();
        this.enfermedades = new ArrayList();
    }
    public Paciente(){
        this.turnos = new ArrayList();
        this.medicamentos = new ArrayList();
        this.enfermedades = new ArrayList();
        
    }
    public void agregarTurno(TurnoPaciente turno){
        turnos.add(turno);
    }
    public void agregarMedicamento(Medicamento medicamento){
        medicamentos.add(medicamento);
    }
    public void agregarEnfermedad(Enfermedad enfermedad){
        enfermedades.add(enfermedad);
    }
    public void acomodarseguntipoEnfermedades(){
        Collections.sort(enfermedades, new TipoEnfermedadComparator());
    }
    public void acomodarsegunfechaEnfermedades(){
        
        Collections.sort(enfermedades, new FechaIniComparator());
    }
    public void leerTurno(){
        for(TurnoPaciente object:turnos){
            System.out.println("Numero de turno: "+object.getNumturn()+" "+"Medico "+object.getNombremedico()+" "+"Fecha"+object.getFechayhora());
            
        }
    }
    public void leerMedicamento(){
        for(Medicamento object:medicamentos){
            System.out.println("Nombre de medicamento:"+" "+object.getNombre());
        }
    }
    public void leerEnfermedad(){
        for(Enfermedad object:enfermedades){
            System.out.println("Nombre de Enfermedad: "+object.getNombre()+" "+"Tipo de enfermedad: "+object.getTipo());
        }
        
    }
    public String getHistoriaclinica(){
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
