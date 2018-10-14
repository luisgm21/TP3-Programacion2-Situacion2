
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
               Paciente x= new Paciente();
               x=(Paciente)object;
               System.out.println("Hay pacientes");
               System.out.println(x.getNombre());
           }
           if(object.getClass()==MedicoPermanente.class)
           {
               MedicoPermanente x=new MedicoPermanente();
               x=(MedicoPermanente)object;
               System.out.println("Hay medicos permanentes");
               System.out.println(x.getNombre());
           }
           if(object.getClass()==MedicoTemporal.class)
           {   
               MedicoTemporal x=new MedicoTemporal();
               System.out.println("Hay medicos temporales");
               System.out.println(x.getNombre()); 
               
           }
           
       }
   }
}
//morelli gato