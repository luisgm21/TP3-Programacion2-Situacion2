public class TurnoPaciente {
    private int numturn;
    private String nombremedico;
    private String fechayhora;
    public TurnoPaciente(int numturn,String nombremedico,String fechayhora){
        this.numturn=numturn;
        this.nombremedico=nombremedico;
        this.fechayhora=fechayhora;
    }
    public TurnoPaciente(){
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
    public String getFechayhora() {
        return fechayhora;
    }
    public void setFechayhora(String fechayhora) {
        this.fechayhora = fechayhora;
    }
}
