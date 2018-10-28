
import java.util.ArrayList;


public class CentrodeAtencion {
    private ArrayList <Persona> personas;
  
    
   public CentrodeAtencion(){
      this.personas=new ArrayList();
      
   }
   public void agregarElemento(Persona persona){
       this.personas.add(persona);
   }
   public void leerElementos(){
       for(Persona object:personas){
           if(object.getClass()==Paciente.class){
               
               System.out.println("Hay pacientes");
               System.out.println(object.getNombre());
           }
           if(object.getClass()==MedicoPermanente.class)
           {
               
               System.out.println("Hay medicos permanentes");
               System.out.println(object.getNombre());
           }
           if(object.getClass()==MedicoTemporal.class)
           {   
               
               System.out.println("Hay medicos temporales");
               System.out.println(object.getNombre()); 
               
           }
           
       }
   }
}
