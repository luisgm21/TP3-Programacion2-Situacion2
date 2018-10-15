

class Enfermedad {
    private String nombre;
    private String fechadeinicio;
    private String tipo;

    public Enfermedad(String nombre,String fechadeinicio,String tipo){
        this.nombre=nombre;
        this.fechadeinicio=fechadeinicio;
        this.tipo=tipo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechadeinicio() {
        return fechadeinicio;
    }

    public void setFechadeinicio(String fechadeinicio) {
        this.fechadeinicio = fechadeinicio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
