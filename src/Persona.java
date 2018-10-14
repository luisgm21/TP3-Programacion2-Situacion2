
public abstract class  Persona {
    private String nombre;
    private String apellido;
    private long numtelefono;
    private String sexo;
    private String fechanaci;
    private String correo;
    private String direccion;
    
    public Persona(String nombre,String apellido,long numtelefono,String sexo,String fechanaci,String correo,String direccion){
        this.nombre=nombre;
        this.apellido=apellido;
        this.numtelefono=numtelefono;
        this.sexo=sexo;
        this.fechanaci=fechanaci;
        this.correo=correo;
        this.direccion=direccion;
        
    }
    public Persona(){

    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public long getNumtelefono() {
        return numtelefono;
    }
    public void setNumtelefono(long numtelefono) {
        this.numtelefono = numtelefono;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getFechanaci() {
        return fechanaci;
    }
    public void setFechanaci(String fechanaci) {
        this.fechanaci = fechanaci;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
